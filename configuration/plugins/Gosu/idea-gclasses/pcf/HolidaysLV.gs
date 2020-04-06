package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidaysLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidaysLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($HolidayList :  gw.api.database.IQueryBeanResult<Holiday>) : void {
    __widgetOf(this, pcf.HolidaysLV, SECTION_WIDGET_CLASS).setVariables(false, {$HolidayList})
  }
  
  function refreshVariables ($HolidayList :  gw.api.database.IQueryBeanResult<Holiday>) : void {
    __widgetOf(this, pcf.HolidaysLV, SECTION_WIDGET_CLASS).setVariables(true, {$HolidayList})
  }
  
  
}