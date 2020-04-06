package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MatterDetailPageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterDetailPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Matter :  Matter) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_CalendarButton) at MatterDetailPage.pcf: line 53, column 37
    function action_11 () : void {
      ClaimMatterCalendar.go(Claim, Matter)
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_SupervisorCalendarButton) at MatterDetailPage.pcf: line 59, column 76
    function action_14 () : void {
      SupervisorClaimMatterCalendar.go(Claim, Matter)
    }
    
    // 'action' attribute on ToolbarButton (id=AddAllBudgetLines) at MatterDetailPage.pcf: line 110, column 57
    function action_24 () : void {
      Matter.createAllBudgetLines()
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_AssignButton) at MatterDetailPage.pcf: line 32, column 48
    function action_3 () : void {
      AssignMattersPopup.push(new gw.api.matter.MatterAssignmentPopup(Matter))
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_CloseMatterButton) at MatterDetailPage.pcf: line 40, column 71
    function action_6 () : void {
      CloseMatterPopup.push(Matter)
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_ReopenMatterButton) at MatterDetailPage.pcf: line 46, column 71
    function action_9 () : void {
      if (gw.api.claim.ReopenUtil.requireExplanation(entity.Matter)) {ReopenMatterPopup.push(Matter);} else {gw.api.claim.ReopenUtil.reopenMatterWithoutExplanation(Matter);}
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_CalendarButton) at MatterDetailPage.pcf: line 53, column 37
    function action_dest_12 () : pcf.api.Destination {
      return pcf.ClaimMatterCalendar.createDestination(Claim, Matter)
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_SupervisorCalendarButton) at MatterDetailPage.pcf: line 59, column 76
    function action_dest_15 () : pcf.api.Destination {
      return pcf.SupervisorClaimMatterCalendar.createDestination(Claim, Matter)
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_AssignButton) at MatterDetailPage.pcf: line 32, column 48
    function action_dest_4 () : pcf.api.Destination {
      return pcf.AssignMattersPopup.createDestination(new gw.api.matter.MatterAssignmentPopup(Matter))
    }
    
    // 'action' attribute on ToolbarButton (id=MatterDetailPage_CloseMatterButton) at MatterDetailPage.pcf: line 40, column 71
    function action_dest_7 () : pcf.api.Destination {
      return pcf.CloseMatterPopup.createDestination(Matter)
    }
    
    // 'canVisit' attribute on Page (id=MatterDetailPage) at MatterDetailPage.pcf: line 11, column 74
    static function canVisit_29 (Claim :  Claim, Matter :  Matter) : java.lang.Boolean {
      return perm.Matter.view(Matter)
    }
    
    // 'def' attribute on PanelRef at MatterDetailPage.pcf: line 71, column 54
    function def_onEnter_17 (def :  pcf.MatterDetailsDV) : void {
      def.onEnter(Matter)
    }
    
    // 'def' attribute on PanelRef at MatterDetailPage.pcf: line 78, column 34
    function def_onEnter_19 (def :  pcf.MatterActivitiesLV) : void {
      def.onEnter(Matter.Activities, Claim)
    }
    
    // 'def' attribute on PanelRef at MatterDetailPage.pcf: line 87, column 34
    function def_onEnter_21 (def :  pcf.NotesLV) : void {
      def.onEnter(Matter.Notes)
    }
    
    // 'def' attribute on PanelRef (id=BudgetLinesLV) at MatterDetailPage.pcf: line 103, column 32
    function def_onEnter_25 (def :  pcf.EditableBudgetLinesLV) : void {
      def.onEnter(Claim, Matter)
    }
    
    // 'def' attribute on PanelRef at MatterDetailPage.pcf: line 71, column 54
    function def_refreshVariables_18 (def :  pcf.MatterDetailsDV) : void {
      def.refreshVariables(Matter)
    }
    
    // 'def' attribute on PanelRef at MatterDetailPage.pcf: line 78, column 34
    function def_refreshVariables_20 (def :  pcf.MatterActivitiesLV) : void {
      def.refreshVariables(Matter.Activities, Claim)
    }
    
    // 'def' attribute on PanelRef at MatterDetailPage.pcf: line 87, column 34
    function def_refreshVariables_22 (def :  pcf.NotesLV) : void {
      def.refreshVariables(Matter.Notes)
    }
    
    // 'def' attribute on PanelRef (id=BudgetLinesLV) at MatterDetailPage.pcf: line 103, column 32
    function def_refreshVariables_26 (def :  pcf.EditableBudgetLinesLV) : void {
      def.refreshVariables(Claim, Matter)
    }
    
    // EditButtons at MatterDetailPage.pcf: line 24, column 51
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=MatterDetailPage) at MatterDetailPage.pcf: line 11, column 74
    static function parent_30 (Claim :  Claim, Matter :  Matter) : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    // 'title' attribute on Page (id=MatterDetailPage) at MatterDetailPage.pcf: line 11, column 74
    static function title_31 (Claim :  Claim, Matter :  Matter) : java.lang.Object {
      return DisplayKey.get("Web.ClaimMatters.Matter",  Matter)
    }
    
    // 'editVisible' attribute on EditButtons at MatterDetailPage.pcf: line 24, column 51
    function visible_0 () : java.lang.Boolean {
      return perm.Matter.edit(Matter)
    }
    
    // 'visible' attribute on ToolbarButton (id=MatterDetailPage_CalendarButton) at MatterDetailPage.pcf: line 53, column 37
    function visible_10 () : java.lang.Boolean {
      return !Matter.Closed
    }
    
    // 'visible' attribute on ToolbarButton (id=MatterDetailPage_SupervisorCalendarButton) at MatterDetailPage.pcf: line 59, column 76
    function visible_13 () : java.lang.Boolean {
      return !Matter.Closed and perm.System.viewsupcalendar
    }
    
    // 'visible' attribute on ToolbarButton (id=MatterDetailPage_AssignButton) at MatterDetailPage.pcf: line 32, column 48
    function visible_2 () : java.lang.Boolean {
      return perm.Matter.genericassign
    }
    
    // 'visible' attribute on ToolbarButton (id=AddAllBudgetLines) at MatterDetailPage.pcf: line 110, column 57
    function visible_23 () : java.lang.Boolean {
      return Matter.BudgetLines.length==0
    }
    
    // 'visible' attribute on Card (id=BudgetLineCardDV) at MatterDetailPage.pcf: line 99, column 58
    function visible_27 () : java.lang.Boolean {
      return ScriptParameters.UtilizeMatterBudget
    }
    
    // 'visible' attribute on ToolbarButton (id=MatterDetailPage_CloseMatterButton) at MatterDetailPage.pcf: line 40, column 71
    function visible_5 () : java.lang.Boolean {
      return !Matter.Closed and perm.Claim.closematter(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=MatterDetailPage_ReopenMatterButton) at MatterDetailPage.pcf: line 46, column 71
    function visible_8 () : java.lang.Boolean {
      return Matter.Closed and perm.Claim.reopenmatter(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.MatterDetailPage {
      return super.CurrentLocation as pcf.MatterDetailPage
    }
    
    property get Matter () : Matter {
      return getVariableValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setVariableValue("Matter", 0, $arg)
    }
    
    
  }
  
  
}