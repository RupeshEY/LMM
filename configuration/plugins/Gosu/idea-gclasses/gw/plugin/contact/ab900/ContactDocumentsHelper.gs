package gw.plugin.contact.ab900

uses gw.plugin.contact.search.ContactDocumentSearchFilter
uses gw.plugin.contact.search.ContactDocumentsSearchResult
uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns
uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns_Entry
uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchResultContainer
uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec

/**
 * This is a utility class with some methods used by the ABContactSystemPlugin and it's related classes for contact
 * documents search.
 */
@Export
class ContactDocumentsHelper {

  protected function toSearchResult(xmlSearchResult:ABContactAPIDocumentSearchResultContainer, countOnly:boolean) : ContactDocumentsSearchResult {
    //if count-only
    if(countOnly) {
      return new ContactDocumentsSearchResult(xmlSearchResult.TotalResults)
    }
    return new ContactDocumentsSearchResult(xmlSearchResult.Results.Entry.map(\ sr -> {
      return gw.plugin.contact.ab900.ContactDocumentsSearchResultMapper.createContactDocumentInfoFromSearchResult(sr)
    }))
  }

  /**
   * Searches documents up to the MaxResults.
   * Pagination is defined in the ListViewPageSizeDefault.
   * @param searchFilter
   * @return
   */
  protected function toSearchSpec(searchFilter: ContactDocumentSearchFilter) : ABContactAPIDocumentSearchSpec {
    var searchSpec = new ABContactAPIDocumentSearchSpec()
    searchSpec.GetNumResultsOnly = searchFilter.NumResultsOnly
    searchSpec.StartRow = searchFilter.StartRow
    searchSpec.ChunkSize = searchFilter.MaxResults
    searchSpec.ExcludeTotal = searchFilter.ExcludeTotal

    //sort columns
    searchSpec.SortColumns = new ABContactAPIDocumentSearchSpec_SortColumns()
    var sortColumns = new ArrayList<ABContactAPIDocumentSearchSpec_SortColumns_Entry>()

    for (sc in searchFilter.SortColumns) {
      var sortColumn = new ABContactAPIDocumentSearchSpec_SortColumns_Entry()
      sortColumn.Ascending = sc.Ascending
      sortColumn.BeanPath = sc.SortPath
      sortColumns.add(sortColumn)
    }

    if (sortColumns != null) {
      searchSpec.SortColumns.Entry = sortColumns
    }

    return searchSpec
  }
}