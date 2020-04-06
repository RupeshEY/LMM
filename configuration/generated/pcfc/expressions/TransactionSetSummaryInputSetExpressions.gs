package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionSetSummaryInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionSetSummaryInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionSetSummaryInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionSetSummaryInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=ApprovableBean_CreateUser) at TransactionSetSummaryInputSet.pcf: line 16, column 62
    function valueRoot_2 () : java.lang.Object {
      return TransactionSet.CreateUser.Contact
    }
    
    // 'value' attribute on DateInput (id=ApprovableBean_CreateTime) at TransactionSetSummaryInputSet.pcf: line 20, column 42
    function valueRoot_5 () : java.lang.Object {
      return TransactionSet
    }
    
    // 'value' attribute on TextInput (id=ApprovableBean_CreateUser) at TransactionSetSummaryInputSet.pcf: line 16, column 62
    function value_0 () : java.lang.String {
      return TransactionSet.CreateUser.Contact.DisplayName
    }
    
    // 'value' attribute on DateInput (id=ApprovableBean_CreateTime) at TransactionSetSummaryInputSet.pcf: line 20, column 42
    function value_3 () : java.util.Date {
      return TransactionSet.CreateTime
    }
    
    property get TransactionSet () : TransactionSet {
      return getRequireValue("TransactionSet", 0) as TransactionSet
    }
    
    property set TransactionSet ($arg :  TransactionSet) {
      setRequireValue("TransactionSet", 0, $arg)
    }
    
    
  }
  
  
}