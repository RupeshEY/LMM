package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServicesLVInputGroupInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherServicesLVInputGroupInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $incident :  Incident, $otherServiceRequests :  java.util.Set<ServiceRequest>, $alsoAddAndRemove :  java.util.Set<ServiceRequest>, $unusedServiceRequests :  java.util.Set<entity.ServiceRequest>, $incidentsToExclude :  java.util.Collection<Incident>) : void {
    __widgetOf(this, pcf.OtherServicesLVInputGroupInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $incident, $otherServiceRequests, $alsoAddAndRemove, $unusedServiceRequests, $incidentsToExclude})
  }
  
  function refreshVariables ($claim :  Claim, $incident :  Incident, $otherServiceRequests :  java.util.Set<ServiceRequest>, $alsoAddAndRemove :  java.util.Set<ServiceRequest>, $unusedServiceRequests :  java.util.Set<entity.ServiceRequest>, $incidentsToExclude :  java.util.Collection<Incident>) : void {
    __widgetOf(this, pcf.OtherServicesLVInputGroupInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $incident, $otherServiceRequests, $alsoAddAndRemove, $unusedServiceRequests, $incidentsToExclude})
  }
  
  
}