package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation400DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $PolicyProperty :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyLocation400DV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $PolicyProperty})
  }
  
  function refreshVariables ($Claim :  Claim, $PolicyProperty :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyLocation400DV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $PolicyProperty})
  }
  
  
}