package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotContactEFT700LV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Contact :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotContactEFT700LV, SECTION_WIDGET_CLASS).setVariables(false, {$Contact})
  }
  
  function refreshVariables ($Contact :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotContactEFT700LV, SECTION_WIDGET_CLASS).setVariables(true, {$Contact})
  }
  
  
}