package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimAssociationsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimAssociations_NewButton) at ClaimAssociations.pcf: line 23, column 51
    function action_1 () : void {
      NewClaimAssociation.go(Claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimAssociations_FindButton) at ClaimAssociations.pcf: line 37, column 25
    function action_5 () : void {
      ClaimAssociationSearchPopup.push(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimAssociations_NewButton) at ClaimAssociations.pcf: line 23, column 51
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewClaimAssociation.createDestination(Claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimAssociations_FindButton) at ClaimAssociations.pcf: line 37, column 25
    function action_dest_6 () : pcf.api.Destination {
      return pcf.ClaimAssociationSearchPopup.createDestination(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimAssociations) at ClaimAssociations.pcf: line 9, column 64
    static function canVisit_10 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.ClaimAssociation.view
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimAssociations_DeleteButton) at ClaimAssociations.pcf: line 31, column 51
    function checkedRowAction_4 (element :  entity.ClaimAssociation, CheckedValue :  entity.ClaimAssociation) : void {
      CheckedValue.remove()
    }
    
    // 'def' attribute on PanelRef at ClaimAssociations.pcf: line 40, column 62
    function def_onEnter_8 (def :  pcf.AssociatedClaimsLV) : void {
      def.onEnter(Claim, Claim.Associations)
    }
    
    // 'def' attribute on PanelRef at ClaimAssociations.pcf: line 40, column 62
    function def_refreshVariables_9 (def :  pcf.AssociatedClaimsLV) : void {
      def.refreshVariables(Claim, Claim.Associations)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=ClaimAssociations_FindButton) at ClaimAssociations.pcf: line 37, column 25
    function onPick_7 (PickedValue :  ClaimAssociation) : void {
      ClaimAssociationDetail.go(Claim, PickedValue, true)
    }
    
    // Page (id=ClaimAssociations) at ClaimAssociations.pcf: line 9, column 64
    static function parent_11 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimLossDetailsGroup.createDestination(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimAssociations_NewButton) at ClaimAssociations.pcf: line 23, column 51
    function visible_0 () : java.lang.Boolean {
      return perm.Claim.createassociation
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimAssociations_DeleteButton) at ClaimAssociations.pcf: line 31, column 51
    function visible_3 () : java.lang.Boolean {
      return perm.ClaimAssociation.delete
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimAssociations {
      return super.CurrentLocation as pcf.ClaimAssociations
    }
    
    
  }
  
  
}