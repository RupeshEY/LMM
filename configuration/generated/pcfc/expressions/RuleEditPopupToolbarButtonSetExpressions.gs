package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleEditPopupToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleEditPopupToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleEditPopupToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleEditPopupToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Update) at RuleEditPopupToolbarButtonSet.pcf: line 12, column 83
    function action_0 () : void {
      CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=Cancel) at RuleEditPopupToolbarButtonSet.pcf: line 16, column 58
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    
  }
  
  
}