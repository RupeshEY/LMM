package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimAssociationExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimAssociationExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewClaimAssociation) at NewClaimAssociation.pcf: line 14, column 64
    function afterCancel_4 () : void {
      ClaimAssociations.go(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewClaimAssociation) at NewClaimAssociation.pcf: line 14, column 64
    function afterCancel_dest_5 () : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // 'afterCommit' attribute on Page (id=NewClaimAssociation) at NewClaimAssociation.pcf: line 14, column 64
    function afterCommit_6 (TopLocation :  pcf.api.Location) : void {
      ClaimAssociations.go(Claim)
    }
    
    // 'canVisit' attribute on Page (id=NewClaimAssociation) at NewClaimAssociation.pcf: line 14, column 64
    static function canVisit_7 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.Claim.createassociation
    }
    
    // 'def' attribute on PanelRef at NewClaimAssociation.pcf: line 30, column 59
    function def_onEnter_2 (def :  pcf.ClaimAssociationDetailDV) : void {
      def.onEnter(ClaimAssociation)
    }
    
    // 'def' attribute on PanelRef at NewClaimAssociation.pcf: line 30, column 59
    function def_refreshVariables_3 (def :  pcf.ClaimAssociationDetailDV) : void {
      def.refreshVariables(ClaimAssociation)
    }
    
    // 'initialValue' attribute on Variable at NewClaimAssociation.pcf: line 23, column 32
    function initialValue_0 () : ClaimAssociation {
      return Claim.createClaimAssociation(true)
    }
    
    // EditButtons at NewClaimAssociation.pcf: line 27, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=NewClaimAssociation) at NewClaimAssociation.pcf: line 14, column 64
    static function parent_8 (Claim :  Claim) : pcf.api.Destination {
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
    
    override property get CurrentLocation () : pcf.NewClaimAssociation {
      return super.CurrentLocation as pcf.NewClaimAssociation
    }
    
    
  }
  
  
}