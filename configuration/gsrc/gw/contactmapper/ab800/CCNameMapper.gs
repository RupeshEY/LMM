package gw.contactmapper.ab800

uses gw.webservice.contactapi.NameMapperImpl

/**
 * Class for handling name mapping between ClaimCenter and ContactManager entities and typelists.
 * If an entity is added to the contact graph, and the names differ between ClaimCenter and ContactManager,
 * then a mapping need to be added to this class in the create() method below.  All entity names and
 * typelist values in the XML sent between the applications via the ABContactAPI is in terms of
 * the ContactManager data model, thus ClaimCenter needs to translate the names from the ClaimCenter
 * (local) namespace to the ContactManager (AB) namespace.
 */
@Export
class CCNameMapper extends NameMapperImpl<CCNameMapper> {
  
  private static var _instance : CCNameMapper

  static property get Instance() : CCNameMapper {
    if (_instance == null)
      _instance = create()
    return _instance
  }
  
  private construct() {
  }

  private static function create() : CCNameMapper {

    var nameMapper = new CCNameMapper()
      // This is the code to map CC entity, typelist and typecode names to the corresponding
      // AB names.  See NameMapperImpl for more documentation.

      // two way mappings between the CC and AB entities
      .entity(Contact, "ABContact")
      .entity(Adjudicator, "ABAdjudicator")
      .entity(Attorney, "ABAttorney")
      .entity(AutoRepairShop, "ABAutoRepairShop")
      .entity(AutoTowingAgcy, "ABAutoTowingAgcy")
      .entity(Company, "ABCompany")
      .entity(CompanyVendor, "ABCompanyVendor")
      .entity(Doctor, "ABDoctor")
      .entity(LawFirm, "ABLawFirm")
      .entity(LegalVenue, "ABLegalVenue")
      .entity(MedicalCareOrg, "ABMedicalCareOrg")
      .entity(Person, "ABPerson")
      .entity(PersonVendor, "ABPersonVendor")
      .entity(Place, "ABPlace")
      .entity(UserContact, "ABUserContact")

      .entity(ContactTag, "ABContactTag")
      .entity(ContactContact, "ABContactContact")
      .entity(ContactAddress, "ABContactAddress")
      .entity(ContactSearchCriteria, "ABContactSearchCriteria")
      .entity(ContactCategoryScore, "ABContactCategoryScore")

      // one way mapping from an AB to a CC entity
      .abToLocalEntity("ABPolicyPerson", Person)
      .abToLocalEntity("ABPolicyCompany", Company)

    /*    A typelist could be mapped like this:

        .typeList(TypeListMapping.make(MaritalStatus)
          .typeCode(MaritalStatus.TC_S, "single")
          .typeCode(MaritalStatus.TC_M, "married")
          .typeCode(MaritalStatus.TC_D, "divorced")
          .typeCode(MaritalStatus.TC_W, "widowed")
          .typeCode(MaritalStatus.TC_C, "common")
          .typeCode(MaritalStatus.TC_P, "separated")
          .typeCode(MaritalStatus.TC_U, "unknown"))
    */

    return nameMapper
  }
}
