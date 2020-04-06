package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceAdditionalInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceAdditionalInfoInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($recurrenceHelper :  gw.financials.CheckRecurrenceUIHelper) : void {
    __widgetOf(this, pcf.CheckRecurrenceAdditionalInfoInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$recurrenceHelper})
  }
  
  function refreshVariables ($recurrenceHelper :  gw.financials.CheckRecurrenceUIHelper) : void {
    __widgetOf(this, pcf.CheckRecurrenceAdditionalInfoInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$recurrenceHelper})
  }
  
  
}