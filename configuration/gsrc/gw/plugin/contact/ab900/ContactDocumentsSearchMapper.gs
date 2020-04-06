package gw.plugin.contact.ab900

uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchCriteria_IncludeDocumentSecurityTypes
uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchCriteria

/**
 * This class converts the DocumentSearchCriteria entity into the ABContactAPIDocumentSearchCriteria that
 * is sent to ContactManager for search operations. See convertToABContactAPIDocumentSearchCriteria() below.
 */
@Export
class ContactDocumentsSearchMapper {

  /**
   * This method converts the DocumentSearchCriteria entity into the ABContactAPIDocumentSearchCriteria that
   * is sent to ContactManager for search operations.
   *
   * If you have extended the DocumentSearchCriteria entity with custom search fields, you must extend the
   * ABContactAPIDocumentSearchCriteria class in ContactManager and then extend this method to ensure the custom
   * search data is sent to ContactManager.
   * 
   * @param searchCriteria the DocumentSearchCriteria to be converted
   * @returns the ABContactAPIDocumentSearchCriteria to be sent to ContactManager
   */
  public static function convertToABContactAPIDocumentSearchCriteria(searchCriteria : DocumentSearchCriteria) : ABContactAPIDocumentSearchCriteria {
    var searchCriteriaInfo = new ABContactAPIDocumentSearchCriteria()
    searchCriteriaInfo.IncludeObsoletes = searchCriteria.IncludeObsoletes
    searchCriteriaInfo.IncludeDocumentSecurityTypes = new ABContactAPIDocumentSearchCriteria_IncludeDocumentSecurityTypes()

    for (typeWrapper in searchCriteria?.DocumentSecurityTypes){
      searchCriteriaInfo.IncludeDocumentSecurityTypes.Entry.add(typeWrapper.DocumentSecurityType.Code)
    }

    return searchCriteriaInfo
  }
}
