package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionEnabledDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionEnabledDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($fragHolder :  gw.bizrules.pcf.FilteredIterableExpressionFragmentHolder) : void {
    __widgetOf(this, pcf.ConditionEnabledDV, SECTION_WIDGET_CLASS).setVariables(false, {$fragHolder})
  }
  
  function refreshVariables ($fragHolder :  gw.bizrules.pcf.FilteredIterableExpressionFragmentHolder) : void {
    __widgetOf(this, pcf.ConditionEnabledDV, SECTION_WIDGET_CLASS).setVariables(true, {$fragHolder})
  }
  
  
}