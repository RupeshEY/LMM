package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestMessagePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestMessagePanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($messages :  ServiceRequestMessage[]) : void {
    __widgetOf(this, pcf.ServiceRequestMessagePanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$messages})
  }
  
  function refreshVariables ($messages :  ServiceRequestMessage[]) : void {
    __widgetOf(this, pcf.ServiceRequestMessagePanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$messages})
  }
  
  
}