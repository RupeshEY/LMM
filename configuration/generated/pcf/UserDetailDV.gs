package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($User :  User, $linkStatus :  gw.api.contact.ContactSystemLinkStatus) : void {
    __widgetOf(this, pcf.UserDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$User, $linkStatus})
  }
  
  function refreshVariables ($User :  User, $linkStatus :  gw.api.contact.ContactSystemLinkStatus) : void {
    __widgetOf(this, pcf.UserDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$User, $linkStatus})
  }
  
  
}