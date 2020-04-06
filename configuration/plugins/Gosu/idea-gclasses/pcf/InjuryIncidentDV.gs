package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/injury/InjuryIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryIncidentDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($InjuryIncident :  InjuryIncident) : void {
    __widgetOf(this, pcf.InjuryIncidentDV, SECTION_WIDGET_CLASS).setVariables(false, {$InjuryIncident})
  }
  
  function refreshVariables ($InjuryIncident :  InjuryIncident) : void {
    __widgetOf(this, pcf.InjuryIncidentDV, SECTION_WIDGET_CLASS).setVariables(true, {$InjuryIncident})
  }
  
  
}