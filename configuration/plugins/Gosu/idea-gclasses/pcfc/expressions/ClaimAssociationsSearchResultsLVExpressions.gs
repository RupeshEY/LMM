package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationsSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimAssociationsSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationsSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationsSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimAssociationsSearchResultsLV.pcf: line 22, column 43
    function sortValue_0 (ClaimAssociation :  entity.ClaimAssociation) : java.lang.Object {
      return ClaimAssociation.Title
    }
    
    // 'value' attribute on RowIterator at ClaimAssociationsSearchResultsLV.pcf: line 27, column 47
    function sortValue_1 (ClaimAssociation :  entity.ClaimAssociation) : java.lang.Object {
      return ClaimAssociation.ClaimAssocType
    }
    
    // 'value' attribute on RowIterator at ClaimAssociationsSearchResultsLV.pcf: line 16, column 45
    function value_17 () : entity.ClaimAssociation[] {
      return ClaimAssociationList
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
    
    // 'action' attribute on ClaimAssociationsCell (id=Claims) at ClaimAssociationsWidget.xml: line 17, column 63
    function action_9 () : void {
      ClaimInfoForward.go(claimAssoc.ClaimInfo)
    }
    
    // 'action' attribute on ClaimAssociationsCell (id=Claims) at ClaimAssociationsWidget.xml: line 17, column 63
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimInfoForward.createDestination(claimAssoc.ClaimInfo)
    }
    
    // 'label' attribute on ClaimAssociationsCell (id=Claims) at ClaimAssociationsWidget.xml: line 17, column 63
    function label_11 () : java.lang.Object {
      return claimAssoc.ClaimInfo.ClaimNumber
    }
    
    // 'visible' attribute on ClaimAssociationsCell (id=Claims) at ClaimAssociationsWidget.xml: line 18, column 125
    function visible_12 () : java.lang.Boolean {
      return claimAssoc != ClaimAssociation.ClaimsInAssoc[ClaimAssociation.ClaimsInAssoc.length - 1]
    }
    
    property get claimAssoc () : ClaimInAssociation {
      return getIteratedValue(2) as ClaimInAssociation
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationsSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimAssociationsSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickValue' attribute on RowIterator at ClaimAssociationsSearchResultsLV.pcf: line 16, column 45
    function pickValue_16 () : ClaimAssociation {
      return ClaimAssociation
    }
    
    // 'value' attribute on TextCell (id=Association) at ClaimAssociationsSearchResultsLV.pcf: line 22, column 43
    function valueRoot_4 () : java.lang.Object {
      return ClaimAssociation
    }
    
    // 'value' attribute on TextCell (id=Association) at ClaimAssociationsSearchResultsLV.pcf: line 22, column 43
    function value_2 () : java.lang.String {
      return ClaimAssociation.Title
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at ClaimAssociationsSearchResultsLV.pcf: line 27, column 47
    function value_5 () : typekey.ClaimAssocType {
      return ClaimAssociation.ClaimAssocType
    }
    
    // 'value' attribute on ClaimAssociationsCell (id=Claims) at ClaimAssociationsSearchResultsLV.pcf: line 34, column 24
    function value_8 () : entity.ClaimInAssociation[] {
      return ClaimAssociation.ClaimsInAssoc
    }
    
    property get ClaimAssociation () : entity.ClaimAssociation {
      return getIteratedValue(1) as entity.ClaimAssociation
    }
    
    
  }
  
  
}