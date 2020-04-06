package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/vacation/VacationExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VacationExposuresExpressions {
  @javax.annotation.Generated("config/web/pcf/vacation/VacationExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationExposuresExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=VacationExposures_Print) at VacationExposures.pcf: line 41, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=VacationExposures_Assign) at VacationExposures.pcf: line 33, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.ExposureVacationView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignExposuresPopup.push(new gw.api.exposure.ExposureAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=VacationExposures_Print) at VacationExposures.pcf: line 41, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=VacationExposures) at VacationExposures.pcf: line 8, column 64
    static function canVisit_6 () : java.lang.Boolean {
      return perm.Exposure.own and perm.System.viewdesktop and ExposureVacationView.finder.areOpenVacationExposures()
    }
    
    // 'def' attribute on PanelRef at VacationExposures.pcf: line 44, column 64
    function def_onEnter_4 (def :  pcf.MyVacationExposuresLV) : void {
      def.onEnter(ExposureVacationViewList)
    }
    
    // 'def' attribute on PanelRef at VacationExposures.pcf: line 44, column 64
    function def_refreshVariables_5 (def :  pcf.MyVacationExposuresLV) : void {
      def.refreshVariables(ExposureVacationViewList)
    }
    
    // 'initialValue' attribute on Variable at VacationExposures.pcf: line 15, column 76
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ExposureVacationView> {
      return ExposureVacationView.finder.findVacationExposures() as gw.api.database.IQueryBeanResult<ExposureVacationView>
    }
    
    // Page (id=VacationExposures) at VacationExposures.pcf: line 8, column 64
    static function parent_7 () : pcf.api.Destination {
      return pcf.Vacation.createDestination()
    }
    
    override property get CurrentLocation () : pcf.VacationExposures {
      return super.CurrentLocation as pcf.VacationExposures
    }
    
    property get ExposureVacationViewList () : gw.api.database.IQueryBeanResult<ExposureVacationView> {
      return getVariableValue("ExposureVacationViewList", 0) as gw.api.database.IQueryBeanResult<ExposureVacationView>
    }
    
    property set ExposureVacationViewList ($arg :  gw.api.database.IQueryBeanResult<ExposureVacationView>) {
      setVariableValue("ExposureVacationViewList", 0, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}