package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripAccommodationInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($anAddnlTripAccommodation :  AddnlTripAccommodation, $aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.AdditionalTripAccommodationInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$anAddnlTripAccommodation, $aTripIncident})
  }
  
  function refreshVariables ($anAddnlTripAccommodation :  AddnlTripAccommodation, $aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.AdditionalTripAccommodationInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$anAddnlTripAccommodation, $aTripIncident})
  }
  
  
}