package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripRUScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripRUScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aClaim :  Claim, $startEditable :  Boolean, $aTripRU :  TripRU, $aTripRUParam :  TripRU) : void {
    __widgetOf(this, pcf.TripRUScreen, SECTION_WIDGET_CLASS).setVariables(false, {$aClaim, $startEditable, $aTripRU, $aTripRUParam})
  }
  
  function refreshVariables ($aClaim :  Claim, $startEditable :  Boolean, $aTripRU :  TripRU, $aTripRUParam :  TripRU) : void {
    __widgetOf(this, pcf.TripRUScreen, SECTION_WIDGET_CLASS).setVariables(true, {$aClaim, $startEditable, $aTripRU, $aTripRUParam})
  }
  
  
}