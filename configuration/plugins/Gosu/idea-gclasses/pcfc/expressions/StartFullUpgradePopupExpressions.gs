package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StartFullUpgradePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartFullUpgradePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Page :  gw.api.tools.UpgradeInfoPageHelper) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=StartFull) at StartFullUpgradePopup.pcf: line 56, column 61
    function action_0 () : void {
      Page.startFullUpgrade(); CurrentLocation.commit()
    }
    
    // EditButtons (id=editButtons) at StartFullUpgradePopup.pcf: line 61, column 36
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    override property get CurrentLocation () : pcf.StartFullUpgradePopup {
      return super.CurrentLocation as pcf.StartFullUpgradePopup
    }
    
    property get Page () : gw.api.tools.UpgradeInfoPageHelper {
      return getVariableValue("Page", 0) as gw.api.tools.UpgradeInfoPageHelper
    }
    
    property set Page ($arg :  gw.api.tools.UpgradeInfoPageHelper) {
      setVariableValue("Page", 0, $arg)
    }
    
    
  }
  
  
}