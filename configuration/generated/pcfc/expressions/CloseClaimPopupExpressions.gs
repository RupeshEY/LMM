package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/CloseClaimPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CloseClaimPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/CloseClaimPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseClaimPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=CloseClaimPopup) at CloseClaimPopup.pcf: line 12, column 69
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      closeClaimInfo.beforeCommit()
    }
    
    // 'def' attribute on PanelRef at CloseClaimPopup.pcf: line 31, column 49
    function def_onEnter_2 (def :  pcf.CloseClaimInfoDV) : void {
      def.onEnter(closeClaimInfo)
    }
    
    // 'def' attribute on PanelRef at CloseClaimPopup.pcf: line 31, column 49
    function def_refreshVariables_3 (def :  pcf.CloseClaimInfoDV) : void {
      def.refreshVariables(closeClaimInfo)
    }
    
    // 'initialValue' attribute on Variable at CloseClaimPopup.pcf: line 21, column 30
    function initialValue_0 () : CloseClaimInfo {
      return createInfo()
    }
    
    // 'parent' attribute on Popup (id=CloseClaimPopup) at CloseClaimPopup.pcf: line 12, column 69
    static function parent_5 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'showUpdateConfirmMessage' attribute on EditButtons at CloseClaimPopup.pcf: line 28, column 75
    function showConfirmMessage_1 () : java.lang.Boolean {
      return Claim.hasAwaitingSubmissionPaymentsForToday()
    }
    
    // 'title' attribute on Popup (id=CloseClaimPopup) at CloseClaimPopup.pcf: line 12, column 69
    static function title_6 (Claim :  Claim) : java.lang.Object {
      return DisplayKey.get("JSP.CloseClaim.Title", Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CloseClaimPopup {
      return super.CurrentLocation as pcf.CloseClaimPopup
    }
    
    property get closeClaimInfo () : CloseClaimInfo {
      return getVariableValue("closeClaimInfo", 0) as CloseClaimInfo
    }
    
    property set closeClaimInfo ($arg :  CloseClaimInfo) {
      setVariableValue("closeClaimInfo", 0, $arg)
    }
    
    function createInfo() : CloseClaimInfo {
            var info = new CloseClaimInfo();
            info.Claim = Claim;
            return info;
          }
    
    
  }
  
  
}