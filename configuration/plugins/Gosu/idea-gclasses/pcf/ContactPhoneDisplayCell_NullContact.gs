package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ContactPhoneDisplayCell.NullContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactPhoneDisplayCell_NullContact extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($phoneOwner :  gw.api.phone.PhoneOwner, $aLodgingProvider :  entity.LodgingProvider) : void {
    __widgetOf(this, pcf.ContactPhoneDisplayCell_NullContact, SECTION_WIDGET_CLASS).setVariables(false, {$phoneOwner, $aLodgingProvider})
  }
  
  function refreshVariables ($phoneOwner :  gw.api.phone.PhoneOwner, $aLodgingProvider :  entity.LodgingProvider) : void {
    __widgetOf(this, pcf.ContactPhoneDisplayCell_NullContact, SECTION_WIDGET_CLASS).setVariables(true, {$phoneOwner, $aLodgingProvider})
  }
  
  
}