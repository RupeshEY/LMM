package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequestDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewServiceRequestDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($serviceRequest :  ServiceRequest, $doNotAllowIncidentSelection :  boolean, $incidentsToExclude :  java.util.Collection<Incident>) : void {
    __widgetOf(this, pcf.NewServiceRequestDV, SECTION_WIDGET_CLASS).setVariables(false, {$serviceRequest, $doNotAllowIncidentSelection, $incidentsToExclude})
  }
  
  function refreshVariables ($serviceRequest :  ServiceRequest, $doNotAllowIncidentSelection :  boolean, $incidentsToExclude :  java.util.Collection<Incident>) : void {
    __widgetOf(this, pcf.NewServiceRequestDV, SECTION_WIDGET_CLASS).setVariables(true, {$serviceRequest, $doNotAllowIncidentSelection, $incidentsToExclude})
  }
  
  
}