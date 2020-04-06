package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitClaimsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimAggregateLimitRptList :  ClaimAggregateLimitRpt[], $AggregateLimit :  AggregateLimit) : void {
    __widgetOf(this, pcf.AggregateLimitClaimsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimAggregateLimitRptList, $AggregateLimit})
  }
  
  function refreshVariables ($ClaimAggregateLimitRptList :  ClaimAggregateLimitRpt[], $AggregateLimit :  AggregateLimit) : void {
    __widgetOf(this, pcf.AggregateLimitClaimsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimAggregateLimitRptList, $AggregateLimit})
  }
  
  
}