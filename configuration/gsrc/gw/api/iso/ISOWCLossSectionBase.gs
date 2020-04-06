package gw.api.iso
uses gw.xml.xsd.IXMLNodeWithID
uses xsd.iso.req.ClaimsParty
uses gw.xml.XmlElement

/**
 * Base class for creating a ClaimsInjuredInfo loss section based on a worker's
 * comp exposure and claim. Extends and overrides the base functionality provided
 * by ISOInjuryLossSection, mainly by pulling data from different fields in the
 * data model.
 */
@Export
class ISOWCLossSectionBase extends ISOInjuryLossSection {

  /**
   * Exposure level constructor, used when creating a request for just the
   * given exposure. Implicitly creates an ISOClaimSearchRequest.
   */
  construct(inExposure : Exposure) {
    super(inExposure)
  }

  /**
   * Claim level constructor, for adding a new loss section to an existing
   * claim level request.
   */
  construct(inSearchRequest : ISOClaimSearchRequest, inExposure : Exposure) {
    super(inSearchRequest, inExposure)
  }
  
  /**
   * Override basic ISOInjuryLossSection implementation to add in the
   * WorkCompLossInfo.EmployeeInfo.HiredDt field
   */
  protected override function createLossSection(claimantParty : ClaimsParty) : XmlElement {
    var hireDate = Exposure.Claim.EmploymentData.HireDate
    if (hireDate != null) {
      SearchRequest.AddRequest.WorkCompLossInfoSingular.EmployeeInfo.HiredDt = SearchRequest.Translate.formatClaimDate(hireDate)
    }
    return super.createLossSection(claimantParty)  
  }
  
  /**
   * Override base ISOLossSection behavior to use claim description rather than
   * exposure description
   */
  override protected property get IncidentDescription() : String {
    return Exposure.Claim.Description
  }

  /**
   * Override base ISOLossSection behavior; worker's comp claims are never first
   * party
   */
  override protected property get IsFirstParty() : boolean {
    return false
  }
 
  /**
   * Override base ISOLossSection behavior; worker's comp claimants are stored at
   * the claim level
   */
  protected override property get Claimant() : Contact {
    return Exposure.Claim.ClaimantDenorm
  }
  
  /**
   * Override base ISOInjuryLossSection behavior; return the claim injury
   * incident description
   */
  protected override property get InjuryDescription() : String {
    return InjuryIncident.Description
  }

  /**
   * Override base ISOInjuryLossSection behavior; return the claim injury
   * incident
   */
  protected override property get InjuryIncident() : InjuryIncident {
    return Exposure.Claim.ClaimInjuryIncident
  }

  /**
   * Override base ISOInjuryLossSection behavior; the
   * com.iso.DisabledDueToAccidentInd field should not be populated for
   * worker's comp claims.
   */
  protected override property get DisabledDueToAccident() : DisabledDueToAccident {
    return null 
  }
}
