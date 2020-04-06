package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotInjuryIncident800DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncident800DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($InjuryIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncident800DV, SECTION_WIDGET_CLASS).setVariables(false, {$InjuryIncidentInstance})
  }
  
  function refreshVariables ($InjuryIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncident800DV, SECTION_WIDGET_CLASS).setVariables(true, {$InjuryIncidentInstance})
  }
  
  
}