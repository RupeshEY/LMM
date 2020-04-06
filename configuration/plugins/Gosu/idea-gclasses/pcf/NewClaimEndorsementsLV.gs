package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimEndorsementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimEndorsementsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($EndorsementList :  Endorsement[], $Policy :  Policy) : void {
    __widgetOf(this, pcf.NewClaimEndorsementsLV, SECTION_WIDGET_CLASS).setVariables(false, {$EndorsementList, $Policy})
  }
  
  function refreshVariables ($EndorsementList :  Endorsement[], $Policy :  Policy) : void {
    __widgetOf(this, pcf.NewClaimEndorsementsLV, SECTION_WIDGET_CLASS).setVariables(true, {$EndorsementList, $Policy})
  }
  
  
}