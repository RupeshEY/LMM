package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure700DV_PropertyDamage extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposure700DV_PropertyDamage, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Exposure})
  }
  
  function refreshVariables ($Claim :  Claim, $Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposure700DV_PropertyDamage, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Exposure})
  }
  
  
}