package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityZonesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SecurityZoneList :  gw.api.database.IQueryBeanResult<SecurityZone>) : void {
    __widgetOf(this, pcf.SecurityZonesLV, SECTION_WIDGET_CLASS).setVariables(false, {$SecurityZoneList})
  }
  
  function refreshVariables ($SecurityZoneList :  gw.api.database.IQueryBeanResult<SecurityZone>) : void {
    __widgetOf(this, pcf.SecurityZonesLV, SECTION_WIDGET_CLASS).setVariables(true, {$SecurityZoneList})
  }
  
  
}