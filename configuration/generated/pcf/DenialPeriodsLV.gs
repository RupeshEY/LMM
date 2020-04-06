package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DenialPeriodsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WCDenialPeriodList :  gw.api.database.IQueryBeanResult<WCDenialPeriod>) : void {
    __widgetOf(this, pcf.DenialPeriodsLV, SECTION_WIDGET_CLASS).setVariables(false, {$WCDenialPeriodList})
  }
  
  function refreshVariables ($WCDenialPeriodList :  gw.api.database.IQueryBeanResult<WCDenialPeriod>) : void {
    __widgetOf(this, pcf.DenialPeriodsLV, SECTION_WIDGET_CLASS).setVariables(true, {$WCDenialPeriodList})
  }
  
  
}