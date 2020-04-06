package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Contact})
  }
  
  function refreshVariables ($Contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Contact})
  }
  
  
}