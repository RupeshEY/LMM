package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderExpressionMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConditionBuilderExpressionMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderExpressionMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConditionBuilderExpressionMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemIterator at ConditionBuilderExpressionMenuItemSet.pcf: line 18, column 102
    function value_4 () : gw.bizrules.pcf.ExpressionInputMode[] {
      return gw.bizrules.pcf.ExpressionInputMode.values()
    }
    
    // 'visible' attribute on MenuItemIterator at ConditionBuilderExpressionMenuItemSet.pcf: line 18, column 102
    function visible_0 () : java.lang.Boolean {
      return CurrentLocation.InEditMode and (lineHolder.SwitchableLineExpressionModes.size() > 1)
    }
    
    property get fragHolder () : gw.bizrules.pcf.ExpressionFragmentHolder {
      return getRequireValue("fragHolder", 0) as gw.bizrules.pcf.ExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.ExpressionFragmentHolder) {
      setRequireValue("fragHolder", 0, $arg)
    }
    
    property get lineHolder () : gw.bizrules.pcf.RuleConditionLineHolder {
      return getRequireValue("lineHolder", 0) as gw.bizrules.pcf.RuleConditionLineHolder
    }
    
    property set lineHolder ($arg :  gw.bizrules.pcf.RuleConditionLineHolder) {
      setRequireValue("lineHolder", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderExpressionMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ConditionBuilderExpressionMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=modeItem) at ConditionBuilderExpressionMenuItemSet.pcf: line 23, column 76
    function action_2 () : void {
      lineHolder.updateModeForFragment(fragHolder, mode)
    }
    
    // 'label' attribute on MenuItem (id=modeItem) at ConditionBuilderExpressionMenuItemSet.pcf: line 23, column 76
    function label_3 () : java.lang.Object {
      return fragHolder.getMenuItemDisplayForMode(mode)
    }
    
    // 'visible' attribute on MenuItem (id=modeItem) at ConditionBuilderExpressionMenuItemSet.pcf: line 23, column 76
    function visible_1 () : java.lang.Boolean {
      return lineHolder.SwitchableLineExpressionModes.contains(mode)
    }
    
    property get mode () : gw.bizrules.pcf.ExpressionInputMode {
      return getIteratedValue(1) as gw.bizrules.pcf.ExpressionInputMode
    }
    
    
  }
  
  
}