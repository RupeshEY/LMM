package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripAccommodationLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($affectedTripAccommodation :  TripAccommodation) : void {
    __widgetOf(this, pcf.AdditionalTripAccommodationLV, SECTION_WIDGET_CLASS).setVariables(false, {$affectedTripAccommodation})
  }
  
  function refreshVariables ($affectedTripAccommodation :  TripAccommodation) : void {
    __widgetOf(this, pcf.AdditionalTripAccommodationLV, SECTION_WIDGET_CLASS).setVariables(true, {$affectedTripAccommodation})
  }
  
  
}