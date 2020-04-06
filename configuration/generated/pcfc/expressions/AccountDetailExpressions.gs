package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AccountDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (account :  Account) : int {
      return 1
    }
    
    static function __constructorIndex (account :  Account, showAccountHandlingCardToStart :  boolean) : int {
      return 2
    }
    
    // 'beforeCommit' attribute on Page (id=AccountDetail) at AccountDetail.pcf: line 12, column 72
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      verifyNoDuplicate(); checkAccountReferences()
    }
    
    // 'canEdit' attribute on Page (id=AccountDetail) at AccountDetail.pcf: line 12, column 72
    function canEdit_5 () : java.lang.Boolean {
      return perm.System.accountmng
    }
    
    // 'canVisit' attribute on Page (id=AccountDetail) at AccountDetail.pcf: line 12, column 72
    static function canVisit_6 (account :  Account, showAccountHandlingCardToStart :  boolean) : java.lang.Boolean {
      return perm.System.accountview
    }
    
    // 'def' attribute on ScreenRef at AccountDetail.pcf: line 32, column 75
    function def_onEnter_2 (def :  pcf.AccountDetailScreen) : void {
      def.onEnter(account, showAccountHandlingCardToStart)
    }
    
    // 'def' attribute on ScreenRef at AccountDetail.pcf: line 32, column 75
    function def_refreshVariables_3 (def :  pcf.AccountDetailScreen) : void {
      def.refreshVariables(account, showAccountHandlingCardToStart)
    }
    
    // 'initialValue' attribute on Variable at AccountDetail.pcf: line 22, column 23
    function initialValue_0 () : Account {
      return initializeAccountIfNecessary(account)
    }
    
    // 'initialValue' attribute on Variable at AccountDetail.pcf: line 26, column 34
    function initialValue_1 () : List<Policy> {
      return new java.util.ArrayList<Policy>()
    }
    
    // 'parent' attribute on Page (id=AccountDetail) at AccountDetail.pcf: line 12, column 72
    static function parent_7 (account :  Account, showAccountHandlingCardToStart :  boolean) : pcf.api.Destination {
      return pcf.AccountAdmin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.AccountDetail {
      return super.CurrentLocation as pcf.AccountDetail
    }
    
    property get account () : Account {
      return getVariableValue("account", 0) as Account
    }
    
    property set account ($arg :  Account) {
      setVariableValue("account", 0, $arg)
    }
    
    property get checkedPolicies () : List<Policy> {
      return getVariableValue("checkedPolicies", 0) as List<Policy>
    }
    
    property set checkedPolicies ($arg :  List<Policy>) {
      setVariableValue("checkedPolicies", 0, $arg)
    }
    
    property get showAccountHandlingCardToStart () : boolean {
      return getVariableValue("showAccountHandlingCardToStart", 0) as java.lang.Boolean
    }
    
    property set showAccountHandlingCardToStart ($arg :  boolean) {
      setVariableValue("showAccountHandlingCardToStart", 0, $arg)
    }
    
    
    function verifyNoDuplicate() {
      if(account.ChangedFields.contains("AccountNumber") and Query.make(entity.Account).compare("AccountNumber", Equals, account.AccountNumber).select().Count > 0) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.Account.Duplicate", account.AccountNumber))
      }
    }
    
    function initializeAccountIfNecessary(acct : Account) : Account {
      if (null == acct) {
        acct = new Account()
        acct.SpecialHandling = new AccountSpecialHandling()
      }
      
      return acct
    }
    
    /**
     * Called from beforeCommit(). Checks for Policies that reference the original
     * Account Number, and displays a warning if there are 1 or more.
     */
    function checkAccountReferences() {
      if(account.ChangedFields.contains("AccountNumber")) {
        var origAccountNumber = account.getOriginalValue("AccountNumber") as String
        var refPolicies = searchForAccountReferences(origAccountNumber)
        if(!checkedPolicies.containsAll(refPolicies)) {
          checkedPolicies.addAll(refPolicies)
          ExistingAccountRefWorksheet.goInWorkspace(account,refPolicies)
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.Account.Number.ChangeWarning", origAccountNumber))
        }
      }
    }
    
    function searchForAccountReferences(accountNum:String) : java.util.List<Policy> {
      return Query.make(entity.Policy).compare("AccountNumber", Equals, accountNum).select().toList()
    }
    
    
  }
  
  
}