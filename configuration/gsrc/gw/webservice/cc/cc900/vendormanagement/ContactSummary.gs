package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable

/**
 * Contains summary information about a contact in ClaimCenter.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ContactSummary")
final class ContactSummary {

  /**
   * A identifier for this contact in the address book system.
   */
  var _addressBookUID : String as AddressBookUID

  /**
   * A string representation for this contact.
   */
  var _name : String as Name

  /**
   * An email address for this contact.
   */
  var _email : String as Email

  /**
   * A phone number for this contact.
   */
  var _phone : String as Phone

  /**
   * an optional description of this contact's role on the service request
   */
  var _description : String as Description

  construct() {}

  construct(contact : Contact) {
    AddressBookUID = contact.AddressBookUID
    Name = contact.DisplayName
    Email = contact.EmailAddress1
    Phone = contact.PrimaryPhoneValue
  }

}
