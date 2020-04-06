package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleManagementAuditLinkInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleManagementAuditLinkInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($versionController :  gw.bizrules.management.BizRulesVersionController, $importingVersion :  boolean, $version :  RuleVersion) : void {
    __widgetOf(this, pcf.RuleManagementAuditLinkInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$versionController, $importingVersion, $version})
  }
  
  function refreshVariables ($versionController :  gw.bizrules.management.BizRulesVersionController, $importingVersion :  boolean, $version :  RuleVersion) : void {
    __widgetOf(this, pcf.RuleManagementAuditLinkInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$versionController, $importingVersion, $version})
  }
  
  
}