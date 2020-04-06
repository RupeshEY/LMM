package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/CCAddressBookSearchLocationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CCAddressBookSearchLocationInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactSearchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.CCAddressBookSearchLocationInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactSearchCriteria})
  }
  
  function refreshVariables ($contactSearchCriteria :  ContactSearchCriteria) : void {
    __widgetOf(this, pcf.CCAddressBookSearchLocationInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactSearchCriteria})
  }
  
  
}