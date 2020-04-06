package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyEndorsementDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyEndorsementDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Endorsement :  Endorsement) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyEndorsementDetail) at ClaimPolicyEndorsementDetail.pcf: line 10, column 75
    function canEdit_2 () : java.lang.Boolean {
      return perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyEndorsementDetail.pcf: line 23, column 49
    function def_onEnter_0 (def :  pcf.EndorsementDetailDV) : void {
      def.onEnter(Endorsement)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyEndorsementDetail.pcf: line 23, column 49
    function def_refreshVariables_1 (def :  pcf.EndorsementDetailDV) : void {
      def.refreshVariables(Endorsement)
    }
    
    // 'parent' attribute on Page (id=ClaimPolicyEndorsementDetail) at ClaimPolicyEndorsementDetail.pcf: line 10, column 75
    static function parent_3 (Claim :  Claim, Endorsement :  Endorsement) : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsements.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyEndorsementDetail {
      return super.CurrentLocation as pcf.ClaimPolicyEndorsementDetail
    }
    
    property get Endorsement () : Endorsement {
      return getVariableValue("Endorsement", 0) as Endorsement
    }
    
    property set Endorsement ($arg :  Endorsement) {
      setVariableValue("Endorsement", 0, $arg)
    }
    
    
  }
  
  
}