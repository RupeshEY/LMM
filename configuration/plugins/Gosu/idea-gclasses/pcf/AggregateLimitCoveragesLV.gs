package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitCoveragesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AggregateLimitHelper :  gw.api.admin.AggregateLimitHelper, $Policy :  Policy, $AggregateLimit :  AggregateLimit) : void {
    __widgetOf(this, pcf.AggregateLimitCoveragesLV, SECTION_WIDGET_CLASS).setVariables(false, {$AggregateLimitHelper, $Policy, $AggregateLimit})
  }
  
  function refreshVariables ($AggregateLimitHelper :  gw.api.admin.AggregateLimitHelper, $Policy :  Policy, $AggregateLimit :  AggregateLimit) : void {
    __widgetOf(this, pcf.AggregateLimitCoveragesLV, SECTION_WIDGET_CLASS).setVariables(true, {$AggregateLimitHelper, $Policy, $AggregateLimit})
  }
  
  
}