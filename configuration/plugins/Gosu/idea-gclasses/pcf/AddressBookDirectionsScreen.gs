package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookDirectionsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($directions :  gw.api.contact.DrivingDirections) : void {
    __widgetOf(this, pcf.AddressBookDirectionsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$directions})
  }
  
  function refreshVariables ($directions :  gw.api.contact.DrivingDirections) : void {
    __widgetOf(this, pcf.AddressBookDirectionsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$directions})
  }
  
  
}