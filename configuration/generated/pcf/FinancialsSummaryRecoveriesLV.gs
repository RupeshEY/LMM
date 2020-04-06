package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryRecoveriesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $financialsSummaryBridge :  gw.api.financials.summary.FinancialSummaryBridge) : void {
    __widgetOf(this, pcf.FinancialsSummaryRecoveriesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $financialsSummaryBridge})
  }
  
  function refreshVariables ($Claim :  Claim, $financialsSummaryBridge :  gw.api.financials.summary.FinancialSummaryBridge) : void {
    __widgetOf(this, pcf.FinancialsSummaryRecoveriesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $financialsSummaryBridge})
  }
  
  
}