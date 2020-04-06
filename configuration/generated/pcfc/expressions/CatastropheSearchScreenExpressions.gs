package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/CatastropheSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheSearchScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/CatastropheSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheSearchScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at CatastropheSearchScreen.pcf: line 18, column 56
    function initialValue_0 () : gw.api.heatmap.CatastropheSearchCriteria {
      return gw.api.heatmap.CatastropheSearchCriteria.getCriteria(enterPage, gotoCatastrophe, "catMap")
    }
    
    // 'initialValue' attribute on Variable at CatastropheSearchScreen.pcf: line 23, column 23
    function initialValue_1 () : boolean {
      return criteria.updateMapAndTable()
    }
    
    // 'initialValue' attribute on Variable at CatastropheSearchScreen.pcf: line 28, column 22
    function initialValue_2 () : String {
      return criteria.HeatMap.SelectionMessage
    }
    
    // 'initialValue' attribute on Variable at CatastropheSearchScreen.pcf: line 33, column 71
    function initialValue_3 () : gw.api.database.IQueryBeanResult<ClaimSearchView> {
      return criteria.ClaimTableData
    }
    
    // 'initialValue' attribute on Variable at CatastropheSearchScreen.pcf: line 38, column 95
    function initialValue_4 () : List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult> {
      return criteria.PolicyLocationTableData
    }
    
    // 'initialValue' attribute on Variable at CatastropheSearchScreen.pcf: line 42, column 33
    function initialValue_5 () : java.lang.Integer {
      enterPage = false; return 0
    }
    
    property get PrintTargetLv () : java.lang.String {
      return getVariableValue("PrintTargetLv", 0) as java.lang.String
    }
    
    property set PrintTargetLv ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLv", 0, $arg)
    }
    
    property get catSearchClaimResults () : gw.api.database.IQueryBeanResult<ClaimSearchView> {
      return getVariableValue("catSearchClaimResults", 0) as gw.api.database.IQueryBeanResult<ClaimSearchView>
    }
    
    property set catSearchClaimResults ($arg :  gw.api.database.IQueryBeanResult<ClaimSearchView>) {
      setVariableValue("catSearchClaimResults", 0, $arg)
    }
    
    property get catSearchPolicyLocationResults () : List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult> {
      return getVariableValue("catSearchPolicyLocationResults", 0) as List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult>
    }
    
    property set catSearchPolicyLocationResults ($arg :  List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult>) {
      setVariableValue("catSearchPolicyLocationResults", 0, $arg)
    }
    
    property get clearEnterPage () : java.lang.Integer {
      return getVariableValue("clearEnterPage", 0) as java.lang.Integer
    }
    
    property set clearEnterPage ($arg :  java.lang.Integer) {
      setVariableValue("clearEnterPage", 0, $arg)
    }
    
    property get criteria () : gw.api.heatmap.CatastropheSearchCriteria {
      return getVariableValue("criteria", 0) as gw.api.heatmap.CatastropheSearchCriteria
    }
    
    property set criteria ($arg :  gw.api.heatmap.CatastropheSearchCriteria) {
      setVariableValue("criteria", 0, $arg)
    }
    
    property get enterPage () : boolean {
      return getVariableValue("enterPage", 0) as java.lang.Boolean
    }
    
    property set enterPage ($arg :  boolean) {
      setVariableValue("enterPage", 0, $arg)
    }
    
    property get gotoCatastrophe () : Catastrophe {
      return getRequireValue("gotoCatastrophe", 0) as Catastrophe
    }
    
    property set gotoCatastrophe ($arg :  Catastrophe) {
      setRequireValue("gotoCatastrophe", 0, $arg)
    }
    
    property get mapSelectionMessage () : String {
      return getVariableValue("mapSelectionMessage", 0) as String
    }
    
    property set mapSelectionMessage ($arg :  String) {
      setVariableValue("mapSelectionMessage", 0, $arg)
    }
    
    property get updateMapAndTable () : boolean {
      return getVariableValue("updateMapAndTable", 0) as java.lang.Boolean
    }
    
    property set updateMapAndTable ($arg :  boolean) {
      setVariableValue("updateMapAndTable", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/CatastropheSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends CatastropheSearchScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=SimpleClaimSearchScreen_PrintButton) at CatastropheSearchScreen.pcf: line 107, column 31
    function action_17 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLv, DisplayKey.get("JSP.ClaimSearch.Search.Results"), null)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimSearchScreen_AssignButton) at CatastropheSearchScreen.pcf: line 100, column 31
    function allCheckedRowsAction_15 (CheckedValues :  entity.ClaimSearchView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=SimpleClaimSearchScreen_PrintButton) at CatastropheSearchScreen.pcf: line 107, column 31
    function available_16 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at CatastropheSearchScreen.pcf: line 90, column 45
    function def_onEnter_19 (def :  pcf.SimpleClaimSearchResultsLV) : void {
      def.onEnter(catSearchClaimResults)
    }
    
    // 'def' attribute on PanelRef at CatastropheSearchScreen.pcf: line 117, column 45
    function def_onEnter_23 (def :  pcf.PolicyLocationSearchResultsLV) : void {
      def.onEnter(catSearchPolicyLocationResults, criteria.SelectedCatastrophe.PolicyEffectiveDate)
    }
    
    // 'def' attribute on PanelRef at CatastropheSearchScreen.pcf: line 58, column 65
    function def_onEnter_6 (def :  pcf.CatastropheHeatMapFilterPanelSet) : void {
      def.onEnter(criteria, true)
    }
    
    // 'def' attribute on PanelRef at CatastropheSearchScreen.pcf: line 90, column 45
    function def_refreshVariables_20 (def :  pcf.SimpleClaimSearchResultsLV) : void {
      def.refreshVariables(catSearchClaimResults)
    }
    
    // 'def' attribute on PanelRef at CatastropheSearchScreen.pcf: line 117, column 45
    function def_refreshVariables_24 (def :  pcf.PolicyLocationSearchResultsLV) : void {
      def.refreshVariables(catSearchPolicyLocationResults, criteria.SelectedCatastrophe.PolicyEffectiveDate)
    }
    
    // 'def' attribute on PanelRef at CatastropheSearchScreen.pcf: line 58, column 65
    function def_refreshVariables_7 (def :  pcf.CatastropheHeatMapFilterPanelSet) : void {
      def.refreshVariables(criteria, true)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at CatastropheSearchScreen.pcf: line 56, column 83
    function maxSearchResults_26 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forClaims()
    }
    
    // TemplatePanel at CatastropheSearchScreen.pcf: line 68, column 22
    function renderCall_11 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.CatastropheSearchScreen_TemplatePanel1.render(__writer, __escaper, criteria)
    }
    
    // 'searchCriteria' attribute on SearchPanel at CatastropheSearchScreen.pcf: line 56, column 83
    function searchCriteria_28 () : java.io.Serializable {
      return null
    }
    
    // 'search' attribute on SearchPanel at CatastropheSearchScreen.pcf: line 56, column 83
    function search_27 () : java.lang.Object {
      return null as gw.api.database.IQueryBeanResult<ClaimSearchView>
    }
    
    // 'value' attribute on TextInput (id=mapSelectionMessage) at CatastropheSearchScreen.pcf: line 79, column 42
    function value_12 () : java.lang.String {
      return mapSelectionMessage
    }
    
    // 'value' attribute on TextInput (id=howToSelect) at CatastropheSearchScreen.pcf: line 65, column 270
    function value_8 () : java.lang.String {
      return criteria.HeatMap.hasPolicyLocations() ?  DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.ToChangeSelectionWithPolicyLocations") : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.ToChangeSelection")
    }
    
    // 'visible' attribute on DetailViewPanel at CatastropheSearchScreen.pcf: line 61, column 39
    function visible_10 () : java.lang.Boolean {
      return criteria.MapVisible
    }
    
    // 'visible' attribute on PanelRef at CatastropheSearchScreen.pcf: line 90, column 45
    function visible_18 () : java.lang.Boolean {
      return criteria.TableVisible
    }
    
    // 'visible' attribute on Card (id=Claims) at CatastropheSearchScreen.pcf: line 87, column 76
    function visible_21 () : java.lang.Boolean {
      return criteria.TableVisible and criteria.HeatMap.hasClaims()
    }
    
    // 'visible' attribute on Card (id=Policy) at CatastropheSearchScreen.pcf: line 114, column 85
    function visible_25 () : java.lang.Boolean {
      return criteria.TableVisible and criteria.HeatMap.hasPolicyLocations()
    }
    
    property get criteriaWrapper () : java.io.Serializable {
      return getCriteriaValue(1) as java.io.Serializable
    }
    
    property set criteriaWrapper ($arg :  java.io.Serializable) {
      setCriteriaValue(1, $arg)
    }
    
    property get dummyResults () : gw.api.database.IQueryBeanResult<ClaimSearchView> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<ClaimSearchView>
    }
    
    
  }
  
  
}