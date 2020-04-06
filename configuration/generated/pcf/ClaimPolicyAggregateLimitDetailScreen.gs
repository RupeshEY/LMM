package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyAggregateLimitDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $AggregateLimit :  AggregateLimit, $AggregateLimitHelper :  gw.api.admin.AggregateLimitHelper) : void {
    __widgetOf(this, pcf.ClaimPolicyAggregateLimitDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $AggregateLimit, $AggregateLimitHelper})
  }
  
  function refreshVariables ($Claim :  Claim, $AggregateLimit :  AggregateLimit, $AggregateLimitHelper :  gw.api.admin.AggregateLimitHelper) : void {
    __widgetOf(this, pcf.ClaimPolicyAggregateLimitDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $AggregateLimit, $AggregateLimitHelper})
  }
  
  
}