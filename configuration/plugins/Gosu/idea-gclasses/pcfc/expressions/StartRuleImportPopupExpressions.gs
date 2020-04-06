package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/StartRuleImportPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StartRuleImportPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/StartRuleImportPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartRuleImportPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ImportButton) at StartRuleImportPopup.pcf: line 27, column 94
    function action_1 () : void {
      navigationSupport.VersionController.ExportImportController.startRulesImportFromWebFile(file); CurrentLocation.cancel(); navigationSupport.goToExportImportStatusPage()
    }
    
    // 'action' attribute on ToolbarButton (id=CancelButton) at StartRuleImportPopup.pcf: line 32, column 52
    function action_4 () : void {
      CurrentLocation.cancel()
    }
    
    // 'available' attribute on ToolbarButton (id=ImportButton) at StartRuleImportPopup.pcf: line 27, column 94
    function available_0 () : java.lang.Boolean {
      return file != null && gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'available' attribute on ToolbarButton (id=CancelButton) at StartRuleImportPopup.pcf: line 32, column 52
    function available_3 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'value' attribute on FileInput (id=File) at StartRuleImportPopup.pcf: line 46, column 29
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      file = (__VALUE_TO_SET as gw.api.web.WebFile)
    }
    
    // 'tooltip' attribute on ToolbarButton (id=ImportButton) at StartRuleImportPopup.pcf: line 27, column 94
    function tooltip_2 () : java.lang.String {
      return gw.bizrules.pcf.RulePermissionUIHelper.checkAndGetImportPermissionMsg()
    }
    
    // 'value' attribute on TextInput (id=fileLabel) at StartRuleImportPopup.pcf: line 40, column 167
    function value_5 () : java.lang.String {
      return DisplayKey.get('BizRules.StartRuleImportPopup.FileDescription', navigationSupport.VersionController.ExportImportController.RulesFileExtension)
    }
    
    // 'value' attribute on FileInput (id=File) at StartRuleImportPopup.pcf: line 46, column 29
    function value_7 () : gw.api.web.WebFile {
      return file
    }
    
    override property get CurrentLocation () : pcf.StartRuleImportPopup {
      return super.CurrentLocation as pcf.StartRuleImportPopup
    }
    
    property get file () : gw.api.web.WebFile {
      return getVariableValue("file", 0) as gw.api.web.WebFile
    }
    
    property set file ($arg :  gw.api.web.WebFile) {
      setVariableValue("file", 0, $arg)
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getVariableValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setVariableValue("navigationSupport", 0, $arg)
    }
    
    
  }
  
  
}