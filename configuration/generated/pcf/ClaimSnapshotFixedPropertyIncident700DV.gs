package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotFixedPropertyIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncident700DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $FixedPropertyIncident :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotFixedPropertyIncident700DV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $FixedPropertyIncident})
  }
  
  function refreshVariables ($Claim :  Claim, $FixedPropertyIncident :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotFixedPropertyIncident700DV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $FixedPropertyIncident})
  }
  
  
}