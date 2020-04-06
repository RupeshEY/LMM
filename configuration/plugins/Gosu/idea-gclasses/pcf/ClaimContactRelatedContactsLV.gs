package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/ClaimContactRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimContactRelatedContactsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimContactRelatedContactsLV, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $claim})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimContactRelatedContactsLV, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $claim})
  }
  
  
}