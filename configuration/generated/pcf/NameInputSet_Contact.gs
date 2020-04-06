package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/NameInputSet.Contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NameInputSet_Contact extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.NameInputSet_Contact, SECTION_WIDGET_CLASS).setVariables(false, {$searchCriteria})
  }
  
  function refreshVariables ($searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.NameInputSet_Contact, SECTION_WIDGET_CLASS).setVariables(true, {$searchCriteria})
  }
  
  
}