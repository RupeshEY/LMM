package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$Contact})
  }
  
  function refreshVariables ($Contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$Contact})
  }
  
  
}