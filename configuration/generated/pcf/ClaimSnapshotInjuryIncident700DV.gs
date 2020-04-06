package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncident700DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($InjuryIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncident700DV, SECTION_WIDGET_CLASS).setVariables(false, {$InjuryIncidentInstance})
  }
  
  function refreshVariables ($InjuryIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncident700DV, SECTION_WIDGET_CLASS).setVariables(true, {$InjuryIncidentInstance})
  }
  
  
}