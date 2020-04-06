package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryMattersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($MatterList :  Matter[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimSummaryMattersLV, SECTION_WIDGET_CLASS).setVariables(false, {$MatterList, $Claim})
  }
  
  function refreshVariables ($MatterList :  Matter[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimSummaryMattersLV, SECTION_WIDGET_CLASS).setVariables(true, {$MatterList, $Claim})
  }
  
  
}