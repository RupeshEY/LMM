package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookSearchLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($addressBookMatch :  gw.api.contact.AddressBookMatch, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $externalContactSource :  gw.api.contact.ExternalContactSource, $searchResults :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>, $searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.AddressBookSearchLV, SECTION_WIDGET_CLASS).setVariables(false, {$addressBookMatch, $pageHelper, $externalContactSource, $searchResults, $searchCriteria})
  }
  
  function refreshVariables ($addressBookMatch :  gw.api.contact.AddressBookMatch, $pageHelper :  gw.api.contact.ProximitySearchPageHelper, $externalContactSource :  gw.api.contact.ExternalContactSource, $searchResults :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>, $searchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.AddressBookSearchLV, SECTION_WIDGET_CLASS).setVariables(true, {$addressBookMatch, $pageHelper, $externalContactSource, $searchResults, $searchCriteria})
  }
  
  
}