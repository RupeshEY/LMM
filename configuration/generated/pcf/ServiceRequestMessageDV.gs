package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestMessageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestMessageDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($message :  ServiceRequestMessage) : void {
    __widgetOf(this, pcf.ServiceRequestMessageDV, SECTION_WIDGET_CLASS).setVariables(false, {$message})
  }
  
  function refreshVariables ($message :  ServiceRequestMessage) : void {
    __widgetOf(this, pcf.ServiceRequestMessageDV, SECTION_WIDGET_CLASS).setVariables(true, {$message})
  }
  
  
}