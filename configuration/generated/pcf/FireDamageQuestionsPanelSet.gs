package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/FireDamageQuestionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FireDamageQuestionsPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aClaim :  Claim) : void {
    __widgetOf(this, pcf.FireDamageQuestionsPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$aClaim})
  }
  
  function refreshVariables ($aClaim :  Claim) : void {
    __widgetOf(this, pcf.FireDamageQuestionsPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$aClaim})
  }
  
  
}