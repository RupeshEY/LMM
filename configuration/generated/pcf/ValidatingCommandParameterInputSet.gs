package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ValidatingCommandParameterInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ValidatingCommandParameterInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($parameterHolder :  gw.bizrules.pcf.RuleCommandParameterHolder) : void {
    __widgetOf(this, pcf.ValidatingCommandParameterInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$parameterHolder})
  }
  
  function refreshVariables ($parameterHolder :  gw.bizrules.pcf.RuleCommandParameterHolder) : void {
    __widgetOf(this, pcf.ValidatingCommandParameterInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$parameterHolder})
  }
  
  
}