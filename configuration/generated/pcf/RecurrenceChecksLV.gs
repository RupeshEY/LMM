package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecurrenceChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecurrenceChecksLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CheckSet :  CheckSet) : void {
    __widgetOf(this, pcf.RecurrenceChecksLV, SECTION_WIDGET_CLASS).setVariables(false, {$CheckSet})
  }
  
  function refreshVariables ($CheckSet :  CheckSet) : void {
    __widgetOf(this, pcf.RecurrenceChecksLV, SECTION_WIDGET_CLASS).setVariables(true, {$CheckSet})
  }
  
  
}