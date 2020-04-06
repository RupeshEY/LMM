package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ExpressionFragCell.nested.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExpressionFragCell_nestedExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ExpressionFragCell.nested.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpressionFragCellExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=PopupLink) at ExpressionFragCell.nested.pcf: line 43, column 27
    function action_2 () : void {
      inputConfig.pushPopup()
    }
    
    // 'initialValue' attribute on Variable at ExpressionFragCell.nested.pcf: line 18, column 49
    function initialValue_0 () : gw.bizrules.pcf.NestedInputConfig {
      return fragHolder as gw.bizrules.pcf.NestedInputConfig
    }
    
    // 'label' attribute on Link (id=Label) at ExpressionFragCell.nested.pcf: line 26, column 43
    function label_1 () : java.lang.Object {
      return inputConfig.getLabel()
    }
    
    // 'label' attribute on Link (id=PopupLink) at ExpressionFragCell.nested.pcf: line 43, column 27
    function label_3 () : java.lang.Object {
      return inputConfig.PopupLinkLabel
    }
    
    // 'value' attribute on TextInput (id=NestedText) at ExpressionFragCell.nested.pcf: line 47, column 41
    function valueRoot_6 () : java.lang.Object {
      return inputConfig
    }
    
    // 'value' attribute on TextInput (id=NestedText) at ExpressionFragCell.nested.pcf: line 47, column 41
    function value_4 () : java.lang.String {
      return inputConfig.NestedText
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
    
    property get inputConfig () : gw.bizrules.pcf.NestedInputConfig {
      return getVariableValue("inputConfig", 0) as gw.bizrules.pcf.NestedInputConfig
    }
    
    property set inputConfig ($arg :  gw.bizrules.pcf.NestedInputConfig) {
      setVariableValue("inputConfig", 0, $arg)
    }
    
    
  }
  
  
}