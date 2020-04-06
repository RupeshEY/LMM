package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLContactInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactPerson :  Contact, $role :  ContactRole, $incident :  Incident) : void {
    __widgetOf(this, pcf.FNOLContactInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactPerson, $role, $incident})
  }
  
  function refreshVariables ($contactPerson :  Contact, $role :  ContactRole, $incident :  Incident) : void {
    __widgetOf(this, pcf.FNOLContactInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactPerson, $role, $incident})
  }
  
  
}