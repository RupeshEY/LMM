package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripSegmentDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($anAddnlTripSegment :  AddnlTripSegment, $affectedTripSegment :  TripSegment) : void {
    __widgetOf(this, pcf.AdditionalTripSegmentDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$anAddnlTripSegment, $affectedTripSegment})
  }
  
  function refreshVariables ($anAddnlTripSegment :  AddnlTripSegment, $affectedTripSegment :  TripSegment) : void {
    __widgetOf(this, pcf.AdditionalTripSegmentDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$anAddnlTripSegment, $affectedTripSegment})
  }
  
  
}