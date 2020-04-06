package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/admin/ECFAdminClaimRetrievePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFAdminClaimRetrievePageExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/admin/ECFAdminClaimRetrievePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFAdminClaimRetrievePageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCommit' attribute on Page (id=ECFAdminClaimRetrievePage) at ECFAdminClaimRetrievePage.pcf: line 12, column 94
    function afterCommit_4 (TopLocation :  pcf.api.Location) : void {
      gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Accelerator.IPLM.Web.ClaimRetrieve.SucessfullySent")); claimRetrieveRq = claimRetrieveController.initializeNewClaimRetrieve(null, CurrentLocation.Bundle)
    }
    
    // 'beforeCommit' attribute on Page (id=ECFAdminClaimRetrievePage) at ECFAdminClaimRetrievePage.pcf: line 12, column 94
    function beforeCommit_5 (pickedValue :  java.lang.Object) : void {
      claimRetrieveController.sendRequest(claimRetrieveRq)
    }
    
    // 'def' attribute on ScreenRef at ECFAdminClaimRetrievePage.pcf: line 22, column 90
    function def_onEnter_2 (def :  pcf.ClaimRetrieveRequestScreen) : void {
      def.onEnter(claimRetrieveRq, claimRetrieveController, false)
    }
    
    // 'def' attribute on ScreenRef at ECFAdminClaimRetrievePage.pcf: line 22, column 90
    function def_refreshVariables_3 (def :  pcf.ClaimRetrieveRequestScreen) : void {
      def.refreshVariables(claimRetrieveRq, claimRetrieveController, false)
    }
    
    // 'initialValue' attribute on Variable at ECFAdminClaimRetrievePage.pcf: line 16, column 65
    function initialValue_0 () : gw.acc.iplm.controller.ECFClaimRetrieveController {
      return new gw.acc.iplm.controller.ECFClaimRetrieveController()
    }
    
    // 'initialValue' attribute on Variable at ECFAdminClaimRetrievePage.pcf: line 20, column 45
    function initialValue_1 () : ECFMessageClaimRetrieveRq_Ext {
      return claimRetrieveController.initializeNewClaimRetrieve(null, CurrentLocation.Bundle)
    }
    
    // Page (id=ECFAdminClaimRetrievePage) at ECFAdminClaimRetrievePage.pcf: line 12, column 94
    static function parent_6 () : pcf.api.Destination {
      return pcf.IPLMAdminLocationGroup.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ECFAdminClaimRetrievePage {
      return super.CurrentLocation as pcf.ECFAdminClaimRetrievePage
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