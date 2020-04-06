package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewSubroAdversePartyPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewSubroAdversePartyPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'canEdit' attribute on Popup (id=NewSubroAdversePartyPopup) at NewSubroAdversePartyPopup.pcf: line 12, column 101
    function canEdit_5 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'canVisit' attribute on Popup (id=NewSubroAdversePartyPopup) at NewSubroAdversePartyPopup.pcf: line 12, column 101
    static function canVisit_6 (claim :  Claim) : java.lang.Boolean {
      return perm.System.viewsubrodetails
    }
    
    // 'def' attribute on PanelRef at NewSubroAdversePartyPopup.pcf: line 26, column 59
    function def_onEnter_3 (def :  pcf.SubrogationPartyDetailDV) : void {
      def.onEnter(SubroAdverseParty)
    }
    
    // 'def' attribute on PanelRef at NewSubroAdversePartyPopup.pcf: line 26, column 59
    function def_refreshVariables_4 (def :  pcf.SubrogationPartyDetailDV) : void {
      def.refreshVariables(SubroAdverseParty)
    }
    
    // 'initialValue' attribute on Variable at NewSubroAdversePartyPopup.pcf: line 21, column 33
    function initialValue_0 () : SubroAdverseParty {
      return claim.newSubroAdverseParty()
    }
    
    // EditButtons at NewSubroAdversePartyPopup.pcf: line 29, column 44
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Popup (id=NewSubroAdversePartyPopup) at NewSubroAdversePartyPopup.pcf: line 12, column 101
    static function parent_7 (claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    // 'pickValue' attribute on EditButtons at NewSubroAdversePartyPopup.pcf: line 29, column 44
    function pickValue_1 () : entity.SubroAdverseParty {
      return SubroAdverseParty
    }
    
    override property get CurrentLocation () : pcf.NewSubroAdversePartyPopup {
      return super.CurrentLocation as pcf.NewSubroAdversePartyPopup
    }
    
    property get SubroAdverseParty () : SubroAdverseParty {
      return getVariableValue("SubroAdverseParty", 0) as SubroAdverseParty
    }
    
    property set SubroAdverseParty ($arg :  SubroAdverseParty) {
      setVariableValue("SubroAdverseParty", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}