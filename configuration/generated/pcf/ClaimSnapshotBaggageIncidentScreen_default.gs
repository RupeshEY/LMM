package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotBaggageIncidentScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncidentScreen_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($IncidentParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotBaggageIncidentScreen_default, SECTION_WIDGET_CLASS).setVariables(false, {$IncidentParam})
  }
  
  function refreshVariables ($IncidentParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotBaggageIncidentScreen_default, SECTION_WIDGET_CLASS).setVariables(true, {$IncidentParam})
  }
  
  
}