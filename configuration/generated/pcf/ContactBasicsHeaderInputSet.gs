package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsHeaderInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactBasicsHeaderInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $claimContact :  ClaimContact, $showRoles :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus) : void {
    __widgetOf(this, pcf.ContactBasicsHeaderInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $claimContact, $showRoles, $linkStatus})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $claimContact :  ClaimContact, $showRoles :  boolean, $linkStatus :  gw.api.contact.ContactSystemLinkStatus) : void {
    __widgetOf(this, pcf.ContactBasicsHeaderInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $claimContact, $showRoles, $linkStatus})
  }
  
  
}