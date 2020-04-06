package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPersonNameInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookPersonNameInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($person :  Person) : void {
    __widgetOf(this, pcf.AddressBookPersonNameInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$person})
  }
  
  function refreshVariables ($person :  Person) : void {
    __widgetOf(this, pcf.AddressBookPersonNameInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$person})
  }
  
  
}