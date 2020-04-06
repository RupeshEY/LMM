package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleImportAllPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleImportAllPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleImportAllPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleImportAllPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (pageHelper :  gw.bizrules.pcf.RuleExportImportPageHelper, importTask :  RuleImportTask) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ImportButton) at RuleImportAllPopup.pcf: line 22, column 54
    function action_0 () : void {
      pageHelper.importAllRemainingRules(importTask); CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=CancelButton) at RuleImportAllPopup.pcf: line 26, column 52
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'canVisit' attribute on Popup (id=RuleImportAllPopup) at RuleImportAllPopup.pcf: line 8, column 65
    static function canVisit_2 (importTask :  RuleImportTask, pageHelper :  gw.bizrules.pcf.RuleExportImportPageHelper) : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    override property get CurrentLocation () : pcf.RuleImportAllPopup {
      return super.CurrentLocation as pcf.RuleImportAllPopup
    }
    
    property get importTask () : RuleImportTask {
      return getVariableValue("importTask", 0) as RuleImportTask
    }
    
    property set importTask ($arg :  RuleImportTask) {
      setVariableValue("importTask", 0, $arg)
    }
    
    property get pageHelper () : gw.bizrules.pcf.RuleExportImportPageHelper {
      return getVariableValue("pageHelper", 0) as gw.bizrules.pcf.RuleExportImportPageHelper
    }
    
    property set pageHelper ($arg :  gw.bizrules.pcf.RuleExportImportPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  
}