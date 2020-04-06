package gw.api.iso
uses gw.api.locale.DisplayKey
uses java.math.BigDecimal
uses java.util.ArrayList
uses java.lang.IllegalStateException
uses java.lang.StringBuilder
uses java.util.Collections

uses gw.lang.reflect.IType
uses xsd.iso.req.ClaimsOccurrence
uses xsd.iso.req.anonymous.elements.ClaimsOccurrence_ProbableIncurredAmt
uses java.util.List

/**
 * Builds an ISO claim search request containing core claims information plus
 * one or more loss sections, each corresponding to an exposure.
 * <p>
 * For exposure level messaging each claim search request will have a single
 * loss section, for the exposure being sent to ISO.
 * <p>
 * For claim level messaging each claim search request will have multiple loss
 * sections, one for each exposure.
 */
@Export
class ISOClaimSearchRequestBase extends ISORequest {

  /** Maintains the ClaimsParties for the search request */
  var _claimsParties : ISOClaimsParties as readonly ClaimsParties

  /** Maintains the AdjusterParties for the search request */
  var _adjusterParties : ISOAdjusterParties as readonly AdjusterParties
  
  /** The sum of loss estimates from the exposures*/
  var _probableIncurredAmount = BigDecimal.ZERO
  
  /**
   * For claim level messages, the list of loss sections that have been added
   * to this request. Empty for exposure level messages
   */
  var _lossSections = new ArrayList<ISOLossSection>()
  
  /**
   * For exposure level messages, a list of error messages explaining why
   * certain exposures could not be added to the request. Empty for exposure
   * level messages
   */
  var _lossSectionErrors = new ArrayList<String>()
  
  /**
   * Constructs a new ISOClaimSearchRequest for the given claim and initializes
   * the ACORD and AddRequest aggregates.
   */
  construct(inClaim : Claim)  {
    super(inClaim)
    _claimsParties = new ISOClaimsParties(this)
    _adjusterParties = new ISOAdjusterParties(this)
  }
  
  /**
   * Creates the Policy and ClaimsOccurence aggregates, according to the given
   * parameters. This method is only called once per request, for both claim
   * and exposure level messaging.
   * <p>
   * For exposure level messaging the insurerId is the claim number plus the 
   * exposure number, as created by exposure.getISOInsurerId(). The lobCode
   * is the policy type, as looked up in the the ISO coverage code mapper.
   * The description is the exposure's description (actually the exposure's
   * incident's description)
   * <p>
   * For claim level messaging the insurerId is just the claim number. The
   * lobCode is the policy type, as looked up in the ISO coverage code mapper
   * for the first exposure on the claim. The description is the claim's
   * description. Note that for a claim level message there is a small chance
   * that the lobCode as mapped from the first exposure may not be the same
   * as the lobCode for all later exposures; normally a ClaimCenter policy
   * type maps to a single ISO policy type but it is possible to create
   * mappings where this isn't true. In that case the first exposure wins;
   * loss sections for subsequent exposures will only be added if they agree
   * on the initial lobCode.
   */
  protected function initializeClaimInvestigationAddRequest(
          insurerId : String,
          lobCode : String,
          incidentDescription : String) {
    AddRequest.ReplacementInd = ISOConstants.FALSE
    createPolicy(Claim.Policy.EffectiveDate, Claim.Policy.ExpirationDate, 
                 Claim.Policy.AssignedRisk, lobCode)
    createClaimsOccurrence(insurerId, incidentDescription)
  }

