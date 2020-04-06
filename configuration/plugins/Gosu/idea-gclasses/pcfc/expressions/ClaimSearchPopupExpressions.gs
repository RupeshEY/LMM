package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterEnter' attribute on Popup (id=ClaimSearchPopup) at ClaimSearchPopup.pcf: line 13, column 76
    function afterEnter_2 () : void {
      gw.api.claim.ClaimUtil.ensureClaimSearchCriteriaHasActiveDatabaseSelected()
    }
    
    // 'canVisit' attribute on Popup (id=ClaimSearchPopup) at ClaimSearchPopup.pcf: line 13, column 76
    static function canVisit_3 () : java.lang.Boolean {
      return perm.Claim.genericviewclaim and perm.System.viewsearch
    }
    
    // 'def' attribute on ScreenRef at ClaimSearchPopup.pcf: line 15, column 39
    function def_onEnter_0 (def :  pcf.ClaimSearchScreen) : void {
      def.onEnter(false)
    }
    
    // 'def' attribute on ScreenRef at ClaimSearchPopup.pcf: line 15, column 39
    function def_refreshVariables_1 (def :  pcf.ClaimSearchScreen) : void {
      def.refreshVariables(false)
    }
    
    override property get CurrentLocation () : pcf.ClaimSearchPopup {
      return super.CurrentLocation as pcf.ClaimSearchPopup
    }
    
    
  }
  
  
}