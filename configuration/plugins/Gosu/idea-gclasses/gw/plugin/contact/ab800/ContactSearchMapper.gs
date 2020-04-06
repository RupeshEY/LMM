package gw.plugin.contact.ab800

uses gw.contactmapper.ab800.ContactIntegrationMapperFactory
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.ABContactAPISearchCriteria_SpecialistServiceCodes
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.ABContactAPISearchCriteria_Tags
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPIAddressSearch
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPIProximitySearchParameters
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPISearchCriteria


/**
 * This class converts the ContactSearchCriteria entity into the ABContactAPISearchCriteria that
 * is sent to ContactManager for search operations.  See convertToABContactAPISearchCriteria() below.
 */
@Export
class ContactSearchMapper {

  /**
   * This method converts the ContactSearchCriteria entity into the ABContactAPISearchCriteria that
   * is sent to ContactManager for search operations.
   *
   * If you have extended the ContactSearchCriteria entity with custom search fields, you must extend the
   * ABContactAPISearchCriteria class in ContactManager and then extend this method to ensure the custom
   * search data is sent to ContactManager.
   * 
   * @param searchCriteria the ContactSearchCriteria to be converted
   * @returns the ABContactAPISearchCriteria to be sent to ContactManager
   */
  public static function convertToABContactAPISearchCriteria(searchCriteria : ContactSearchCriteria) : ABContactAPISearchCriteria {
    var searchCriteriaInfo = new ABContactAPISearchCriteria()
    searchCriteriaInfo.ContactType = ContactIntegrationMapperFactory.mapper().getNameMapper().getABEntityName(searchCriteria.ContactSubtype.Code)
    searchCriteriaInfo.AdjudicativeDomain = searchCriteria.AdjudicativeDomain.Code
    searchCriteriaInfo.AttorneySpecialty = searchCriteria.AttorneySpecialty.Code
    searchCriteriaInfo.DoctorSpecialty = searchCriteria.DoctorSpecialty.Code
    searchCriteriaInfo.LawFirmSpecialty = searchCriteria.LawFirmSpecialty.Code
    searchCriteriaInfo.MedicalOrgSpecialty = searchCriteria.MedicalOrgSpecialty.Code
    searchCriteriaInfo.VendorType = searchCriteria.VendorType.Code
    searchCriteriaInfo.Keyword = searchCriteria.Keyword
    searchCriteriaInfo.KeywordKanji = searchCriteria.KeywordKanji
    searchCriteriaInfo.OrganizationName = searchCriteria.OrganizationName
    searchCriteriaInfo.PreferredVendors = searchCriteria.PreferredVendors
    searchCriteriaInfo.TaxID    = searchCriteria.TaxID
    searchCriteriaInfo.Score = searchCriteria.Score
    searchCriteriaInfo.EmployeeNumber = null   
    searchCriteriaInfo.FirstName = searchCriteria.FirstName
    searchCriteriaInfo.FirstNameKanji = searchCriteria.FirstNameKanji

    // set AllTagsRequired to false and don't set any tags
    searchCriteriaInfo.AllTagsRequired = false;
    searchCriteriaInfo.Tags = null

    if (searchCriteria.ProximitySearchParameters != null) {
      var pSearchParameters = new ABContactAPIProximitySearchParameters()
      pSearchParameters.CorrectedSearchCenter = searchCriteria.ProximitySearchParameters.CorrectedSearchCenter    
      pSearchParameters.DistanceBasedSearch = searchCriteria.ProximitySearchParameters.DistanceBasedSearch
      pSearchParameters.GeocodeStatus = searchCriteria.ProximitySearchParameters.GeocodeStatus.Code
      pSearchParameters.SpatialPoint = searchCriteria.ProximitySearchParameters.SpatialPoint
      pSearchParameters.Number = searchCriteria.ProximitySearchParameters.Number
      pSearchParameters.SavedSearchCenter = searchCriteria.ProximitySearchParameters.SavedSearchCenter
      pSearchParameters.UnitOfDistance = searchCriteria.ProximitySearchParameters.UnitOfDistance.Code
      
      searchCriteriaInfo.ProximitySearchParameters.$TypeInstance = pSearchParameters    
    }
    
    if (searchCriteria.ProximitySearchCenter != null) {
      var pSearchCenter = new ABContactAPIAddressSearch()
      pSearchCenter.City = searchCriteria.ProximitySearchCenter.City
      pSearchCenter.CityKanji = searchCriteria.ProximitySearchCenter.CityKanji
      pSearchCenter.Country = searchCriteria.ProximitySearchCenter.Country.Code
      pSearchCenter.PostalCode = searchCriteria.ProximitySearchCenter.PostalCode
      pSearchCenter.State = searchCriteria.ProximitySearchCenter.State.Code
      searchCriteriaInfo.ProximitySearchCenter.$TypeInstance = pSearchCenter
    }
    
    if (searchCriteria.Address != null) {
      var address = new ABContactAPIAddressSearch()
      address.City = searchCriteria.Address.City
      address.CityKanji = searchCriteria.Address.CityKanji
      address.Country = searchCriteria.Address.Country.Code
      address.PostalCode = searchCriteria.Address.PostalCode
      address.State = searchCriteria.Address.State.Code
      searchCriteriaInfo.Address.$TypeInstance = address
      
    }

    if (searchCriteria.VendorContactTag and searchCriteria.Tags.HasElements) {
      searchCriteriaInfo.Tags.$TypeInstance = new ABContactAPISearchCriteria_Tags()
      for (tagType in searchCriteria.Tags*.Type){
        searchCriteriaInfo.Tags.Entry.add(tagType.Code)
      }
    }

    searchCriteriaInfo.AllTagsRequired = searchCriteria.AllTagsRequired

    if (searchCriteria.VendorContactTag and searchCriteria.SpecialistServiceCodes.HasElements) {
      searchCriteriaInfo.SpecialistServiceCodes.$TypeInstance = new ABContactAPISearchCriteria_SpecialistServiceCodes()
      for (serviceCode in searchCriteria.SpecialistServiceCodes*.SpecialistServiceCode){
        searchCriteriaInfo.SpecialistServiceCodes.Entry.add(serviceCode)
      }
    }

    return searchCriteriaInfo
  }
}
