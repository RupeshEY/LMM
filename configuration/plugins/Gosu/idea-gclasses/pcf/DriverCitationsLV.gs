package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/DriverCitationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DriverCitationsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($VehicleIncident :  VehicleIncident) : void {
    __widgetOf(this, pcf.DriverCitationsLV, SECTION_WIDGET_CLASS).setVariables(false, {$VehicleIncident})
  }
  
  function refreshVariables ($VehicleIncident :  VehicleIncident) : void {
    __widgetOf(this, pcf.DriverCitationsLV, SECTION_WIDGET_CLASS).setVariables(true, {$VehicleIncident})
  }
  
  
}