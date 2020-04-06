package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EndorsementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EndorsementsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($EndorsementList :  Endorsement[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.EndorsementsLV, SECTION_WIDGET_CLASS).setVariables(false, {$EndorsementList, $Claim})
  }
  
  function refreshVariables ($EndorsementList :  Endorsement[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.EndorsementsLV, SECTION_WIDGET_CLASS).setVariables(true, {$EndorsementList, $Claim})
  }
  
  
}