package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.util.LocationUtil
uses java.util.Date
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/AdminCatastrophePolicyPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminCatastrophePolicyPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/AdminCatastrophePolicyPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminCatastrophePolicyPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=PolicyEffectiveDate) at AdminCatastrophePolicyPanelSet.pcf: line 42, column 51
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      catastrophe.PolicyEffectiveDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'initialValue' attribute on Variable at AdminCatastrophePolicyPanelSet.pcf: line 18, column 56
    function initialValue_0 () : gw.api.heatmap.CatastropheSearchCriteria {
      return gw.api.heatmap.CatastropheSearchCriteria.getCriteria(enterPage, catastrophe, "CatPolicyMap")
    }
    
    // 'initialValue' attribute on Variable at AdminCatastrophePolicyPanelSet.pcf: line 23, column 23
    function initialValue_1 () : boolean {
      return criteria.updateMapAndTable()
    }
    
    // 'initialValue' attribute on Variable at AdminCatastrophePolicyPanelSet.pcf: line 28, column 32
    function initialValue_2 () : java.lang.String {
      return criteria.HeatMap.SelectionMessage
    }
    
    // 'initialValue' attribute on Variable at AdminCatastrophePolicyPanelSet.pcf: line 32, column 33
    function initialValue_3 () : java.lang.Integer {
      enterPage = false; return 0
    }
    
    // 'onChange' attribute on PostOnChange at AdminCatastrophePolicyPanelSet.pcf: line 44, column 53
    function onChange_4 () : void {
      setPolicyRetrievalSetTime()
    }
    
    // 'value' attribute on DateInput (id=PolicyEffectiveDate) at AdminCatastrophePolicyPanelSet.pcf: line 42, column 51
    function valueRoot_8 () : java.lang.Object {
      return catastrophe
    }
    
    // 'value' attribute on DateInput (id=PolicyRetrievalCompletionTime) at AdminCatastrophePolicyPanelSet.pcf: line 56, column 72
    function value_12 () : java.util.Date {
      return catastrophe.PolicyRetrievalCompletionTime
    }
    
    // 'value' attribute on DateInput (id=PolicyEffectiveDate) at AdminCatastrophePolicyPanelSet.pcf: line 42, column 51
    function value_5 () : java.util.Date {
      return catastrophe.PolicyEffectiveDate
    }
    
    // 'value' attribute on TextInput (id=Status) at AdminCatastrophePolicyPanelSet.pcf: line 49, column 38
    function value_9 () : java.lang.String {
      return retrievalStatus()
    }
    
    // 'visible' attribute on DateInput (id=PolicyRetrievalCompletionTime) at AdminCatastrophePolicyPanelSet.pcf: line 56, column 72
    function visible_11 () : java.lang.Boolean {
      return catastrophe.PolicyRetrievalCompletionTime != null
    }
    
    // 'visible' attribute on TextInput (id=PolicyRetrievalCompletionTimeNever) at AdminCatastrophePolicyPanelSet.pcf: line 61, column 72
    function visible_16 () : java.lang.Boolean {
      return catastrophe.PolicyRetrievalCompletionTime == null
    }
    
    property get catastrophe () : Catastrophe {
      return getRequireValue("catastrophe", 0) as Catastrophe
    }
    
    property set catastrophe ($arg :  Catastrophe) {
      setRequireValue("catastrophe", 0, $arg)
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
    
    property get mapSelectionMessage () : java.lang.String {
      return getVariableValue("mapSelectionMessage", 0) as java.lang.String
    }
    
    property set mapSelectionMessage ($arg :  java.lang.String) {
      setVariableValue("mapSelectionMessage", 0, $arg)
    }
    
    property get updateMapAndTable () : boolean {
      return getVariableValue("updateMapAndTable", 0) as java.lang.Boolean
    }
    
    property set updateMapAndTable ($arg :  boolean) {
      setVariableValue("updateMapAndTable", 0, $arg)
    }
    
    
    function setPolicyRetrievalSetTime() {
      catastrophe.PolicyRetrievalSetTime = java.util.Date.CurrentDate
    }
    
    function retrievalStatus() : String {
      if (catastrophe.PolicyEffectiveDate == null) {
        if (criteria.HeatMap.AreaOfInterestPoint1 == null) {
          return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.SetEffDateAndAreaOfInterest")
        } else {
          return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PleaseSetEffDate")
        }
      } else if (criteria.HeatMap.AreaOfInterestPoint1 == null) {
          return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PleaseSetAreaOfInterest")
      } else {
        if (catastrophe.PolicyRetrievalCompletionTime == null) {
          return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.WaitingToRetrieve")
        } else if (catastrophe.PolicyRetrievalSetTime > catastrophe.PolicyRetrievalCompletionTime) {
          return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.WaitingToRetrieveUpdated")
        } else {
          return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PolicyRetrievalComplete")
        }
      }
    }
    
      // set the catastrophe area of interest from the selection
      function setCatastropheAreaOfInterest() {
        if (not CurrentLocation.InEditMode) {
          LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PleaseClickEdit"))
          return
        }
        var HeatMap = criteria.HeatMap
        if (HeatMap.SelectionPoint1 != null) {
          setPolicyRetrievalSetTime()
          if (HeatMap.SelectionPoint1.Lat == HeatMap.SelectionPoint2.Lat or HeatMap.SelectionPoint1.Long == HeatMap.SelectionPoint2.Long) {
            LocationUtil.addRequestScopedErrorMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NonZeroHeightAndWidth"))
            return
          } 
          criteria.AreaOfInterestPoint1 = HeatMap.SelectionPoint1
          criteria.AreaOfInterestPoint2 = HeatMap.SelectionPoint2
          updateCatastropheAreaOfInterest()
          HeatMap.setSelection(null, null)
        } else {
          LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PleaseSelectArea"))
        }
      }
    
      function updateCatastropheAreaOfInterest() {
        catastrophe.PolicyRetrievalSetTime = Date.CurrentDate
    
        catastrophe.TopLeftLatitude = criteria.AreaOfInterestPoint1.Lat
        catastrophe.TopLeftLongitude = criteria.AreaOfInterestPoint1.Long
        catastrophe.BottomRightLatitude = criteria.AreaOfInterestPoint2.Lat
        catastrophe.BottomRightLongitude = criteria.AreaOfInterestPoint2.Long
      }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/AdminCatastrophePolicyPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends AdminCatastrophePolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=SetCatastropheZone) at AdminCatastrophePolicyPanelSet.pcf: line 86, column 77
    function action_22 () : void {
      setCatastropheAreaOfInterest()
    }
    
    // 'def' attribute on PanelRef at AdminCatastrophePolicyPanelSet.pcf: line 76, column 66
    function def_onEnter_18 (def :  pcf.CatastropheHeatMapFilterPanelSet) : void {
      def.onEnter(criteria, false)
    }
    
    // 'def' attribute on PanelRef at AdminCatastrophePolicyPanelSet.pcf: line 76, column 66
    function def_refreshVariables_19 (def :  pcf.CatastropheHeatMapFilterPanelSet) : void {
      def.refreshVariables(criteria, false)
    }
    
    // TemplatePanel at AdminCatastrophePolicyPanelSet.pcf: line 94, column 22
    function renderCall_24 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.AdminCatastrophePolicyPanelSet_TemplatePanel1.render(__writer, __escaper, criteria)
    }
    
    // 'search' attribute on SearchPanel at AdminCatastrophePolicyPanelSet.pcf: line 74, column 34
    function search_25 () : java.lang.Object {
      return null
    }
    
    // 'visible' attribute on ButtonInput (id=SetCatastropheZone) at AdminCatastrophePolicyPanelSet.pcf: line 86, column 77
    function visible_20 () : java.lang.Boolean {
      return perm.Catastrophe.edit and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on DetailViewPanel at AdminCatastrophePolicyPanelSet.pcf: line 79, column 39
    function visible_23 () : java.lang.Boolean {
      return criteria.MapVisible
    }
    
    property get searchCriteria () : java.lang.String {
      return getCriteriaValue(1) as java.lang.String
    }
    
    property set searchCriteria ($arg :  java.lang.String) {
      setCriteriaValue(1, $arg)
    }
    
    property get searchResults () : String {
      return getResultsValue(1) as String
    }
    
    
  }
  
  
}