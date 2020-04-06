package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LivingExpensesIncidentPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($incident :  LivingExpensesIncident) : void {
    __widgetOf(this, pcf.LivingExpensesIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$incident})
  }
  
  function refreshVariables ($incident :  LivingExpensesIncident) : void {
    __widgetOf(this, pcf.LivingExpensesIncidentPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$incident})
  }
  
  
}