package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ReopenClaimPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReopenClaimPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ReopenClaimPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenClaimPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=ReopenClaimPopup) at ReopenClaimPopup.pcf: line 11, column 70
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      reopenClaimInfo.beforeCommit()
    }
    
    // 'def' attribute on PanelRef at ReopenClaimPopup.pcf: line 28, column 51
    function def_onEnter_1 (def :  pcf.ReopenClaimInfoDV) : void {
      def.onEnter(reopenClaimInfo)
    }
    
    // 'def' attribute on PanelRef at ReopenClaimPopup.pcf: line 28, column 51
    function def_refreshVariables_2 (def :  pcf.ReopenClaimInfoDV) : void {
      def.refreshVariables(reopenClaimInfo)
    }
    
    // 'initialValue' attribute on Variable at ReopenClaimPopup.pcf: line 20, column 31
    function initialValue_0 () : ReopenClaimInfo {
      return createInfo()
    }
    
    // 'parent' attribute on Popup (id=ReopenClaimPopup) at ReopenClaimPopup.pcf: line 11, column 70
    static function parent_4 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'title' attribute on Popup (id=ReopenClaimPopup) at ReopenClaimPopup.pcf: line 11, column 70
    static function title_5 (Claim :  Claim) : java.lang.Object {
      return DisplayKey.get("JSP.ReopenClaim.Title", Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ReopenClaimPopup {
      return super.CurrentLocation as pcf.ReopenClaimPopup
    }
    
    property get reopenClaimInfo () : ReopenClaimInfo {
      return getVariableValue("reopenClaimInfo", 0) as ReopenClaimInfo
    }
    
    property set reopenClaimInfo ($arg :  ReopenClaimInfo) {
      setVariableValue("reopenClaimInfo", 0, $arg)
    }
    
    
    function createInfo() : ReopenClaimInfo {
            var info = new ReopenClaimInfo();
            info.Claim = Claim;
            return info;
          }
        
    
    
  }
  
  
}