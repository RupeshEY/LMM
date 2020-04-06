package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation600PanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $LocationBasedRU :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyLocation600PanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $LocationBasedRU})
  }
  
  function refreshVariables ($Claim :  Claim, $LocationBasedRU :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyLocation600PanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $LocationBasedRU})
  }
  
  
}