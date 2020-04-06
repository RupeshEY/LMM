package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/workplan/ClaimWorkplan.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimWorkplanExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/workplan/ClaimWorkplan.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimWorkplanExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimWorkplan_AssignButton) at ClaimWorkplan.pcf: line 28, column 25
    function allCheckedRowsAction_0 (CheckedValues :  entity.Activity[], CheckedValuesErrors :  java.util.Map) : void {
      pushAssignmentPopup(CheckedValues)
    }
    
    // 'canVisit' attribute on Page (id=ClaimWorkplan) at ClaimWorkplan.pcf: line 9, column 65
    static function canVisit_7 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewworkplan and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimWorkplan_SkipButton) at ClaimWorkplan.pcf: line 35, column 25
    function checkedRowAction_1 (element :  entity.Activity, CheckedValue :  entity.Activity) : void {
       CheckedValue.skip()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimWorkplan_CompleteButton) at ClaimWorkplan.pcf: line 42, column 25
    function checkedRowAction_2 (element :  entity.Activity, CheckedValue :  entity.Activity) : void {
       CheckedValue.complete()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimWorkplan_ApproveButton) at ClaimWorkplan.pcf: line 50, column 25
    function checkedRowAction_3 (element :  entity.Activity, CheckedValue :  entity.Activity) : void {
      CheckedValue.approve()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimWorkplan_RejectButton) at ClaimWorkplan.pcf: line 57, column 25
    function checkedRowAction_4 (element :  entity.Activity, CheckedValue :  entity.Activity) : void {
       CheckedValue.reject()
    }
    
    // 'def' attribute on PanelRef at ClaimWorkplan.pcf: line 61, column 130
    function def_onEnter_5 (def :  pcf.WorkplanLV) : void {
      def.onEnter(Claim, gw.api.database.Query.make(entity.Activity).compare("claim", Equals, Claim).select())
    }
    
    // 'def' attribute on PanelRef at ClaimWorkplan.pcf: line 61, column 130
    function def_refreshVariables_6 (def :  pcf.WorkplanLV) : void {
      def.refreshVariables(Claim, gw.api.database.Query.make(entity.Activity).compare("claim", Equals, Claim).select())
    }
    
    // Page (id=ClaimWorkplan) at ClaimWorkplan.pcf: line 9, column 65
    static function parent_8 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimWorkplan {
      return super.CurrentLocation as pcf.ClaimWorkplan
    }
    
    
    function pushAssignmentPopup(Activities : Activity[]){
            var popup = new gw.api.activity.ActivityAssignmentPopup(Activities);
            AssignActivitiesPopup.push(popup)
          }
        
    
    
  }
  
  
}