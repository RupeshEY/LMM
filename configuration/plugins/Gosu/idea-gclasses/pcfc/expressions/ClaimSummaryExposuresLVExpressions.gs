package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryExposuresLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryExposuresLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'icon' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 25, column 22
    function icon_0 () : java.lang.String {
      return "icon_claimClosed.png" 
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 25, column 22
    function sortValue_1 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.State
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 41, column 23
    function sortValue_2 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 49, column 24
    function sortValue_3 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 57, column 29
    function sortValue_4 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.PrimaryCoverage
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 76, column 24
    function sortValue_5 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 76, column 24
    function sortValue_6 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 76, column 24
    function sortValue_7 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 17, column 37
    function value_53 () : entity.Exposure[] {
      return ExposureList
    }
    
    // 'visible' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 115, column 24
    function visible_11 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 86, column 24
    function visible_8 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'visible' attribute on RowIterator at ClaimSummaryExposuresLV.pcf: line 96, column 24
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
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSummaryExposuresLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Order) at ClaimSummaryExposuresLV.pcf: line 41, column 23
    function action_16 () : void {
      ExposureDetailForward.drilldown(Claim, Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at ClaimSummaryExposuresLV.pcf: line 49, column 24
    function action_21 () : void {
      ExposureDetailForward.drilldown(Claim, Exposure)
    }
    
    // 'action' attribute on TextCell (id=Claimant) at ClaimSummaryExposuresLV.pcf: line 67, column 29
    function action_29 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Claim)
    }
    
    // 'action' attribute on TextCell (id=Assignee) at ClaimSummaryExposuresLV.pcf: line 76, column 24
    function action_33 () : void {
      UserContactDetailPopup.push(Exposure.AssignedUser)
    }
    
    // 'action' attribute on TextCell (id=Order) at ClaimSummaryExposuresLV.pcf: line 41, column 23
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(Claim, Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at ClaimSummaryExposuresLV.pcf: line 49, column 24
    function action_dest_22 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(Claim, Exposure)
    }
    
    // 'action' attribute on TextCell (id=Claimant) at ClaimSummaryExposuresLV.pcf: line 67, column 29
    function action_dest_30 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Claim)
    }
    
    // 'action' attribute on TextCell (id=Assignee) at ClaimSummaryExposuresLV.pcf: line 76, column 24
    function action_dest_34 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Exposure.AssignedUser)
    }
    
    // 'icon' attribute on Link (id=StatusIcon) at ClaimSummaryExposuresLV.pcf: line 29, column 51
    function icon_12 () : java.lang.String {
      return Exposure.Closed ? "icon_claimClosed.png" : "icon_claimOpen.png"
    }
    
    // 'icon' attribute on LinkCell (id=Status) at ClaimSummaryExposuresLV.pcf: line 25, column 22
    function icon_14 () : java.lang.String {
      return "icon_claimClosed.png" 
    }
    
    // 'tooltip' attribute on Link (id=StatusIcon) at ClaimSummaryExposuresLV.pcf: line 29, column 51
    function tooltip_13 () : java.lang.String {
      return Exposure.State.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Order) at ClaimSummaryExposuresLV.pcf: line 41, column 23
    function valueRoot_19 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on CurrencyCell (id=RemainingReserves) at ClaimSummaryExposuresLV.pcf: line 86, column 24
    function valueRoot_40 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TextCell (id=Order) at ClaimSummaryExposuresLV.pcf: line 41, column 23
    function value_15 () : java.lang.Integer {
      return Exposure.ClaimOrder
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at ClaimSummaryExposuresLV.pcf: line 49, column 24
    function value_20 () : typekey.ExposureType {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at ClaimSummaryExposuresLV.pcf: line 57, column 29
    function value_25 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claimant) at ClaimSummaryExposuresLV.pcf: line 67, column 29
    function value_28 () : entity.Contact {
      return Exposure.Claim.LossType.equals(LossType.TC_WC) ? Exposure.Claim.ClaimantDenorm : Exposure.Claimant
    }
    
    // 'value' attribute on TextCell (id=Assignee) at ClaimSummaryExposuresLV.pcf: line 76, column 24
    function value_32 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on CurrencyCell (id=RemainingReserves) at ClaimSummaryExposuresLV.pcf: line 86, column 24
    function value_38 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyCell (id=FuturePayments) at ClaimSummaryExposuresLV.pcf: line 96, column 24
    function value_42 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyCell (id=Paid) at ClaimSummaryExposuresLV.pcf: line 105, column 24
    function value_46 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyCell (id=TotalRecoveries) at ClaimSummaryExposuresLV.pcf: line 115, column 24
    function value_50 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'visible' attribute on CurrencyCell (id=RemainingReserves) at ClaimSummaryExposuresLV.pcf: line 86, column 24
    function visible_37 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'visible' attribute on CurrencyCell (id=FuturePayments) at ClaimSummaryExposuresLV.pcf: line 96, column 24
    function visible_41 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'visible' attribute on CurrencyCell (id=TotalRecoveries) at ClaimSummaryExposuresLV.pcf: line 115, column 24
    function visible_49 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  
}