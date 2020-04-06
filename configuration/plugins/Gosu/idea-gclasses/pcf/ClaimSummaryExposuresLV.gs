package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $ExposureList :  Exposure[]) : void {
    __widgetOf(this, pcf.ClaimSummaryExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $ExposureList})
  }
  
  function refreshVariables ($Claim :  Claim, $ExposureList :  Exposure[]) : void {
    __widgetOf(this, pcf.ClaimSummaryExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $ExposureList})
  }
  
  
}