package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AggregateLimit :  AggregateLimit, $Policy :  Policy, $AggregateLimitHelper :  gw.api.admin.AggregateLimitHelper) : void {
    __widgetOf(this, pcf.AggregateLimitDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$AggregateLimit, $Policy, $AggregateLimitHelper})
  }
  
  function refreshVariables ($AggregateLimit :  AggregateLimit, $Policy :  Policy, $AggregateLimitHelper :  gw.api.admin.AggregateLimitHelper) : void {
    __widgetOf(this, pcf.AggregateLimitDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$AggregateLimit, $Policy, $AggregateLimitHelper})
  }
  
  
}