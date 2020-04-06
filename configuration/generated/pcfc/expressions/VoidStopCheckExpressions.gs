package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.lang.IllegalStateException
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VoidStopCheckExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidStopCheckExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Check :  Check) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=VoidStopCheck_VoidButton) at VoidStopCheck.pcf: line 32, column 50
    function action_2 () : void {
      voidCheck()
    }
    
    // 'action' attribute on ToolbarButton (id=VoidStopCheck_StopButton) at VoidStopCheck.pcf: line 39, column 47
    function action_5 () : void {
      stopCheck()
    }
    
    // 'afterCancel' attribute on Page (id=VoidStopCheck) at VoidStopCheck.pcf: line 14, column 74
    function afterCancel_17 () : void {
      ClaimFinancialsChecksDetail.go(Claim, Check)
    }
    
    // 'afterCancel' attribute on Page (id=VoidStopCheck) at VoidStopCheck.pcf: line 14, column 74
    function afterCancel_dest_18 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, Check)
    }
    
    // 'afterCommit' attribute on Page (id=VoidStopCheck) at VoidStopCheck.pcf: line 14, column 74
    function afterCommit_19 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsChecksDetail.go(Claim, Check)
    }
    
    // 'available' attribute on ToolbarButton (id=VoidStopCheck_VoidButton) at VoidStopCheck.pcf: line 32, column 50
    function available_0 () : java.lang.Boolean {
      return  Check.Voidable and perm.Payment.voidpmt(Check)
    }
    
    // 'available' attribute on ToolbarButton (id=VoidStopCheck_StopButton) at VoidStopCheck.pcf: line 39, column 47
    function available_3 () : java.lang.Boolean {
      return  Check.Stoppable and perm.Payment.stop(Check)
    }
    
    // 'canVisit' attribute on Page (id=VoidStopCheck) at VoidStopCheck.pcf: line 14, column 74
    static function canVisit_20 (Check :  Check, Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'def' attribute on PanelRef at VoidStopCheck.pcf: line 58, column 40
    function def_onEnter_12 (def :  pcf.VoidStopCheckDV) : void {
      def.onEnter(Check)
    }
    
    // 'def' attribute on PanelRef at VoidStopCheck.pcf: line 61, column 40
    function def_onEnter_15 (def :  pcf.VoidStopCheckGroupDV) : void {
      def.onEnter(Check)
    }
    
    // 'def' attribute on PanelRef at VoidStopCheck.pcf: line 58, column 40
    function def_refreshVariables_13 (def :  pcf.VoidStopCheckDV) : void {
      def.refreshVariables(Check)
    }
    
    // 'def' attribute on PanelRef at VoidStopCheck.pcf: line 61, column 40
    function def_refreshVariables_16 (def :  pcf.VoidStopCheckGroupDV) : void {
      def.refreshVariables(Check)
    }
    
    // EditButtons at VoidStopCheck.pcf: line 43, column 34
    function label_6 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on TextInput (id=LinkedServiceRequestInvoicesMessage) at VoidStopCheck.pcf: line 53, column 65
    function label_8 () : java.lang.Object {
      return DisplayKey.get("JSP.VoidStopCheck.VoidStop.InvoicesTip", ServiceRequestInvoiceStatus.TC_APPROVED.DisplayName, Check.BulletedListOfServiceRequestInvoicesForWarning)
    }
    
    // 'parent' attribute on Page (id=VoidStopCheck) at VoidStopCheck.pcf: line 14, column 74
    static function parent_21 (Check :  Check, Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, Check)
    }
    
    // 'visible' attribute on ToolbarButton (id=VoidStopCheck_VoidButton) at VoidStopCheck.pcf: line 32, column 50
    function visible_1 () : java.lang.Boolean {
      return perm.Payment.voidpmt(Check)
    }
    
    // 'visible' attribute on PanelRef at VoidStopCheck.pcf: line 58, column 40
    function visible_11 () : java.lang.Boolean {
      return Check.Group == null
    }
    
    // 'visible' attribute on PanelRef at VoidStopCheck.pcf: line 61, column 40
    function visible_14 () : java.lang.Boolean {
      return Check.Group != null
    }
    
    // 'visible' attribute on ToolbarButton (id=VoidStopCheck_StopButton) at VoidStopCheck.pcf: line 39, column 47
    function visible_4 () : java.lang.Boolean {
      return perm.Payment.stop(Check)
    }
    
    // 'visible' attribute on TextInput (id=LinkedServiceRequestInvoicesMessage) at VoidStopCheck.pcf: line 53, column 65
    function visible_7 () : java.lang.Boolean {
      return Check.ServiceRequestInvoices.HasElements
    }
    
    property get Check () : Check {
      return getVariableValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setVariableValue("Check", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.VoidStopCheck {
      return super.CurrentLocation as pcf.VoidStopCheck
    }
    
    
    function voidCheck() {
      try {
        gw.api.util.CCLocationUtil.runAndCommit( \ -> Check.voidCheck(), CurrentLocation )
      } catch (e : IllegalStateException) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Financials.CheckCancel.Error.IllegalFinancialsStatus"), e)
      }
    }
    
    function stopCheck() {
      try {
        gw.api.util.CCLocationUtil.runAndCommit( \ -> Check.stopCheck(), CurrentLocation )
      } catch (e : IllegalStateException) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Financials.CheckCancel.Error.IllegalFinancialsStatus"), e)
      }
    }
    
    
  }
  
  
}