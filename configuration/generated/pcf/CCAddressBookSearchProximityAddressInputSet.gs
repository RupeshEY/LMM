package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/CCAddressBookSearchProximityAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CCAddressBookSearchProximityAddressInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactSearchCriteria :  ContactSearchCriteria, $proximitySearchPageHelper :  gw.api.contact.CCProximitySearchPageHelper, $claim :  Claim) : void {
    __widgetOf(this, pcf.CCAddressBookSearchProximityAddressInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactSearchCriteria, $proximitySearchPageHelper, $claim})
  }
  
  function refreshVariables ($contactSearchCriteria :  ContactSearchCriteria, $proximitySearchPageHelper :  gw.api.contact.CCProximitySearchPageHelper, $claim :  Claim) : void {
    __widgetOf(this, pcf.CCAddressBookSearchProximityAddressInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactSearchCriteria, $proximitySearchPageHelper, $claim})
  }
  
  
}