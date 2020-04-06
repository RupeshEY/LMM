package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryBasicsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($recovery :  Recovery) : void {
    __widgetOf(this, pcf.RecoveryBasicsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$recovery})
  }
  
  function refreshVariables ($recovery :  Recovery) : void {
    __widgetOf(this, pcf.RecoveryBasicsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$recovery})
  }
  
  
}