package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.upgrade.UpgradeCondition
@javax.annotation.Generated("config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StartRollingUpgradePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends StartRollingUpgradeScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxCell (id=Checked) at StartRollingUpgradePopup.pcf: line 40, column 41
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      condition.Checked = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=Checked) at StartRollingUpgradePopup.pcf: line 40, column 41
    function valueRoot_4 () : java.lang.Object {
      return condition
    }
    
    // 'value' attribute on CheckBoxCell (id=Checked) at StartRollingUpgradePopup.pcf: line 40, column 41
    function value_1 () : java.lang.Boolean {
      return condition.Checked
    }
    
    // 'value' attribute on TextCell (id=condition) at StartRollingUpgradePopup.pcf: line 47, column 28
    function value_5 () : java.lang.String {
      return condition.Condition
    }
    
    property get condition () : gw.upgrade.UpgradeCondition {
      return getIteratedValue(2) as gw.upgrade.UpgradeCondition
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartRollingUpgradePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Page :  gw.api.tools.UpgradeInfoPageHelper) : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.StartRollingUpgradePopup {
      return super.CurrentLocation as pcf.StartRollingUpgradePopup
    }
    
    property get Page () : gw.api.tools.UpgradeInfoPageHelper {
      return getVariableValue("Page", 0) as gw.api.tools.UpgradeInfoPageHelper
    }
    
    property set Page ($arg :  gw.api.tools.UpgradeInfoPageHelper) {
      setVariableValue("Page", 0, $arg)
    }
    
    
    function initConds() : UpgradeCondition[] {
     var msgs : UpgradeCondition[] = {
       new UpgradeCondition(DisplayKey.get("Web.InternalTools.infoPages.UpgradeInfo.StartRolling.Condition1")),
       new UpgradeCondition(DisplayKey.get("Web.InternalTools.infoPages.UpgradeInfo.StartRolling.Condition2"))
     }
     return msgs
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartRollingUpgradeScreenExpressionsImpl extends StartRollingUpgradePopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=StartRolling) at StartRollingUpgradePopup.pcf: line 62, column 93
    function action_10 () : void {
      Page.startRollingUpgrade(); CurrentLocation.commit()
    }
    
    // 'available' attribute on ToolbarButton (id=StartRolling) at StartRollingUpgradePopup.pcf: line 62, column 93
    function available_9 () : java.lang.Boolean {
      return conditions.allMatch( \ cond -> cond.Checked)
    }
    
    // 'initialValue' attribute on Variable at StartRollingUpgradePopup.pcf: line 20, column 47
    function initialValue_0 () : gw.upgrade.UpgradeCondition[] {
      return initConds()
    }
    
    // EditButtons (id=editButtons) at StartRollingUpgradePopup.pcf: line 67, column 36
    function label_11 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'value' attribute on RowIterator (id=iterator) at StartRollingUpgradePopup.pcf: line 35, column 53
    function value_8 () : gw.upgrade.UpgradeCondition[] {
      return conditions
    }
    
    property get conditions () : gw.upgrade.UpgradeCondition[] {
      return getVariableValue("conditions", 1) as gw.upgrade.UpgradeCondition[]
    }
    
    property set conditions ($arg :  gw.upgrade.UpgradeCondition[]) {
      setVariableValue("conditions", 1, $arg)
    }
    
    
  }
  
  
}