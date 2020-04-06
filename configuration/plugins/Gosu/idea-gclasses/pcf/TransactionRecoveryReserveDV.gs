package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionRecoveryReserveDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionRecoveryReserveDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RecoveryReserve :  RecoveryReserve) : void {
    __widgetOf(this, pcf.TransactionRecoveryReserveDV, SECTION_WIDGET_CLASS).setVariables(false, {$RecoveryReserve})
  }
  
  function refreshVariables ($RecoveryReserve :  RecoveryReserve) : void {
    __widgetOf(this, pcf.TransactionRecoveryReserveDV, SECTION_WIDGET_CLASS).setVariables(true, {$RecoveryReserve})
  }
  
  
}