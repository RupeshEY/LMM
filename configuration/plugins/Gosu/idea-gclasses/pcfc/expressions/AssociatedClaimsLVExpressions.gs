package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssociatedClaimsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssociatedClaimsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at AssociatedClaimsLV.pcf: line 30, column 43
    function sortValue_0 (ClaimAssociation :  entity.ClaimAssociation) : java.lang.Object {
      return ClaimAssociation.Title
    }
    
    // 'value' attribute on RowIterator at AssociatedClaimsLV.pcf: line 42, column 47
    function sortValue_1 (ClaimAssociation :  entity.ClaimAssociation) : java.lang.Object {
      return ClaimAssociation.ClaimAssocType
    }
    
    // 'value' attribute on RowIterator at AssociatedClaimsLV.pcf: line 23, column 45
    function value_18 () : entity.ClaimAssociation[] {
      return ClaimAssociationList
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get ClaimAssociationList () : ClaimAssociation[] {
      return getRequireValue("ClaimAssociationList", 0) as ClaimAssociation[]
    }
    
    property set ClaimAssociationList ($arg :  ClaimAssociation[]) {
      setRequireValue("ClaimAssociationList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/widgets/ClaimAssociationsWidget.xml", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimAssociationsCell (id=Claim) at ClaimAssociationsWidget.xml: line 17, column 63
    function action_8 () : void {
      ClaimInfoForward.go(claimAssoc.ClaimInfo)
    }
    
    // 'action' attribute on ClaimAssociationsCell (id=Claim) at ClaimAssociationsWidget.xml: line 17, column 63
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimInfoForward.createDestination(claimAssoc.ClaimInfo)
    }
    
    // 'label' attribute on ClaimAssociationsCell (id=Claim) at ClaimAssociationsWidget.xml: line 17, column 63
    function label_10 () : java.lang.Object {
      return claimAssoc.ClaimInfo.ClaimNumber
    }
    
    // 'visible' attribute on ClaimAssociationsCell (id=Claim) at ClaimAssociationsWidget.xml: line 18, column 125
    function visible_11 () : java.lang.Boolean {
      return claimAssoc != ClaimAssociation.ClaimsInAssoc[ClaimAssociation.ClaimsInAssoc.length - 1]
    }
    
    property get claimAssoc () : ClaimInAssociation {
      return getIteratedValue(2) as ClaimInAssociation
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AssociatedClaimsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Association) at AssociatedClaimsLV.pcf: line 30, column 43
    function action_3 () : void {
      ClaimAssociationDetail.drilldown(Claim, ClaimAssociation)
    }
    
    // 'action' attribute on TextCell (id=Association) at AssociatedClaimsLV.pcf: line 30, column 43
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimAssociationDetail.createDestination(Claim, ClaimAssociation)
    }
    
    // 'value' attribute on TextCell (id=Association) at AssociatedClaimsLV.pcf: line 30, column 43
    function valueRoot_6 () : java.lang.Object {
      return ClaimAssociation
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at AssociatedClaimsLV.pcf: line 42, column 47
    function value_15 () : typekey.ClaimAssocType {
      return ClaimAssociation.ClaimAssocType
    }
    
    // 'value' attribute on TextCell (id=Association) at AssociatedClaimsLV.pcf: line 30, column 43
    function value_2 () : java.lang.String {
      return ClaimAssociation.Title
    }
    
    // 'value' attribute on ClaimAssociationsCell (id=Claim) at AssociatedClaimsLV.pcf: line 37, column 24
    function value_7 () : entity.ClaimInAssociation[] {
      return ClaimAssociation.ClaimsInAssoc
    }
    
    property get ClaimAssociation () : entity.ClaimAssociation {
      return getIteratedValue(1) as entity.ClaimAssociation
    }
    
    
  }
  
  
}