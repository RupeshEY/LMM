package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryReserveSetLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RecoveryReserveList :  RecoveryReserve[]) : void {
    __widgetOf(this, pcf.RecoveryReserveSetLV, SECTION_WIDGET_CLASS).setVariables(false, {$RecoveryReserveList})
  }
  
  function refreshVariables ($RecoveryReserveList :  RecoveryReserve[]) : void {
    __widgetOf(this, pcf.RecoveryReserveSetLV, SECTION_WIDGET_CLASS).setVariables(true, {$RecoveryReserveList})
  }
  
  
}