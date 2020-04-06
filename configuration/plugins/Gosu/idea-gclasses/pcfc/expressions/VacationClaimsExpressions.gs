package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/vacation/VacationClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VacationClaimsExpressions {
  @javax.annotation.Generated("config/web/pcf/vacation/VacationClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationClaimsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=VacationClaims_Print) at VacationClaims.pcf: line 42, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=VacationClaims_Assign) at VacationClaims.pcf: line 33, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.ClaimVacationView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=VacationClaims_Print) at VacationClaims.pcf: line 42, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=VacationClaims) at VacationClaims.pcf: line 8, column 61
    static function canVisit_6 () : java.lang.Boolean {
      return perm.Claim.own and perm.System.viewdesktop and ClaimVacationView.finder.areOpenVacationClaims()
    }
    
    // 'def' attribute on PanelRef at VacationClaims.pcf: line 45, column 56
    function def_onEnter_4 (def :  pcf.VacationClaimsLV) : void {
      def.onEnter(ClaimVacationViewList)
    }
    
    // 'def' attribute on PanelRef at VacationClaims.pcf: line 45, column 56
    function def_refreshVariables_5 (def :  pcf.VacationClaimsLV) : void {
      def.refreshVariables(ClaimVacationViewList)
    }
    
    // 'initialValue' attribute on Variable at VacationClaims.pcf: line 15, column 73
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ClaimVacationView> {
      return ClaimVacationView.finder.findVacationClaims() as gw.api.database.IQueryBeanResult<ClaimVacationView>
    }
    
    // Page (id=VacationClaims) at VacationClaims.pcf: line 8, column 61
    static function parent_7 () : pcf.api.Destination {
      return pcf.Vacation.createDestination()
    }
    
    property get ClaimVacationViewList () : gw.api.database.IQueryBeanResult<ClaimVacationView> {
      return getVariableValue("ClaimVacationViewList", 0) as gw.api.database.IQueryBeanResult<ClaimVacationView>
    }
    
    property set ClaimVacationViewList ($arg :  gw.api.database.IQueryBeanResult<ClaimVacationView>) {
      setVariableValue("ClaimVacationViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.VacationClaims {
      return super.CurrentLocation as pcf.VacationClaims
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}