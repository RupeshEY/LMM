package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/admin/accounts/NewAccount.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewAccountExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/accounts/NewAccount.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAccountExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewAccount) at NewAccount.pcf: line 13, column 70
    function afterCancel_3 () : void {
      AccountAdmin.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewAccount) at NewAccount.pcf: line 13, column 70
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.AccountAdmin.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewAccount) at NewAccount.pcf: line 13, column 70
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      AccountAdmin.go()
    }
    
    // 'beforeCommit' attribute on Page (id=NewAccount) at NewAccount.pcf: line 13, column 70
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      verifyNoDuplicate()
    }
    
    // 'def' attribute on ScreenRef at NewAccount.pcf: line 19, column 50
    function def_onEnter_1 (def :  pcf.AccountDetailScreen) : void {
      def.onEnter(account, false)
    }
    
    // 'def' attribute on ScreenRef at NewAccount.pcf: line 19, column 50
    function def_refreshVariables_2 (def :  pcf.AccountDetailScreen) : void {
      def.refreshVariables(account, false)
    }
    
    // 'initialValue' attribute on Variable at NewAccount.pcf: line 17, column 23
    function initialValue_0 () : Account {
      return initializeNewAccount()
    }
    
    // 'parent' attribute on Page (id=NewAccount) at NewAccount.pcf: line 13, column 70
    static function parent_7 () : pcf.api.Destination {
      return pcf.AccountAdmin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewAccount {
      return super.CurrentLocation as pcf.NewAccount
    }
    
    property get account () : Account {
      return getVariableValue("account", 0) as Account
    }
    
    property set account ($arg :  Account) {
      setVariableValue("account", 0, $arg)
    }
    
    
    function verifyNoDuplicate() {
      if(Query.make(entity.Account).compare("AccountNumber", Equals, account.AccountNumber).select().Count > 0) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.Account.Duplicate", account.AccountNumber))
      }
    }
    
    function initializeNewAccount() : Account {
      var acct = new Account()
      acct.SpecialHandling = new AccountSpecialHandling()
      return acct
    }
    
    
  }
  
  
}