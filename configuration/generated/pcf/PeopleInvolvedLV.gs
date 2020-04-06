package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/PeopleInvolvedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PeopleInvolvedLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $ClaimContactList :  ClaimContact[]) : void {
    __widgetOf(this, pcf.PeopleInvolvedLV, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $ClaimContactList})
  }
  
  function refreshVariables ($claim :  Claim, $ClaimContactList :  ClaimContact[]) : void {
    __widgetOf(this, pcf.PeopleInvolvedLV, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $ClaimContactList})
  }
  
  
}