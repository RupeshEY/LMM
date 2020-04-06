package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/summary/FinancialsSummaryPanelSet.Claimant.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryPanelSet_Claimant extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $useFloatingFinancials :  boolean, $financialsSummaryBridge :  gw.api.financials.summary.FinancialSummaryBridge) : void {
    __widgetOf(this, pcf.FinancialsSummaryPanelSet_Claimant, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $useFloatingFinancials, $financialsSummaryBridge})
  }
  
  function refreshVariables ($Claim :  Claim, $useFloatingFinancials :  boolean, $financialsSummaryBridge :  gw.api.financials.summary.FinancialSummaryBridge) : void {
    __widgetOf(this, pcf.FinancialsSummaryPanelSet_Claimant, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $useFloatingFinancials, $financialsSummaryBridge})
  }
  
  
}