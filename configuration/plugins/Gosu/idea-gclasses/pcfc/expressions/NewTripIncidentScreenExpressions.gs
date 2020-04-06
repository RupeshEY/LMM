package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewTripIncidentScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanel2ExpressionsImpl extends ListDetailPanel2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AddnlAccommodationApprovalButton) at NewTripIncidentScreen.pcf: line 339, column 41
    function checkedRowAction_62 (element :  entity.AddnlTripAccommodation, CheckedValue :  entity.AddnlTripAccommodation) : void {
      CheckedValue.Assessment = TC_APPROVE
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AddnlAccommodationReviewButton) at NewTripIncidentScreen.pcf: line 347, column 41
    function checkedRowAction_63 (element :  entity.AddnlTripAccommodation, CheckedValue :  entity.AddnlTripAccommodation) : void {
      CheckedValue.Assessment = TC_REVIEW
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AddnlAccommodationDenyButton) at NewTripIncidentScreen.pcf: line 355, column 41
    function checkedRowAction_64 (element :  entity.AddnlTripAccommodation, CheckedValue :  entity.AddnlTripAccommodation) : void {
      CheckedValue.Assessment = TC_DENY
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AddnlAccommodationClearButton) at NewTripIncidentScreen.pcf: line 363, column 41
    function checkedRowAction_65 (element :  entity.AddnlTripAccommodation, CheckedValue :  entity.AddnlTripAccommodation) : void {
      CheckedValue.Assessment = null
    }
    
    // 'def' attribute on ListViewInput (id=AdditionalTripAccommodationLV_Panel) at NewTripIncidentScreen.pcf: line 327, column 73
    function def_onEnter_67 (def :  pcf.AdditionalTripAccommodationLV) : void {
      def.onEnter(eachTripAccommodation)
    }
    
    // 'def' attribute on InputSetRef at NewTripIncidentScreen.pcf: line 369, column 73
    function def_onEnter_71 (def :  pcf.AdditionalTripAccommodationInputSet) : void {
      def.onEnter(getFirstAddnlTripAccommodation, aTripIncident)
    }
    
    // 'def' attribute on ListViewInput (id=AdditionalTripAccommodationLV_Panel) at NewTripIncidentScreen.pcf: line 327, column 73
    function def_refreshVariables_68 (def :  pcf.AdditionalTripAccommodationLV) : void {
      def.refreshVariables(eachTripAccommodation)
    }
    
    // 'def' attribute on InputSetRef at NewTripIncidentScreen.pcf: line 369, column 73
    function def_refreshVariables_72 (def :  pcf.AdditionalTripAccommodationInputSet) : void {
      def.refreshVariables(getFirstAddnlTripAccommodation, aTripIncident)
    }
    
    // 'editable' attribute on InputSetRef at NewTripIncidentScreen.pcf: line 369, column 73
    function editable_69 () : java.lang.Boolean {
      return getFirstAddnlTripAccommodation != null
    }
    
    // 'initialValue' attribute on Variable at NewTripIncidentScreen.pcf: line 318, column 52
    function initialValue_61 () : AddnlTripAccommodation {
      return eachTripAccommodation.AddnlTripAccommodations.length == 1 ? eachTripAccommodation.AddnlTripAccommodations.first() : null
    }
    
    // 'visible' attribute on ListViewInput (id=AdditionalTripAccommodationLV_Panel) at NewTripIncidentScreen.pcf: line 327, column 73
    function visible_66 () : java.lang.Boolean {
      return getFirstAddnlTripAccommodation == null 
    }
    
    property get getFirstAddnlTripAccommodation () : AddnlTripAccommodation {
      return getVariableValue("getFirstAddnlTripAccommodation", 2) as AddnlTripAccommodation
    }
    
    property set getFirstAddnlTripAccommodation ($arg :  AddnlTripAccommodation) {
      setVariableValue("getFirstAddnlTripAccommodation", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanelExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentApprovalButton) at NewTripIncidentScreen.pcf: line 209, column 41
    function checkedRowAction_43 (element :  entity.AddnlTripSegment, CheckedValue :  entity.AddnlTripSegment) : void {
      CheckedValue.Assessment = TC_APPROVE
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentReviewButton) at NewTripIncidentScreen.pcf: line 217, column 41
    function checkedRowAction_44 (element :  entity.AddnlTripSegment, CheckedValue :  entity.AddnlTripSegment) : void {
      CheckedValue.Assessment = TC_REVIEW
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentDenyButton) at NewTripIncidentScreen.pcf: line 225, column 41
    function checkedRowAction_45 (element :  entity.AddnlTripSegment, CheckedValue :  entity.AddnlTripSegment) : void {
      CheckedValue.Assessment = TC_DENY
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentClearButton) at NewTripIncidentScreen.pcf: line 233, column 41
    function checkedRowAction_46 (element :  entity.AddnlTripSegment, CheckedValue :  entity.AddnlTripSegment) : void {
      CheckedValue.Assessment = null
    }
    
    // 'def' attribute on ListViewInput (id=AdditionalTripSegmentLV_Panel) at NewTripIncidentScreen.pcf: line 197, column 64
    function def_onEnter_48 (def :  pcf.AdditionalTripSegmentLV) : void {
      def.onEnter(eachTripSegment)
    }
    
    // 'def' attribute on InputSetRef at NewTripIncidentScreen.pcf: line 238, column 64
    function def_onEnter_51 (def :  pcf.AdditionalTripSegmentInputSet) : void {
      def.onEnter(firstAddnlTripSegment, aTripIncident)
    }
    
    // 'def' attribute on ListViewInput (id=AdditionalTripSegmentLV_Panel) at NewTripIncidentScreen.pcf: line 197, column 64
    function def_refreshVariables_49 (def :  pcf.AdditionalTripSegmentLV) : void {
      def.refreshVariables(eachTripSegment)
    }
    
    // 'def' attribute on InputSetRef at NewTripIncidentScreen.pcf: line 238, column 64
    function def_refreshVariables_52 (def :  pcf.AdditionalTripSegmentInputSet) : void {
      def.refreshVariables(firstAddnlTripSegment, aTripIncident)
    }
    
    // 'initialValue' attribute on Variable at NewTripIncidentScreen.pcf: line 188, column 46
    function initialValue_42 () : AddnlTripSegment {
      return eachTripSegment.AddnlTripSegments.length == 1 ? eachTripSegment.AddnlTripSegments.first() : null
    }
    
    // 'visible' attribute on ListViewInput (id=AdditionalTripSegmentLV_Panel) at NewTripIncidentScreen.pcf: line 197, column 64
    function visible_47 () : java.lang.Boolean {
      return firstAddnlTripSegment == null 
    }
    
    // 'visible' attribute on InputSetRef at NewTripIncidentScreen.pcf: line 238, column 64
    function visible_50 () : java.lang.Boolean {
      return firstAddnlTripSegment != null
    }
    
    property get firstAddnlTripSegment () : AddnlTripSegment {
      return getVariableValue("firstAddnlTripSegment", 2) as AddnlTripSegment
    }
    
    property set firstAddnlTripSegment ($arg :  AddnlTripSegment) {
      setVariableValue("firstAddnlTripSegment", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel2ExpressionsImpl extends NewTripIncidentScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AccommodationApprovalButton) at NewTripIncidentScreen.pcf: line 279, column 31
    function checkedRowAction_55 (element :  entity.TripAccommodation, CheckedValue :  entity.TripAccommodation) : void {
      CheckedValue.Assessment = TC_APPROVE
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AccommodationReviewButton) at NewTripIncidentScreen.pcf: line 287, column 31
    function checkedRowAction_56 (element :  entity.TripAccommodation, CheckedValue :  entity.TripAccommodation) : void {
      CheckedValue.Assessment = TC_REVIEW
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AccommodationDenyButton) at NewTripIncidentScreen.pcf: line 295, column 31
    function checkedRowAction_57 (element :  entity.TripAccommodation, CheckedValue :  entity.TripAccommodation) : void {
      CheckedValue.Assessment = TC_DENY
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AccommodationClearButton) at NewTripIncidentScreen.pcf: line 303, column 31
    function checkedRowAction_58 (element :  entity.TripAccommodation, CheckedValue :  entity.TripAccommodation) : void {
      CheckedValue.Assessment = null
    }
    
    // 'def' attribute on PanelRef (id=TripIncidentAffectedAccommodationLV) at NewTripIncidentScreen.pcf: line 262, column 54
    function def_onEnter_59 (def :  pcf.TripIncidentAccommodationsLV) : void {
      def.onEnter(aTripIncident)
    }
    
    // 'def' attribute on PanelRef (id=TripIncidentAffectedAccommodationLV) at NewTripIncidentScreen.pcf: line 262, column 54
    function def_refreshVariables_60 (def :  pcf.TripIncidentAccommodationsLV) : void {
      def.refreshVariables(aTripIncident)
    }
    
    // 'visible' attribute on Card (id=AffectedTripAccommodationCard) at NewTripIncidentScreen.pcf: line 311, column 85
    function visible_73 () : java.lang.Boolean {
      return eachTripAccommodation.AddnlTripAccommodations.length > 0
    }
    
    property get eachTripAccommodation () : TripAccommodation {
      return getCurrentSelection(1) as TripAccommodation
    }
    
    property set eachTripAccommodation ($arg :  TripAccommodation) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends NewTripIncidentScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentApprovalButton) at NewTripIncidentScreen.pcf: line 149, column 31
    function checkedRowAction_36 (element :  entity.TripSegment, CheckedValue :  entity.TripSegment) : void {
      CheckedValue.Assessment = TC_APPROVE
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentReviewButton) at NewTripIncidentScreen.pcf: line 157, column 31
    function checkedRowAction_37 (element :  entity.TripSegment, CheckedValue :  entity.TripSegment) : void {
      CheckedValue.Assessment = TC_REVIEW
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentDenyButton) at NewTripIncidentScreen.pcf: line 165, column 31
    function checkedRowAction_38 (element :  entity.TripSegment, CheckedValue :  entity.TripSegment) : void {
      CheckedValue.Assessment = TC_DENY
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentClearButton) at NewTripIncidentScreen.pcf: line 173, column 31
    function checkedRowAction_39 (element :  entity.TripSegment, CheckedValue :  entity.TripSegment) : void {
      CheckedValue.Assessment = null
    }
    
    // 'def' attribute on PanelRef (id=TripIncidentAffectedSegmentLV) at NewTripIncidentScreen.pcf: line 132, column 48
    function def_onEnter_40 (def :  pcf.TripIncidentSegmentsLV) : void {
      def.onEnter(aTripIncident)
    }
    
    // 'def' attribute on PanelRef (id=TripIncidentAffectedSegmentLV) at NewTripIncidentScreen.pcf: line 132, column 48
    function def_refreshVariables_41 (def :  pcf.TripIncidentSegmentsLV) : void {
      def.refreshVariables(aTripIncident)
    }
    
    // 'visible' attribute on Card (id=AdditionalTripSegmentCard) at NewTripIncidentScreen.pcf: line 181, column 73
    function visible_53 () : java.lang.Boolean {
      return eachTripSegment.AddnlTripSegments.length > 0
    }
    
    property get eachTripSegment () : TripSegment {
      return getCurrentSelection(1) as TripSegment
    }
    
    property set eachTripSegment ($arg :  TripSegment) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewTripIncidentScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at NewTripIncidentScreen.pcf: line 110, column 127
    function def_onEnter_33 (def :  pcf.OtherServicesLVInputSet) : void {
      def.onEnter(aTripIncident.Claim, aTripIncident, aTripIncident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on InputSetRef at NewTripIncidentScreen.pcf: line 110, column 127
    function def_refreshVariables_34 (def :  pcf.OtherServicesLVInputSet) : void {
      def.refreshVariables(aTripIncident.Claim, aTripIncident, aTripIncident.ServiceRequests.toSet(), null, {})
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at NewTripIncidentScreen.pcf: line 66, column 50
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=TripRU) at NewTripIncidentScreen.pcf: line 36, column 41
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripIncident.TripRU = (__VALUE_TO_SET as entity.TripRU)
    }
    
    // 'icon' attribute on TitleBar at NewTripIncidentScreen.pcf: line 15, column 40
    function icon_0 () : java.lang.String {
      return aTripIncident.HeaderIcon
    }
    
    // EditButtons at NewTripIncidentScreen.pcf: line 18, column 36
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewTripIncidentScreen.pcf: line 18, column 36
    function pickValue_1 () : TripIncident {
      return aTripIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=TripRU) at NewTripIncidentScreen.pcf: line 36, column 41
    function valueRange_7 () : java.lang.Object {
      return aTripIncident.Claim.Policy.getRiskUnits( TripRU )
    }
    
    // 'value' attribute on TypeKeyInput (id=GeographicalRegion) at NewTripIncidentScreen.pcf: line 43, column 55
    function valueRoot_12 () : java.lang.Object {
      return aTripIncident.TripRU
    }
    
    // 'value' attribute on RangeInput (id=TripRU) at NewTripIncidentScreen.pcf: line 36, column 41
    function valueRoot_6 () : java.lang.Object {
      return aTripIncident
    }
    
    // 'value' attribute on TypeKeyInput (id=GeographicalRegion) at NewTripIncidentScreen.pcf: line 43, column 55
    function value_10 () : typekey.GeographicalRegion {
      return aTripIncident.TripRU.GeographicalRegion
    }
    
    // 'value' attribute on DateInput (id=StartDate) at NewTripIncidentScreen.pcf: line 47, column 55
    function value_13 () : java.util.Date {
      return aTripIncident.TripRU.StartDate
    }
    
    // 'value' attribute on DateInput (id=EndDate) at NewTripIncidentScreen.pcf: line 51, column 53
    function value_16 () : java.util.Date {
      return aTripIncident.TripRU.EndDate
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at NewTripIncidentScreen.pcf: line 66, column 50
    function value_19 () : java.lang.String {
      return aTripIncident.Description
    }
    
    // 'value' attribute on CurrencyInput (id=SegmentTotalIncurred) at NewTripIncidentScreen.pcf: line 79, column 94
    function value_23 () : gw.api.financials.CurrencyAmount {
      return aTripIncident.getSegmentsFinancialImpact(AssessmentAction.TC_APPROVE)
    }
    
    // 'value' attribute on CurrencyInput (id=TripTotalIncurred) at NewTripIncidentScreen.pcf: line 84, column 100
    function value_25 () : gw.api.financials.CurrencyAmount {
      return aTripIncident.getAccommodationsFinancialImpact(AssessmentAction.TC_APPROVE)
    }
    
    // 'value' attribute on CurrencyInput (id=AccommodationTotalIncurred) at NewTripIncidentScreen.pcf: line 90, column 91
    function value_27 () : gw.api.financials.CurrencyAmount {
      return aTripIncident.getTotalFinancialImpact(AssessmentAction.TC_APPROVE)
    }
    
    // 'value' attribute on RangeInput (id=TripRU) at NewTripIncidentScreen.pcf: line 36, column 41
    function value_3 () : entity.TripRU {
      return aTripIncident.TripRU
    }
    
    // 'valueRange' attribute on RangeInput (id=TripRU) at NewTripIncidentScreen.pcf: line 36, column 41
    function verifyValueRangeIsAllowedType_8 ($$arg :  entity.TripRU[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripRU) at NewTripIncidentScreen.pcf: line 36, column 41
    function verifyValueRangeIsAllowedType_8 ($$arg :  gw.api.database.IQueryBeanResult<entity.TripRU>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripRU) at NewTripIncidentScreen.pcf: line 36, column 41
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripRU) at NewTripIncidentScreen.pcf: line 36, column 41
    function verifyValueRange_9 () : void {
      var __valueRangeArg = aTripIncident.Claim.Policy.getRiskUnits( TripRU )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at NewTripIncidentScreen.pcf: line 103, column 53
    function visible_29 () : java.lang.Boolean {
      return aTripIncident.Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at NewTripIncidentScreen.pcf: line 108, column 88
    function visible_31 () : java.lang.Boolean {
      return not aTripIncident.Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on PanelDivider at NewTripIncidentScreen.pcf: line 114, column 47
    function visible_35 () : java.lang.Boolean {
      return aTripIncident.TripRU != null
    }
    
    property get aTripIncident () : TripIncident {
      return getRequireValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setRequireValue("aTripIncident", 0, $arg)
    }
    
    property get checkedTripSegments () : TripSegment[] {
      return getRequireValue("checkedTripSegments", 0) as TripSegment[]
    }
    
    property set checkedTripSegments ($arg :  TripSegment[]) {
      setRequireValue("checkedTripSegments", 0, $arg)
    }
    
    
  }
  
  
}