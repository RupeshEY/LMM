package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Bodilyinjurydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Bodilyinjurydamage extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.ExposureDetailDV_Bodilyinjurydamage, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure, $unusedServiceRequests})
  }
  
  function refreshVariables ($Exposure :  Exposure, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.ExposureDetailDV_Bodilyinjurydamage, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure, $unusedServiceRequests})
  }
  
  
}