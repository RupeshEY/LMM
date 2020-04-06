package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/claims/DesktopClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopClaimsExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/claims/DesktopClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopClaimsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopClaims_PrintButton) at DesktopClaims.pcf: line 42, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DesktopClaims_AssignButton) at DesktopClaims.pcf: line 34, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.ClaimDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopClaims_PrintButton) at DesktopClaims.pcf: line 42, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=DesktopClaims) at DesktopClaims.pcf: line 9, column 59
    static function canVisit_6 () : java.lang.Boolean {
      return perm.Claim.own and perm.System.viewdesktop
    }
    
    // 'def' attribute on PanelRef at DesktopClaims.pcf: line 45, column 83
    function def_onEnter_4 (def :  pcf.DesktopClaimsLV) : void {
      def.onEnter(ClaimDesktopViewList, User.util.CurrentUser, true)
    }
    
    // 'def' attribute on PanelRef at DesktopClaims.pcf: line 45, column 83
    function def_refreshVariables_5 (def :  pcf.DesktopClaimsLV) : void {
      def.refreshVariables(ClaimDesktopViewList, User.util.CurrentUser, true)
    }
    
    // 'initialValue' attribute on Variable at DesktopClaims.pcf: line 16, column 79
    function initialValue_0 () : gw.api.database.IQueryBeanResult<entity.ClaimDesktopView> {
      return ClaimDesktopView.finder.findAllAndAttachClaimants()
    }
    
    // Page (id=DesktopClaims) at DesktopClaims.pcf: line 9, column 59
    static function parent_7 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    property get ClaimDesktopViewList () : gw.api.database.IQueryBeanResult<entity.ClaimDesktopView> {
      return getVariableValue("ClaimDesktopViewList", 0) as gw.api.database.IQueryBeanResult<entity.ClaimDesktopView>
    }
    
    property set ClaimDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<entity.ClaimDesktopView>) {
      setVariableValue("ClaimDesktopViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.DesktopClaims {
      return super.CurrentLocation as pcf.DesktopClaims
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}