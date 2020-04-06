package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServicesLVInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherServicesLVInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  entity.Claim, $incident :  entity.Incident, $otherServices :  java.util.Set<ServiceRequest>, $alsoAddAndRemove :  java.util.Set<ServiceRequest>, $incidentsToExclude :  java.util.Collection<Incident>) : void {
    __widgetOf(this, pcf.OtherServicesLVInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $incident, $otherServices, $alsoAddAndRemove, $incidentsToExclude})
  }
  
  function refreshVariables ($claim :  entity.Claim, $incident :  entity.Incident, $otherServices :  java.util.Set<ServiceRequest>, $alsoAddAndRemove :  java.util.Set<ServiceRequest>, $incidentsToExclude :  java.util.Collection<Incident>) : void {
    __widgetOf(this, pcf.OtherServicesLVInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $incident, $otherServices, $alsoAddAndRemove, $incidentsToExclude})
  }
  
  
}