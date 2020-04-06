package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/preferences/UserDetailInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserDetailInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($User :  User, $UserOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.UserDetailInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$User, $UserOwner})
  }
  
  function refreshVariables ($User :  User, $UserOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.UserDetailInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$User, $UserOwner})
  }
  
  
}