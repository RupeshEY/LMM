package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral800PanelSet_auto extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotGeneral800PanelSet_auto, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Snapshot})
  }
  
  function refreshVariables ($Claim :  Claim, $Snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotGeneral800PanelSet_auto, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Snapshot})
  }
  
  
}