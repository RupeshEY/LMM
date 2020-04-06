package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleManagementAuditLinkInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleManagementAuditLinkInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleManagementAuditLinkInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleManagementAuditLinkInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Link) at RuleManagementAuditLinkInputSet.pcf: line 35, column 91
    function action_3 () : void {
      RuleManagementAuditPopup.push(controller, version)
    }
    
    // 'action' attribute on Link (id=Link) at RuleManagementAuditLinkInputSet.pcf: line 35, column 91
    function action_dest_4 () : pcf.api.Destination {
      return pcf.RuleManagementAuditPopup.createDestination(controller, version)
    }
    
    // 'initialValue' attribute on Variable at RuleManagementAuditLinkInputSet.pcf: line 20, column 61
    function initialValue_0 () : gw.bizrules.pcf.RuleManagementAuditController {
      return new gw.bizrules.pcf.RuleManagementAuditController(versionController, importingVersion)
    }
    
    // 'initialValue' attribute on Variable at RuleManagementAuditLinkInputSet.pcf: line 25, column 70
    function initialValue_1 () : gw.bizrules.pcf.RuleManagementAuditController.Activity {
      return version != null ? controller.getMostImportantActivity(version) : null
    }
    
    // 'label' attribute on Link (id=Summary) at RuleManagementAuditLinkInputSet.pcf: line 30, column 218
    function label_2 () : java.lang.Object {
      return DisplayKey.get("BizRules.RuleManagementAuditLink.Summary", mostImportantActivity.ActivityType.DisplayName, mostImportantActivity.UserName, mostImportantActivity.Timestamp.formatDate(SHORT))
    }
    
    // 'visible' attribute on InputSet (id=RuleManagementAuditLinkInputSet) at RuleManagementAuditLinkInputSet.pcf: line 7, column 31
    function visible_5 () : java.lang.Boolean {
      return version != null
    }
    
    property get controller () : gw.bizrules.pcf.RuleManagementAuditController {
      return getVariableValue("controller", 0) as gw.bizrules.pcf.RuleManagementAuditController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RuleManagementAuditController) {
      setVariableValue("controller", 0, $arg)
    }
    
    property get importingVersion () : boolean {
      return getRequireValue("importingVersion", 0) as java.lang.Boolean
    }
    
    property set importingVersion ($arg :  boolean) {
      setRequireValue("importingVersion", 0, $arg)
    }
    
    property get mostImportantActivity () : gw.bizrules.pcf.RuleManagementAuditController.Activity {
      return getVariableValue("mostImportantActivity", 0) as gw.bizrules.pcf.RuleManagementAuditController.Activity
    }
    
    property set mostImportantActivity ($arg :  gw.bizrules.pcf.RuleManagementAuditController.Activity) {
      setVariableValue("mostImportantActivity", 0, $arg)
    }
    
    property get version () : RuleVersion {
      return getRequireValue("version", 0) as RuleVersion
    }
    
    property set version ($arg :  RuleVersion) {
      setRequireValue("version", 0, $arg)
    }
    
    property get versionController () : gw.bizrules.management.BizRulesVersionController {
      return getRequireValue("versionController", 0) as gw.bizrules.management.BizRulesVersionController
    }
    
    property set versionController ($arg :  gw.bizrules.management.BizRulesVersionController) {
      setRequireValue("versionController", 0, $arg)
    }
    
    
  }
  
  
}