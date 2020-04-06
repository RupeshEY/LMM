package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactRelatedContactsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactRelatedContactsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $claim :  Claim) : void {
    __widgetOf(this, pcf.ContactRelatedContactsDV, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $claim})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $claim :  Claim) : void {
    __widgetOf(this, pcf.ContactRelatedContactsDV, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $claim})
  }
  
  
}