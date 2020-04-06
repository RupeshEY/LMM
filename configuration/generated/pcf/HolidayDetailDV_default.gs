package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidayDetailDV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Holiday :  Holiday) : void {
    __widgetOf(this, pcf.HolidayDetailDV_default, SECTION_WIDGET_CLASS).setVariables(false, {$Holiday})
  }
  
  function refreshVariables ($Holiday :  Holiday) : void {
    __widgetOf(this, pcf.HolidayDetailDV_default, SECTION_WIDGET_CLASS).setVariables(true, {$Holiday})
  }
  
  
}