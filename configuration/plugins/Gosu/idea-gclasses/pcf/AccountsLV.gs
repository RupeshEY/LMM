package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/AccountsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Accounts :  Account[]) : void {
    __widgetOf(this, pcf.AccountsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Accounts})
  }
  
  function refreshVariables ($Accounts :  Account[]) : void {
    __widgetOf(this, pcf.AccountsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Accounts})
  }
  
  
}