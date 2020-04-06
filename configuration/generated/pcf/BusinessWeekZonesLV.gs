package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekZonesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BusinessWeek :  BusinessWeek, $zoneType :  ZoneType, $country :  Country) : void {
    __widgetOf(this, pcf.BusinessWeekZonesLV, SECTION_WIDGET_CLASS).setVariables(false, {$BusinessWeek, $zoneType, $country})
  }
  
  function refreshVariables ($BusinessWeek :  BusinessWeek, $zoneType :  ZoneType, $country :  Country) : void {
    __widgetOf(this, pcf.BusinessWeekZonesLV, SECTION_WIDGET_CLASS).setVariables(true, {$BusinessWeek, $zoneType, $country})
  }
  
  
}