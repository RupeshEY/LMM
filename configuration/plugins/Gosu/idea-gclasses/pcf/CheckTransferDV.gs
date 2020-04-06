package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransferDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckTransferDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($NewCheck :  Check, $OldCheck :  Check, $Claim :  Claim, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.CheckTransferDV, SECTION_WIDGET_CLASS).setVariables(false, {$NewCheck, $OldCheck, $Claim, $reserveLineInputSetHelper})
  }
  
  function refreshVariables ($NewCheck :  Check, $OldCheck :  Check, $Claim :  Claim, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : void {
    __widgetOf(this, pcf.CheckTransferDV, SECTION_WIDGET_CLASS).setVariables(true, {$NewCheck, $OldCheck, $Claim, $reserveLineInputSetHelper})
  }
  
  
}