package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/RecoveryReservesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryReservesSummaryDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($NewRecoveryReserveSet :  gw.api.financials.RecoveryReserveWizardHelper) : void {
    __widgetOf(this, pcf.RecoveryReservesSummaryDV, SECTION_WIDGET_CLASS).setVariables(false, {$NewRecoveryReserveSet})
  }
  
  function refreshVariables ($NewRecoveryReserveSet :  gw.api.financials.RecoveryReserveWizardHelper) : void {
    __widgetOf(this, pcf.RecoveryReservesSummaryDV, SECTION_WIDGET_CLASS).setVariables(true, {$NewRecoveryReserveSet})
  }
  
  
}