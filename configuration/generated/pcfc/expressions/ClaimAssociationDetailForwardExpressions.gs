package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/associations/ClaimAssociationDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimAssociationDetailForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/associations/ClaimAssociationDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationDetailForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, ClaimAssociation :  ClaimAssociation) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimAssociationDetailForward.pcf: line 21, column 58
    function action_0 () : void {
      ClaimAssociationDetail.go(Claim, ClaimAssociation)
    }
    
    // 'action' attribute on ForwardCondition at ClaimAssociationDetailForward.pcf: line 23, column 45
    function action_3 () : void {
      ClaimAssociations.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimAssociationDetailForward.pcf: line 21, column 58
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimAssociationDetail.createDestination(Claim, ClaimAssociation)
    }
    
    // 'action' attribute on ForwardCondition at ClaimAssociationDetailForward.pcf: line 23, column 45
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // 'canVisit' attribute on Forward (id=ClaimAssociationDetailForward) at ClaimAssociationDetailForward.pcf: line 10, column 39
    static function canVisit_5 (Claim :  Claim, ClaimAssociation :  ClaimAssociation) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.ClaimAssociation.view
    }
    
    // 'condition' attribute on ForwardCondition at ClaimAssociationDetailForward.pcf: line 21, column 58
    function condition_2 () : java.lang.Boolean {
      return ClaimAssociation.containsClaim(Claim)
    }
    
    // 'parent' attribute on Forward (id=ClaimAssociationDetailForward) at ClaimAssociationDetailForward.pcf: line 10, column 39
    static function parent_6 (Claim :  Claim, ClaimAssociation :  ClaimAssociation) : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get ClaimAssociation () : ClaimAssociation {
      return getVariableValue("ClaimAssociation", 0) as ClaimAssociation
    }
    
    property set ClaimAssociation ($arg :  ClaimAssociation) {
      setVariableValue("ClaimAssociation", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimAssociationDetailForward {
      return super.CurrentLocation as pcf.ClaimAssociationDetailForward
    }
    
    
  }
  
  
}