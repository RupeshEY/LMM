package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($recovery :  Recovery, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper, $recoveryHelper :  gw.api.financials.RecoveryHelper) : void {
    __widgetOf(this, pcf.RecoveryDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$recovery, $reserveLineInputSetHelper, $recoveryHelper})
  }
  
  function refreshVariables ($recovery :  Recovery, $reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper, $recoveryHelper :  gw.api.financials.RecoveryHelper) : void {
    __widgetOf(this, pcf.RecoveryDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$recovery, $reserveLineInputSetHelper, $recoveryHelper})
  }
  
  
}