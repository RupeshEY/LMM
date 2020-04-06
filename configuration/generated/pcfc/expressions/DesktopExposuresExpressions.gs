package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/exposures/DesktopExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopExposuresExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/exposures/DesktopExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopExposuresExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopExposures_PrintButton) at DesktopExposures.pcf: line 42, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DesktopExposures_AssignButton) at DesktopExposures.pcf: line 34, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.ExposureDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignExposuresPopup.push(new gw.api.exposure.ExposureAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopExposures_PrintButton) at DesktopExposures.pcf: line 42, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=DesktopExposures) at DesktopExposures.pcf: line 9, column 62
    static function canVisit_6 () : java.lang.Boolean {
      return perm.Exposure.own and perm.System.viewdesktop
    }
    
    // 'def' attribute on PanelRef at DesktopExposures.pcf: line 45, column 83
    function def_onEnter_4 (def :  pcf.DesktopExposuresLV) : void {
      def.onEnter(ExposureDesktopViewList, User.util.CurrentUser)
    }
    
    // 'def' attribute on PanelRef at DesktopExposures.pcf: line 45, column 83
    function def_refreshVariables_5 (def :  pcf.DesktopExposuresLV) : void {
      def.refreshVariables(ExposureDesktopViewList, User.util.CurrentUser)
    }
    
    // 'initialValue' attribute on Variable at DesktopExposures.pcf: line 16, column 82
    function initialValue_0 () : gw.api.database.IQueryBeanResult<entity.ExposureDesktopView> {
      return ExposureDesktopView.finder.findAll()
    }
    
    // Page (id=DesktopExposures) at DesktopExposures.pcf: line 9, column 62
    static function parent_7 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    override property get CurrentLocation () : pcf.DesktopExposures {
      return super.CurrentLocation as pcf.DesktopExposures
    }
    
    property get ExposureDesktopViewList () : gw.api.database.IQueryBeanResult<entity.ExposureDesktopView> {
      return getVariableValue("ExposureDesktopViewList", 0) as gw.api.database.IQueryBeanResult<entity.ExposureDesktopView>
    }
    
    property set ExposureDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<entity.ExposureDesktopView>) {
      setVariableValue("ExposureDesktopViewList", 0, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}