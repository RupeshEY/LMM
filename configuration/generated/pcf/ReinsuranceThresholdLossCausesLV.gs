package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLossCausesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceThresholdLossCausesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ReinsuranceThreshold :  ReinsuranceThreshold) : void {
    __widgetOf(this, pcf.ReinsuranceThresholdLossCausesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ReinsuranceThreshold})
  }
  
  function refreshVariables ($ReinsuranceThreshold :  ReinsuranceThreshold) : void {
    __widgetOf(this, pcf.ReinsuranceThresholdLossCausesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ReinsuranceThreshold})
  }
  
  
}