package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewCheckGroupChecksLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewCheckGroupChecksLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioCell (id=Check_Primary) at NewCheckGroupChecksLV.pcf: line 24, column 34
    function valueRoot_7 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextCell (id=Check_MailingAddress) at NewCheckGroupChecksLV.pcf: line 33, column 54
    function value_11 () : java.lang.String {
      return Check.FormatAddressSummary(false)
    }
    
    // 'value' attribute on TextCell (id=Check_Portion) at NewCheckGroupChecksLV.pcf: line 37, column 69
    function value_13 () : java.lang.String {
      return Check.Portion.getMultiCurrencyDisplayName(Check)
    }
    
    // 'value' attribute on CurrencyCell (id=Check_NetAmount) at NewCheckGroupChecksLV.pcf: line 43, column 61
    function value_15 () : gw.api.financials.CurrencyAmountPair {
      return Check.NetAmountPair
    }
    
    // 'value' attribute on BooleanRadioCell (id=Check_Primary) at NewCheckGroupChecksLV.pcf: line 24, column 34
    function value_5 () : java.lang.Boolean {
      return Check.Primary
    }
    
    // 'value' attribute on TextCell (id=Check_PayTo) at NewCheckGroupChecksLV.pcf: line 29, column 32
    function value_8 () : java.lang.String {
      return Check.PayTo
    }
    
    property get Check () : entity.Check {
      return getIteratedValue(1) as entity.Check
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckGroupChecksLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at NewCheckGroupChecksLV.pcf: line 24, column 34
    function sortValue_0 (Check :  entity.Check) : java.lang.Object {
      return Check.Primary
    }
    
    // 'value' attribute on RowIterator at NewCheckGroupChecksLV.pcf: line 29, column 32
    function sortValue_1 (Check :  entity.Check) : java.lang.Object {
      return Check.PayTo
    }
    
    // 'value' attribute on RowIterator at NewCheckGroupChecksLV.pcf: line 33, column 54
    function sortValue_2 (Check :  entity.Check) : java.lang.Object {
      return Check.FormatAddressSummary(false)
    }
    
    // 'value' attribute on RowIterator at NewCheckGroupChecksLV.pcf: line 37, column 69
    function sortValue_3 (Check :  entity.Check) : java.lang.Object {
      return Check.Portion.getMultiCurrencyDisplayName(Check)
    }
    
    // 'value' attribute on RowIterator at NewCheckGroupChecksLV.pcf: line 43, column 61
    function sortValue_4 (Check :  entity.Check) : java.lang.Object {
      return Check.NetAmountPair
    }
    
    // 'value' attribute on RowIterator at NewCheckGroupChecksLV.pcf: line 16, column 34
    function value_18 () : entity.Check[] {
      return CheckGroup.Checks
    }
    
    property get CheckGroup () : CheckGroup {
      return getRequireValue("CheckGroup", 0) as CheckGroup
    }
    
    property set CheckGroup ($arg :  CheckGroup) {
      setRequireValue("CheckGroup", 0, $arg)
    }
    
    
  }
  
  
}