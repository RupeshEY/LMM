package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AuthorityLimitProfileDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AuthorityLimitProfile :  AuthorityLimitProfile) : void {
    __widgetOf(this, pcf.AuthorityLimitProfileDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$AuthorityLimitProfile})
  }
  
  function refreshVariables ($AuthorityLimitProfile :  AuthorityLimitProfile) : void {
    __widgetOf(this, pcf.AuthorityLimitProfileDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$AuthorityLimitProfile})
  }
  
  
}