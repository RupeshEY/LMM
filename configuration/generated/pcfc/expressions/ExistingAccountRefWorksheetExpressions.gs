package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExistingAccountRefWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExistingAccountRefWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (account :  Account, policies :  java.util.List<Policy>) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=CloseButton) at ExistingAccountRefWorksheet.pcf: line 25, column 39
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'location' attribute on Scope at ExistingAccountRefWorksheet.pcf: line 12, column 42
    function location_0 () : pcf.api.Destination {
      return pcf.AccountDetail.createDestination(account)
    }
    
    // 'value' attribute on RowIterator at ExistingAccountRefWorksheet.pcf: line 38, column 44
    function sortValue_2 (policy :  entity.Policy) : java.lang.Object {
      return policy.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ExistingAccountRefWorksheet.pcf: line 43, column 43
    function sortValue_3 (policy :  entity.Policy) : java.lang.Object {
      return policy.insured
    }
    
    // 'value' attribute on RowIterator at ExistingAccountRefWorksheet.pcf: line 47, column 45
    function sortValue_4 (policy :  entity.Policy) : java.lang.Object {
      return policy.EffectiveDate
    }
    
    // 'value' attribute on RowIterator at ExistingAccountRefWorksheet.pcf: line 51, column 46
    function sortValue_5 (policy :  entity.Policy) : java.lang.Object {
      return policy.ExpirationDate
    }
    
    // 'value' attribute on RowIterator at ExistingAccountRefWorksheet.pcf: line 56, column 47
    function sortValue_6 (policy :  entity.Policy) : java.lang.Object {
      return policy.PolicyType
    }
    
    // 'value' attribute on RowIterator at ExistingAccountRefWorksheet.pcf: line 33, column 59
    function value_22 () : java.util.List<entity.Policy> {
      return policies
    }
    
    override property get CurrentLocation () : pcf.ExistingAccountRefWorksheet {
      return super.CurrentLocation as pcf.ExistingAccountRefWorksheet
    }
    
    property get account () : Account {
      return getVariableValue("account", 0) as Account
    }
    
    property set account ($arg :  Account) {
      setVariableValue("account", 0, $arg)
    }
    
    property get policies () : java.util.List<Policy> {
      return getVariableValue("policies", 0) as java.util.List<Policy>
    }
    
    property set policies ($arg :  java.util.List<Policy>) {
      setVariableValue("policies", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ExistingAccountRefWorksheetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ExistingAccountRefWorksheet.pcf: line 38, column 44
    function valueRoot_9 () : java.lang.Object {
      return policy
    }
    
    // 'value' attribute on TextCell (id=InsuredName) at ExistingAccountRefWorksheet.pcf: line 43, column 43
    function value_10 () : entity.Contact {
      return policy.insured
    }
    
    // 'value' attribute on DateCell (id=EffectiveDate) at ExistingAccountRefWorksheet.pcf: line 47, column 45
    function value_13 () : java.util.Date {
      return policy.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=ExpirationDate) at ExistingAccountRefWorksheet.pcf: line 51, column 46
    function value_16 () : java.util.Date {
      return policy.ExpirationDate
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType) at ExistingAccountRefWorksheet.pcf: line 56, column 47
    function value_19 () : typekey.PolicyType {
      return policy.PolicyType
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ExistingAccountRefWorksheet.pcf: line 38, column 44
    function value_7 () : java.lang.String {
      return policy.PolicyNumber
    }
    
    property get policy () : entity.Policy {
      return getIteratedValue(1) as entity.Policy
    }
    
    
  }
  
  
}