package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryMattersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryMattersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryMattersLV.pcf: line 25, column 32
    function sortValue_0 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryMattersLV.pcf: line 31, column 24
    function sortValue_1 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.CaseNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryMattersLV.pcf: line 37, column 24
    function sortValue_2 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.FinalSettleCost
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryMattersLV.pcf: line 45, column 24
    function sortValue_3 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.TrialDate
    }
    
    // 'value' attribute on RowIterator at ClaimSummaryMattersLV.pcf: line 18, column 35
    function value_20 () : entity.Matter[] {
      return MatterList
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get MatterList () : Matter[] {
      return getRequireValue("MatterList", 0) as Matter[]
    }
    
    property set MatterList ($arg :  Matter[]) {
      setRequireValue("MatterList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSummaryMattersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=CaseNumber) at ClaimSummaryMattersLV.pcf: line 31, column 24
    function action_10 () : void {
      MatterDetailForward.drilldown(Claim, Matter)
    }
    
    // 'action' attribute on TextCell (id=Name) at ClaimSummaryMattersLV.pcf: line 25, column 32
    function action_5 () : void {
      MatterDetailForward.drilldown(Claim, Matter)
    }
    
    // 'action' attribute on TextCell (id=CaseNumber) at ClaimSummaryMattersLV.pcf: line 31, column 24
    function action_dest_11 () : pcf.api.Destination {
      return pcf.MatterDetailForward.createDestination(Claim, Matter)
    }
    
    // 'action' attribute on TextCell (id=Name) at ClaimSummaryMattersLV.pcf: line 25, column 32
    function action_dest_6 () : pcf.api.Destination {
      return pcf.MatterDetailForward.createDestination(Claim, Matter)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSummaryMattersLV.pcf: line 25, column 32
    function valueRoot_8 () : java.lang.Object {
      return Matter
    }
    
    // 'value' attribute on CurrencyCell (id=EstSettleCost) at ClaimSummaryMattersLV.pcf: line 37, column 24
    function value_14 () : gw.api.financials.CurrencyAmount {
      return Matter.FinalSettleCost
    }
    
    // 'value' attribute on DateCell (id=TrialDate) at ClaimSummaryMattersLV.pcf: line 45, column 24
    function value_17 () : java.util.Date {
      return Matter.TrialDate
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSummaryMattersLV.pcf: line 25, column 32
    function value_4 () : java.lang.String {
      return Matter.Name
    }
    
    // 'value' attribute on TextCell (id=CaseNumber) at ClaimSummaryMattersLV.pcf: line 31, column 24
    function value_9 () : java.lang.String {
      return Matter.CaseNumber
    }
    
    property get Matter () : entity.Matter {
      return getIteratedValue(1) as entity.Matter
    }
    
    
  }
  
  
}