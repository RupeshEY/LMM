package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RelatedToInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RelatedToInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($state :  gw.bizrules.ruleaction.behavioralcommandparam.relatedto.HasRelatedToRuleActionCommandDefinitionState, $commandDefinition :  gw.bizrules.pcf.RuleCommandDefinitionHolder, $relatedToConfig :  gw.bizrules.ruleaction.config.CCCommandParameterDefinition) : void {
    __widgetOf(this, pcf.RelatedToInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$state, $commandDefinition, $relatedToConfig})
  }
  
  function refreshVariables ($state :  gw.bizrules.ruleaction.behavioralcommandparam.relatedto.HasRelatedToRuleActionCommandDefinitionState, $commandDefinition :  gw.bizrules.pcf.RuleCommandDefinitionHolder, $relatedToConfig :  gw.bizrules.ruleaction.config.CCCommandParameterDefinition) : void {
    __widgetOf(this, pcf.RelatedToInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$state, $commandDefinition, $relatedToConfig})
  }
  
  
}