package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityZoneDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SecurityZone :  SecurityZone) : void {
    __widgetOf(this, pcf.SecurityZoneDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$SecurityZone})
  }
  
  function refreshVariables ($SecurityZone :  SecurityZone) : void {
    __widgetOf(this, pcf.SecurityZoneDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$SecurityZone})
  }
  
  
}