package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/DeployConfirmationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DeployConfirmationPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/DeployConfirmationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeployConfirmationPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (pageHelper :  gw.bizrules.pcf.RuleDeploymentPageHelper) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Continue) at DeployConfirmationPopup.pcf: line 20, column 86
    function action_1 () : void {
      pageHelper.deployQualifiedRulesInNewBundle(); pageHelper.NavigationSupport.goToRulesListPage()
    }
    
    // 'action' attribute on ToolbarButton (id=Cancel) at DeployConfirmationPopup.pcf: line 24, column 52
    function action_2 () : void {
      CurrentLocation.cancel()
    }
    
    // 'available' attribute on ToolbarButton (id=Continue) at DeployConfirmationPopup.pcf: line 20, column 86
    function available_0 () : java.lang.Boolean {
      return pageHelper.hasQualifiedRules() && !pageHelper.DeployFailed
    }
    
    // 'canVisit' attribute on Popup (id=DeployConfirmationPopup) at DeployConfirmationPopup.pcf: line 8, column 70
    static function canVisit_15 (pageHelper :  gw.bizrules.pcf.RuleDeploymentPageHelper) : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canDeployRule(null)
    }
    
    // 'def' attribute on PanelRef (id=OutdatedVersions) at DeployConfirmationPopup.pcf: line 57, column 33
    function def_onEnter_10 (def :  pcf.RuleListPanelSet) : void {
      def.onEnter(pageHelper.NavigationSupport, pageHelper.OutdatedVersions)
    }
    
    // 'def' attribute on PanelRef (id=AlreadyDeployedVersions) at DeployConfirmationPopup.pcf: line 62, column 40
    function def_onEnter_12 (def :  pcf.RuleListPanelSet) : void {
      def.onEnter(pageHelper.NavigationSupport, pageHelper.AlreadyDeployedVersions)
    }
    
    // 'def' attribute on PanelRef (id=ReadyVersions) at DeployConfirmationPopup.pcf: line 30, column 30
    function def_onEnter_3 (def :  pcf.RuleListPanelSet) : void {
      def.onEnter(pageHelper.NavigationSupport, pageHelper.ReadyVersions)
    }
    
    // 'def' attribute on PanelRef (id=UnapprovedVersions) at DeployConfirmationPopup.pcf: line 47, column 35
    function def_onEnter_6 (def :  pcf.RuleListPanelSet) : void {
      def.onEnter(pageHelper.NavigationSupport, pageHelper.UnapprovedVersions)
    }
    
    // 'def' attribute on PanelRef (id=InvalidVersions) at DeployConfirmationPopup.pcf: line 52, column 32
    function def_onEnter_8 (def :  pcf.RuleListPanelSet) : void {
      def.onEnter(pageHelper.NavigationSupport, pageHelper.InvalidVersions)
    }
    
    // 'def' attribute on PanelRef (id=OutdatedVersions) at DeployConfirmationPopup.pcf: line 57, column 33
    function def_refreshVariables_11 (def :  pcf.RuleListPanelSet) : void {
      def.refreshVariables(pageHelper.NavigationSupport, pageHelper.OutdatedVersions)
    }
    
    // 'def' attribute on PanelRef (id=AlreadyDeployedVersions) at DeployConfirmationPopup.pcf: line 62, column 40
    function def_refreshVariables_13 (def :  pcf.RuleListPanelSet) : void {
      def.refreshVariables(pageHelper.NavigationSupport, pageHelper.AlreadyDeployedVersions)
    }
    
    // 'def' attribute on PanelRef (id=ReadyVersions) at DeployConfirmationPopup.pcf: line 30, column 30
    function def_refreshVariables_4 (def :  pcf.RuleListPanelSet) : void {
      def.refreshVariables(pageHelper.NavigationSupport, pageHelper.ReadyVersions)
    }
    
    // 'def' attribute on PanelRef (id=UnapprovedVersions) at DeployConfirmationPopup.pcf: line 47, column 35
    function def_refreshVariables_7 (def :  pcf.RuleListPanelSet) : void {
      def.refreshVariables(pageHelper.NavigationSupport, pageHelper.UnapprovedVersions)
    }
    
    // 'def' attribute on PanelRef (id=InvalidVersions) at DeployConfirmationPopup.pcf: line 52, column 32
    function def_refreshVariables_9 (def :  pcf.RuleListPanelSet) : void {
      def.refreshVariables(pageHelper.NavigationSupport, pageHelper.InvalidVersions)
    }
    
    // 'visible' attribute on PanelSet at DeployConfirmationPopup.pcf: line 37, column 46
    function visible_14 () : java.lang.Boolean {
      return pageHelper.hasExceptions()
    }
    
    // 'visible' attribute on PanelSet at DeployConfirmationPopup.pcf: line 27, column 50
    function visible_5 () : java.lang.Boolean {
      return pageHelper.hasQualifiedRules()
    }
    
    override property get CurrentLocation () : pcf.DeployConfirmationPopup {
      return super.CurrentLocation as pcf.DeployConfirmationPopup
    }
    
    property get pageHelper () : gw.bizrules.pcf.RuleDeploymentPageHelper {
      return getVariableValue("pageHelper", 0) as gw.bizrules.pcf.RuleDeploymentPageHelper
    }
    
    property set pageHelper ($arg :  gw.bizrules.pcf.RuleDeploymentPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  
}