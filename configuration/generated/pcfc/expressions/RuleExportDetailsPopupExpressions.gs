package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleExportDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleExportDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, exportTask :  RuleExportTask) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Download) at RuleExportDetailsPopup.pcf: line 27, column 43
    function action_2 () : void {
      navigationSupport.VersionController.ExportImportController.sendExportedRulesToWebClient(exportTask)
    }
    
    // 'def' attribute on PanelRef at RuleExportDetailsPopup.pcf: line 50, column 93
    function def_onEnter_12 (def :  pcf.RuleListPanelSet) : void {
      def.onEnter(navigationSupport, pageHelper.getExportedRules(exportTask))
    }
    
    // 'def' attribute on PanelRef at RuleExportDetailsPopup.pcf: line 50, column 93
    function def_refreshVariables_13 (def :  pcf.RuleListPanelSet) : void {
      def.refreshVariables(navigationSupport, pageHelper.getExportedRules(exportTask))
    }
    
    // 'initialValue' attribute on Variable at RuleExportDetailsPopup.pcf: line 19, column 58
    function initialValue_0 () : gw.bizrules.pcf.RuleExportImportPageHelper {
      return new gw.bizrules.pcf.RuleExportImportPageHelper(navigationSupport.VersionController.ExportImportController)
    }
    
    // 'value' attribute on TextInput (id=Status) at RuleExportDetailsPopup.pcf: line 46, column 166
    function valueRoot_11 () : java.lang.Object {
      return gw.bizrules.management.RuleExportImportTaskStatus.of(navigationSupport.VersionController.ExportImportController, exportTask).Status
    }
    
    // 'value' attribute on TextInput (id=StartedBy) at RuleExportDetailsPopup.pcf: line 34, column 55
    function valueRoot_5 () : java.lang.Object {
      return exportTask.StartedBy
    }
    
    // 'value' attribute on DateInput (id=Created) at RuleExportDetailsPopup.pcf: line 40, column 43
    function valueRoot_8 () : java.lang.Object {
      return exportTask
    }
    
    // 'value' attribute on TextInput (id=StartedBy) at RuleExportDetailsPopup.pcf: line 34, column 55
    function value_3 () : java.lang.String {
      return exportTask.StartedBy.DisplayName
    }
    
    // 'value' attribute on DateInput (id=Created) at RuleExportDetailsPopup.pcf: line 40, column 43
    function value_6 () : java.util.Date {
      return exportTask.StartTime
    }
    
    // 'value' attribute on TextInput (id=Status) at RuleExportDetailsPopup.pcf: line 46, column 166
    function value_9 () : java.lang.String {
      return gw.bizrules.management.RuleExportImportTaskStatus.of(navigationSupport.VersionController.ExportImportController, exportTask).Status.DisplayName
    }
    
    // 'visible' attribute on ToolbarButton (id=Download) at RuleExportDetailsPopup.pcf: line 27, column 43
    function visible_1 () : java.lang.Boolean {
      return exportTask.hasData()
    }
    
    override property get CurrentLocation () : pcf.RuleExportDetailsPopup {
      return super.CurrentLocation as pcf.RuleExportDetailsPopup
    }
    
    property get exportTask () : RuleExportTask {
      return getVariableValue("exportTask", 0) as RuleExportTask
    }
    
    property set exportTask ($arg :  RuleExportTask) {
      setVariableValue("exportTask", 0, $arg)
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getVariableValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setVariableValue("navigationSupport", 0, $arg)
    }
    
    property get pageHelper () : gw.bizrules.pcf.RuleExportImportPageHelper {
      return getVariableValue("pageHelper", 0) as gw.bizrules.pcf.RuleExportImportPageHelper
    }
    
    property set pageHelper ($arg :  gw.bizrules.pcf.RuleExportImportPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  
}