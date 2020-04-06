package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripAccommodationAddressPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripAccommodationAddressPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aTripAccommodation :  TripAccommodation, aTripIncident :  TripIncident, isParentInEditMode :  Boolean) : int {
      return 0
    }
    
    static function __constructorIndex (aTripIncident :  TripIncident, isParentInEditMode :  Boolean) : int {
      return 1
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SegmentApprovalButton) at TripAccommodationAddressPopup.pcf: line 71, column 31
    function checkedRowAction_6 (element :  entity.AddnlTripAccommodation, CheckedValue :  entity.AddnlTripAccommodation) : void {
      CheckedValue.Assessment = TC_APPROVE
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AddnlAccommodationReviewButton) at TripAccommodationAddressPopup.pcf: line 79, column 31
    function checkedRowAction_7 (element :  entity.AddnlTripAccommodation, CheckedValue :  entity.AddnlTripAccommodation) : void {
      CheckedValue.Assessment = TC_REVIEW
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AddnlAccommodationDenyButton) at TripAccommodationAddressPopup.pcf: line 87, column 31
    function checkedRowAction_8 (element :  entity.AddnlTripAccommodation, CheckedValue :  entity.AddnlTripAccommodation) : void {
      CheckedValue.Assessment = TC_DENY
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AddnlAccommodationClearButton) at TripAccommodationAddressPopup.pcf: line 95, column 31
    function checkedRowAction_9 (element :  entity.AddnlTripAccommodation, CheckedValue :  entity.AddnlTripAccommodation) : void {
      CheckedValue.Assessment = null
    }
    
    // 'def' attribute on PanelRef at TripAccommodationAddressPopup.pcf: line 59, column 69
    function def_onEnter_10 (def :  pcf.AdditionalTripAccommodationLV) : void {
      def.onEnter(aTripAccommodation)
    }
    
    // 'def' attribute on PanelRef (id=ClaimPolicyTripAccommodationDetailDV) at TripAccommodationAddressPopup.pcf: line 39, column 51
    function def_onEnter_4 (def :  pcf.ClaimTripAccommodationDetailDV) : void {
      def.onEnter(aTripAccommodation, aTripIncident)
    }
    
    // 'def' attribute on PanelRef at TripAccommodationAddressPopup.pcf: line 59, column 69
    function def_refreshVariables_11 (def :  pcf.AdditionalTripAccommodationLV) : void {
      def.refreshVariables(aTripAccommodation)
    }
    
    // 'def' attribute on PanelRef (id=ClaimPolicyTripAccommodationDetailDV) at TripAccommodationAddressPopup.pcf: line 39, column 51
    function def_refreshVariables_5 (def :  pcf.ClaimTripAccommodationDetailDV) : void {
      def.refreshVariables(aTripAccommodation, aTripIncident)
    }
    
    // 'initialValue' attribute on Variable at TripAccommodationAddressPopup.pcf: line 19, column 33
    function initialValue_0 () : TripAccommodation {
      return aTripAccommodationParam == null ? initTripAccommodation() : aTripAccommodationParam
    }
    
    // 'initialValue' attribute on Variable at TripAccommodationAddressPopup.pcf: line 34, column 38
    function initialValue_1 () : AddnlTripAccommodation {
      return aTripAccommodation.AddnlTripAccommodations.length > 0 ? aTripAccommodation.AddnlTripAccommodations.first() : null
    }
    
    // 'updateLabel' attribute on EditButtons at TripAccommodationAddressPopup.pcf: line 43, column 144
    function label_3 () : java.lang.Object {
      return aTripAccommodationParam == null ? DisplayKey.get("Button.OK") : DisplayKey.get("Button.Update")
    }
    
    // 'pickValue' attribute on EditButtons at TripAccommodationAddressPopup.pcf: line 43, column 144
    function pickValue_2 () : TripAccommodation {
      return aTripAccommodation
    }
    
    // 'startInEditMode' attribute on Popup (id=TripAccommodationAddressPopup) at TripAccommodationAddressPopup.pcf: line 11, column 81
    function startInEditMode_13 () : java.lang.Boolean {
      return aTripAccommodation.PropertyName == null or isParentInEditMode == true
    }
    
    // 'visible' attribute on Card (id=AffectedTripAccommodationCard) at TripAccommodationAddressPopup.pcf: line 51, column 55
    function visible_12 () : java.lang.Boolean {
      return not aTripAccommodation.CancelOnly
    }
    
    override property get CurrentLocation () : pcf.TripAccommodationAddressPopup {
      return super.CurrentLocation as pcf.TripAccommodationAddressPopup
    }
    
    property get aTripAccommodation () : TripAccommodation {
      return getVariableValue("aTripAccommodation", 0) as TripAccommodation
    }
    
    property set aTripAccommodation ($arg :  TripAccommodation) {
      setVariableValue("aTripAccommodation", 0, $arg)
    }
    
    property get aTripAccommodationParam () : TripAccommodation {
      return getVariableValue("aTripAccommodationParam", 0) as TripAccommodation
    }
    
    property set aTripAccommodationParam ($arg :  TripAccommodation) {
      setVariableValue("aTripAccommodationParam", 0, $arg)
    }
    
    property get aTripIncident () : TripIncident {
      return getVariableValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setVariableValue("aTripIncident", 0, $arg)
    }
    
    property get anAddnlTripAccommodation () : AddnlTripAccommodation {
      return getVariableValue("anAddnlTripAccommodation", 0) as AddnlTripAccommodation
    }
    
    property set anAddnlTripAccommodation ($arg :  AddnlTripAccommodation) {
      setVariableValue("anAddnlTripAccommodation", 0, $arg)
    }
    
    property get isParentInEditMode () : Boolean {
      return getVariableValue("isParentInEditMode", 0) as Boolean
    }
    
    property set isParentInEditMode ($arg :  Boolean) {
      setVariableValue("isParentInEditMode", 0, $arg)
    }
    
    function initTripAccommodation() : TripAccommodation {
      var result = new TripAccommodation()
      result.TripIncident = aTripIncident
      return result 
    }
    
    
  }
  
  
}