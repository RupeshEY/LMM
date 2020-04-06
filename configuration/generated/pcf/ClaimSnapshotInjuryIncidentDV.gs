package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuryIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncidentDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($InjuryIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncidentDV, SECTION_WIDGET_CLASS).setVariables(false, {$InjuryIncidentInstance})
  }
  
  function refreshVariables ($InjuryIncidentInstance :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotInjuryIncidentDV, SECTION_WIDGET_CLASS).setVariables(true, {$InjuryIncidentInstance})
  }
  
  
}