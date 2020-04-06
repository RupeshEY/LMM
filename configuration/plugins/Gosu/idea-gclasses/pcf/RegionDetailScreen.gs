package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Region :  Region) : void {
    __widgetOf(this, pcf.RegionDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Region})
  }
  
  function refreshVariables ($Region :  Region) : void {
    __widgetOf(this, pcf.RegionDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Region})
  }
  
  
}