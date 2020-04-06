package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimExposuresLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimExposuresLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Order) at NewClaimExposuresLV.pcf: line 51, column 40
    function action_26 () : void {
      NewClaimWizard_ExposurePagePopup.push(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at NewClaimExposuresLV.pcf: line 57, column 45
    function action_31 () : void {
      NewClaimWizard_ExposurePagePopup.push(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TextCell (id=Order) at NewClaimExposuresLV.pcf: line 51, column 40
    function action_dest_27 () : pcf.api.Destination {
      return pcf.NewClaimWizard_ExposurePagePopup.createDestination(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at NewClaimExposuresLV.pcf: line 57, column 45
    function action_dest_32 () : pcf.api.Destination {
      return pcf.NewClaimWizard_ExposurePagePopup.createDestination(Claim, Exposure, Wizard)
    }
    
    // 'outputConversion' attribute on TextCell (id=Order) at NewClaimExposuresLV.pcf: line 51, column 40
    function outputConversion_28 (VALUE :  entity.Exposure) : java.lang.String {
      return VALUE.ClaimOrder as String
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at NewClaimExposuresLV.pcf: line 57, column 45
    function valueRoot_34 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on CurrencyCell (id=RemainingReserves) at NewClaimExposuresLV.pcf: line 85, column 53
    function valueRoot_50 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TextCell (id=Order) at NewClaimExposuresLV.pcf: line 51, column 40
    function value_25 () : entity.Exposure {
      return Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at NewClaimExposuresLV.pcf: line 57, column 45
    function value_30 () : typekey.ExposureType {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at NewClaimExposuresLV.pcf: line 62, column 45
    function value_35 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claimant) at NewClaimExposuresLV.pcf: line 68, column 39
    function value_38 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextCell (id=Assignee) at NewClaimExposuresLV.pcf: line 73, column 51
    function value_41 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at NewClaimExposuresLV.pcf: line 78, column 46
    function value_44 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on CurrencyCell (id=RemainingReserves) at NewClaimExposuresLV.pcf: line 85, column 53
    function value_48 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyCell (id=FuturePayments) at NewClaimExposuresLV.pcf: line 92, column 53
    function value_52 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyCell (id=Paid) at NewClaimExposuresLV.pcf: line 99, column 53
    function value_56 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'visible' attribute on CurrencyCell (id=RemainingReserves) at NewClaimExposuresLV.pcf: line 85, column 53
    function visible_47 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'visible' attribute on CurrencyCell (id=FuturePayments) at NewClaimExposuresLV.pcf: line 92, column 53
    function visible_51 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposuresLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at NewClaimExposuresLV.pcf: line 39, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.All
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at NewClaimExposuresLV.pcf: line 41, column 56
    function filters_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return FilterSet.getFilterOptions(Claim)
    }
    
    // 'initialValue' attribute on Variable at NewClaimExposuresLV.pcf: line 24, column 55
    function initialValue_0 () : gw.api.exposure.ClaimExposuresFilterSet {
      return gw.api.exposure.ClaimExposuresFilterSet.INSTANCE
    }
    
    // 'value' attribute on RowIterator at NewClaimExposuresLV.pcf: line 85, column 53
    function sortValue_11 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on RowIterator at NewClaimExposuresLV.pcf: line 92, column 53
    function sortValue_13 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on RowIterator at NewClaimExposuresLV.pcf: line 99, column 53
    function sortValue_15 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on RowIterator at NewClaimExposuresLV.pcf: line 51, column 40
    function sortValue_3 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RowIterator at NewClaimExposuresLV.pcf: line 57, column 45
    function sortValue_4 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on RowIterator at NewClaimExposuresLV.pcf: line 62, column 45
    function sortValue_5 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.PrimaryCoverage
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimExposuresLV.pcf: line 73, column 51
    function sortValue_6 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimExposuresLV.pcf: line 73, column 51
    function sortValue_7 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimExposuresLV.pcf: line 73, column 51
    function sortValue_8 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at NewClaimExposuresLV.pcf: line 78, column 46
    function sortValue_9 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.State
    }
    
    // '$$sumValue' attribute on RowIterator at NewClaimExposuresLV.pcf: line 85, column 53
    function sumValueRoot_18 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'footerSumValue' attribute on RowIterator at NewClaimExposuresLV.pcf: line 85, column 53
    function sumValue_17 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'footerSumValue' attribute on RowIterator at NewClaimExposuresLV.pcf: line 92, column 53
    function sumValue_20 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'footerSumValue' attribute on RowIterator at NewClaimExposuresLV.pcf: line 99, column 53
    function sumValue_23 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'toRemove' attribute on RowIterator at NewClaimExposuresLV.pcf: line 31, column 37
    function toRemove_59 (Exposure :  entity.Exposure) : void {
      Wizard.deleteExposure(Exposure)
    }
    
    // 'value' attribute on RowIterator at NewClaimExposuresLV.pcf: line 31, column 37
    function value_60 () : entity.Exposure[] {
      return ExposureList
    }
    
    // 'visible' attribute on RowIterator at NewClaimExposuresLV.pcf: line 85, column 53
    function visible_10 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'visible' attribute on RowIterator at NewClaimExposuresLV.pcf: line 92, column 53
    function visible_12 () : java.lang.Boolean {
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
    
    property get FilterSet () : gw.api.exposure.ClaimExposuresFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.exposure.ClaimExposuresFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.exposure.ClaimExposuresFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}