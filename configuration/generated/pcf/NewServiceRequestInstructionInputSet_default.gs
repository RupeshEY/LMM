package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequestInstructionInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewServiceRequestInstructionInputSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($serviceRequest :  entity.ServiceRequest, $serviceAddressLabel :  String, $quoteOrServiceAlternativeLabel :  String) : void {
    __widgetOf(this, pcf.NewServiceRequestInstructionInputSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$serviceRequest, $serviceAddressLabel, $quoteOrServiceAlternativeLabel})
  }
  
  function refreshVariables ($serviceRequest :  entity.ServiceRequest, $serviceAddressLabel :  String, $quoteOrServiceAlternativeLabel :  String) : void {
    __widgetOf(this, pcf.NewServiceRequestInstructionInputSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$serviceRequest, $serviceAddressLabel, $quoteOrServiceAlternativeLabel})
  }
  
  
}