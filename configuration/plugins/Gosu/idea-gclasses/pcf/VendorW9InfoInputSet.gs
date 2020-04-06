package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/VendorW9InfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VendorW9InfoInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle) : void {
    __widgetOf(this, pcf.VendorW9InfoInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle) : void {
    __widgetOf(this, pcf.VendorW9InfoInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle})
  }
  
  
}