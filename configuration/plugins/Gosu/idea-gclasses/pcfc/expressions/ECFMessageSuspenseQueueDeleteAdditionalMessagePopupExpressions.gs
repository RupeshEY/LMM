package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ECFMessageSuspenseQueueDeleteAdditionalMessagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageSuspenseQueueDeleteAdditionalMessagePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ECFMessageSuspenseQueueDeleteAdditionalMessagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageSuspenseQueueDeleteAdditionalMessagePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ecfMessageClaimData :  ECFMessageClaimData_Ext) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DeleteButton) at ECFMessageSuspenseQueueDeleteAdditionalMessagePopup.pcf: line 25, column 39
    function allCheckedRowsAction_1 (CheckedValues :  ECFMessageClaimData_Ext[], CheckedValuesErrors :  java.util.Map) : void {
      ecfSuspenseQueueController.deleteECFMessages(CheckedValues);pcf.ECFMessageSuspenseQueue.go() 
    }
    
    // 'def' attribute on PanelRef at ECFMessageSuspenseQueueDeleteAdditionalMessagePopup.pcf: line 28, column 127
    function def_onEnter_2 (def :  pcf.ClaimDataSuspenseQueueLV) : void {
      def.onEnter(ecfSuspenseQueueController.getAllSuspendedMsgsForClaimTransaction(ecfMessageClaimData))
    }
    
    // 'def' attribute on PanelRef at ECFMessageSuspenseQueueDeleteAdditionalMessagePopup.pcf: line 28, column 127
    function def_refreshVariables_3 (def :  pcf.ClaimDataSuspenseQueueLV) : void {
      def.refreshVariables(ecfSuspenseQueueController.getAllSuspendedMsgsForClaimTransaction(ecfMessageClaimData))
    }
    
    // 'initialValue' attribute on Variable at ECFMessageSuspenseQueueDeleteAdditionalMessagePopup.pcf: line 13, column 65
    function initialValue_0 () : gw.acc.iplm.controller.ECFSuspenseQueueController {
      return new gw.acc.iplm.controller.ECFSuspenseQueueController()
    }
    
    override property get CurrentLocation () : pcf.ECFMessageSuspenseQueueDeleteAdditionalMessagePopup {
      return super.CurrentLocation as pcf.ECFMessageSuspenseQueueDeleteAdditionalMessagePopup
    }
    
    property get ecfMessageClaimData () : ECFMessageClaimData_Ext {
      return getVariableValue("ecfMessageClaimData", 0) as ECFMessageClaimData_Ext
    }
    
    property set ecfMessageClaimData ($arg :  ECFMessageClaimData_Ext) {
      setVariableValue("ecfMessageClaimData", 0, $arg)
    }
    
    property get ecfSuspenseQueueController () : gw.acc.iplm.controller.ECFSuspenseQueueController {
      return getVariableValue("ecfSuspenseQueueController", 0) as gw.acc.iplm.controller.ECFSuspenseQueueController
    }
    
    property set ecfSuspenseQueueController ($arg :  gw.acc.iplm.controller.ECFSuspenseQueueController) {
      setVariableValue("ecfSuspenseQueueController", 0, $arg)
    }
    
    
  }
  
  
}