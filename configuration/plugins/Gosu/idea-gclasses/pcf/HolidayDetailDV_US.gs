package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailDV.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidayDetailDV_US extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Holiday :  Holiday) : void {
    __widgetOf(this, pcf.HolidayDetailDV_US, SECTION_WIDGET_CLASS).setVariables(false, {$Holiday})
  }
  
  function refreshVariables ($Holiday :  Holiday) : void {
    __widgetOf(this, pcf.HolidayDetailDV_US, SECTION_WIDGET_CLASS).setVariables(true, {$Holiday})
  }
  
  
}