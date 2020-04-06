package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsPanelSet_Homeowners extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.LossDetailsPanelSet_Homeowners, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.LossDetailsPanelSet_Homeowners, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}