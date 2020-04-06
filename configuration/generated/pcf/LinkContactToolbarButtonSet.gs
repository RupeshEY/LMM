package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/LinkContactToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LinkContactToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $linkStatus :  gw.api.contact.ContactSystemLinkStatus) : void {
    __widgetOf(this, pcf.LinkContactToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $linkStatus})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $linkStatus :  gw.api.contact.ContactSystemLinkStatus) : void {
    __widgetOf(this, pcf.LinkContactToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $linkStatus})
  }
  
  
}