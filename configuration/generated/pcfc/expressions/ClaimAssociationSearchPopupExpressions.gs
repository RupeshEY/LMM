package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimAssociationSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ClaimAssociationSearchPopup) at ClaimAssociationSearchPopup.pcf: line 10, column 69
    static function canVisit_6 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.ClaimAssociation.view
    }
    
    // 'parent' attribute on Popup (id=ClaimAssociationSearchPopup) at ClaimAssociationSearchPopup.pcf: line 10, column 69
    static function parent_7 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimAssociationSearchPopup {
      return super.CurrentLocation as pcf.ClaimAssociationSearchPopup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ClaimAssociationSearchPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimAssociationSearchPopup.pcf: line 26, column 75
    function def_onEnter_0 (def :  pcf.ClaimAssociationSearchDV) : void {
      def.onEnter(ClaimAssociationSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimAssociationSearchPopup.pcf: line 28, column 72
    function def_onEnter_2 (def :  pcf.ClaimAssociationsSearchResultsLV) : void {
      def.onEnter(ClaimAssociationList)
    }
    
    // 'def' attribute on PanelRef at ClaimAssociationSearchPopup.pcf: line 26, column 75
    function def_refreshVariables_1 (def :  pcf.ClaimAssociationSearchDV) : void {
      def.refreshVariables(ClaimAssociationSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimAssociationSearchPopup.pcf: line 28, column 72
    function def_refreshVariables_3 (def :  pcf.ClaimAssociationsSearchResultsLV) : void {
      def.refreshVariables(ClaimAssociationList)
    }
    
    // 'searchCriteria' attribute on SearchPanel at ClaimAssociationSearchPopup.pcf: line 24, column 48
    function searchCriteria_5 () : entity.ClaimAssociationSearchCriteria {
      return new ClaimAssociationSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at ClaimAssociationSearchPopup.pcf: line 24, column 48
    function search_4 () : java.lang.Object {
      return ClaimAssociationSearchCriteria.performSearch()
    }
    
    property get ClaimAssociationList () : ClaimAssociation[] {
      return getResultsValue(1) as ClaimAssociation[]
    }
    
    property get ClaimAssociationSearchCriteria () : entity.ClaimAssociationSearchCriteria {
      return getCriteriaValue(1) as entity.ClaimAssociationSearchCriteria
    }
    
    property set ClaimAssociationSearchCriteria ($arg :  entity.ClaimAssociationSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}