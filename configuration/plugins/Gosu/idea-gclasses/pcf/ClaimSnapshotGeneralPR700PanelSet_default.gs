package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotGeneralPR700PanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneralPR700PanelSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotGeneralPR700PanelSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Snapshot})
  }
  
  function refreshVariables ($Claim :  Claim, $Snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotGeneralPR700PanelSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Snapshot})
  }
  
  
}