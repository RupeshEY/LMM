package gw.acc.iplm.utils.pcf.search

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.api.database.IQueryBeanResult
uses gw.api.util.DisplayableException

uses java.io.Serializable

class ECFClaimSearch implements Serializable {

  private var _ecfClaimSearchCriteria: ECFClaimSearchCriteria as ECFClaimSearchCriteria
  private var _claimDao: ClaimDAO

  construct(claimDao: ClaimDAO) {
    this._claimDao = claimDao
    this.ECFClaimSearchCriteria = new ECFClaimSearchCriteria()
  }

  static function newInstance(): ECFClaimSearch {
    return new ECFClaimSearch(new ClaimDAO())
  }

  public function search(): IQueryBeanResult<ClaimSearchView> {
    if (not ECFClaimSearchCriteria.criteriaPresent()) {
      throw new DisplayableException("At least one search criteria must be present")
    }

    return _claimDao.findClaims(ECFClaimSearchCriteria.UCR, ECFClaimSearchCriteria.UMR)
  }

  public function reset() {
    this.ECFClaimSearchCriteria = new ECFClaimSearchCriteria()
  }

}