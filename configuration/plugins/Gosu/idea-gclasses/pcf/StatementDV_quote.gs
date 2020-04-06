package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.quote.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementDV_quote extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($currentQuote :  ServiceRequestStatement, $previousTotal :  gw.api.financials.CurrencyAmount, $isEditable :  boolean) : void {
    __widgetOf(this, pcf.StatementDV_quote, SECTION_WIDGET_CLASS).setVariables(false, {$currentQuote, $previousTotal, $isEditable})
  }
  
  function refreshVariables ($currentQuote :  ServiceRequestStatement, $previousTotal :  gw.api.financials.CurrencyAmount, $isEditable :  boolean) : void {
    __widgetOf(this, pcf.StatementDV_quote, SECTION_WIDGET_CLASS).setVariables(true, {$currentQuote, $previousTotal, $isEditable})
  }
  
  
}