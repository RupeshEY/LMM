package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.util.CurrencyUtil
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceSummaryLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Agreement) at ReinsuranceSummaryLV.pcf: line 108, column 50
    function action_19 () : void {
      pcf.ReinsuranceAgreementDetails.push(agreement, claim)
    }
    
    // 'action' attribute on ButtonCell (id=EditAdjustments) at ReinsuranceSummaryLV.pcf: line 136, column 41
    function action_37 () : void {
      pcf.AdjustRIRecoverablesPopup.push(agreement, claim)
    }
    
    // 'action' attribute on Link (id=Agreement) at ReinsuranceSummaryLV.pcf: line 108, column 50
    function action_dest_20 () : pcf.api.Destination {
      return pcf.ReinsuranceAgreementDetails.createDestination(agreement, claim)
    }
    
    // 'action' attribute on ButtonCell (id=EditAdjustments) at ReinsuranceSummaryLV.pcf: line 136, column 41
    function action_dest_38 () : pcf.api.Destination {
      return pcf.AdjustRIRecoverablesPopup.createDestination(agreement, claim)
    }
    
    // 'label' attribute on Link (id=Agreement) at ReinsuranceSummaryLV.pcf: line 108, column 50
    function label_21 () : java.lang.Object {
      return agreement.AgreementName
    }
    
    // 'value' attribute on TextCell (id=ProportionalShare) at ReinsuranceSummaryLV.pcf: line 119, column 47
    function valueRoot_26 () : java.lang.Object {
      return agreement
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceSummaryLV.pcf: line 127, column 139
    function valueRoot_32 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).withRIAgreement(agreement)
    }
    
    // 'value' attribute on CurrencyCell (id=CededReserves) at ReinsuranceSummaryLV.pcf: line 131, column 139
    function valueRoot_35 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).withRIAgreement(agreement)
    }
    
    // 'value' attribute on TextInput (id=AgreementDesc) at ReinsuranceSummaryLV.pcf: line 112, column 59
    function value_22 () : java.lang.String {
      return getAgreementDescription(agreement)
    }
    
    // 'value' attribute on TextCell (id=ProportionalShare) at ReinsuranceSummaryLV.pcf: line 119, column 47
    function value_24 () : java.math.BigDecimal {
      return agreement.ProportionalShare
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExceedsNotificationThreshold) at ReinsuranceSummaryLV.pcf: line 123, column 61
    function value_27 () : java.lang.Boolean {
      return agreement.ExceedsNotificationThreshold
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceSummaryLV.pcf: line 127, column 139
    function value_30 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).withRIAgreement(agreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=CededReserves) at ReinsuranceSummaryLV.pcf: line 131, column 139
    function value_33 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).withRIAgreement(agreement).Amount
    }
    
    // 'visible' attribute on ButtonCell (id=EditAdjustments) at ReinsuranceSummaryLV.pcf: line 136, column 41
    function visible_36 () : java.lang.Boolean {
      return hasAdjustments()
    }
    
    property get agreement () : entity.RIAgreement {
      return getIteratedValue(2) as entity.RIAgreement
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReinsuranceSummaryLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at ReinsuranceSummaryLV.pcf: line 93, column 26
    function sortBy_17 (agreement :  entity.RIAgreement) : java.lang.Object {
      return agreement.Subtype.Priority
    }
    
    // 'sortBy' attribute on IteratorSort at ReinsuranceSummaryLV.pcf: line 98, column 26
    function sortBy_18 (agreement :  entity.RIAgreement) : java.lang.Object {
      return agreement.AttachmentPoint
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecovHeader) at ReinsuranceSummaryLV.pcf: line 71, column 147
    function valueRoot_12 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).withRIAgreementGroup(agreementGroup)
    }
    
    // 'value' attribute on CurrencyCell (id=CededReservesHeader) at ReinsuranceSummaryLV.pcf: line 76, column 147
    function valueRoot_15 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).withRIAgreementGroup(agreementGroup)
    }
    
    // 'value' attribute on TextCell (id=GroupDescription) at ReinsuranceSummaryLV.pcf: line 48, column 63
    function valueRoot_3 () : java.lang.Object {
      return agreementGroup
    }
    
    // 'value' attribute on TextCell (id=GroupDescription) at ReinsuranceSummaryLV.pcf: line 48, column 63
    function value_1 () : java.lang.String {
      return agreementGroup.AgreementGroupSummaryString
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecovHeader) at ReinsuranceSummaryLV.pcf: line 71, column 147
    function value_10 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).withRIAgreementGroup(agreementGroup).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=CededReservesHeader) at ReinsuranceSummaryLV.pcf: line 76, column 147
    function value_13 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).withRIAgreementGroup(agreementGroup).Amount
    }
    
    // 'value' attribute on RowIterator (id=Agreement) at ReinsuranceSummaryLV.pcf: line 90, column 24
    function value_39 () : entity.RIAgreement[] {
      return agreementGroup.Agreements
    }
    
    // 'value' attribute on TextCell (id=Label) at ReinsuranceSummaryLV.pcf: line 55, column 24
    function value_4 () : java.lang.String {
      return agreementGroup.RiskName 
    }
    
    // 'value' attribute on TextCell (id=PropShareHeader) at ReinsuranceSummaryLV.pcf: line 62, column 45
    function value_7 () : java.math.BigDecimal {
      return agreementGroup.ProportionalShare
    }
    
    // 'visible' attribute on EmptyCell (id=EditAdjustmentsHeaderRow) at ReinsuranceSummaryLV.pcf: line 80, column 39
    function visible_16 () : java.lang.Boolean {
      return hasAdjustments()
    }
    
    property get agreementGroup () : entity.RIAgreementGroup {
      return getIteratedValue(1) as entity.RIAgreementGroup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceSummaryLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecovFooter) at ReinsuranceSummaryLV.pcf: line 154, column 108
    function valueRoot_43 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim)
    }
    
    // 'value' attribute on CurrencyCell (id=CededReservesFooter) at ReinsuranceSummaryLV.pcf: line 159, column 108
    function valueRoot_46 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim)
    }
    
    // 'value' attribute on RowIterator (id=AgreementGroup) at ReinsuranceSummaryLV.pcf: line 42, column 45
    function value_40 () : entity.RIAgreementGroup[] {
      return claim.RIAgreementGroups.sortBy(\ r -> r.PublicID)
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecovFooter) at ReinsuranceSummaryLV.pcf: line 154, column 108
    function value_41 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=CededReservesFooter) at ReinsuranceSummaryLV.pcf: line 159, column 108
    function value_44 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).Amount
    }
    
    // 'visible' attribute on TextCell (id=EditAdjustmentsHeaderRow2) at ReinsuranceSummaryLV.pcf: line 35, column 37
    function visible_0 () : java.lang.Boolean {
      return hasAdjustments()
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
    function getAgreementDescription (agreement : RIAgreement) : String {
      if (agreement typeis entity.NonProportionalRIAgreement) {
        return DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceSummary.AttachmentPoint") + CurrencyUtil.renderAsCurrency(agreement.AttachmentPoint)
               + "  "
               + DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceSummary.TopOfLayer") + CurrencyUtil.renderAsCurrency(agreement.TopOfLayer)
      }
      return ""
    }
    
    function hasAdjustments () : boolean {
      return true;
    }
    
    
  }
  
  
}