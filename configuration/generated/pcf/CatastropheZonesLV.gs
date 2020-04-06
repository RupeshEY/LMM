package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheZonesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($catastrophe :  Catastrophe, $zoneType :  ZoneType, $country :  Country) : void {
    __widgetOf(this, pcf.CatastropheZonesLV, SECTION_WIDGET_CLASS).setVariables(false, {$catastrophe, $zoneType, $country})
  }
  
  function refreshVariables ($catastrophe :  Catastrophe, $zoneType :  ZoneType, $country :  Country) : void {
    __widgetOf(this, pcf.CatastropheZonesLV, SECTION_WIDGET_CLASS).setVariables(true, {$catastrophe, $zoneType, $country})
  }
  
  
}