package gw.solr.mapper

uses gw.xsd.config.solr_search_config.DataProperty
uses gw.xsd.config.solr_search_config.ResultField
uses java.util.List


/**
 * Builds the status.
 */
@Export
class BuildStatus implements ISolrQueryResultMapper {
  
  /**
   * Status column is not sortable
   */
  override function mapSortColumn(resultFields : List<ResultField>, criteriaProperties : List<DataProperty>, dataHolder : IDataHolder) : String {
    return null
  }

  /**
   * From the claimNumber retrieve the claim and get its current state.
   *
   * @return the status of the claim
   */
  override function mapQueryResult(resultFields : List<ResultField>, criteriaProperties : List<DataProperty>, dataHolder : IDataHolder, solrResult : IResultHolder) : Object {
    var retVal = ""
    var claimNumber = solrResult.lookup<String>( resultFields.get(0) )
    var claimInfo = Claim.finder.findClaimInfoByClaimNumber(claimNumber)
    if(claimInfo != null) {
      switch(claimInfo.ArchiveState) {
        case TC_ARCHIVED:    retVal = ClaimState.TC_ARCHIVED.DisplayName
                             break
        case TC_RETRIEVING:  retVal = ArchiveState.TC_RETRIEVING.DisplayName
                             break
        default:
             if(claimInfo.Claim!=null) {
               retVal = claimInfo.Claim.State.DisplayName
             }
      }
    }
    return retVal
  }

}
