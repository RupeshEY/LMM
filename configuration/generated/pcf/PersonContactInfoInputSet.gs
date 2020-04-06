package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/PersonContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PersonContactInfoInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $claimContact :  ClaimContact) : void {
    __widgetOf(this, pcf.PersonContactInfoInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $claimContact})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $claimContact :  ClaimContact) : void {
    __widgetOf(this, pcf.PersonContactInfoInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $claimContact})
  }
  
  
}