package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation800PanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $PolicyLocation :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyLocation800PanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $PolicyLocation})
  }
  
  function refreshVariables ($Claim :  Claim, $PolicyLocation :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyLocation800PanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $PolicyLocation})
  }
  
  
}