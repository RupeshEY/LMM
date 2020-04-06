package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactDetailScreen.error.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactDetailScreen_error extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($abcHelper :  gw.pcf.AddressBookContactHelper) : void {
    __widgetOf(this, pcf.AddressBookContactDetailScreen_error, SECTION_WIDGET_CLASS).setVariables(false, {$abcHelper})
  }
  
  function refreshVariables ($abcHelper :  gw.pcf.AddressBookContactHelper) : void {
    __widgetOf(this, pcf.AddressBookContactDetailScreen_error, SECTION_WIDGET_CLASS).setVariables(true, {$abcHelper})
  }
  
  
}