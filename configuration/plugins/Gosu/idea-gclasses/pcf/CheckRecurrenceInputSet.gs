package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($check :  Check) : void {
    __widgetOf(this, pcf.CheckRecurrenceInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$check})
  }
  
  function refreshVariables ($check :  Check) : void {
    __widgetOf(this, pcf.CheckRecurrenceInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$check})
  }
  
  
}