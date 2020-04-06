package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditableTripCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableTripCoveragesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aTripRU :  TripRU) : void {
    __widgetOf(this, pcf.EditableTripCoveragesLV, SECTION_WIDGET_CLASS).setVariables(false, {$aTripRU})
  }
  
  function refreshVariables ($aTripRU :  TripRU) : void {
    __widgetOf(this, pcf.EditableTripCoveragesLV, SECTION_WIDGET_CLASS).setVariables(true, {$aTripRU})
  }
  
  
}