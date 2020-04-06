package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimSummaryExposuresLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimSummaryExposuresLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Exposures_Order) at NewClaimSummaryExposuresLV.pcf: line 30, column 40
    function action_23 () : void {
      NewClaimWizard_ExposurePagePopup.push(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TypeKeyCell (id=Exposures_Type) at NewClaimSummaryExposuresLV.pcf: line 36, column 45
    function action_28 () : void {
      NewClaimWizard_ExposurePagePopup.push(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TextCell (id=Exposures_Order) at NewClaimSummaryExposuresLV.pcf: line 30, column 40
    function action_dest_24 () : pcf.api.Destination {
      return pcf.NewClaimWizard_ExposurePagePopup.createDestination(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TypeKeyCell (id=Exposures_Type) at NewClaimSummaryExposuresLV.pcf: line 36, column 45
    function action_dest_29 () : pcf.api.Destination {
      return pcf.NewClaimWizard_ExposurePagePopup.createDestination(Claim, Exposure, Wizard)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposures_Order) at NewClaimSummaryExposuresLV.pcf: line 30, column 40
    function outputConversion_25 (VALUE :  entity.Exposure) : java.lang.String {
      return VALUE.ClaimOrder as String
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Type) at NewClaimSummaryExposuresLV.pcf: line 36, column 45
    function valueRoot_31 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on CurrencyCell (id=Exposures_RemainingReserves) at NewClaimSummaryExposuresLV.pcf: line 64, column 53
    function valueRoot_47 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TextCell (id=Exposures_Order) at NewClaimSummaryExposuresLV.pcf: line 30, column 40
    function value_22 () : entity.Exposure {
      return Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Type) at NewClaimSummaryExposuresLV.pcf: line 36, column 45
    function value_27 () : typekey.ExposureType {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Coverage) at NewClaimSummaryExposuresLV.pcf: line 41, column 45
    function value_32 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Exposures_Claimant) at NewClaimSummaryExposuresLV.pcf: line 47, column 39
    function value_35 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextCell (id=Exposures_Assignee) at NewClaimSummaryExposuresLV.pcf: line 52, column 51
    function value_38 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Status) at NewClaimSummaryExposuresLV.pcf: line 57, column 46
    function value_41 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on CurrencyCell (id=Exposures_RemainingReserves) at NewClaimSummaryExposuresLV.pcf: line 64, column 53
    function value_45 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyCell (id=Exposures_FuturePayments) at NewClaimSummaryExposuresLV.pcf: line 71, column 53
    function value_49 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyCell (id=Exposures_Paid) at NewClaimSummaryExposuresLV.pcf: line 78, column 53
    function value_53 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'visible' attribute on CurrencyCell (id=Exposures_RemainingReserves) at NewClaimSummaryExposuresLV.pcf: line 64, column 53
    function visible_44 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'visible' attribute on CurrencyCell (id=Exposures_FuturePayments) at NewClaimSummaryExposuresLV.pcf: line 71, column 53
    function visible_48 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimSummaryExposuresLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 30, column 40
    function sortValue_0 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 36, column 45
    function sortValue_1 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 71, column 53
    function sortValue_10 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 78, column 53
    function sortValue_12 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 41, column 45
    function sortValue_2 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.PrimaryCoverage
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 52, column 51
    function sortValue_3 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 52, column 51
    function sortValue_4 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 52, column 51
    function sortValue_5 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 57, column 46
    function sortValue_6 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.State
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 64, column 53
    function sortValue_8 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // '$$sumValue' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 64, column 53
    function sumValueRoot_15 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'footerSumValue' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 64, column 53
    function sumValue_14 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'footerSumValue' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 71, column 53
    function sumValue_17 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'footerSumValue' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 78, column 53
    function sumValue_20 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 21, column 37
    function value_56 () : entity.Exposure[] {
      return ExposureList
    }
    
    // 'visible' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 64, column 53
    function visible_7 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'visible' attribute on RowIterator at NewClaimSummaryExposuresLV.pcf: line 71, column 53
    function visible_9 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get ExposureList () : Exposure[] {
      return getRequireValue("ExposureList", 0) as Exposure[]
    }
    
    property set ExposureList ($arg :  Exposure[]) {
      setRequireValue("ExposureList", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}