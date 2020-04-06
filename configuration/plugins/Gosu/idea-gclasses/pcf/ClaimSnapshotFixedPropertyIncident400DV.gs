package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotFixedPropertyIncident400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncident400DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $FixedPropertyIncident :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotFixedPropertyIncident400DV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $FixedPropertyIncident})
  }
  
  function refreshVariables ($Claim :  Claim, $FixedPropertyIncident :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotFixedPropertyIncident400DV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $FixedPropertyIncident})
  }
  
  
}