package gw.api.contact
uses java.util.ArrayList
uses gw.lang.reflect.IType
uses java.lang.IllegalArgumentException
uses java.util.List

@Export
class CCContactMinimalTagsImpl implements ContactMinimalTags {

  private var _contact : Contact

  construct(contact : Contact) {
    _contact = contact
  }

  /**
   * This sets the minimum out of the box tags on the Contact based on it's subtype. All
   * Contacts get the CLAIMPARTY tag, vendor subtype also get the VENDOR tag. 
   */
  override function ensureMinimumTags() {
    var tagTypeList = getTagsForContactSubtype(typeof _contact)
    
    for(tagType in tagTypeList) {
      if(! _contact.TagTypes.contains(tagType)) {
        var cTag : ContactTag = new ContactTag(_contact.Bundle)
        cTag.Type = tagType    
        _contact.addToTags(cTag)  
      }
    }  
  }

  /**
   * Returns the list of tags that will be set on a Contact based on its subtype. All
   * Contacts get the CLAIMPARTY tag, vendor subtype also get the VENDOR tag.
   * 
   * @param type the IType for the Contact you wish to get the tag list for
   * @return The list of ContactTagTypes for the passed in Contact subtype
   */
  public static function getTagsForContactSubtype(type : IType) : List<ContactTagType> {
    
    if(!gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(Contact.Type, type)) {
      throw new IllegalArgumentException("Invalid type! ${type.RelativeName} is not a subtype of Contact")
    }
    
    var tagList = new ArrayList<ContactTagType>()
    tagList.add(ContactTagType.TC_CLAIMPARTY)
    
    if(gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(PersonVendor.Type, type) || gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(CompanyVendor.Type, type)) {
      tagList.add(ContactTagType.TC_VENDOR)
    }
    return tagList
  }

  /**
   * Check whether the user can create the contact of the specified type.
   * The user must have permission for both the Contact type (eg Doctor) and
   * ALL of the ContactTag types that will be created for that contact type.
   */
  public static function checkCreatePermission(type : IType) : boolean {
    return perm.Contact.createab(type)
            and getTagsForContactSubtype(type).allMatch(\ tag -> perm.Contact.createab(tag))
  }

}