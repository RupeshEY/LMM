package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/phone/GlobalPhoneInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalPhoneInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($phoneOwner :  gw.api.phone.PhoneOwner) : void {
    __widgetOf(this, pcf.GlobalPhoneInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$phoneOwner})
  }
  
  function refreshVariables ($phoneOwner :  gw.api.phone.PhoneOwner) : void {
    __widgetOf(this, pcf.GlobalPhoneInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$phoneOwner})
  }
  
  
}