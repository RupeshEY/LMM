package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandSequenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandSequenceInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($commandDefinitionDiff :  gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition>) : void {
    __widgetOf(this, pcf.RuleComparisonCommandSequenceInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$commandDefinitionDiff})
  }
  
  function refreshVariables ($commandDefinitionDiff :  gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition>) : void {
    __widgetOf(this, pcf.RuleComparisonCommandSequenceInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$commandDefinitionDiff})
  }
  
  
}