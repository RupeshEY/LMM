package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure, $User :  User, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.ExposureDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure, $User, $unusedServiceRequests})
  }
  
  function refreshVariables ($Exposure :  Exposure, $User :  User, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.ExposureDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure, $User, $unusedServiceRequests})
  }
  
  
}