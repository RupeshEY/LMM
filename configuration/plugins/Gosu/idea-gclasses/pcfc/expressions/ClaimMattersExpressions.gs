package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/ClaimMatters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMattersExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/ClaimMatters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMattersExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimMatters_CalendarButton) at ClaimMatters.pcf: line 57, column 25
    function action_10 () : void {
      ClaimAllMattersCalendar.go(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimMatters_SupervisorCalendarButton) at ClaimMatters.pcf: line 63, column 50
    function action_13 () : void {
      SupervisorClaimAllMattersCalendar.go(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimMatters_RefreshButton) at ClaimMatters.pcf: line 36, column 25
    function action_3 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimMatters_NewMatterButton) at ClaimMatters.pcf: line 51, column 53
    function action_8 () : void {
      NewMatter.go(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimMatters_CalendarButton) at ClaimMatters.pcf: line 57, column 25
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimAllMattersCalendar.createDestination(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimMatters_SupervisorCalendarButton) at ClaimMatters.pcf: line 63, column 50
    function action_dest_14 () : pcf.api.Destination {
      return pcf.SupervisorClaimAllMattersCalendar.createDestination(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimMatters_NewMatterButton) at ClaimMatters.pcf: line 51, column 53
    function action_dest_9 () : pcf.api.Destination {
      return pcf.NewMatter.createDestination(Claim)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimMatters_AssignButton) at ClaimMatters.pcf: line 31, column 48
    function allCheckedRowsAction_2 (CheckedValues :  entity.Matter[], CheckedValuesErrors :  java.util.Map) : void {
      AssignMattersPopup.push(new gw.api.matter.MatterAssignmentPopup(CheckedValues))
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimMatters_CloseMatterButton) at ClaimMatters.pcf: line 44, column 52
    function allCheckedRowsAction_5 (CheckedValues :  entity.Matter[], CheckedValuesErrors :  java.util.Map) : void {
      CloseMatterPopup.push(CheckedValues[0])
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimMatters_NewMatterButton) at ClaimMatters.pcf: line 51, column 53
    function available_6 () : java.lang.Boolean {
      return !Claim.Closed
    }
    
    // 'canVisit' attribute on Page (id=ClaimMatters) at ClaimMatters.pcf: line 9, column 63
    static function canVisit_18 (Claim :  Claim) : java.lang.Boolean {
      return perm.Matter.view(Claim) and perm.System.viewmatters and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on PanelRef at ClaimMatters.pcf: line 67, column 45
    function def_onEnter_16 (def :  pcf.MattersLV) : void {
      def.onEnter(Claim.Matters, Claim, PageHelper)
    }
    
    // 'def' attribute on PanelRef at ClaimMatters.pcf: line 67, column 45
    function def_refreshVariables_17 (def :  pcf.MattersLV) : void {
      def.refreshVariables(Claim.Matters, Claim, PageHelper)
    }
    
    // 'editable' attribute on PanelRef at ClaimMatters.pcf: line 67, column 45
    function editable_15 () : java.lang.Boolean {
      return perm.Matter.edit(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimMatters.pcf: line 15, column 48
    function initialValue_0 () : gw.api.matter.ClaimMattersHelper {
      return new gw.api.matter.ClaimMattersHelper()
    }
    
    // Page (id=ClaimMatters) at ClaimMatters.pcf: line 9, column 63
    static function parent_19 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimMatters_AssignButton) at ClaimMatters.pcf: line 31, column 48
    function visible_1 () : java.lang.Boolean {
      return perm.Matter.genericassign
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimMatters_SupervisorCalendarButton) at ClaimMatters.pcf: line 63, column 50
    function visible_12 () : java.lang.Boolean {
      return perm.System.viewsupcalendar
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimMatters_CloseMatterButton) at ClaimMatters.pcf: line 44, column 52
    function visible_4 () : java.lang.Boolean {
      return perm.Claim.closematter(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimMatters_NewMatterButton) at ClaimMatters.pcf: line 51, column 53
    function visible_7 () : java.lang.Boolean {
      return perm.Claim.creatematter(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimMatters {
      return super.CurrentLocation as pcf.ClaimMatters
    }
    
    property get PageHelper () : gw.api.matter.ClaimMattersHelper {
      return getVariableValue("PageHelper", 0) as gw.api.matter.ClaimMattersHelper
    }
    
    property set PageHelper ($arg :  gw.api.matter.ClaimMattersHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}