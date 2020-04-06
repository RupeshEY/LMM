package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAssignableDV_claimExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAssignableDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UserClaimsPage_AssignButton) at UserAssignableDV.claim.pcf: line 27, column 27
    function allCheckedRowsAction_1 (CheckedValues :  entity.ClaimDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'def' attribute on ListViewInput at UserAssignableDV.claim.pcf: line 18, column 27
    function def_onEnter_2 (def :  pcf.DesktopClaimsLV) : void {
      def.onEnter(ClaimDesktopViewList, User, false)
    }
    
    // 'def' attribute on ListViewInput at UserAssignableDV.claim.pcf: line 18, column 27
    function def_refreshVariables_3 (def :  pcf.DesktopClaimsLV) : void {
      def.refreshVariables(ClaimDesktopViewList, User, false)
    }
    
    // 'initialValue' attribute on Variable at UserAssignableDV.claim.pcf: line 14, column 72
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ClaimDesktopView> {
      return ClaimDesktopView.finder.findAllAndAttachClaimants()
    }
    
    property get ClaimDesktopViewList () : gw.api.database.IQueryBeanResult<ClaimDesktopView> {
      return getVariableValue("ClaimDesktopViewList", 0) as gw.api.database.IQueryBeanResult<ClaimDesktopView>
    }
    
    property set ClaimDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<ClaimDesktopView>) {
      setVariableValue("ClaimDesktopViewList", 0, $arg)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  
}