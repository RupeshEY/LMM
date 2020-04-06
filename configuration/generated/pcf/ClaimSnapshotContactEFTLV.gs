package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotContactEFTLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotContactEFTLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Contact :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotContactEFTLV, SECTION_WIDGET_CLASS).setVariables(false, {$Contact})
  }
  
  function refreshVariables ($Contact :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotContactEFTLV, SECTION_WIDGET_CLASS).setVariables(true, {$Contact})
  }
  
  
}