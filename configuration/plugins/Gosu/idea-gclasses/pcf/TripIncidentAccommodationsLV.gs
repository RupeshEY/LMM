package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripIncidentAccommodationsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.TripIncidentAccommodationsLV, SECTION_WIDGET_CLASS).setVariables(false, {$aTripIncident})
  }
  
  function refreshVariables ($aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.TripIncidentAccommodationsLV, SECTION_WIDGET_CLASS).setVariables(true, {$aTripIncident})
  }
  
  
}