package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/CatastropheHeatMapFilterPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheHeatMapFilterPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/CatastropheHeatMapFilterPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheHeatMapFilterPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 10, column 49
    function action_38 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 13, column 49
    function action_40 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 10, column 49
    function action_dest_39 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 13, column 49
    function action_dest_41 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'value' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      criteria.HeatMap.MapViewDropdown = (__VALUE_TO_SET as gw.api.heatmap.CatastropheHeatMapViews.CatastropheHeatMapView)
    }
    
    // 'value' attribute on RangeInput (id=ClaimStatus) at CatastropheHeatMapFilterPanelSet.pcf: line 56, column 52
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      criteria.HeatMap.ClaimState = (__VALUE_TO_SET as typekey.ClaimState)
    }
    
    // 'value' attribute on RangeInput (id=ReportedDate) at CatastropheHeatMapFilterPanelSet.pcf: line 69, column 52
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      criteria.HeatMap.ReportedDateRange = (__VALUE_TO_SET as typekey.DateRangeChoiceType)
    }
    
    // 'value' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      criteria.SelectedCatastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      criteria.HeatMap.AssignedToGroup = __VALUE_TO_SET
    }
    
    // 'value' attribute on RangeInput (id=PolicyLocationFilter) at CatastropheHeatMapFilterPanelSet.pcf: line 95, column 61
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      criteria.HeatMap.PolicyLocations = (__VALUE_TO_SET as gw.api.heatmap.CatastropheSearchCriteria.PolicyGroupFilter)
    }
    
    // 'editable' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function editable_0 () : java.lang.Boolean {
      return allowCatastropheSelection
    }
    
    // 'noneSelectedLabel' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function noneSelectedLabel_13 () : java.lang.String {
      return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.Claims")
    }
    
    // 'optionLabel' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function optionLabel_14 (VALUE :  gw.api.heatmap.CatastropheHeatMapViews.CatastropheHeatMapView) : java.lang.String {
      return VALUE.FilterOptionLabel
    }
    
    // 'valueRange' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function valueRange_15 () : java.lang.Object {
      return criteria.HeatMap.MapViews.AvailableViews
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimStatus) at CatastropheHeatMapFilterPanelSet.pcf: line 56, column 52
    function valueRange_24 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableClaimStates()
    }
    
    // 'valueRange' attribute on RangeInput (id=ReportedDate) at CatastropheHeatMapFilterPanelSet.pcf: line 69, column 52
    function valueRange_33 () : java.lang.Object {
      return criteria.dateFilterChoices()
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function valueRange_46 () : java.lang.Object {
      return criteria.groupFilterChoices()
    }
    
    // 'valueRange' attribute on RangeInput (id=PolicyLocationFilter) at CatastropheHeatMapFilterPanelSet.pcf: line 95, column 61
    function valueRange_58 () : java.lang.Object {
      return criteria.policyLocationFilterChoices()
    }
    
    // 'valueRange' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function valueRange_6 () : java.lang.Object {
      return gw.api.database.Query.make(entity.Catastrophe).compare("Active", Equals, Boolean.TRUE).select()
    }
    
    // 'value' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function valueRoot_12 () : java.lang.Object {
      return criteria.HeatMap
    }
    
    // 'value' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function valueRoot_5 () : java.lang.Object {
      return criteria
    }
    
    // 'value' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function value_1 () : entity.Catastrophe {
      return criteria.SelectedCatastrophe
    }
    
    // 'value' attribute on RangeInput (id=ClaimStatus) at CatastropheHeatMapFilterPanelSet.pcf: line 56, column 52
    function value_19 () : typekey.ClaimState {
      return criteria.HeatMap.ClaimState
    }
    
    // 'value' attribute on RangeInput (id=ReportedDate) at CatastropheHeatMapFilterPanelSet.pcf: line 69, column 52
    function value_28 () : typekey.DateRangeChoiceType {
      return criteria.HeatMap.ReportedDateRange
    }
    
    // 'value' attribute on GroupInput (id=AssignedToGroup) at CatastropheHeatMapFilterPanelSet.pcf: line 82, column 52
    function value_37 () : java.lang.Object {
      return criteria.HeatMap.AssignedToGroup
    }
    
    // 'value' attribute on RangeInput (id=PolicyLocationFilter) at CatastropheHeatMapFilterPanelSet.pcf: line 95, column 61
    function value_53 () : gw.api.heatmap.CatastropheSearchCriteria.PolicyGroupFilter {
      return criteria.HeatMap.PolicyLocations
    }
    
    // 'value' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function value_9 () : gw.api.heatmap.CatastropheHeatMapViews.CatastropheHeatMapView {
      return criteria.HeatMap.MapViewDropdown
    }
    
    // 'valueRange' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.heatmap.CatastropheHeatMapViews.CatastropheHeatMapView[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimStatus) at CatastropheHeatMapFilterPanelSet.pcf: line 56, column 52
    function verifyValueRangeIsAllowedType_25 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimStatus) at CatastropheHeatMapFilterPanelSet.pcf: line 56, column 52
    function verifyValueRangeIsAllowedType_25 ($$arg :  typekey.ClaimState[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ReportedDate) at CatastropheHeatMapFilterPanelSet.pcf: line 69, column 52
    function verifyValueRangeIsAllowedType_34 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ReportedDate) at CatastropheHeatMapFilterPanelSet.pcf: line 69, column 52
    function verifyValueRangeIsAllowedType_34 ($$arg :  typekey.DateRangeChoiceType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.lang.Object[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PolicyLocationFilter) at CatastropheHeatMapFilterPanelSet.pcf: line 95, column 61
    function verifyValueRangeIsAllowedType_59 ($$arg :  gw.api.heatmap.CatastropheSearchCriteria.PolicyGroupFilter[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PolicyLocationFilter) at CatastropheHeatMapFilterPanelSet.pcf: line 95, column 61
    function verifyValueRangeIsAllowedType_59 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function verifyValueRangeIsAllowedType_7 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function verifyValueRangeIsAllowedType_7 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ImageToDisplay) at CatastropheHeatMapFilterPanelSet.pcf: line 38, column 87
    function verifyValueRange_17 () : void {
      var __valueRangeArg = criteria.HeatMap.MapViews.AvailableViews
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimStatus) at CatastropheHeatMapFilterPanelSet.pcf: line 56, column 52
    function verifyValueRange_26 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableClaimStates()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_25(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ReportedDate) at CatastropheHeatMapFilterPanelSet.pcf: line 69, column 52
    function verifyValueRange_35 () : void {
      var __valueRangeArg = criteria.dateFilterChoices()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_34(__valueRangeArg)
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_48 () : void {
      var __valueRangeArg = criteria.groupFilterChoices()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_47(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=PolicyLocationFilter) at CatastropheHeatMapFilterPanelSet.pcf: line 95, column 61
    function verifyValueRange_60 () : void {
      var __valueRangeArg = criteria.policyLocationFilterChoices()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_59(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=catastrophe) at CatastropheHeatMapFilterPanelSet.pcf: line 25, column 44
    function verifyValueRange_8 () : void {
      var __valueRangeArg = gw.api.database.Query.make(entity.Catastrophe).compare("Active", Equals, Boolean.TRUE).select()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_7(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=ClaimStatus) at CatastropheHeatMapFilterPanelSet.pcf: line 56, column 52
    function visible_18 () : java.lang.Boolean {
      return criteria.HeatMap.hasClaims()
    }
    
    // 'visible' attribute on RangeInput (id=PolicyLocationFilter) at CatastropheHeatMapFilterPanelSet.pcf: line 95, column 61
    function visible_52 () : java.lang.Boolean {
      return criteria.HeatMap.hasPolicyLocations()
    }
    
    property get allowCatastropheSelection () : boolean {
      return getRequireValue("allowCatastropheSelection", 0) as java.lang.Boolean
    }
    
    property set allowCatastropheSelection ($arg :  boolean) {
      setRequireValue("allowCatastropheSelection", 0, $arg)
    }
    
    property get criteria () : gw.api.heatmap.CatastropheSearchCriteria {
      return getRequireValue("criteria", 0) as gw.api.heatmap.CatastropheSearchCriteria
    }
    
    property set criteria ($arg :  gw.api.heatmap.CatastropheSearchCriteria) {
      setRequireValue("criteria", 0, $arg)
    }
    
    
  }
  
  
}