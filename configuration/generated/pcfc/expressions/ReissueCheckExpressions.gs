package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.lang.IllegalStateException
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ReissueCheck.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReissueCheckExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/ReissueCheck.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReissueCheckExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, check :  Check) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ReissueCheck_VoidAndReissueButton) at ReissueCheck.pcf: line 40, column 50
    function action_4 () : void {
      voidAndReissueCheck()
    }
    
    // 'action' attribute on ToolbarButton (id=ReissueCheck_StopAndReissueButton) at ReissueCheck.pcf: line 47, column 47
    function action_7 () : void {
      stopAndReissueCheck();
    }
    
    // 'afterCancel' attribute on Page (id=ReissueCheck) at ReissueCheck.pcf: line 14, column 64
    function afterCancel_11 () : void {
      ClaimFinancialsChecksDetail.go(Claim, check)
    }
    
    // 'afterCancel' attribute on Page (id=ReissueCheck) at ReissueCheck.pcf: line 14, column 64
    function afterCancel_dest_12 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, check)
    }
    
    // 'afterCommit' attribute on Page (id=ReissueCheck) at ReissueCheck.pcf: line 14, column 64
    function afterCommit_13 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsChecksDetail.go(Claim, check)
    }
    
    // 'available' attribute on ToolbarButton (id=ReissueCheck_VoidAndReissueButton) at ReissueCheck.pcf: line 40, column 50
    function available_2 () : java.lang.Boolean {
      return  check.VoidableForReissue and perm.Payment.voidpmt(check)
    }
    
    // 'available' attribute on ToolbarButton (id=ReissueCheck_StopAndReissueButton) at ReissueCheck.pcf: line 47, column 47
    function available_5 () : java.lang.Boolean {
      return  check.StoppableForReissue and perm.Payment.stop(check)
    }
    
    // 'canVisit' attribute on Page (id=ReissueCheck) at ReissueCheck.pcf: line 14, column 64
    static function canVisit_14 (Claim :  Claim, check :  Check) : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'def' attribute on PanelRef at ReissueCheck.pcf: line 54, column 64
    function def_onEnter_9 (def :  pcf.ReissueCheckDV) : void {
      def.onEnter(newCheck, !oldCheck.isPrimary())
    }
    
    // 'def' attribute on PanelRef at ReissueCheck.pcf: line 54, column 64
    function def_refreshVariables_10 (def :  pcf.ReissueCheckDV) : void {
      def.refreshVariables(newCheck, !oldCheck.isPrimary())
    }
    
    // 'initialValue' attribute on Variable at ReissueCheck.pcf: line 26, column 21
    function initialValue_0 () : Check {
      return check
    }
    
    // 'initialValue' attribute on Variable at ReissueCheck.pcf: line 30, column 21
    function initialValue_1 () : Check {
      return oldCheck.createCheckForReissue()
    }
    
    // EditButtons at ReissueCheck.pcf: line 51, column 34
    function label_8 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=ReissueCheck) at ReissueCheck.pcf: line 14, column 64
    static function parent_15 (Claim :  Claim, check :  Check) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, check)
    }
    
    // 'visible' attribute on ToolbarButton (id=ReissueCheck_VoidAndReissueButton) at ReissueCheck.pcf: line 40, column 50
    function visible_3 () : java.lang.Boolean {
      return perm.Payment.voidpmt(check)
    }
    
    // 'visible' attribute on ToolbarButton (id=ReissueCheck_StopAndReissueButton) at ReissueCheck.pcf: line 47, column 47
    function visible_6 () : java.lang.Boolean {
      return perm.Payment.stop(check)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ReissueCheck {
      return super.CurrentLocation as pcf.ReissueCheck
    }
    
    property get check () : Check {
      return getVariableValue("check", 0) as Check
    }
    
    property set check ($arg :  Check) {
      setVariableValue("check", 0, $arg)
    }
    
    property get newCheck () : Check {
      return getVariableValue("newCheck", 0) as Check
    }
    
    property set newCheck ($arg :  Check) {
      setVariableValue("newCheck", 0, $arg)
    }
    
    property get oldCheck () : Check {
      return getVariableValue("oldCheck", 0) as Check
    }
    
    property set oldCheck ($arg :  Check) {
      setVariableValue("oldCheck", 0, $arg)
    }
    
    
    function voidAndReissueCheck() {
      try {
        gw.api.util.CCLocationUtil.runAndCommit( \ -> newCheck.voidAndReissue(oldCheck), CurrentLocation )
      } catch (e : IllegalStateException) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Financials.CheckCancel.Error.IllegalFinancialsStatus"), e)
      }
    }
    
    function stopAndReissueCheck() {
      try {
        gw.api.util.CCLocationUtil.runAndCommit( \ -> newCheck.stopAndReissue(oldCheck), CurrentLocation )
      } catch (e : IllegalStateException) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Financials.CheckCancel.Error.IllegalFinancialsStatus"), e)
      }
    }
        
    
    
  }
  
  
}