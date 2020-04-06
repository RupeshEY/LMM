package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimTransactionsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimTransactionsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimTransactionsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}