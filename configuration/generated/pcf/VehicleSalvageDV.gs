package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/VehicleSalvageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleSalvageDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.VehicleSalvageDV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.VehicleSalvageDV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}