package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidayDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Holiday :  Holiday) : void {
    __widgetOf(this, pcf.HolidayDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Holiday})
  }
  
  function refreshVariables ($Holiday :  Holiday) : void {
    __widgetOf(this, pcf.HolidayDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Holiday})
  }
  
  
}