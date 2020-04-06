package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewTripIncidentScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aTripIncident :  TripIncident, $checkedTripSegments :  TripSegment[]) : void {
    __widgetOf(this, pcf.NewTripIncidentScreen, SECTION_WIDGET_CLASS).setVariables(false, {$aTripIncident, $checkedTripSegments})
  }
  
  function refreshVariables ($aTripIncident :  TripIncident, $checkedTripSegments :  TripSegment[]) : void {
    __widgetOf(this, pcf.NewTripIncidentScreen, SECTION_WIDGET_CLASS).setVariables(true, {$aTripIncident, $checkedTripSegments})
  }
  
  
}