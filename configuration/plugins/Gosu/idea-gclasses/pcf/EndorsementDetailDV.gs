package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EndorsementDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EndorsementDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Endorsement :  Endorsement) : void {
    __widgetOf(this, pcf.EndorsementDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$Endorsement})
  }
  
  function refreshVariables ($Endorsement :  Endorsement) : void {
    __widgetOf(this, pcf.EndorsementDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$Endorsement})
  }
  
  
}