package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.weekly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceDetailInputSet_weekly extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($check :  Check, $recurrenceHelper :  gw.financials.CheckRecurrenceUIHelper) : void {
    __widgetOf(this, pcf.CheckRecurrenceDetailInputSet_weekly, SECTION_WIDGET_CLASS).setVariables(false, {$check, $recurrenceHelper})
  }
  
  function refreshVariables ($check :  Check, $recurrenceHelper :  gw.financials.CheckRecurrenceUIHelper) : void {
    __widgetOf(this, pcf.CheckRecurrenceDetailInputSet_weekly, SECTION_WIDGET_CLASS).setVariables(true, {$check, $recurrenceHelper})
  }
  
  
}