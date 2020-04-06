package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/shared/AddressSnapshot700InputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressSnapshot700InputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Address :  dynamic.Dynamic, $Claim :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.AddressSnapshot700InputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Address, $Claim})
  }
  
  function refreshVariables ($Address :  dynamic.Dynamic, $Claim :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.AddressSnapshot700InputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Address, $Claim})
  }
  
  
}