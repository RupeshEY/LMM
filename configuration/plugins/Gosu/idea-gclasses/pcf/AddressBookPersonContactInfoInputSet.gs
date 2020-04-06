package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookPersonContactInfoInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($person :  Person, $claimContact :  ClaimContact) : void {
    __widgetOf(this, pcf.AddressBookPersonContactInfoInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$person, $claimContact})
  }
  
  function refreshVariables ($person :  Person, $claimContact :  ClaimContact) : void {
    __widgetOf(this, pcf.AddressBookPersonContactInfoInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$person, $claimContact})
  }
  
  
}