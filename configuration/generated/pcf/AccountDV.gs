package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($account :  Account) : void {
    __widgetOf(this, pcf.AccountDV, SECTION_WIDGET_CLASS).setVariables(false, {$account})
  }
  
  function refreshVariables ($account :  Account) : void {
    __widgetOf(this, pcf.AccountDV, SECTION_WIDGET_CLASS).setVariables(true, {$account})
  }
  
  
}