package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServicesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherServicesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($otherServiceRequests :  java.util.Set<ServiceRequest>, $alsoRemove :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.OtherServicesLV, SECTION_WIDGET_CLASS).setVariables(false, {$otherServiceRequests, $alsoRemove})
  }
  
  function refreshVariables ($otherServiceRequests :  java.util.Set<ServiceRequest>, $alsoRemove :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.OtherServicesLV, SECTION_WIDGET_CLASS).setVariables(true, {$otherServiceRequests, $alsoRemove})
  }
  
  
}