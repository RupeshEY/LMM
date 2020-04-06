package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable

uses java.util.Date

/**
 * Represents a message on a service request, written by one of the parties associated with the service request.
 * A message does not identify a recipient, but rather is posted to the service request for general viewing.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/Message")
final class Message {

  /**
   * Identifies the party who sent the message.
   */
  var _sender : ContactSummary as Sender

  /**
   * The service request reference information. This field is optional.
   */
  var _serviceRequestReference : ServiceRequestReference as ServiceRequestReference

  /**
   * The date the message was sent.
   */
  var _date : Date as Date

  /**
   * A title for the message.
   */
  var _title : String as Title

  /**
   * The body of the message.
   */
  var _body : String as Body

  /**
   * The type of message.
   */
  var _type : typekey.ServiceRequestMessageType as Type

  /**
   * The name of the Type in the current locale.
   */
  var _typeName : String as TypeName

  /**
   * Flags whether or not the message was originally from the Portal
  */

  var _sentFromPortal : boolean as SentFromPortal

  construct() {}

  construct (message : ServiceRequestMessage) {
    populate(message, false)
  }

  construct(message : ServiceRequestMessage, populateSRRef : boolean) {
    populate(message, populateSRRef)
  }

  private function populate(message: ServiceRequestMessage, populateSRRef : boolean)  {
    if(populateSRRef) {
      ServiceRequestReference = new ServiceRequestReference(message.ServiceRequest)
    }
    Sender = new ContactSummary(message.Author)
    Date = message.SendDate
    Title = message.Title
    Body = message.Body
    Type = message.Type
    TypeName = Type.DisplayName
    SentFromPortal = message.SentFromPortal
  }
}
