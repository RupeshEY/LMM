package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/NameInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NameInputSet_Person extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.NameInputSet_Person, SECTION_WIDGET_CLASS).setVariables(false, {$searchCriteria})
  }
  
  function refreshVariables ($searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.NameInputSet_Person, SECTION_WIDGET_CLASS).setVariables(true, {$searchCriteria})
  }
  
  
}