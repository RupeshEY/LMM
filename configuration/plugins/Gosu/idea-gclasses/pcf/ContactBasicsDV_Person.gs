package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactBasicsDV_Person extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $showRoles :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $claim :  Claim) : void {
    __widgetOf(this, pcf.ContactBasicsDV_Person, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $showRoles, $linkStatus, $claim})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $showRoles :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus, $claim :  Claim) : void {
    __widgetOf(this, pcf.ContactBasicsDV_Person, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $showRoles, $linkStatus, $claim})
  }
  
  
}