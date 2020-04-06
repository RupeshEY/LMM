package gw.acc.iplm.utils.pcf.search

uses gw.api.search.SimpleClaimSearchHelper
uses org.apache.commons.lang.StringUtils

enhancement ECFSimpleClaimSearchHelperEnhancement: SimpleClaimSearchHelper {

  /**
   * Search active claims, using the current search criteria. If archiving is available then also do a limited
   * count query looking for matching archived claims. If any archived claims are found, add an informational
   * message at the top of the screen.
   *
   * Includes the ECF Criteria in the search.
   * @return entity.ClaimSearchView[]
   */
  function searchWithECFCriteria() : entity.ClaimSearchView[]{
    var results = this.search()

    var resultsList = results?.toList()
    resultsList = filterOnECFCriteria(resultsList)

    return resultsList?.toTypedArray()

  }

  /**
   * Search active claims, using the current search criteria. If archiving is available then also do a limited
   * count query looking for matching archived claims. If any archived claims are found, add an informational
   * message at the top of the screen.
   *
   * Includes the ECF Criteria in the search and will only return ECF Claims.
   * @return entity.ClaimSearchView[]
   */
  function searchECFClaimsWithECFCriteria() : entity.ClaimSearchView[]{
    var results = this.search()

    var resultsList = results?.toList()
    resultsList = filterECFClaims(resultsList)
    resultsList = filterOnECFCriteria(resultsList)

    return resultsList?.toTypedArray()
  }

  /**
   * Takes in a list of ClaimSearchView and returns the subset which
   * are related to ECF Claims.
   *
   * @param claimSearchResults
   * @return List<entity.ClaimSearchView>
   */
  private function filterECFClaims(claimSearchResults : List<entity.ClaimSearchView>) : List<entity.ClaimSearchView>{
    return claimSearchResults?.where(\elt -> elt.UCR_Ext != null)
  }

  /**
   * Takes in a list of ClaimSearchView and returns the a subset
   * filtered on the included ECF Criteria (UMR, UCR).
   *
   * @param claimSearchResults
   * @return List<entity.ClaimSearchView>
   */
  private function filterOnECFCriteria(claimSearchResults : List<entity.ClaimSearchView>) : List<entity.ClaimSearchView>{
    if(StringUtils.isNotBlank(this.Criteria.UMR_Ext)){
      claimSearchResults = claimSearchResults?.where(\elt -> elt.UMR_Ext?.startsWith(this.Criteria.UMR_Ext))
    }

    if(StringUtils.isNotBlank(this.Criteria.UCR_Ext)){
      claimSearchResults = claimSearchResults?.where(\elt -> elt.UCR_Ext?.startsWith(this.Criteria.UCR_Ext))
    }

    return claimSearchResults
  }

}