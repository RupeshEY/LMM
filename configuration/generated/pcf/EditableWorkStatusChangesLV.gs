package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableWorkStatusChangesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableWorkStatusChangesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($EmploymentData :  EmploymentData) : void {
    __widgetOf(this, pcf.EditableWorkStatusChangesLV, SECTION_WIDGET_CLASS).setVariables(false, {$EmploymentData})
  }
  
  function refreshVariables ($EmploymentData :  EmploymentData) : void {
    __widgetOf(this, pcf.EditableWorkStatusChangesLV, SECTION_WIDGET_CLASS).setVariables(true, {$EmploymentData})
  }
  
  
}