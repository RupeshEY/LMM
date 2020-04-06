package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransfer.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckTransferExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransfer.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckTransferExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, OldCheck :  Check) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=CheckTransfer_TransferButton) at CheckTransfer.pcf: line 40, column 48
    function action_4 () : void {
      doTransfer()
    }
    
    // 'afterCancel' attribute on Page (id=CheckTransfer) at CheckTransfer.pcf: line 15, column 66
    function afterCancel_8 () : void {
      ClaimFinancialsChecksDetail.go(Claim, OldCheck)
    }
    
    // 'afterCancel' attribute on Page (id=CheckTransfer) at CheckTransfer.pcf: line 15, column 66
    function afterCancel_dest_9 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, OldCheck)
    }
    
    // 'afterCommit' attribute on Page (id=CheckTransfer) at CheckTransfer.pcf: line 15, column 66
    function afterCommit_10 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsChecksDetail.go(Claim, OldCheck)
    }
    
    // 'available' attribute on ToolbarButton (id=CheckTransfer_TransferButton) at CheckTransfer.pcf: line 40, column 48
    function available_2 () : java.lang.Boolean {
      return perm.Check.edit(OldCheck)
    }
    
    // 'beforeCommit' attribute on Page (id=CheckTransfer) at CheckTransfer.pcf: line 15, column 66
    function beforeCommit_11 (pickedValue :  java.lang.Object) : void {
      gw.api.system.bundle.BundleCommitCondition.verify(NewCheck)
    }
    
    // 'canVisit' attribute on Page (id=CheckTransfer) at CheckTransfer.pcf: line 15, column 66
    static function canVisit_12 (Claim :  Claim, OldCheck :  Check) : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'def' attribute on PanelRef at CheckTransfer.pcf: line 47, column 86
    function def_onEnter_6 (def :  pcf.CheckTransferDV) : void {
      def.onEnter(NewCheck, OldCheck, Claim, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at CheckTransfer.pcf: line 47, column 86
    function def_refreshVariables_7 (def :  pcf.CheckTransferDV) : void {
      def.refreshVariables(NewCheck, OldCheck, Claim, reserveLineInputSetHelper)
    }
    
    // 'initialValue' attribute on Variable at CheckTransfer.pcf: line 27, column 21
    function initialValue_0 () : Check {
      return OldCheck.createCheckForTransfer()
    }
    
    // 'initialValue' attribute on Variable at CheckTransfer.pcf: line 31, column 59
    function initialValue_1 () : gw.api.financials.ReserveLineInputSetHelper {
      return gw.api.financials.ReserveLineInputSetStrategyForPaymentTransfer.newHelper(NewCheck)
    }
    
    // EditButtons at CheckTransfer.pcf: line 44, column 34
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onResume' attribute on Page (id=CheckTransfer) at CheckTransfer.pcf: line 15, column 66
    function onResume_13 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(NewCheck)
    }
    
    // 'parent' attribute on Page (id=CheckTransfer) at CheckTransfer.pcf: line 15, column 66
    static function parent_14 (Claim :  Claim, OldCheck :  Check) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, OldCheck)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CheckTransfer {
      return super.CurrentLocation as pcf.CheckTransfer
    }
    
    property get NewCheck () : Check {
      return getVariableValue("NewCheck", 0) as Check
    }
    
    property set NewCheck ($arg :  Check) {
      setVariableValue("NewCheck", 0, $arg)
    }
    
    property get OldCheck () : Check {
      return getVariableValue("OldCheck", 0) as Check
    }
    
    property set OldCheck ($arg :  Check) {
      setVariableValue("OldCheck", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getVariableValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setVariableValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    function doTransfer() {
      OldCheck.unlinkDeductibles()
      NewCheck.linkDeductibles()
      OldCheck.unlinkServiceRequestInvoicesForTransfer()
      gw.api.financials.CheckUtil.transferCheck(NewCheck, OldCheck, CurrentLocation)
    }
    
    
  }
  
  
}