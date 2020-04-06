package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamClaimRemoveFlagPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamClaimRemoveFlagPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, ViaTeamScreen :  Boolean) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Popup (id=TeamClaimRemoveFlagPopup) at TeamClaimRemoveFlagPopup.pcf: line 10, column 61
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      Claim.clearFlag(RemoveFlagInfo.note)
    }
    
    // 'def' attribute on PanelRef at TeamClaimRemoveFlagPopup.pcf: line 33, column 71
    function def_onEnter_1 (def :  pcf.RemoveFlagInfoDV) : void {
      def.onEnter(RemoveFlagInfo, Claim, ViaTeamScreen)
    }
    
    // 'def' attribute on PanelRef at TeamClaimRemoveFlagPopup.pcf: line 33, column 71
    function def_refreshVariables_2 (def :  pcf.RemoveFlagInfoDV) : void {
      def.refreshVariables(RemoveFlagInfo, Claim, ViaTeamScreen)
    }
    
    // 'initialValue' attribute on Variable at TeamClaimRemoveFlagPopup.pcf: line 21, column 30
    function initialValue_0 () : RemoveFlagInfo {
      return new RemoveFlagInfo()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TeamClaimRemoveFlagPopup {
      return super.CurrentLocation as pcf.TeamClaimRemoveFlagPopup
    }
    
    property get RemoveFlagInfo () : RemoveFlagInfo {
      return getVariableValue("RemoveFlagInfo", 0) as RemoveFlagInfo
    }
    
    property set RemoveFlagInfo ($arg :  RemoveFlagInfo) {
      setVariableValue("RemoveFlagInfo", 0, $arg)
    }
    
    property get ViaTeamScreen () : Boolean {
      return getVariableValue("ViaTeamScreen", 0) as Boolean
    }
    
    property set ViaTeamScreen ($arg :  Boolean) {
      setVariableValue("ViaTeamScreen", 0, $arg)
    }
    
    
  }
  
  
}