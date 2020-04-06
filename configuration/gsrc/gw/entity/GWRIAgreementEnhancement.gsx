package gw.entity

uses java.math.BigDecimal
uses gw.datatype.annotation.DataType
uses gw.api.financials.FinancialsCalculations
uses gw.api.financials.FinancialsCalculator
uses gw.plugin.Plugins
uses gw.plugin.financials.reinsurance.IReinsuranceTransactionPlugin

@Export
enhancement GWRIAgreementEnhancement : entity.RIAgreement {

  property get isUserEditable() : Boolean {
    return !this.ManagedInExternalSystem
  }
  
  property get isUserDeletable() : Boolean {
    return !this.ManagedInExternalSystem
  }
  
  property get ReinsuranceCategory() : String {
    if(this typeis ProportionalRIAgreement)
      return ProportionalRIAgreement.Type.RelativeName
    else
      return NonProportionalRIAgreement.Type.RelativeName
  }

  @DataType("ripercentagedec")
  property get ProportionalShare() : BigDecimal {
    return (this typeis entity.ProportionalRIAgreement ? this.ProportionalShare : null)
  }

  property get HasNotificationThreshold() : boolean {
    return this.NotificationThreshold != null and not this.NotificationThreshold.Amount.IsZero
  }
  
  function matches(agreement : RIAgreement) : boolean {
    return this.AgreementName == agreement.AgreementName and this.AttachmentPoint == agreement.AttachmentPoint and this.TopOfLayer == agreement.TopOfLayer
  }

  function canChangeAgreementGroups() : boolean {
    return hasNoAdjustments() and willNotHaveRICodings()
  }
  
  private function hasNoAdjustments() : boolean {
      return hasZero(FinancialsCalculations.getRITotalCededReservesAdjustments()) and
      hasZero(FinancialsCalculations.getRITotalRecoverablesAdjustments())
  }
  
  private function willNotHaveRICodings() : boolean {
    return (this typeis ProportionalRIAgreement and
        Plugins.isEnabled(IReinsuranceTransactionPlugin) or
        (hasZero(FinancialsCalculations.getRIOpenCededReserves()) and
         hasZero(FinancialsCalculations.getRITotalRecoverables())))
  }

  private function hasZero(calc : FinancialsCalculator) : boolean {
    var claim = this.Claim
    var value = calc.withClaim(claim).withRIAgreement(this).Amount

    return value == null or value.Amount.IsZero
  }
}
