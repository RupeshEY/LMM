package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/deductible/DeductibleInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DeductibleInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/deductible/DeductibleInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeductibleInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at DeductibleInputSet.pcf: line 18, column 28
    function initialValue_0 () : Deductible[] {
      return claim.getDeductibles()
    }
    
    // 'value' attribute on InputIterator (id=DeductibleIterator) at DeductibleInputSet.pcf: line 26, column 39
    function value_6 () : entity.Deductible[] {
      return deductibles
    }
    
    // 'visible' attribute on InputSet (id=DeductibleInputSet) at DeductibleInputSet.pcf: line 7, column 41
    function visible_7 () : java.lang.Boolean {
      return deductibles.length > 0
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get deductibles () : Deductible[] {
      return getVariableValue("deductibles", 0) as Deductible[]
    }
    
    property set deductibles ($arg :  Deductible[]) {
      setVariableValue("deductibles", 0, $arg)
    }
    
    property get withCoverage () : boolean {
      return getRequireValue("withCoverage", 0) as java.lang.Boolean
    }
    
    property set withCoverage ($arg :  boolean) {
      setRequireValue("withCoverage", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/deductible/DeductibleInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DeductibleInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextInput (id=Deductible) at DeductibleInputSet.pcf: line 30, column 43
    function label_1 () : java.lang.Object {
      return deductible.getDisplayLabel( withCoverage )
    }
    
    // 'value' attribute on TextInput (id=Deductible) at DeductibleInputSet.pcf: line 30, column 43
    function valueRoot_5 () : java.lang.Object {
      return deductible
    }
    
    // 'value' attribute on TextInput (id=Deductible) at DeductibleInputSet.pcf: line 30, column 43
    function value_2 () : java.lang.String {
      return deductible.DisplayAmount
    }
    
    property get deductible () : entity.Deductible {
      return getIteratedValue(1) as entity.Deductible
    }
    
    
  }
  
  
}