package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidayZonesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Holiday :  Holiday, $zoneType :  ZoneType, $country :  Country) : void {
    __widgetOf(this, pcf.HolidayZonesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Holiday, $zoneType, $country})
  }
  
  function refreshVariables ($Holiday :  Holiday, $zoneType :  ZoneType, $country :  Country) : void {
    __widgetOf(this, pcf.HolidayZonesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Holiday, $zoneType, $country})
  }
  
  
}