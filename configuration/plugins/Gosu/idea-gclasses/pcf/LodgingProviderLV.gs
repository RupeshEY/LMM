package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LodgingProviderLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($incident :  LivingExpensesIncident) : void {
    __widgetOf(this, pcf.LodgingProviderLV, SECTION_WIDGET_CLASS).setVariables(false, {$incident})
  }
  
  function refreshVariables ($incident :  LivingExpensesIncident) : void {
    __widgetOf(this, pcf.LodgingProviderLV, SECTION_WIDGET_CLASS).setVariables(true, {$incident})
  }
  
  
}