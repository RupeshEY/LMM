package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsPanelSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.LossDetailsPanelSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.LossDetailsPanelSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}