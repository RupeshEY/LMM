package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripSegmentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripSegmentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aTripSegmentParam :  TripSegment, aTripIncident :  TripIncident, startEditable :  Boolean) : int {
      return 0
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentApprovalButton) at TripSegmentPopup.pcf: line 71, column 31
    function checkedRowAction_6 (element :  entity.AddnlTripSegment, CheckedValue :  entity.AddnlTripSegment) : void {
      CheckedValue.Assessment = TC_APPROVE
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentReviewlButton) at TripSegmentPopup.pcf: line 79, column 31
    function checkedRowAction_7 (element :  entity.AddnlTripSegment, CheckedValue :  entity.AddnlTripSegment) : void {
      CheckedValue.Assessment = TC_REVIEW
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentDenyButton) at TripSegmentPopup.pcf: line 87, column 31
    function checkedRowAction_8 (element :  entity.AddnlTripSegment, CheckedValue :  entity.AddnlTripSegment) : void {
      CheckedValue.Assessment = TC_DENY
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentClearButton) at TripSegmentPopup.pcf: line 95, column 31
    function checkedRowAction_9 (element :  entity.AddnlTripSegment, CheckedValue :  entity.AddnlTripSegment) : void {
      CheckedValue.Assessment = null
    }
    
    // 'def' attribute on PanelRef at TripSegmentPopup.pcf: line 59, column 57
    function def_onEnter_10 (def :  pcf.AdditionalTripSegmentLV) : void {
      def.onEnter(aTripSegment)
    }
    
    // 'def' attribute on PanelRef (id=ClaimTripSegmentDetailDV) at TripSegmentPopup.pcf: line 39, column 39
    function def_onEnter_4 (def :  pcf.ClaimTripSegmentDetailDV) : void {
      def.onEnter(aTripSegment, aTripIncident)
    }
    
    // 'def' attribute on PanelRef at TripSegmentPopup.pcf: line 59, column 57
    function def_refreshVariables_11 (def :  pcf.AdditionalTripSegmentLV) : void {
      def.refreshVariables(aTripSegment)
    }
    
    // 'def' attribute on PanelRef (id=ClaimTripSegmentDetailDV) at TripSegmentPopup.pcf: line 39, column 39
    function def_refreshVariables_5 (def :  pcf.ClaimTripSegmentDetailDV) : void {
      def.refreshVariables(aTripSegment, aTripIncident)
    }
    
    // 'initialValue' attribute on Variable at TripSegmentPopup.pcf: line 23, column 27
    function initialValue_0 () : TripSegment {
      return aTripSegmentParam == null ? initTripSegment() : aTripSegmentParam
    }
    
    // 'initialValue' attribute on Variable at TripSegmentPopup.pcf: line 35, column 32
    function initialValue_1 () : AddnlTripSegment {
      return aTripSegment.AddnlTripSegments.length > 0 ? aTripSegment.AddnlTripSegments.first() : null
    }
    
    // 'updateLabel' attribute on EditButtons at TripSegmentPopup.pcf: line 43, column 138
    function label_3 () : java.lang.Object {
      return aTripSegmentParam == null ? DisplayKey.get("Button.OK") : DisplayKey.get("Button.Update")
    }
    
    // 'pickValue' attribute on EditButtons at TripSegmentPopup.pcf: line 43, column 138
    function pickValue_2 () : TripSegment {
      return aTripSegment
    }
    
    // 'startInEditMode' attribute on Popup (id=TripSegmentPopup) at TripSegmentPopup.pcf: line 11, column 64
    function startInEditMode_13 () : java.lang.Boolean {
      return startEditable
    }
    
    // 'visible' attribute on Card (id=RebookedTransportationCard) at TripSegmentPopup.pcf: line 51, column 49
    function visible_12 () : java.lang.Boolean {
      return not aTripSegment.CancelOnly
    }
    
    override property get CurrentLocation () : pcf.TripSegmentPopup {
      return super.CurrentLocation as pcf.TripSegmentPopup
    }
    
    property get aTripIncident () : TripIncident {
      return getVariableValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setVariableValue("aTripIncident", 0, $arg)
    }
    
    property get aTripSegment () : TripSegment {
      return getVariableValue("aTripSegment", 0) as TripSegment
    }
    
    property set aTripSegment ($arg :  TripSegment) {
      setVariableValue("aTripSegment", 0, $arg)
    }
    
    property get aTripSegmentParam () : TripSegment {
      return getVariableValue("aTripSegmentParam", 0) as TripSegment
    }
    
    property set aTripSegmentParam ($arg :  TripSegment) {
      setVariableValue("aTripSegmentParam", 0, $arg)
    }
    
    property get anAddnlTripSegment () : AddnlTripSegment {
      return getVariableValue("anAddnlTripSegment", 0) as AddnlTripSegment
    }
    
    property set anAddnlTripSegment ($arg :  AddnlTripSegment) {
      setVariableValue("anAddnlTripSegment", 0, $arg)
    }
    
    property get cancellationOnly () : Boolean {
      return getVariableValue("cancellationOnly", 0) as Boolean
    }
    
    property set cancellationOnly ($arg :  Boolean) {
      setVariableValue("cancellationOnly", 0, $arg)
    }
    
    property get startEditable () : Boolean {
      return getVariableValue("startEditable", 0) as Boolean
    }
    
    property set startEditable ($arg :  Boolean) {
      setVariableValue("startEditable", 0, $arg)
    }
    
    function initTripSegment() : TripSegment {
      var result = new TripSegment()
      result.TripIncident = aTripIncident
      return result 
    }
    
    
  }
  
  
}