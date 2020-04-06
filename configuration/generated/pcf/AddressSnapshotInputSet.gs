package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/shared/AddressSnapshotInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressSnapshotInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Address :  dynamic.Dynamic, $Claim :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.AddressSnapshotInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Address, $Claim})
  }
  
  function refreshVariables ($Address :  dynamic.Dynamic, $Claim :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.AddressSnapshotInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Address, $Claim})
  }
  
  
}