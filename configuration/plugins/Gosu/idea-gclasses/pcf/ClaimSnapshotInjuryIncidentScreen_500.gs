package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotInjuryIncidentScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncidentScreen_500 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($IncidentParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncidentScreen_500, SECTION_WIDGET_CLASS).setVariables(false, {$IncidentParam})
  }
  
  function refreshVariables ($IncidentParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncidentScreen_500, SECTION_WIDGET_CLASS).setVariables(true, {$IncidentParam})
  }
  
  
}