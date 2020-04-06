package gw.entity

uses java.util.Date
uses gw.api.util.DisplayableException
uses gw.api.locale.DisplayKey
uses java.util.HashSet

/**
 * Properties for accessing ClaimWorkComp properties on a Claim.
 */
@Export
enhancement GWClaimClaimWorkCompEnhancement : entity.Claim {

  private property get EnsureClaimWorkComp() : ClaimWorkComp {
    var claimWorkComp = this.ClaimWorkComp
    if (claimWorkComp == null) {
      claimWorkComp = new ClaimWorkComp(this.Bundle)
      this.ClaimWorkComp = claimWorkComp
    }
    return claimWorkComp
  }

  property get TimeLossReport() : Boolean { return this.ClaimWorkComp?.TimeLossReport }
  property set TimeLossReport(value : Boolean) { EnsureClaimWorkComp.TimeLossReport = value }

  property get MedicalReport() : Boolean { return this.ClaimWorkComp?.MedicalReport }
  property set MedicalReport(value : Boolean) { EnsureClaimWorkComp.MedicalReport = value }

  property get DeathReport() : Boolean { return this.ClaimWorkComp?.DeathReport }
  property set DeathReport(value : Boolean) { EnsureClaimWorkComp.DeathReport = value }

  property get EmployerLiability() : Boolean { return this.ClaimWorkComp?.EmployerLiability }
  property set EmployerLiability(value : Boolean) { EnsureClaimWorkComp.EmployerLiability = value }

  property get EquipmentUsed() : String { return this.ClaimWorkComp?.EquipmentUsed }
  property set EquipmentUsed(value : String) { EnsureClaimWorkComp.EquipmentUsed = value }

  property get ActivityPerformed() : String { return this.ClaimWorkComp?.ActivityPerformed }
  property set ActivityPerformed(value : String) { EnsureClaimWorkComp.ActivityPerformed = value }

  property get IllnessRelatedToExposure() : Boolean { return this.ClaimWorkComp?.IllnessRelatedToExposure }
  property set IllnessRelatedToExposure(value : Boolean) { EnsureClaimWorkComp.IllnessRelatedToExposure = value }

  property get ClassCodeByLocation() : Boolean { return this.ClaimWorkComp?.ClassCodeByLocation }
  property set ClassCodeByLocation(value : Boolean) { EnsureClaimWorkComp.ClassCodeByLocation = value }

  property get Compensable() : CompensabilityDecision { return this.ClaimWorkComp?.Compensable }
  property set Compensable(value : CompensabilityDecision) {
    EnsureClaimWorkComp.Compensable = value
    if (this.ClaimWorkComp.Compensable != CompensabilityDecision.TC_PARTIALDENIAL) {
      PartialDenialReason = null
    }
    if (this.ClaimWorkComp.Compensable != CompensabilityDecision.TC_DENIED) {
      for (var reason in FullDenialReasons) {
        removeFromFullDenialReasons(reason)
      }
      FullDenialEffectiveDate = null
    }
  }

  /**
   * Creates a new FullDenialReason to add to the Claim when the CompensabilityDecision
   * is set to Denied
   * @return new FullDenialReason
   */
  public function createNewFullDenialReason() : FullDenialReason {
    var newFullDenialReason = new FullDenialReason()
    this.addToFullDenialReasons(newFullDenialReason)
    return newFullDenialReason;
  }

  /**
   * Validate this Claim's Full Denial Reasons are not duplicated, throwing an user error message if
   * it is not valid (i.e., there is a duplicate FullDenialReason code)
   */
  function validateUniqueFullDenialReasons() {
    var set = new HashSet ()
    for (reason in FullDenialReasons) {
      if (not set.add(reason.FullDenialReasonCode)) {
        throw new DisplayableException(DisplayKey.get("Web.ClaimLossDetails.FullDenialReasonsDuplicated"))
      }
    }
  }

  property get FullDenialReasons() : FullDenialReason[] { return this.ClaimWorkComp?.FullDenialReasons }
  property set FullDenialReasons(value : FullDenialReason[]) { EnsureClaimWorkComp.FullDenialReasons = value }
  function addToFullDenialReasons(value : FullDenialReason) { EnsureClaimWorkComp.addToFullDenialReasons(value) }
  function removeFromFullDenialReasons(value : FullDenialReason) { EnsureClaimWorkComp.removeFromFullDenialReasons(value) }

  property get FullDenialEffectiveDate() : Date { return this.ClaimWorkComp?.FullDenialEffectiveDate }
  property set FullDenialEffectiveDate(value : Date) { EnsureClaimWorkComp.FullDenialEffectiveDate = value }

  property get PartialDenialReason() : PartialDenialReason { return this.ClaimWorkComp?.PartialDenialReason }
  property set PartialDenialReason(value : PartialDenialReason) { EnsureClaimWorkComp.PartialDenialReason = value }

  property get WaitingPeriodApplied() : Boolean { return this.ClaimWorkComp?.WaitingPeriodApplied }
  property set WaitingPeriodApplied(value : Boolean) { EnsureClaimWorkComp.WaitingPeriodApplied = value }

  /**
  * Clear the selected value when 'First Notice Suit?' is set to No
   */
  function clearDateNotifiedOfEmployeeRepresentation(){
    if(not this.FirstNoticeSuit){
      this.ClaimWorkComp?.DateOfEmployeeRepresentation = null
    }
  }

  /**
   * Whether the Claimant Additional Information for Workers Comp claims should be displayed.
   * @return true if it is a WC claim and the person is the claimant in the Claim, false otherwise
   */
  function showClaimantInfo(person : Person, claimContact: ClaimContact) : boolean {

    if ( this.Policy.PolicyType != PolicyType.TC_WORKERSCOMP) {
      return false
    }
    var contactByRoleClaimant = this.getContactByRole(TC_CLAIMANT)
    return  claimContact == null ? true :  contactByRoleClaimant == person
  }

}
