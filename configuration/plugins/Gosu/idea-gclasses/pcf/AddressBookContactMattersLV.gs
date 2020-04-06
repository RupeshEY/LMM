package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactMattersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactMattersLV, SECTION_WIDGET_CLASS).setVariables(false, {$Contact})
  }
  
  function refreshVariables ($Contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactMattersLV, SECTION_WIDGET_CLASS).setVariables(true, {$Contact})
  }
  
  
}