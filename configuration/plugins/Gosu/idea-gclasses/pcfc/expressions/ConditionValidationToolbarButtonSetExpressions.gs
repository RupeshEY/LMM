package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionValidationToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConditionValidationToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionValidationToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConditionValidationToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ShowValidation) at ConditionValidationToolbarButtonSet.pcf: line 15, column 165
    function action_2 () : void {
      scopedValidatable.ShowValidationErrors = true
    }
    
    // 'action' attribute on ToolbarButton (id=HideValidation) at ConditionValidationToolbarButtonSet.pcf: line 21, column 164
    function action_6 () : void {
      scopedValidatable.ShowValidationErrors = false
    }
    
    // 'available' attribute on ToolbarButton (id=ShowValidation) at ConditionValidationToolbarButtonSet.pcf: line 15, column 165
    function available_0 () : java.lang.Boolean {
      return scopedValidatable.HasErrorsInScope
    }
    
    // 'label' attribute on ToolbarButton (id=ShowValidation) at ConditionValidationToolbarButtonSet.pcf: line 15, column 165
    function label_3 () : java.lang.Object {
      return scopedValidatable.HasErrorsInScope ? DisplayKey.get('BizRules.ConditionBuilderPanelSet.Toolbar.EnableValidation') : DisplayKey.get("BizRules.ConditionBuilderPanelSet.Toolbar.NoErrors")
    }
    
    // 'label' attribute on ToolbarButton (id=HideValidation) at ConditionValidationToolbarButtonSet.pcf: line 21, column 164
    function label_7 () : java.lang.Object {
      return scopedValidatable.HasErrorsInScope ? DisplayKey.get('BizRules.ConditionBuilderPanelSet.Toolbar.DisableValidation') : DisplayKey.get("BizRules.ConditionBuilderPanelSet.Toolbar.NoErrors")
    }
    
    // 'visible' attribute on ToolbarButton (id=ShowValidation) at ConditionValidationToolbarButtonSet.pcf: line 15, column 165
    function visible_1 () : java.lang.Boolean {
      return !scopedValidatable.ShowValidationErrors && (scopedValidatable.ShowValidationButtonIfNoErrorsInScope || scopedValidatable.HasErrorsInScope)
    }
    
    // 'visible' attribute on ToolbarButton (id=HideValidation) at ConditionValidationToolbarButtonSet.pcf: line 21, column 164
    function visible_5 () : java.lang.Boolean {
      return scopedValidatable.ShowValidationErrors && (scopedValidatable.ShowValidationButtonIfNoErrorsInScope || scopedValidatable.HasErrorsInScope)
    }
    
    property get scopedValidatable () : gw.bizrules.pcf.ScopedValidatable {
      return getRequireValue("scopedValidatable", 0) as gw.bizrules.pcf.ScopedValidatable
    }
    
    property set scopedValidatable ($arg :  gw.bizrules.pcf.ScopedValidatable) {
      setRequireValue("scopedValidatable", 0, $arg)
    }
    
    
  }
  
  
}