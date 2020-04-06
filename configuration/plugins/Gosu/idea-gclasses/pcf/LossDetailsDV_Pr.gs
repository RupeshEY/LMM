package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsDV_Pr extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.LossDetailsDV_Pr, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.LossDetailsDV_Pr, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}