package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyVehicle400DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $PolicyVehicle :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyVehicle400DV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $PolicyVehicle})
  }
  
  function refreshVariables ($Claim :  Claim, $PolicyVehicle :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyVehicle400DV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $PolicyVehicle})
  }
  
  
}