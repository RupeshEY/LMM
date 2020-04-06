package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopSubrogationsExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopSubrogationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopSubrogations_PrintButton) at DesktopSubrogations.pcf: line 23, column 25
    function action_1 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions("SubrogationsLV")
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DesktopSubrogations_AssignButton) at DesktopSubrogations.pcf: line 31, column 25
    function allCheckedRowsAction_3 (CheckedValues :  entity.SubrogationView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopSubrogations_PrintButton) at DesktopSubrogations.pcf: line 23, column 25
    function available_0 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'available' attribute on CheckedValuesToolbarButton (id=DesktopSubrogations_AssignButton) at DesktopSubrogations.pcf: line 31, column 25
    function available_2 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'canVisit' attribute on Page (id=DesktopSubrogations) at DesktopSubrogations.pcf: line 9, column 65
    static function canVisit_6 () : java.lang.Boolean {
      return perm.Subrogation.own and perm.System.viewdesktop
    }
    
    // 'def' attribute on PanelRef at DesktopSubrogations.pcf: line 34, column 103
    function def_onEnter_4 (def :  pcf.SubrogationsLV) : void {
      def.onEnter(SubrogationView.finder.findByUser(entity.User.util.CurrentUser), false)
    }
    
    // 'def' attribute on PanelRef at DesktopSubrogations.pcf: line 34, column 103
    function def_refreshVariables_5 (def :  pcf.SubrogationsLV) : void {
      def.refreshVariables(SubrogationView.finder.findByUser(entity.User.util.CurrentUser), false)
    }
    
    // Page (id=DesktopSubrogations) at DesktopSubrogations.pcf: line 9, column 65
    static function parent_7 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    override property get CurrentLocation () : pcf.DesktopSubrogations {
      return super.CurrentLocation as pcf.DesktopSubrogations
    }
    
    
  }
  
  
}