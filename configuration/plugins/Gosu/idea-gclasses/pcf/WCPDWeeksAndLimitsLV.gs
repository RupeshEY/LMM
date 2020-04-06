package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WCPDWeeksAndLimitsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ref_WC_PD_WeeksAndLimitsList :  gw.api.database.IQueryBeanResult<ref_WC_PD_WeeksAndLimits>) : void {
    __widgetOf(this, pcf.WCPDWeeksAndLimitsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ref_WC_PD_WeeksAndLimitsList})
  }
  
  function refreshVariables ($ref_WC_PD_WeeksAndLimitsList :  gw.api.database.IQueryBeanResult<ref_WC_PD_WeeksAndLimits>) : void {
    __widgetOf(this, pcf.WCPDWeeksAndLimitsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ref_WC_PD_WeeksAndLimitsList})
  }
  
  
}