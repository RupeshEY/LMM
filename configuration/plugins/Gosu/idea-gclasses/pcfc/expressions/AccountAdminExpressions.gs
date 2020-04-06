package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/AccountAdmin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AccountAdminExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/accounts/AccountAdmin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountAdminExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Accounts_AddAccountButton) at AccountAdmin.pcf: line 18, column 45
    function action_1 () : void {
      NewAccount.go()
    }
    
    // 'action' attribute on ToolbarButton (id=Accounts_AddAccountButton) at AccountAdmin.pcf: line 18, column 45
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewAccount.createDestination()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Accounts_DeleteAccountsButton) at AccountAdmin.pcf: line 26, column 45
    function allCheckedRowsAction_4 (CheckedValues :  entity.Account[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.AdminUtil.deleteAccounts(CheckedValues)
    }
    
    // 'canVisit' attribute on Page (id=AccountAdmin) at AccountAdmin.pcf: line 8, column 65
    static function canVisit_7 () : java.lang.Boolean {
      return perm.System.accountview
    }
    
    // 'def' attribute on PanelRef at AccountAdmin.pcf: line 29, column 68
    function def_onEnter_5 (def :  pcf.AccountsLV) : void {
      def.onEnter(gw.api.admin.AdminUtil.getAllAccounts())
    }
    
    // 'def' attribute on PanelRef at AccountAdmin.pcf: line 29, column 68
    function def_refreshVariables_6 (def :  pcf.AccountsLV) : void {
      def.refreshVariables(gw.api.admin.AdminUtil.getAllAccounts())
    }
    
    // Page (id=AccountAdmin) at AccountAdmin.pcf: line 8, column 65
    static function parent_8 () : pcf.api.Destination {
      return pcf.SpecialHandling.createDestination()
    }
    
    // 'visible' attribute on ToolbarButton (id=Accounts_AddAccountButton) at AccountAdmin.pcf: line 18, column 45
    function visible_0 () : java.lang.Boolean {
      return perm.System.accountmng
    }
    
    override property get CurrentLocation () : pcf.AccountAdmin {
      return super.CurrentLocation as pcf.AccountAdmin
    }
    
    
  }
  
  
}