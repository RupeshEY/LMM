package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimTripSegmentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimTripSegmentDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aTripSegment :  TripSegment, $aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.ClaimTripSegmentDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$aTripSegment, $aTripIncident})
  }
  
  function refreshVariables ($aTripSegment :  TripSegment, $aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.ClaimTripSegmentDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$aTripSegment, $aTripIncident})
  }
  
  
}