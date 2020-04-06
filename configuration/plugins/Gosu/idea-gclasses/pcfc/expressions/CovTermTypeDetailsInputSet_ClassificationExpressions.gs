package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Classification.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CovTermTypeDetailsInputSet_ClassificationExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Classification.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermTypeDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Code) at CovTermTypeDetailsInputSet.Classification.pcf: line 19, column 43
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClassificationCovTerm.Code = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Description) at CovTermTypeDetailsInputSet.Classification.pcf: line 24, column 50
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClassificationCovTerm.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at CovTermTypeDetailsInputSet.Classification.pcf: line 14, column 37
    function initialValue_0 () : ClassificationCovTerm {
      return CovTerm as ClassificationCovTerm
    }
    
    // 'value' attribute on TextInput (id=Code) at CovTermTypeDetailsInputSet.Classification.pcf: line 19, column 43
    function valueRoot_4 () : java.lang.Object {
      return ClassificationCovTerm
    }
    
    // 'value' attribute on TextInput (id=Code) at CovTermTypeDetailsInputSet.Classification.pcf: line 19, column 43
    function value_1 () : java.lang.String {
      return ClassificationCovTerm.Code
    }
    
    // 'value' attribute on TextInput (id=Description) at CovTermTypeDetailsInputSet.Classification.pcf: line 24, column 50
    function value_5 () : java.lang.String {
      return ClassificationCovTerm.Description
    }
    
    property get ClassificationCovTerm () : ClassificationCovTerm {
      return getVariableValue("ClassificationCovTerm", 0) as ClassificationCovTerm
    }
    
    property set ClassificationCovTerm ($arg :  ClassificationCovTerm) {
      setVariableValue("ClassificationCovTerm", 0, $arg)
    }
    
    property get CovTerm () : CovTerm {
      return getRequireValue("CovTerm", 0) as CovTerm
    }
    
    property set CovTerm ($arg :  CovTerm) {
      setRequireValue("CovTerm", 0, $arg)
    }
    
    
  }
  
  
}