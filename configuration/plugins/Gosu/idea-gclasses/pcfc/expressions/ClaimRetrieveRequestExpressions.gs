package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimretrieve/ClaimRetrieveRequest.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimRetrieveRequestExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimretrieve/ClaimRetrieveRequest.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimRetrieveRequestExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'afterCommit' attribute on Page (id=ClaimRetrieveRequest) at ClaimRetrieveRequest.pcf: line 14, column 78
    function afterCommit_4 (TopLocation :  pcf.api.Location) : void {
      ClaimSummary.go(claim); gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Accelerator.IPLM.Web.ClaimRetrieve.SucessfullySent"))
    }
    
    // 'beforeCommit' attribute on Page (id=ClaimRetrieveRequest) at ClaimRetrieveRequest.pcf: line 14, column 78
    function beforeCommit_5 (pickedValue :  java.lang.Object) : void {
      claimRetrieveController.sendRequest(claimRetrieveRq)
    }
    
    // 'def' attribute on ScreenRef at ClaimRetrieveRequest.pcf: line 29, column 89
    function def_onEnter_2 (def :  pcf.ClaimRetrieveRequestScreen) : void {
      def.onEnter(claimRetrieveRq, claimRetrieveController, true)
    }
    
    // 'def' attribute on ScreenRef at ClaimRetrieveRequest.pcf: line 29, column 89
    function def_refreshVariables_3 (def :  pcf.ClaimRetrieveRequestScreen) : void {
      def.refreshVariables(claimRetrieveRq, claimRetrieveController, true)
    }
    
    // 'initialValue' attribute on Variable at ClaimRetrieveRequest.pcf: line 23, column 65
    function initialValue_0 () : gw.acc.iplm.controller.ECFClaimRetrieveController {
      return new gw.acc.iplm.controller.ECFClaimRetrieveController()
    }
    
    // 'initialValue' attribute on Variable at ClaimRetrieveRequest.pcf: line 27, column 45
    function initialValue_1 () : ECFMessageClaimRetrieveRq_Ext {
      return claimRetrieveController.initializeNewClaimRetrieve(claim, CurrentLocation.Bundle)
    }
    
    // Page (id=ClaimRetrieveRequest) at ClaimRetrieveRequest.pcf: line 14, column 78
    static function parent_6 (claim :  Claim) : pcf.api.Destination {
      return pcf.ECFLocationGroup.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimRetrieveRequest {
      return super.CurrentLocation as pcf.ClaimRetrieveRequest
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get claimRetrieveController () : gw.acc.iplm.controller.ECFClaimRetrieveController {
      return getVariableValue("claimRetrieveController", 0) as gw.acc.iplm.controller.ECFClaimRetrieveController
    }
    
    property set claimRetrieveController ($arg :  gw.acc.iplm.controller.ECFClaimRetrieveController) {
      setVariableValue("claimRetrieveController", 0, $arg)
    }
    
    property get claimRetrieveRq () : ECFMessageClaimRetrieveRq_Ext {
      return getVariableValue("claimRetrieveRq", 0) as ECFMessageClaimRetrieveRq_Ext
    }
    
    property set claimRetrieveRq ($arg :  ECFMessageClaimRetrieveRq_Ext) {
      setVariableValue("claimRetrieveRq", 0, $arg)
    }
    
    
  }
  
  
}