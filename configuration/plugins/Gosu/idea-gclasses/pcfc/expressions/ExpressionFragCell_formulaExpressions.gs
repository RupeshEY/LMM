package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ExpressionFragCell.formula.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExpressionFragCell_formulaExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ExpressionFragCell.formula.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpressionFragCellExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoComplete' attribute on TextCell (id=Expression) at ExpressionFragCell.formula.pcf: line 27, column 45
    function autoComplete_7 () : gw.api.contact.AutocompleteHandler {
      return codeFragHolder.AutocompleteHandler
    }
    
    // 'value' attribute on TextCell (id=Expression) at ExpressionFragCell.formula.pcf: line 27, column 45
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      codeFragHolder.FragmentProp = (__VALUE_TO_SET as entity.ExpressionFragment)
    }
    
    // 'initialValue' attribute on Variable at ExpressionFragCell.formula.pcf: line 17, column 60
    function initialValue_0 () : gw.bizrules.pcf.TextExpressionFragmentHolder {
      return fragHolder as gw.bizrules.pcf.TextExpressionFragmentHolder
    }
    
    // 'inputConversion' attribute on TextCell (id=Expression) at ExpressionFragCell.formula.pcf: line 27, column 45
    function inputConversion_2 (VALUE :  java.lang.String) : java.lang.Object {
      return codeFragHolder.inputConversion(VALUE)
    }
    
    // 'outputConversion' attribute on TextCell (id=Expression) at ExpressionFragCell.formula.pcf: line 27, column 45
    function outputConversion_3 (VALUE :  entity.ExpressionFragment) : java.lang.String {
      return codeFragHolder.outputConversion()
    }
    
    // 'value' attribute on TextCell (id=Expression) at ExpressionFragCell.formula.pcf: line 27, column 45
    function valueRoot_6 () : java.lang.Object {
      return codeFragHolder
    }
    
    // 'value' attribute on TextCell (id=Expression) at ExpressionFragCell.formula.pcf: line 27, column 45
    function value_1 () : entity.ExpressionFragment {
      return codeFragHolder.FragmentProp
    }
    
    property get codeFragHolder () : gw.bizrules.pcf.TextExpressionFragmentHolder {
      return getVariableValue("codeFragHolder", 0) as gw.bizrules.pcf.TextExpressionFragmentHolder
    }
    
    property set codeFragHolder ($arg :  gw.bizrules.pcf.TextExpressionFragmentHolder) {
      setVariableValue("codeFragHolder", 0, $arg)
    }
    
    property get controller () : gw.bizrules.pcf.ConditionBuilderController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.ConditionBuilderController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.ConditionBuilderController) {
      setRequireValue("controller", 0, $arg)
    }
    
    property get fragHolder () : gw.bizrules.pcf.ExpressionFragmentHolder {
      return getRequireValue("fragHolder", 0) as gw.bizrules.pcf.ExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.ExpressionFragmentHolder) {
      setRequireValue("fragHolder", 0, $arg)
    }
    
    
  }
  
  
}