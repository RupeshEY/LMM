package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AuthorityLimitProfilesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AuthorityLimitProfileList :  gw.api.database.IQueryBeanResult<AuthorityLimitProfile>) : void {
    __widgetOf(this, pcf.AuthorityLimitProfilesLV, SECTION_WIDGET_CLASS).setVariables(false, {$AuthorityLimitProfileList})
  }
  
  function refreshVariables ($AuthorityLimitProfileList :  gw.api.database.IQueryBeanResult<AuthorityLimitProfile>) : void {
    __widgetOf(this, pcf.AuthorityLimitProfilesLV, SECTION_WIDGET_CLASS).setVariables(true, {$AuthorityLimitProfileList})
  }
  
  
}