package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimretrieve/ClaimRetrieveRequestScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimRetrieveRequestScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimRetrieveRq :  ECFMessageClaimRetrieveRq_Ext, $ecfClaimRetrieveController :  gw.acc.iplm.controller.ECFClaimRetrieveController, $calledFromClaim :  Boolean) : void {
    __widgetOf(this, pcf.ClaimRetrieveRequestScreen, SECTION_WIDGET_CLASS).setVariables(false, {$claimRetrieveRq, $ecfClaimRetrieveController, $calledFromClaim})
  }
  
  function refreshVariables ($claimRetrieveRq :  ECFMessageClaimRetrieveRq_Ext, $ecfClaimRetrieveController :  gw.acc.iplm.controller.ECFClaimRetrieveController, $calledFromClaim :  Boolean) : void {
    __widgetOf(this, pcf.ClaimRetrieveRequestScreen, SECTION_WIDGET_CLASS).setVariables(true, {$claimRetrieveRq, $ecfClaimRetrieveController, $calledFromClaim})
  }
  
  
}