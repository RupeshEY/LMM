package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionZonesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($r :  Region, $zt :  ZoneType, $c :  Country) : void {
    __widgetOf(this, pcf.RegionZonesLV, SECTION_WIDGET_CLASS).setVariables(false, {$r, $zt, $c})
  }
  
  function refreshVariables ($r :  Region, $zt :  ZoneType, $c :  Country) : void {
    __widgetOf(this, pcf.RegionZonesLV, SECTION_WIDGET_CLASS).setVariables(true, {$r, $zt, $c})
  }
  
  
}