package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/PLNameInputSet.Contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PLNameInputSet_Contact extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($nameOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.PLNameInputSet_Contact, SECTION_WIDGET_CLASS).setVariables(false, {$nameOwner})
  }
  
  function refreshVariables ($nameOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.PLNameInputSet_Contact, SECTION_WIDGET_CLASS).setVariables(true, {$nameOwner})
  }
  
  
}