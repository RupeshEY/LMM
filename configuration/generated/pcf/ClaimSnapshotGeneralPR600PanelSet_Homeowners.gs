package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneralPR600PanelSet_Homeowners extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotGeneralPR600PanelSet_Homeowners, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $snapshot})
  }
  
  function refreshVariables ($claim :  Claim, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotGeneralPR600PanelSet_Homeowners, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $snapshot})
  }
  
  
}