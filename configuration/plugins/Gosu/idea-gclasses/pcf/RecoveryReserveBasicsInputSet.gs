package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryReserveBasicsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($recoveryReserve :  RecoveryReserve) : void {
    __widgetOf(this, pcf.RecoveryReserveBasicsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$recoveryReserve})
  }
  
  function refreshVariables ($recoveryReserve :  RecoveryReserve) : void {
    __widgetOf(this, pcf.RecoveryReserveBasicsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$recoveryReserve})
  }
  
  
}