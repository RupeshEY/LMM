package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubroAdversePartyDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubroAdversePartyDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (party :  SubroAdverseParty) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=SubroAdversePartyDetail) at SubroAdversePartyDetail.pcf: line 11, column 31
    function canEdit_3 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'canVisit' attribute on Page (id=SubroAdversePartyDetail) at SubroAdversePartyDetail.pcf: line 11, column 31
    static function canVisit_4 (party :  SubroAdverseParty) : java.lang.Boolean {
      return perm.Claim.view(party.SubrogationSummary.Claim) and perm.System.viewsubrodetails
    }
    
    // 'def' attribute on PanelRef at SubroAdversePartyDetail.pcf: line 22, column 48
    function def_onEnter_1 (def :  pcf.SubrogationPartyDetailDV) : void {
      def.onEnter(party)
    }
    
    // 'def' attribute on PanelRef at SubroAdversePartyDetail.pcf: line 22, column 48
    function def_refreshVariables_2 (def :  pcf.SubrogationPartyDetailDV) : void {
      def.refreshVariables(party)
    }
    
    // EditButtons at SubroAdversePartyDetail.pcf: line 19, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=SubroAdversePartyDetail) at SubroAdversePartyDetail.pcf: line 11, column 31
    static function parent_5 (party :  SubroAdverseParty) : pcf.api.Destination {
      return pcf.SubrogationGeneral.createDestination(party.SubrogationSummary.Claim)
    }
    
    // 'title' attribute on Page (id=SubroAdversePartyDetail) at SubroAdversePartyDetail.pcf: line 11, column 31
    static function title_6 (party :  SubroAdverseParty) : java.lang.Object {
      return party.DisplayName
    }
    
    override property get CurrentLocation () : pcf.SubroAdversePartyDetail {
      return super.CurrentLocation as pcf.SubroAdversePartyDetail
    }
    
    property get party () : SubroAdverseParty {
      return getVariableValue("party", 0) as SubroAdverseParty
    }
    
    property set party ($arg :  SubroAdverseParty) {
      setVariableValue("party", 0, $arg)
    }
    
    
  }
  
  
}