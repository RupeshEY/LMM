package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotBaggageIncident500DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncident500DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BaggageIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotBaggageIncident500DV, SECTION_WIDGET_CLASS).setVariables(false, {$BaggageIncidentInstance})
  }
  
  function refreshVariables ($BaggageIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotBaggageIncident500DV, SECTION_WIDGET_CLASS).setVariables(true, {$BaggageIncidentInstance})
  }
  
  
}