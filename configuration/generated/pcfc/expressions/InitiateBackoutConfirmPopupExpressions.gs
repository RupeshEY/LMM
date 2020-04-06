package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InitiateBackoutConfirmPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InitiateBackoutConfirmPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Page :  gw.api.tools.UpgradeInfoPageHelper) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Continue) at InitiateBackoutConfirmPopup.pcf: line 32, column 114
    function action_0 () : void {
      CurrentLocation.commit(); InitiateBackoutPopup.push(Page) 
    }
    
    // 'action' attribute on ToolbarButton (id=Cancel) at InitiateBackoutConfirmPopup.pcf: line 36, column 64
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    override property get CurrentLocation () : pcf.InitiateBackoutConfirmPopup {
      return super.CurrentLocation as pcf.InitiateBackoutConfirmPopup
    }
    
    property get Page () : gw.api.tools.UpgradeInfoPageHelper {
      return getVariableValue("Page", 0) as gw.api.tools.UpgradeInfoPageHelper
    }
    
    property set Page ($arg :  gw.api.tools.UpgradeInfoPageHelper) {
      setVariableValue("Page", 0, $arg)
    }
    
    
  }
  
  
}