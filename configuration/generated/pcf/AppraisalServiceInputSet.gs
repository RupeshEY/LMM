package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AppraisalServiceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AppraisalServiceInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($appraisalService :  ServiceRequest, $incident :  PropertyIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>, $appraisalServiceCode :  String) : void {
    __widgetOf(this, pcf.AppraisalServiceInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$appraisalService, $incident, $unusedServiceRequests, $appraisalServiceCode})
  }
  
  function refreshVariables ($appraisalService :  ServiceRequest, $incident :  PropertyIncident, $unusedServiceRequests :  java.util.Set<ServiceRequest>, $appraisalServiceCode :  String) : void {
    __widgetOf(this, pcf.AppraisalServiceInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$appraisalService, $incident, $unusedServiceRequests, $appraisalServiceCode})
  }
  
  
}