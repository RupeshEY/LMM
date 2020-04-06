package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryIncidentInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($injury :  InjuryIncident) : void {
    __widgetOf(this, pcf.InjuryIncidentInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$injury})
  }
  
  function refreshVariables ($injury :  InjuryIncident) : void {
    __widgetOf(this, pcf.InjuryIncidentInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$injury})
  }
  
  
}