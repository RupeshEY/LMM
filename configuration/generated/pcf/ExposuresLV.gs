package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $ClaimExposures :  gw.api.exposure.ClaimExposuresHelper, $ExposureList :  Exposure[]) : void {
    __widgetOf(this, pcf.ExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $ClaimExposures, $ExposureList})
  }
  
  function refreshVariables ($Claim :  Claim, $ClaimExposures :  gw.api.exposure.ClaimExposuresHelper, $ExposureList :  Exposure[]) : void {
    __widgetOf(this, pcf.ExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $ClaimExposures, $ExposureList})
  }
  
  
}