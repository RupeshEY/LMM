package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AggregateLimitList :  AggregateLimit[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.AggregateLimitsLV, SECTION_WIDGET_CLASS).setVariables(false, {$AggregateLimitList, $Claim})
  }
  
  function refreshVariables ($AggregateLimitList :  AggregateLimit[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.AggregateLimitsLV, SECTION_WIDGET_CLASS).setVariables(true, {$AggregateLimitList, $Claim})
  }
  
  
}