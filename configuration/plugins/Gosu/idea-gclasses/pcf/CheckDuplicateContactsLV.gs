package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckDuplicateContactsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($addressBookMatch :  gw.api.contact.AddressBookMatch, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $externalContactSource :  gw.api.contact.ExternalContactSource, $searchResults :  gw.api.database.IQueryBeanResult<Contact>, $searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.CheckDuplicateContactsLV, SECTION_WIDGET_CLASS).setVariables(false, {$addressBookMatch, $pageHelper, $externalContactSource, $searchResults, $searchCriteria})
  }
  
  function refreshVariables ($addressBookMatch :  gw.api.contact.AddressBookMatch, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $externalContactSource :  gw.api.contact.ExternalContactSource, $searchResults :  gw.api.database.IQueryBeanResult<Contact>, $searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.CheckDuplicateContactsLV, SECTION_WIDGET_CLASS).setVariables(true, {$addressBookMatch, $pageHelper, $externalContactSource, $searchResults, $searchCriteria})
  }
  
  
}