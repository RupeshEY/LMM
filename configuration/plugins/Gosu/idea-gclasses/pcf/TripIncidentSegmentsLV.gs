package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripIncidentSegmentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.TripIncidentSegmentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$aTripIncident})
  }
  
  function refreshVariables ($aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.TripIncidentSegmentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$aTripIncident})
  }
  
  
}