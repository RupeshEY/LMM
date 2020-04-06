package gw.plugin.messaging.ab800

uses gw.api.locale.DisplayKey
uses gw.api.contact.ContactSystemUtil
uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.plugin.contact.ContactSystemPluginException
uses gw.plugin.messaging.ContactMessageTransportBase
uses gw.webservice.contactapi.beanmodel.XmlBackedInstance
uses gw.webservice.contactapi.beanmodel.anonymous.elements.XmlBackedInstance_Field
uses org.apache.commons.lang.ObjectUtils

uses java.lang.*

uses gw.plugin.contact.integration.contactpayload.ContactPayload
uses gw.plugin.contact.integration.contactpayload.types.complex.CreateAction
uses gw.plugin.contact.integration.contactpayload.types.complex.UpdateAction
uses gw.pl.util.ExceptionUtil
uses gw.api.contact.ContactSystemPluginAdapter

/**
 * Implementation of <code>gw.plugin.messaging.MessageTransport</code>
 * for handling asynchronous Contact updates to ContactManager.
 * @deprecated Since 9.0.0 use gw.plugin.messaging.ContactMessageTransport instead
 */
@Export
class ContactMessageTransport extends ContactMessageTransportBase {

  override function send(message:Message, payload:String) {
    LOGGER.debug("Message being sent for event '${message.EventName}' on contact ${message.Contact}")
   
    try {
      switch (message.EventName) {
          case "ContactUpdatedInAB":
            createLocalUpdateWorkerItem(message,payload)        
            break
          default:
            //all other Contact events should be handled by plugin
            ContactSystemPluginAdapter.getAdapter().sendAsyncUpdate(message, payload)
      }
      message.reportAck()
    } catch (cspe: ContactSystemPluginException) {
      LOGGER.error("Exception occurred while sending message to CM ${cspe.LocalizedMessage}")
      LOGGER.error("Caused by ${cspe.Cause}")
      createActivity(message, payload, cspe)
      if(cspe.Retryable) {
        message.ErrorDescription = ExceptionUtil.findExceptionCause(cspe).LocalizedMessage
        message.reportError()
      } else  {
        message.reportAck()
      }
    } catch (e : Exception) {
        message.ErrorDescription = e.LocalizedMessage
        LOGGER.error("Exception occurred while sending message to CM ${e}")
        message.reportError()
    }
  }
  
  private function createLocalUpdateWorkerItem(message : Message, payload : String) {
    if(message != null && payload != null) {
      LOGGER.debug("Creating AutoSyncWorkItem for ABUID: ${payload}")
      ContactSystemUtil.createAutoSyncWorkItem(payload)
    }
  }
  
  private function createActivity(message:Message, payload:String, cspe : ContactSystemPluginException) {
    var contact : Contact
    var messageRoot = message.MessageRoot
    if (messageRoot typeis ClaimContact) {
      contact = messageRoot.Contact
    }
    else {
      contact = messageRoot as Contact
    }

    var user : User
    if (cspe.NotifyAdmin){
      user = contact.UpdateUser.RootGroup.Supervisor
    } else
      user = contact.UpdateUser
    
    var claim : Claim
    var cc = Query.make(ClaimContact).compare("Contact", Relop.Equals, contact).select().first()
    if (cc == null) {
      LOGGER.debug("Creating activity for failed update for ${contact.PublicID} - Unable to find claim contact for this contact.")
      return
    }

    if (message.Claim != null)
      claim = message.Claim
    else {
      if(cc != null) {
      claim = cc.Claim
      }
      if (claim == null) {
        LOGGER.debug("Creating activity for failed update for ${contact.PublicID} - Unable to find claim for this contact.")
        return
      }
    }
    
    var subject = DisplayKey.get("Web.AddressBook.MessageTransport.Subject", contact)
    var noteText : String
    var description : String
    try {
      var actionType = ContactPayload.parse(payload).$TypeInstance
      if(actionType typeis CreateAction) {
        noteText = createNote(XmlBackedInstance.parse(actionType.CreateXml))
      } else if(actionType typeis UpdateAction) {
        noteText = createNote(XmlBackedInstance.parse(actionType.UpdateXml))
      }
    } catch (ee : Exception) {
      noteText = null
    }

    description = cspe.getMessage()

    var bundle = contact.Bundle
    var activity = new Activity(bundle)
    cc = bundle.add(cc)
    message = bundle.add(message)
      
    activity.setActivityPatternAndCopy(ActivityPattern.finder.getActivityPatternByCode("approval_denied"), null, null)
    activity.Claim = claim
    activity.Status = ActivityStatus.TC_OPEN
    activity.RelatedTo = cc.Contact
    activity.Description = description
    activity.Priority = Priority.TC_NORMAL

    var note = activity.newNote()
    note.Subject = subject
    note.Body = noteText == null ? description : noteText
    note.Claim = claim
    note.RelatedTo = cc.Contact
    activity.assignUserAndDefaultGroup(user)

    //Call Copy from AB to revert the contact back in sync
    if (cc.Contact.AddressBookUID != null) {
      ContactSystemUtil.INSTANCE.syncToContactSystem(cc.Contact)
    }
  }
  
