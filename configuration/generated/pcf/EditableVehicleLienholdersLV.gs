package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditableVehicleLienholdersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableVehicleLienholdersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Vehicle :  Vehicle, $Claim :  Claim) : void {
    __widgetOf(this, pcf.EditableVehicleLienholdersLV, SECTION_WIDGET_CLASS).setVariables(false, {$Vehicle, $Claim})
  }
  
  function refreshVariables ($Vehicle :  Vehicle, $Claim :  Claim) : void {
    __widgetOf(this, pcf.EditableVehicleLienholdersLV, SECTION_WIDGET_CLASS).setVariables(true, {$Vehicle, $Claim})
  }
  
  
}