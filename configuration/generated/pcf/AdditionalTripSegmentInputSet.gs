package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripSegmentInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($anAddnlTripSegment :  AddnlTripSegment, $aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.AdditionalTripSegmentInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$anAddnlTripSegment, $aTripIncident})
  }
  
  function refreshVariables ($anAddnlTripSegment :  AddnlTripSegment, $aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.AdditionalTripSegmentInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$anAddnlTripSegment, $aTripIncident})
  }
  
  
}