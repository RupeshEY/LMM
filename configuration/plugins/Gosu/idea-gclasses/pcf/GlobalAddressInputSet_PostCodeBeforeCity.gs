package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/address/GlobalAddressInputSet.PostCodeBeforeCity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalAddressInputSet_PostCodeBeforeCity extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($addressOwner :  gw.api.address.AddressOwner) : void {
    __widgetOf(this, pcf.GlobalAddressInputSet_PostCodeBeforeCity, SECTION_WIDGET_CLASS).setVariables(false, {$addressOwner})
  }
  
  function refreshVariables ($addressOwner :  gw.api.address.AddressOwner) : void {
    __widgetOf(this, pcf.GlobalAddressInputSet_PostCodeBeforeCity, SECTION_WIDGET_CLASS).setVariables(true, {$addressOwner})
  }
  
  
}