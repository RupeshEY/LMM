package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Financial.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CovTermTypeDetailsInputSet_FinancialExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Financial.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermTypeDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyInput (id=FinancialAmount) at CovTermTypeDetailsInputSet.Financial.pcf: line 19, column 49
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      FinancialCovTerm.FinancialAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'initialValue' attribute on Variable at CovTermTypeDetailsInputSet.Financial.pcf: line 14, column 32
    function initialValue_0 () : FinancialCovTerm {
      return CovTerm as FinancialCovTerm
    }
    
    // 'value' attribute on CurrencyInput (id=FinancialAmount) at CovTermTypeDetailsInputSet.Financial.pcf: line 19, column 49
    function valueRoot_4 () : java.lang.Object {
      return FinancialCovTerm
    }
    
    // 'value' attribute on CurrencyInput (id=FinancialAmount) at CovTermTypeDetailsInputSet.Financial.pcf: line 19, column 49
    function value_1 () : gw.api.financials.CurrencyAmount {
      return FinancialCovTerm.FinancialAmount
    }
    
    property get CovTerm () : CovTerm {
      return getRequireValue("CovTerm", 0) as CovTerm
    }
    
    property set CovTerm ($arg :  CovTerm) {
      setRequireValue("CovTerm", 0, $arg)
    }
    
    property get FinancialCovTerm () : FinancialCovTerm {
      return getVariableValue("FinancialCovTerm", 0) as FinancialCovTerm
    }
    
    property set FinancialCovTerm ($arg :  FinancialCovTerm) {
      setVariableValue("FinancialCovTerm", 0, $arg)
    }
    
    
  }
  
  
}