package gw.plugin.contact.ab800

uses gw.api.locale.DisplayKey
uses java.util.Map
uses gw.lang.reflect.IType

/**
 * This class maps the RequiredFieldException message from ContactManager to the appropriate
 * subtype message for ClaimCenter. 
 * 
 * If you change the required fields for a subtype in ContactManager you will need to change 
 * the DisplayKeys returned by this class.
 * 
 * If you add a Contact subtype you should add an entry in the map for that subtype, if that 
 * subtype has any special required fields then add a DisplayKey also or use an existing one.
 */
@Export
class ContactRequiredFieldMessageMapper {

  //String that separates an identified contact subtype from the message that identifies which field is required in it
  static final var subjectMessageSeparator = " - "

  private construct() { }
  
  private static var _contactSubtypeRequiredFieldMessageMap : Map<String,String> = {
    Adjudicator.Type.RelativeName -> DisplayKey.get("Web.Plugin.ContactManager.RequiredFieldMissingException_Adjudicator"),
    Company.Type.RelativeName -> DisplayKey.get("Web.Plugin.ContactManager.RequiredFieldMissingException_Company"),
    CompanyVendor.Type.RelativeName -> DisplayKey.get("Web.Plugin.ContactManager.RequiredFieldMissingException_CompanyVendor"),
    Person.Type.RelativeName -> DisplayKey.get("Web.Plugin.ContactManager.RequiredFieldMissingException_Person"),
    PersonVendor.Type.RelativeName -> DisplayKey.get("Web.Plugin.ContactManager.RequiredFieldMissingException_PersonVendor"),
    Place.Type.RelativeName -> DisplayKey.get("Web.Plugin.ContactManager.RequiredFieldMissingException_Place"),
    UserContact.Type.RelativeName -> DisplayKey.get("Web.Plugin.ContactManager.RequiredFieldMissingException_UserContact"),
    Contact.Type.RelativeName -> DisplayKey.get("Web.Plugin.ContactManager.RequiredFieldMissingException")
  }
 
 
  /**
   * Add a required field message for a Contact subtype to the message map.
   *
   * @param type the Contact subtype to add the message for
   * @message the required field message
   */
  public static function addRequiredFieldMessageForContact(type : IType, message : String) {
    if(type != null && message != null && gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(Contact.Type, type)) {
      _contactSubtypeRequiredFieldMessageMap.put(type.RelativeName, message)  
    }
  }
  
  /**
   * Removes a required field message for a Contact subtype from the message map.
   *
   * @param type the Contact Subtype to remove the message for
   */
  public static function removeRequiredFieldMessageForContact(type : IType) : String {
    var message : String = null
    if(type != null) {
      message = _contactSubtypeRequiredFieldMessageMap.remove(type.RelativeName)  
    }
    return message
  }
  
  /**
   * Returns the required fields message for a contact based on it's subtype
   * 
   * If there is no message for the actual subtype of the contact passed in, the
   * code goes up the contact hierarchy until it finds a subtype with a message.
   * 
   * @param contact the Contact to return the required fields message for
   * @returns the required fields message for the subtype
   */
  public static function getRequiredFieldMessageForContact(contact : Contact) : String {
    if (contact == null) {
      return null      
    }
    var lookupType = typeof contact
    var message = _contactSubtypeRequiredFieldMessageMap.get((typeof contact).RelativeName)
    while(message == null && lookupType != null) {
      lookupType = lookupType.Supertype
      message = _contactSubtypeRequiredFieldMessageMap.get(lookupType.RelativeName)
    }
    return contact.DisplayName + subjectMessageSeparator + message
  }

}
