package gw.acc.iplm.dao.impl

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.IQueryBeanResult
uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.api.webservice.cc.claim.ClaimAPIImpl
uses gw.transaction.Transaction
uses org.apache.commons.lang.StringUtils

class ClaimDAO {

  private var LOGGER = ECFConstants.LOGGER_BLOCK()

  /**
   * This method is used for finding claim by UCR (Universal Claim Reference)
   * This is going to return null if no result is found.
   *
   * @param ucr
   * @return Claim
   */
  function findClaim(ucr: String): Claim {
    LOGGER.trace("ClaimDAO#findClaim entering")
    var claim: Claim = null
    if (StringUtils.isBlank(ucr)) {
      throw new ECFException(ECFErrorCodeType.CLAIM_UCR_NOT_FOUND)
    }
    var matchingClaims = Query.make(Claim).compare(Claim#UCR_Ext, Relop.Equals, ucr).select().toList()
    //If more than one claim returns, throw an error.
    if (matchingClaims.Count > 1) {
      throw new ECFException(ECFErrorCodeType.CLAIM_MULTIPLE_RESULTS, ucr)
    }
    claim = matchingClaims.first()
    return claim
  }

  /**
   * Retrieves a Query Result containing all Claims from the DB
   * that have a matching UCR and UMR.
   *
   * @param ucr Can be null
   * @param umr Can be null
   * @return A List of ClaimSearchView for claims with matching UCR/UMR,
   * or an empty list if no Claims found with UCR/UMR
   */
  function findClaims(ucr: String, umr: String): IQueryBeanResult<ClaimSearchView> {

    if (StringUtils.isBlank(ucr) and StringUtils.isBlank(umr)) {
      throw new IllegalArgumentException("At least one search criteria must be present")
    }

    var claimQuery = Query.make(ClaimSearchView)
    if (not StringUtils.isBlank(ucr)) {
      claimQuery.compare(Claim#UCR_Ext, Equals, ucr)
    }
    if (not StringUtils.isBlank(umr)) {
      claimQuery.compare(Claim#UMR_Ext, Equals, umr)
    }
    return claimQuery.select()
  }

  /**
   * This method is used for finding a claim by UCR (Universal Claim Reference)
   * This is going to return null if no result is found.
   * Also this method updates claim's bundle from readable to writeable.
   *
   * @param ucr
   * @return Claim
   */
  function findWriteableClaim(ucr: String): Claim {
    var claim = findClaim(ucr)
    if (claim != null) {
      var bundle = Transaction.getCurrent()
      //Make it writeable bundle
      claim = bundle.add(claim)
    }
    return claim
  }

  /**
   * This method is used for creating a new FNOL (A Claim)
   *
   * @param newClaim
   * @return
   */
  function createClaim(newClaim: Claim): Claim {
    LOGGER.trace("ClaimDAO#createClaim entering")
    new ClaimAPIImpl().addFNOL(newClaim, true)
    return newClaim
  }

  /**
   * This method is used for to commit a claim
   *
   * @param claim
   * @return Claim
   */
  function saveClaim(claim: Claim): Claim {
    claim.Bundle.commit()
    return claim
  }

}