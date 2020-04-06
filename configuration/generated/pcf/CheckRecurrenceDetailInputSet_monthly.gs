package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.monthly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceDetailInputSet_monthly extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($check :  Check, $recurrenceHelper :  gw.financials.CheckRecurrenceUIHelper) : void {
    __widgetOf(this, pcf.CheckRecurrenceDetailInputSet_monthly, SECTION_WIDGET_CLASS).setVariables(false, {$check, $recurrenceHelper})
  }
  
  function refreshVariables ($check :  Check, $recurrenceHelper :  gw.financials.CheckRecurrenceUIHelper) : void {
    __widgetOf(this, pcf.CheckRecurrenceDetailInputSet_monthly, SECTION_WIDGET_CLASS).setVariables(true, {$check, $recurrenceHelper})
  }
  
  
}