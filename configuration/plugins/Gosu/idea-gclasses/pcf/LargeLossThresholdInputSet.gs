package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/keymetrics/LargeLossThresholdInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LargeLossThresholdInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($policyType :  PolicyType, $ccThreshold :  LargeLossThreshold, $psThreshold :  LargeLossThreshold) : void {
    __widgetOf(this, pcf.LargeLossThresholdInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$policyType, $ccThreshold, $psThreshold})
  }
  
  function refreshVariables ($policyType :  PolicyType, $ccThreshold :  LargeLossThreshold, $psThreshold :  LargeLossThreshold) : void {
    __widgetOf(this, pcf.LargeLossThresholdInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$policyType, $ccThreshold, $psThreshold})
  }
  
  
}