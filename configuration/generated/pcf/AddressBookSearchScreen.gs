package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($externalSearchEnabled :  boolean, $requiredContactType :  Type, $claim :  Claim, $showCancel :  boolean, $initialSpecialistServices :  java.util.List<SpecialistService>, $performVendorSearch :  boolean) : void {
    __widgetOf(this, pcf.AddressBookSearchScreen, SECTION_WIDGET_CLASS).setVariables(false, {$externalSearchEnabled, $requiredContactType, $claim, $showCancel, $initialSpecialistServices, $performVendorSearch})
  }
  
  function refreshVariables ($externalSearchEnabled :  boolean, $requiredContactType :  Type, $claim :  Claim, $showCancel :  boolean, $initialSpecialistServices :  java.util.List<SpecialistService>, $performVendorSearch :  boolean) : void {
    __widgetOf(this, pcf.AddressBookSearchScreen, SECTION_WIDGET_CLASS).setVariables(true, {$externalSearchEnabled, $requiredContactType, $claim, $showCancel, $initialSpecialistServices, $performVendorSearch})
  }
  
  
}