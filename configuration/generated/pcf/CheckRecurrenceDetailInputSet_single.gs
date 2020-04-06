package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceDetailInputSet_single extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($check :  Check, $checkRecurrence :  gw.financials.CheckRecurrenceUIHelper) : void {
    __widgetOf(this, pcf.CheckRecurrenceDetailInputSet_single, SECTION_WIDGET_CLASS).setVariables(false, {$check, $checkRecurrence})
  }
  
  function refreshVariables ($check :  Check, $checkRecurrence :  gw.financials.CheckRecurrenceUIHelper) : void {
    __widgetOf(this, pcf.CheckRecurrenceDetailInputSet_single, SECTION_WIDGET_CLASS).setVariables(true, {$check, $checkRecurrence})
  }
  
  
}