  private function createNote(instance: XmlBackedInstance) : String {
    return appendInstanceChanges(instance, "Contact")
  }
    
  private function appendInstanceChanges(instance: XmlBackedInstance, objectPath:String):String {
    
    var noteText = ""
    
    for (field in instance.Field) {
      if (not(isExcludedField(field)) and not ObjectUtils.equals(field.OrigValue, field.Value)) {
        if (field.OrigValue == null) {
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.AddField", "${field.Name}", field.Value) + "\n"
        } else if (field.Value == null) { 
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.RemoveField", "${field.Name}", field.OrigValue) + "\n"
        } else {
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.UpdateField", "${field.Name}", field.OrigValue, field.Value) + "\n"
        }
      }
    }
    for (fkItem in instance.Fk) {
      var fkInstance = fkItem.XmlBackedInstance
      if (not ObjectUtils.equals(fkItem.OrigValue, fkInstance.LinkID)) {  // if the FK has changed where it points
        if (fkItem.OrigValue == null) {
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.AddForeignKey", "${fkItem.Name}", fkInstance.LinkID) + "\n"
        } else if (fkInstance.LinkID == null) {
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.RemoveForeignKey", "${fkItem.Name}", fkItem.OrigValue) + "\n"
        } else {
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.UpdateForeignKey", "${fkItem.Name}", fkItem.OrigValue, fkInstance.LinkID) + "\n"
        }
      }
      noteText += appendInstanceChanges(fkInstance, "${objectPath}.${fkItem.Name}")
    }
    for (array in instance.Array) {
      var arrayName = array.Name
      for (arrayItem in array.XmlBackedInstance) {
        var arrayElemID = arrayItem.LinkID == null ? DisplayKey.get("Web.AddressBook.MessageTransport.Info.NewElement") : arrayItem.LinkID
        if (arrayItem.Action == "Add") {
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.AddArrayElement", "${arrayName}") + "\n"
        } else if (arrayItem.Action == "Update") {
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.UpdateArrayElement", "${arrayName}[${arrayElemID}]") + "\n"
        } else if (arrayItem.Action == "Remove") {
          noteText += DisplayKey.get("Web.AddressBook.MessageTransport.Info.RemoveArrayElement", "${arrayName}[${arrayElemID}]") + "\n"
        } else if (arrayItem.Action != null) {
          noteText += "Unrecognized array action: ${arrayItem.Action}\n"
        }
        noteText += appendInstanceChanges(arrayItem, "${objectPath}.${arrayName}[${arrayElemID}]")
      }
    }
    return noteText
  }
  
  private function isExcludedField(field : XmlBackedInstance_Field) : boolean {
    return (field.Name == "LinkID" or field.Name == "External_PublicID")
  }
}
