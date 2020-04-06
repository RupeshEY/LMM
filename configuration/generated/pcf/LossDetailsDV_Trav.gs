package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsDV_Trav extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.LossDetailsDV_Trav, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.LossDetailsDV_Trav, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}