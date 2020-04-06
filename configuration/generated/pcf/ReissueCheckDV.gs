package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReissueCheckDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Check :  Check, $oldCheckIsSecondary :  Boolean) : void {
    __widgetOf(this, pcf.ReissueCheckDV, SECTION_WIDGET_CLASS).setVariables(false, {$Check, $oldCheckIsSecondary})
  }
  
  function refreshVariables ($Check :  Check, $oldCheckIsSecondary :  Boolean) : void {
    __widgetOf(this, pcf.ReissueCheckDV, SECTION_WIDGET_CLASS).setVariables(true, {$Check, $oldCheckIsSecondary})
  }
  
  
}