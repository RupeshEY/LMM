package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/vehicle/EditableIncidentContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableIncidentContactsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Incident :  Incident) : void {
    __widgetOf(this, pcf.EditableIncidentContactsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Incident})
  }
  
  function refreshVariables ($Incident :  Incident) : void {
    __widgetOf(this, pcf.EditableIncidentContactsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Incident})
  }
  
  
}