  /**
   * Called by initializeClaimInvestigationAddRequest, to create the
   * ClaimsOccurrence aggregate. Creates the standard fields populated for
   * both claim search and key field update requests by calling
   * super.createClaimsOccurrence. Then populates the claim search specific
   * fields such as loss time, incident description, addr and 
   * com.iso.AccidentWitnessedInd
   */    
  protected function createClaimsOccurrence(insurerId : String, incidentDescription : String) {   
    super.createClaimsOccurrence(Claim.LossDate, Claim.ReportedDate, insurerId)        
    AddRequest.ClaimsOccurrence.Id =  getNextId()
    AddRequest.ClaimsOccurrence.LossTime = Translate.formatClaimTime(Claim.LossDate)
    AddRequest.ClaimsOccurrence.IncidentDesc = truncateString(incidentDescription, 50)
    if (Claim.LossLocation!= null) {
      AddRequest.ClaimsOccurrence.Addr = createAddr(Claim.LossLocation)
    }
    // check for witness, witness need to be inserted after address
    var witnessContactRole = Properties.ClaimSearchContactRoleForWitness
    if (witnessContactRole != null
        and !Claim.getAllClaimContactRolesByRoles({witnessContactRole}).Empty) {
      AddRequest.ClaimsOccurrence.ComIso_AccidentWitnessedInd = ISOConstants.YES
    } else {
      AddRequest.ClaimsOccurrence.ComIso_AccidentWitnessedInd = ISOConstants.NO
    }
  }

  /**
   * Populates the ClaimsOccurrence ProbableIncurredAmt field. Can be called
   * multiple times in which case it will set the field to the total of all
   * the values it has been called with. Ignores null and zero amounts.
   */
  protected function createProbableIncurredAmt(amount : BigDecimal) {
    if (amount != null and amount != BigDecimal.ZERO) {
      _probableIncurredAmount = _probableIncurredAmount.add(amount)
      var piaa : ClaimsOccurrence_ProbableIncurredAmt
      if (AddRequest.ClaimsOccurrence.ProbableIncurredAmt.HasElements) {
        piaa = AddRequest.ClaimsOccurrence.ProbableIncurredAmt[0]
      } else {
        piaa = new ClaimsOccurrence_ProbableIncurredAmt()
        AddRequest.ClaimsOccurrence.ProbableIncurredAmt.add(piaa)
      }
      piaa.Amt = _probableIncurredAmount.toString()
      /* Note that although iso version 5.2 now allows multiple occurrences of a ProbableIncurredAmt,
         (EstimatedLossAmount) (one for each Coverage). But since CC does not collect LossEstimates
         at the Coverage level (they are at the Incident level) we sum the estimate for all Incidents
         and report one amount, as allowed by XML User Manual v5.2, v5.3 from ISO.  See "Estimated Loss Amount"
         in that document for more details.
      */
    }
  }

  /**
   * Creates a claim level search payload, adding in loss sections from each
   * exposure, and converting the resulting XML to a string. Only used for
   * claim level messaging, never for exposure level messaging.
   * <p>
   * Iterates the claim's exposures, in the order returned by the
   * ISOOrderedExposures enhancement property. Each exposure is checked
   * to see if a loss section can be added for that exposure (see
   * verifyLossSection). If it can then the loss section is added and
   * populated. If it cannot an error is logged.
   * <p>
   * If one or more loss sections were added, returns the generated XML
   * as a string. Otherwise returns null. 
   */
  public function createClaimLevelSearchPayload() : String {
    for (exposure in Claim.ISOOrderedExposures) {
      addExposureToClaimLevelSearchRequest(exposure)
    }
    logErrorMessageForClaimLevelSearch()
    return _lossSections.Count > 0  ? AcordRequest.asUTFString() : null
  }

  /**
   * Used by createClaimLevelSearchPayload to add and populate a loss section
   * for the given exposure. Only used by claim level messaging.
   * <p>
   * First creates a loss section for the exposure, using
   * constructClaimLevelLossSection. Then verifies that the loss section can
   * be added. If so adds and populates the loss section. If not discards
   * the loss section and adds an error message, to be logged later.
   * <p>
   * Only used for claim level messaging
   */
  protected function addExposureToClaimLevelSearchRequest(exposure : Exposure) {
    var lossSection = constructClaimLevelLossSection(exposure)
    if (lossSection != null) {
      var errorMessage = verifyLossSection(lossSection)
      if (errorMessage == null) {
        lossSection.populate() 
        _lossSections.add(lossSection)
      } else {
        _lossSectionErrors.add(errorMessage)
      }
    }
  }
  
