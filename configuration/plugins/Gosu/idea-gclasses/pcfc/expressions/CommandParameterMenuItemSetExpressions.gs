package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CommandParameterMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandParameterMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemIterator at CommandParameterMenuItemSet.pcf: line 15, column 110
    function value_4 () : gw.bizrules.pcf.ExpressionInputMode[] {
      return gw.bizrules.pcf.ExpressionInputMode.values()
    }
    
    // 'visible' attribute on MenuItemIterator at CommandParameterMenuItemSet.pcf: line 15, column 110
    function visible_0 () : java.lang.Boolean {
      return CurrentLocation.InEditMode && parameterHolder.getLegalAvailableModes().size() > 1
    }
    
    property get parameterHolder () : gw.bizrules.pcf.RuleCommandParameterHolder {
      return getRequireValue("parameterHolder", 0) as gw.bizrules.pcf.RuleCommandParameterHolder
    }
    
    property set parameterHolder ($arg :  gw.bizrules.pcf.RuleCommandParameterHolder) {
      setRequireValue("parameterHolder", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CommandParameterMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=modeItem) at CommandParameterMenuItemSet.pcf: line 20, column 54
    function action_2 () : void {
      parameterHolder.Mode = mode
    }
    
    // 'label' attribute on MenuItem (id=modeItem) at CommandParameterMenuItemSet.pcf: line 20, column 54
    function label_3 () : java.lang.Object {
      return parameterHolder.getMenuItemDisplayForMode(mode)
    }
    
    // 'visible' attribute on MenuItem (id=modeItem) at CommandParameterMenuItemSet.pcf: line 20, column 54
    function visible_1 () : java.lang.Boolean {
      return parameterHolder.isLegalMode(mode)
    }
    
    property get mode () : gw.bizrules.pcf.ExpressionInputMode {
      return getIteratedValue(1) as gw.bizrules.pcf.ExpressionInputMode
    }
    
    
  }
  
  
}