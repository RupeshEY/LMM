package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableTripIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableTripIncidentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  Boolean) : void {
    __widgetOf(this, pcf.EditableTripIncidentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  Boolean) : void {
    __widgetOf(this, pcf.EditableTripIncidentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard})
  }
  
  
}