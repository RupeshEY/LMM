package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransferPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckTransferPaymentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Check :  Check, $Claim :  Claim, $displayLink :  boolean, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.CheckTransferPaymentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Check, $Claim, $displayLink, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($Check :  Check, $Claim :  Claim, $displayLink :  boolean, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.CheckTransferPaymentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Check, $Claim, $displayLink, $reserveLineInputSetHelper})
  }
  
  
}