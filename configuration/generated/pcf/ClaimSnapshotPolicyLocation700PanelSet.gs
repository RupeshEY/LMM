package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation700PanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $PolicyLocation :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyLocation700PanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $PolicyLocation})
  }
  
  function refreshVariables ($Claim :  Claim, $PolicyLocation :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyLocation700PanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $PolicyLocation})
  }
  
  
}