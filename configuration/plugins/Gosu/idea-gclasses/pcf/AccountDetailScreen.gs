package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($account :  Account, $showAccountHandlingCardToStart :  boolean) : void {
    __widgetOf(this, pcf.AccountDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$account, $showAccountHandlingCardToStart})
  }
  
  function refreshVariables ($account :  Account, $showAccountHandlingCardToStart :  boolean) : void {
    __widgetOf(this, pcf.AccountDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$account, $showAccountHandlingCardToStart})
  }
  
  
}