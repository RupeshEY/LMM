package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableRecurrenceChecksLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CheckSet :  CheckSet) : void {
    __widgetOf(this, pcf.EditableRecurrenceChecksLV, SECTION_WIDGET_CLASS).setVariables(false, {$CheckSet})
  }
  
  function refreshVariables ($CheckSet :  CheckSet) : void {
    __widgetOf(this, pcf.EditableRecurrenceChecksLV, SECTION_WIDGET_CLASS).setVariables(true, {$CheckSet})
  }
  
  
}