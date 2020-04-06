package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotInjuryIncident600DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncident600DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($InjuryIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncident600DV, SECTION_WIDGET_CLASS).setVariables(false, {$InjuryIncidentInstance})
  }
  
  function refreshVariables ($InjuryIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncident600DV, SECTION_WIDGET_CLASS).setVariables(true, {$InjuryIncidentInstance})
  }
  
  
}