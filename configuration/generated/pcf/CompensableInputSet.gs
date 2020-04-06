package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CompensableInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.CompensableInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.CompensableInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}