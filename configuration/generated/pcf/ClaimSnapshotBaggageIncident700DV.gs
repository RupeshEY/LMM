package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotBaggageIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncident700DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BaggageIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotBaggageIncident700DV, SECTION_WIDGET_CLASS).setVariables(false, {$BaggageIncidentInstance})
  }
  
  function refreshVariables ($BaggageIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotBaggageIncident700DV, SECTION_WIDGET_CLASS).setVariables(true, {$BaggageIncidentInstance})
  }
  
  
}