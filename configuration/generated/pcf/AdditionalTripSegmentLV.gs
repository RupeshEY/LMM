package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripSegmentLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($affectedTripSegment :  TripSegment) : void {
    __widgetOf(this, pcf.AdditionalTripSegmentLV, SECTION_WIDGET_CLASS).setVariables(false, {$affectedTripSegment})
  }
  
  function refreshVariables ($affectedTripSegment :  TripSegment) : void {
    __widgetOf(this, pcf.AdditionalTripSegmentLV, SECTION_WIDGET_CLASS).setVariables(true, {$affectedTripSegment})
  }
  
  
}