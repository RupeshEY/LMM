package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchContactDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $canAccessLinkButtons :  boolean, $showRoles :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $claim :  Claim) : void {
    __widgetOf(this, pcf.AddressBookSearchContactDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $canAccessLinkButtons, $showRoles, $linkStatus, $claim})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $canAccessLinkButtons :  boolean, $showRoles :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $claim :  Claim) : void {
    __widgetOf(this, pcf.AddressBookSearchContactDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $canAccessLinkButtons, $showRoles, $linkStatus, $claim})
  }
  
  
}