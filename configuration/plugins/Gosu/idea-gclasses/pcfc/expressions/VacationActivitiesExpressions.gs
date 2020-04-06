package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/vacation/VacationActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VacationActivitiesExpressions {
  @javax.annotation.Generated("config/web/pcf/vacation/VacationActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationActivitiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=VacationActivities_Print) at VacationActivities.pcf: line 64, column 25
    function action_7 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=VacationActivities_Assign) at VacationActivities.pcf: line 31, column 77
    function allCheckedRowsAction_1 (CheckedValues :  entity.ActivityVacationView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=VacationActivities_Print) at VacationActivities.pcf: line 64, column 25
    function available_6 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=VacationActivities) at VacationActivities.pcf: line 8, column 65
    static function canVisit_10 () : java.lang.Boolean {
      return perm.Activity.own and perm.System.viewdesktop and ActivityVacationView.finder.findVacationActivities().getCount() > 0
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=VacationActivities_Skip) at VacationActivities.pcf: line 37, column 75
    function checkedRowAction_2 (element :  entity.ActivityVacationView, CheckedValue :  entity.ActivityVacationView) : void {
      CheckedValue.Activity.skip()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=VacationActivities_Complete) at VacationActivities.pcf: line 43, column 79
    function checkedRowAction_3 (element :  entity.ActivityVacationView, CheckedValue :  entity.ActivityVacationView) : void {
      CheckedValue.Activity.complete()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=VacationActivities_Approve) at VacationActivities.pcf: line 50, column 78
    function checkedRowAction_4 (element :  entity.ActivityVacationView, CheckedValue :  entity.ActivityVacationView) : void {
      CheckedValue.Activity.approve()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=VacationActivities_Reject) at VacationActivities.pcf: line 56, column 77
    function checkedRowAction_5 (element :  entity.ActivityVacationView, CheckedValue :  entity.ActivityVacationView) : void {
      CheckedValue.Activity.reject()
    }
    
    // 'def' attribute on PanelRef at VacationActivities.pcf: line 67, column 63
    function def_onEnter_8 (def :  pcf.VacationActivitiesLV) : void {
      def.onEnter(ActivityVacationViewList)
    }
    
    // 'def' attribute on PanelRef at VacationActivities.pcf: line 67, column 63
    function def_refreshVariables_9 (def :  pcf.VacationActivitiesLV) : void {
      def.refreshVariables(ActivityVacationViewList)
    }
    
    // 'initialValue' attribute on Variable at VacationActivities.pcf: line 15, column 76
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ActivityVacationView> {
      return ActivityVacationView.finder.findVacationActivities()
    }
    
    // Page (id=VacationActivities) at VacationActivities.pcf: line 8, column 65
    static function parent_11 () : pcf.api.Destination {
      return pcf.Vacation.createDestination()
    }
    
    property get ActivityVacationViewList () : gw.api.database.IQueryBeanResult<ActivityVacationView> {
      return getVariableValue("ActivityVacationViewList", 0) as gw.api.database.IQueryBeanResult<ActivityVacationView>
    }
    
    property set ActivityVacationViewList ($arg :  gw.api.database.IQueryBeanResult<ActivityVacationView>) {
      setVariableValue("ActivityVacationViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.VacationActivities {
      return super.CurrentLocation as pcf.VacationActivities
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}