package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimUserPrintDetailsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUserPrintDetailsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, claimUserModel :  ClaimUserModel) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ClaimUserPrintDetails.pcf: line 20, column 56
    function def_onEnter_0 (def :  pcf.ClaimUserDetailDV) : void {
      def.onEnter(claimUserModel, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimUserPrintDetails.pcf: line 20, column 56
    function def_refreshVariables_1 (def :  pcf.ClaimUserDetailDV) : void {
      def.refreshVariables(claimUserModel, claim)
    }
    
    // 'parent' attribute on Page (id=ClaimUserPrintDetails) at ClaimUserPrintDetails.pcf: line 8, column 95
    static function parent_2 (claim :  Claim, claimUserModel :  ClaimUserModel) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(claim)
    }
    
    // 'title' attribute on Page (id=ClaimUserPrintDetails) at ClaimUserPrintDetails.pcf: line 8, column 95
    static function title_3 (claim :  Claim, claimUserModel :  ClaimUserModel) : java.lang.Object {
      return DisplayKey.get("Web.ClaimUsers.UserDetails.Title", claimUserModel.User)
    }
    
    override property get CurrentLocation () : pcf.ClaimUserPrintDetails {
      return super.CurrentLocation as pcf.ClaimUserPrintDetails
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get claimUserModel () : ClaimUserModel {
      return getVariableValue("claimUserModel", 0) as ClaimUserModel
    }
    
    property set claimUserModel ($arg :  ClaimUserModel) {
      setVariableValue("claimUserModel", 0, $arg)
    }
    
    
  }
  
  
}