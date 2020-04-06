package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InstructionServicesLV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($serviceRequest :  ServiceRequest, $isEditable :  boolean) : void {
    __widgetOf(this, pcf.InstructionServicesLV_default, SECTION_WIDGET_CLASS).setVariables(false, {$serviceRequest, $isEditable})
  }
  
  function refreshVariables ($serviceRequest :  ServiceRequest, $isEditable :  boolean) : void {
    __widgetOf(this, pcf.InstructionServicesLV_default, SECTION_WIDGET_CLASS).setVariables(true, {$serviceRequest, $isEditable})
  }
  
  
}