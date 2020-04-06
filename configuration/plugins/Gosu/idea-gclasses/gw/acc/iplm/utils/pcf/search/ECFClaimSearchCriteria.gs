package gw.acc.iplm.utils.pcf.search

class ECFClaimSearchCriteria {
  var _ucr : String as UCR
  var _umr : String as UMR

  /*
  * @return true if at least one field on this search criteria is present
  */
  public function criteriaPresent() : boolean {
    return _ucr != null or _umr != null
  }
}