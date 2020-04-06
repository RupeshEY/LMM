package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationRUDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RU :  LocationBasedRU) : void {
    __widgetOf(this, pcf.PolicyLocationRUDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$RU})
  }
  
  function refreshVariables ($RU :  LocationBasedRU) : void {
    __widgetOf(this, pcf.PolicyLocationRUDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$RU})
  }
  
  
}