  /**
   * Returns a list of the loss sections added to the request.
   * <p>
   * Only used for claim level messaging
   */
  public property get ClaimLevelLossSections() : List<ISOLossSection> {
    return Collections.unmodifiableList(_lossSections);
  }
  
  /**
   * Returns a list of the errors generated while adding loss sections to
   * the request. These errors are usually logged, as there's little the
   * end user can do about them.
   * <p>
   * Only used for claim level messaging
   */
  public property get ClaimLevelLossSectionErrors() : List<String> {
    return Collections.unmodifiableList(_lossSectionErrors);
  }
  
  /**
   * Called to create a new loss section for the given exposure. Uses the
   * configurable ISOLossSectionType enhancement method to determine which
   * type of loss section to create. Then looks for a constructor on that
   * type that takes an ISOClaimSearchRequest and an exposure, and calls that
   * constructor with "this" and the given exposure as arguments.
   * <p>
   * Only used for claim level messaging
   */
  public function constructClaimLevelLossSection(exposure : Exposure) : ISOLossSection  {
    var lossSectionType = exposure.ISOLossSectionType
    if (lossSectionType == null) {
      return null
    }
    var constructor = lossSectionType.TypeInfo.getConstructor(new IType[] {ISOClaimSearchRequest, entity.Exposure})
    if (constructor == null) {
      throw new IllegalStateException(DisplayKey.get("Java.Error.ISO.NoConstructorForClaim", lossSectionType))
    }
    return constructor.Constructor.newInstance({this, exposure}) as ISOLossSection  
  }
  
  /**
   * Called to check whether the given loss section can be added to this
   * request. First checks that the policy type (Policy.LOBCd) required
   * for this loss section matches the existing one (if set). See
   * verifyPolicyTypeMatches(...) for details.
   * <p>
   * Then calls lossSection.verifyCanPopulate(...), passing in the list of
   * existing loss sections. This checks that the loss section does not
   * clash with any of the existing loss sections - for example some loss
   * sections can only appear once in a claim search request.
   * <p>
   * Returns a non null error message if either check fails. Returns null if
   * there are no errors and the loss section can be added.
   * <p>
   * Only used for claim level messaging
   */
  protected function verifyLossSection(lossSection : ISOLossSection) : String {
    var error : String = null
    if (!verifyPolicyTypeMatches(lossSection)) {
      error = DisplayKey.get("Java.Error.ISO.MismatchPolicyTypeCode")
    } else {
      error = lossSection.verifyCanPopulate(ClaimLevelLossSections)
    }
    return error
  }
  
  /**
   * Checks whether the policy type required by the given loss section
   * matches any Policy.LOBCd already set on this request.
   * <p>
   * Only used for claim level messaging
   */
  protected function verifyPolicyTypeMatches(lossSection : ISOLossSection) : boolean {
    var policyTypeCodeInClaimSearch = AddRequest.Policy.LOBCd
    return policyTypeCodeInClaimSearch == null
      or lossSection.CoverageCodes.PolicyType == policyTypeCodeInClaimSearch
  }
  
  /**
   * Called by createClaimLevelSearchPayload() to log any error messages
   * generated by adding loss sections for each exposure
   * <p>
   * Only used for claim level messaging
   */
  protected function logErrorMessageForClaimLevelSearch() {
    if (_lossSectionErrors.Count > 0 ) {
      var loggingMessage = new StringBuilder()
      loggingMessage.append("Exposure(s) are omitted in creating claim-level iso claim search for Claim number : " + Claim.ClaimNumber)
      for (errorMessage in _lossSectionErrors) {
        loggingMessage.append("\n" + errorMessage)
      }
      ISOProperties.LOGGER.info(loggingMessage as String)
    }
  }

}
