package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchContactDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchContactDetailToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $canAccessLinkButtons :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus) : void {
    __widgetOf(this, pcf.AddressBookSearchContactDetailToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $canAccessLinkButtons, $linkStatus})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $canAccessLinkButtons :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus) : void {
    __widgetOf(this, pcf.AddressBookSearchContactDetailToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $canAccessLinkButtons, $linkStatus})
  }
  
  
}