package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimTripAccommodationDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimTripAccommodationDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aTripAccommodation :  TripAccommodation, $aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.ClaimTripAccommodationDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$aTripAccommodation, $aTripIncident})
  }
  
  function refreshVariables ($aTripAccommodation :  TripAccommodation, $aTripIncident :  TripIncident) : void {
    __widgetOf(this, pcf.ClaimTripAccommodationDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$aTripAccommodation, $aTripIncident})
  }
  
  
}