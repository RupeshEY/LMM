package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookMatchWorksheetScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookMatchWorksheetScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($addressBookMatch :  gw.api.contact.AddressBookMatch, $proximitySearchPageHelper :  gw.api.contact.ProximitySearchPageHelper, $onlyPrimaryRelationships :  boolean) : void {
    __widgetOf(this, pcf.AddressBookMatchWorksheetScreen, SECTION_WIDGET_CLASS).setVariables(false, {$addressBookMatch, $proximitySearchPageHelper, $onlyPrimaryRelationships})
  }
  
  function refreshVariables ($addressBookMatch :  gw.api.contact.AddressBookMatch, $proximitySearchPageHelper :  gw.api.contact.ProximitySearchPageHelper, $onlyPrimaryRelationships :  boolean) : void {
    __widgetOf(this, pcf.AddressBookMatchWorksheetScreen, SECTION_WIDGET_CLASS).setVariables(true, {$addressBookMatch, $proximitySearchPageHelper, $onlyPrimaryRelationships})
  }
  
  
}