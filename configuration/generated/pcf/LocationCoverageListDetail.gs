package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/LocationCoverageListDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LocationCoverageListDetail extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($LocationBasedRU :  LocationBasedRU) : void {
    __widgetOf(this, pcf.LocationCoverageListDetail, SECTION_WIDGET_CLASS).setVariables(false, {$LocationBasedRU})
  }
  
  function refreshVariables ($LocationBasedRU :  LocationBasedRU) : void {
    __widgetOf(this, pcf.LocationCoverageListDetail, SECTION_WIDGET_CLASS).setVariables(true, {$LocationBasedRU})
  }
  
  
}