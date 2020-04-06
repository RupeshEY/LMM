package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/EditableABRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableABRelatedContactsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($primaryContact :  Contact, $relationship :  ContactBidiRel, $externalContactSource :  gw.api.contact.ExternalContactSource) : void {
    __widgetOf(this, pcf.EditableABRelatedContactsLV, SECTION_WIDGET_CLASS).setVariables(false, {$primaryContact, $relationship, $externalContactSource})
  }
  
  function refreshVariables ($primaryContact :  Contact, $relationship :  ContactBidiRel, $externalContactSource :  gw.api.contact.ExternalContactSource) : void {
    __widgetOf(this, pcf.EditableABRelatedContactsLV, SECTION_WIDGET_CLASS).setVariables(true, {$primaryContact, $relationship, $externalContactSource})
  }
  
  
}