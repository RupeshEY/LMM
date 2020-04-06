package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/shared/CCAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CCAddressInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($addressOwner :  gw.api.address.CCAddressOwner) : void {
    __widgetOf(this, pcf.CCAddressInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$addressOwner})
  }
  
  function refreshVariables ($addressOwner :  gw.api.address.CCAddressOwner) : void {
    __widgetOf(this, pcf.CCAddressInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$addressOwner})
  }
  
  
}