package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleExportAllConfirmationPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleExportAllConfirmationPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (helper :  gw.bizrules.pcf.RuleExportPageHelper) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Continue) at RuleExportAllConfirmationPopup.pcf: line 18, column 93
    function action_0 () : void {
      helper.exportAllRulesToFileNoConfirm()
    }
    
    // 'action' attribute on ToolbarButton (id=Cancel) at RuleExportAllConfirmationPopup.pcf: line 22, column 52
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on PanelRef (id=NoDeployedDrafts) at RuleExportAllConfirmationPopup.pcf: line 26, column 31
    function def_onEnter_2 (def :  pcf.ExportExclusionsPanelSet) : void {
      def.onEnter(helper.NavigationSupport, helper.NoDeployedDrafts, DisplayKey.get('BizRules.RuleExportAllConfirmationPopup.NoDeployedDraftsTitle'), false, false)
    }
    
    // 'def' attribute on PanelRef (id=PreviouslyDeployedDrafts) at RuleExportAllConfirmationPopup.pcf: line 31, column 39
    function def_onEnter_4 (def :  pcf.ExportExclusionsPanelSet) : void {
      def.onEnter(helper.NavigationSupport, helper.PreviouslyDeployedDrafts, DisplayKey.get('BizRules.RuleExportAllConfirmationPopup.PreviouslyDeployedDraftsTitle'), true, true)
    }
    
    // 'def' attribute on PanelRef (id=DraftsWithDeploymentUncertainty) at RuleExportAllConfirmationPopup.pcf: line 36, column 46
    function def_onEnter_6 (def :  pcf.ExportExclusionsPanelSet) : void {
      def.onEnter(helper.NavigationSupport, helper.DraftsWithDeploymentUncertainty, DisplayKey.get('BizRules.RuleExportAllConfirmationPopup.DraftsWithDeploymentUncertaintyTitle'), true, false)
    }
    
    // 'def' attribute on PanelRef (id=NoDeployedDrafts) at RuleExportAllConfirmationPopup.pcf: line 26, column 31
    function def_refreshVariables_3 (def :  pcf.ExportExclusionsPanelSet) : void {
      def.refreshVariables(helper.NavigationSupport, helper.NoDeployedDrafts, DisplayKey.get('BizRules.RuleExportAllConfirmationPopup.NoDeployedDraftsTitle'), false, false)
    }
    
    // 'def' attribute on PanelRef (id=PreviouslyDeployedDrafts) at RuleExportAllConfirmationPopup.pcf: line 31, column 39
    function def_refreshVariables_5 (def :  pcf.ExportExclusionsPanelSet) : void {
      def.refreshVariables(helper.NavigationSupport, helper.PreviouslyDeployedDrafts, DisplayKey.get('BizRules.RuleExportAllConfirmationPopup.PreviouslyDeployedDraftsTitle'), true, true)
    }
    
    // 'def' attribute on PanelRef (id=DraftsWithDeploymentUncertainty) at RuleExportAllConfirmationPopup.pcf: line 36, column 46
    function def_refreshVariables_7 (def :  pcf.ExportExclusionsPanelSet) : void {
      def.refreshVariables(helper.NavigationSupport, helper.DraftsWithDeploymentUncertainty, DisplayKey.get('BizRules.RuleExportAllConfirmationPopup.DraftsWithDeploymentUncertaintyTitle'), true, false)
    }
    
    override property get CurrentLocation () : pcf.RuleExportAllConfirmationPopup {
      return super.CurrentLocation as pcf.RuleExportAllConfirmationPopup
    }
    
    property get helper () : gw.bizrules.pcf.RuleExportPageHelper {
      return getVariableValue("helper", 0) as gw.bizrules.pcf.RuleExportPageHelper
    }
    
    property set helper ($arg :  gw.bizrules.pcf.RuleExportPageHelper) {
      setVariableValue("helper", 0, $arg)
    }
    
    
  }
  
  
}