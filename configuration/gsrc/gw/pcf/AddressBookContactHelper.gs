package gw.pcf
uses gw.api.contact.ExternalContact
uses gw.api.contact.ExternalContactSource

@Export
class AddressBookContactHelper {

  construct(aContact : Contact, anExternalContactSource : ExternalContactSource, anExternalContact : ExternalContact) {
    Contact = aContact
    ExternalContactSource = anExternalContactSource
    ExternalContact = anExternalContact
    AllowEditContact = true
  }

  construct(aContact : Contact, anExternalContactSource : ExternalContactSource, anExternalContact : ExternalContact, canEditContact : boolean) {
    Contact = aContact
    ExternalContactSource = anExternalContactSource
    ExternalContact = anExternalContact
    AllowEditContact = canEditContact
  }

  var _contact : Contact as Contact
  var _externalContact : ExternalContact as ExternalContact
  var _externalContactSource : ExternalContactSource as ExternalContactSource
  var _allowEditContact : Boolean as AllowEditContact
}
