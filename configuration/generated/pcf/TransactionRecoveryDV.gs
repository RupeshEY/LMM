package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionRecoveryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionRecoveryDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Recovery :  Recovery) : void {
    __widgetOf(this, pcf.TransactionRecoveryDV, SECTION_WIDGET_CLASS).setVariables(false, {$Recovery})
  }
  
  function refreshVariables ($Recovery :  Recovery) : void {
    __widgetOf(this, pcf.TransactionRecoveryDV, SECTION_WIDGET_CLASS).setVariables(true, {$Recovery})
  }
  
  
}