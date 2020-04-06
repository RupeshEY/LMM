package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/login/LoginDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoginDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($LoginForm :  gw.api.util.LoginForm) : void {
    __widgetOf(this, pcf.LoginDV, SECTION_WIDGET_CLASS).setVariables(false, {$LoginForm})
  }
  
  function refreshVariables ($LoginForm :  gw.api.util.LoginForm) : void {
    __widgetOf(this, pcf.LoginDV, SECTION_WIDGET_CLASS).setVariables(true, {$LoginForm})
  }
  
  
}