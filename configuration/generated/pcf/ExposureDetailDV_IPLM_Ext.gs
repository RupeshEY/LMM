package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.IPLM_Ext.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_IPLM_Ext extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($exposure :  Exposure, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.ExposureDetailDV_IPLM_Ext, SECTION_WIDGET_CLASS).setVariables(false, {$exposure, $unusedServiceRequests})
  }
  
  function refreshVariables ($exposure :  Exposure, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.ExposureDetailDV_IPLM_Ext, SECTION_WIDGET_CLASS).setVariables(true, {$exposure, $unusedServiceRequests})
  }
  
  
}