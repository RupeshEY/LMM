package gw.api.iso

uses xsd.iso.req.AdjusterParty
uses xsd.iso.req.AdjusterPartyInfo
uses java.util.HashMap

/**
 * Manages the AdjusterParty aggregates associated with an ISO ClaimSearch
 * request. An AdjusterParty corresponds to an assigned user in ClaimCenter.
 * Each AdjusterParty contains details about the adjuster (name, address etc.)
 * plus one or more AdjustPartyInfo aggregates, one for each associated loss
 * section in the ClaimSearch request. The AdjusterPartyInfo contains the
 * CoverageCd and LossCauseCd for the loss section and its AssignmentRef 
 * attribute is set to the id of the loss section.
 * <p>
 * This class manages the AdjusterParty aggregates for a single request;
 * in particular it keeps track of which adjusters already have an
 * AdjusterParty aggregate. If another loss section is added for an
 * existing adjuster then the AdjusterParty aggregate will be reused
 * and only a new AdjusterPartyInfo will be created.
 */
@Export
class ISOAdjusterPartiesBase {

  var _claimSearch : ISOClaimSearchRequestBase as readonly ClaimSearch
  var _partiesByUser = new HashMap<User,AdjusterParty>()
  
  /**
   * Create new ISOAdjusterParties object to manage the AdjusterParties
   * for the given claim search request.
   */
  construct(inClaimSearch : ISOClaimSearchRequestBase) {
    _claimSearch = inClaimSearch
  }
  
  /**
   * Adds the given user as an AdjusterParty on the ClaimSearch request and
   * creates an AdjusterPartyInfo for that party corresponding to the given
   * coverage codes (in particular the CoverageCd and LossCauseCd). If there is
   * an existing AdjusterParty for the user, then reuse that AdjusterParty and
   * just add a new AdjusterPartyInfo.
   * <p>
   * If the given user is null, always creates a new AdjusterParty with a
   * null GeneralPartyInfo aggregate (the GeneralPartyInfo aggregate is
   * optional for AdjusterParty).
   * <p>
   * Returns the newly created AdjusterPartyInfo
   */
  function addAdjuster(adjuster : User, coverageCodes : ISOCoverageCodes) : AdjusterPartyInfo {
    var adjusterParty = _partiesByUser[adjuster]
    if (adjusterParty == null) {
      adjusterParty = createAdjusterParty(adjuster.Contact)
      ClaimSearch.AddRequest.AdjusterParty.add(adjusterParty)
      _partiesByUser[adjuster] = adjusterParty
    }
    var adjusterPartyInfo = createAdjusterPartyInfo(coverageCodes)
    adjusterParty.AdjusterPartyInfo.add(adjusterPartyInfo)
    return adjusterPartyInfo
  }

  /**
   * Creates the AdjusterParty aggregate. Called by addAdjuster if there is not
   * an existing AdjusterParty aggregate for the given adjuster
   */
  protected function createAdjusterParty(adjuster : Contact) : AdjusterParty {
    var adjusterParty = new AdjusterParty()
    var claim = ClaimSearch.Claim
    adjusterParty.ItemIdInfo.AgencyId = (claim.AgencyId != null) ? claim.AgencyId : ClaimSearch.Properties.AgencyId
    if (adjuster != null) {
      adjusterParty.GeneralPartyInfo = ClaimSearch.ClaimsParties.createLimitedGeneralPartyInfo(adjuster)
    }
    return adjusterParty
  }
  
  /**
   * Creates an AdjusterPartyInfo aggregate to be added to the AdjusterParty.
   * Always called by addAdjuster, as a new AdjusterPartyInfo is needed whether
   * or not the AdjusterParty was already present.
   */
  protected function createAdjusterPartyInfo(coverageCodes : ISOCoverageCodes) : AdjusterPartyInfo {
    var adjusterPartyInfo = new AdjusterPartyInfo()
    if (coverageCodes.CoverageType != null) {
      adjusterPartyInfo.CoverageCd = coverageCodes.CoverageType
      adjusterPartyInfo.CoverageCd_elem.Codelistref = ClaimSearch.findOrCreateCodeList(ISOCodeList.COVERAGE_CODE.Id)
    }
    adjusterPartyInfo.LossCauseCd = coverageCodes.LossType
    adjusterPartyInfo.LossCauseCd_elem.Codelistref = ClaimSearch.findOrCreateCodeList(ISOCodeList.LOSS_TYPE_CODE.Id)
    return adjusterPartyInfo
  }
}
