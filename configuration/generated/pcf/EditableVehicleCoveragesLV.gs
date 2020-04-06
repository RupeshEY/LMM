package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableVehicleCoveragesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Vehicle :  Vehicle, $VehicleRU :  VehicleRU) : void {
    __widgetOf(this, pcf.EditableVehicleCoveragesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Vehicle, $VehicleRU})
  }
  
  function refreshVariables ($Vehicle :  Vehicle, $VehicleRU :  VehicleRU) : void {
    __widgetOf(this, pcf.EditableVehicleCoveragesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Vehicle, $VehicleRU})
  }
  
  
}