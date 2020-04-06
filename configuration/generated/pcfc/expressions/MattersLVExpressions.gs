package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MattersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/MattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MattersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at MattersLV.pcf: line 38, column 32
    function action_7 () : void {
      MatterDetailForward.drilldown(Claim, Matter)
    }
    
    // 'action' attribute on TextCell (id=Name) at MattersLV.pcf: line 38, column 32
    function action_dest_8 () : pcf.api.Destination {
      return pcf.MatterDetailForward.createDestination(Claim, Matter)
    }
    
    // 'condition' attribute on ToolbarFlag at MattersLV.pcf: line 31, column 32
    function condition_5 () : java.lang.Boolean {
      return Matter.canClose(User.util.CurrentUser) and !ClaimMatters.isBeingEdited(Claim, Matter)
    }
    
    // 'value' attribute on TextCell (id=Name) at MattersLV.pcf: line 38, column 32
    function valueRoot_10 () : java.lang.Object {
      return Matter
    }
    
    // 'value' attribute on TextCell (id=CaseNumber) at MattersLV.pcf: line 42, column 38
    function value_11 () : java.lang.String {
      return Matter.CaseNumber
    }
    
    // 'value' attribute on CurrencyCell (id=EstSettleCost) at MattersLV.pcf: line 47, column 43
    function value_14 () : gw.api.financials.CurrencyAmount {
      return Matter.FinalSettleCost
    }
    
    // 'value' attribute on DateCell (id=TrialDate) at MattersLV.pcf: line 54, column 37
    function value_17 () : java.util.Date {
      return Matter.TrialDate
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at MattersLV.pcf: line 58, column 49
    function value_20 () : java.lang.String {
      return Matter.AssigneeDisplayString
    }
    
    // 'value' attribute on TextCell (id=Name) at MattersLV.pcf: line 38, column 32
    function value_6 () : java.lang.String {
      return Matter.Name
    }
    
    property get Matter () : entity.Matter {
      return getIteratedValue(1) as entity.Matter
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/litigation/MattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MattersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at MattersLV.pcf: line 38, column 32
    function sortValue_0 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.Name
    }
    
    // 'value' attribute on RowIterator at MattersLV.pcf: line 42, column 38
    function sortValue_1 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.CaseNumber
    }
    
    // 'value' attribute on RowIterator at MattersLV.pcf: line 47, column 43
    function sortValue_2 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.FinalSettleCost
    }
    
    // 'value' attribute on RowIterator at MattersLV.pcf: line 54, column 37
    function sortValue_3 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.TrialDate
    }
    
    // 'value' attribute on RowIterator at MattersLV.pcf: line 58, column 49
    function sortValue_4 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.AssigneeDisplayString
    }
    
    // 'value' attribute on RowIterator at MattersLV.pcf: line 26, column 35
    function value_23 () : entity.Matter[] {
      return MatterList
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get ClaimMatters () : gw.api.matter.ClaimMattersHelper {
      return getRequireValue("ClaimMatters", 0) as gw.api.matter.ClaimMattersHelper
    }
    
    property set ClaimMatters ($arg :  gw.api.matter.ClaimMattersHelper) {
      setRequireValue("ClaimMatters", 0, $arg)
    }
    
    property get MatterList () : Matter[] {
      return getRequireValue("MatterList", 0) as Matter[]
    }
    
    property set MatterList ($arg :  Matter[]) {
      setRequireValue("MatterList", 0, $arg)
    }
    
    
  }
  
  
}