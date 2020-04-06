package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityZoneDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($securityZone :  SecurityZone) : void {
    __widgetOf(this, pcf.SecurityZoneDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$securityZone})
  }
  
  function refreshVariables ($securityZone :  SecurityZone) : void {
    __widgetOf(this, pcf.SecurityZoneDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$securityZone})
  }
  
  
}