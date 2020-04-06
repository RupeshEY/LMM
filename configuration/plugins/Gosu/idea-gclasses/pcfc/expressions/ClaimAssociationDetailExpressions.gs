package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimAssociationDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, ClaimAssociation :  ClaimAssociation) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, ClaimAssociation :  ClaimAssociation, startInEditMode :  boolean) : int {
      return 1
    }
    
    // 'afterCommit' attribute on Page (id=ClaimAssociationDetail) at ClaimAssociationDetail.pcf: line 14, column 64
    function afterCommit_3 (TopLocation :  pcf.api.Location) : void {
      ClaimAssociationDetailForward.go(Claim, ClaimAssociation)
    }
    
    // 'canEdit' attribute on Page (id=ClaimAssociationDetail) at ClaimAssociationDetail.pcf: line 14, column 64
    function canEdit_4 () : java.lang.Boolean {
      return perm.ClaimAssociation.edit
    }
    
    // 'canVisit' attribute on Page (id=ClaimAssociationDetail) at ClaimAssociationDetail.pcf: line 14, column 64
    static function canVisit_5 (Claim :  Claim, ClaimAssociation :  ClaimAssociation, startInEditMode :  boolean) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.ClaimAssociation.view
    }
    
    // 'def' attribute on PanelRef at ClaimAssociationDetail.pcf: line 35, column 59
    function def_onEnter_1 (def :  pcf.ClaimAssociationDetailDV) : void {
      def.onEnter(ClaimAssociation)
    }
    
    // 'def' attribute on PanelRef at ClaimAssociationDetail.pcf: line 35, column 59
    function def_refreshVariables_2 (def :  pcf.ClaimAssociationDetailDV) : void {
      def.refreshVariables(ClaimAssociation)
    }
    
    // EditButtons at ClaimAssociationDetail.pcf: line 32, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=ClaimAssociationDetail) at ClaimAssociationDetail.pcf: line 14, column 64
    static function parent_6 (Claim :  Claim, ClaimAssociation :  ClaimAssociation, startInEditMode :  boolean) : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // 'startEditing' attribute on Page (id=ClaimAssociationDetail) at ClaimAssociationDetail.pcf: line 14, column 64
    function startEditing_7 () : void {
      ClaimAssociation.addClaimIfNotPresent(Claim)
    }
    
    // 'startInEditMode' attribute on Page (id=ClaimAssociationDetail) at ClaimAssociationDetail.pcf: line 14, column 64
    function startInEditMode_8 () : java.lang.Boolean {
      return  startInEditMode and perm.ClaimAssociation.edit
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
    
    override property get CurrentLocation () : pcf.ClaimAssociationDetail {
      return super.CurrentLocation as pcf.ClaimAssociationDetail
    }
    
    property get startInEditMode () : boolean {
      return getVariableValue("startInEditMode", 0) as java.lang.Boolean
    }
    
    property set startInEditMode ($arg :  boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    
  }
  
  
}