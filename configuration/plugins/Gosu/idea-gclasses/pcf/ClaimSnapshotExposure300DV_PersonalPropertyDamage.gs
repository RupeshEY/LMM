package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PersonalPropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure300DV_PersonalPropertyDamage extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $SnapshotParam :  dynamic.Dynamic, $Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposure300DV_PersonalPropertyDamage, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $SnapshotParam, $Exposure})
  }
  
  function refreshVariables ($Claim :  Claim, $SnapshotParam :  dynamic.Dynamic, $Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposure300DV_PersonalPropertyDamage, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $SnapshotParam, $Exposure})
  }
  
  
}