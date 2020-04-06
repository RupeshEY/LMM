package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.quoterevision.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementDV_quoterevision extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($currentQuote :  ServiceRequestStatement, $previousTotal :  gw.api.financials.CurrencyAmount, $readOnly :  boolean) : void {
    __widgetOf(this, pcf.StatementDV_quoterevision, SECTION_WIDGET_CLASS).setVariables(false, {$currentQuote, $previousTotal, $readOnly})
  }
  
  function refreshVariables ($currentQuote :  ServiceRequestStatement, $previousTotal :  gw.api.financials.CurrencyAmount, $readOnly :  boolean) : void {
    __widgetOf(this, pcf.StatementDV_quoterevision, SECTION_WIDGET_CLASS).setVariables(true, {$currentQuote, $previousTotal, $readOnly})
  }
  
  
}