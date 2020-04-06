package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactClaimsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactClaimsLV, SECTION_WIDGET_CLASS).setVariables(false, {$contact})
  }
  
  function refreshVariables ($contact :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactClaimsLV, SECTION_WIDGET_CLASS).setVariables(true, {$contact})
  }
  
  
}