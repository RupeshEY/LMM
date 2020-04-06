package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotContactEFT800LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotContactEFT800LV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Contact :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotContactEFT800LV, SECTION_WIDGET_CLASS).setVariables(false, {$Contact})
  }
  
  function refreshVariables ($Contact :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotContactEFT800LV, SECTION_WIDGET_CLASS).setVariables(true, {$Contact})
  }
  
  
}