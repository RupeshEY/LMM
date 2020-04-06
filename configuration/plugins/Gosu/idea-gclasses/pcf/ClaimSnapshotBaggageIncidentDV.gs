package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotBaggageIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncidentDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BaggageIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotBaggageIncidentDV, SECTION_WIDGET_CLASS).setVariables(false, {$BaggageIncidentInstance})
  }
  
  function refreshVariables ($BaggageIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotBaggageIncidentDV, SECTION_WIDGET_CLASS).setVariables(true, {$BaggageIncidentInstance})
  }
  
  
}