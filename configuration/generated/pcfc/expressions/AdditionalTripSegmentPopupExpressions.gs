package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalTripSegmentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripSegmentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (addnlTripSegment :  AddnlTripSegment, affectedTripSegment :  TripSegment, isParentInEditMode :  Boolean) : int {
      return 1
    }
    
    static function __constructorIndex (affectedTripSegment :  TripSegment, isParentInEditMode :  Boolean) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at AdditionalTripSegmentPopup.pcf: line 37, column 86
    function def_onEnter_4 (def :  pcf.AdditionalTripSegmentDetailDV) : void {
      def.onEnter(addnlTripSegment, affectedTripSegment )
    }
    
    // 'def' attribute on PanelRef at AdditionalTripSegmentPopup.pcf: line 37, column 86
    function def_refreshVariables_5 (def :  pcf.AdditionalTripSegmentDetailDV) : void {
      def.refreshVariables(addnlTripSegment, affectedTripSegment )
    }
    
    // 'initialValue' attribute on Variable at AdditionalTripSegmentPopup.pcf: line 19, column 32
    function initialValue_0 () : AddnlTripSegment {
      return new AddnlTripSegment()
    }
    
    // 'initialValue' attribute on Variable at AdditionalTripSegmentPopup.pcf: line 29, column 23
    function initialValue_1 () : boolean {
      return initIsNew()
    }
    
    // 'updateLabel' attribute on EditButtons at AdditionalTripSegmentPopup.pcf: line 34, column 132
    function label_3 () : java.lang.Object {
      return isNewAddnlTripSegment ? DisplayKey.get("Button.OK") : DisplayKey.get("Button.Update")
    }
    
    // 'pickValue' attribute on EditButtons at AdditionalTripSegmentPopup.pcf: line 34, column 132
    function pickValue_2 () : AddnlTripSegment {
      return addnlTripSegment
    }
    
    // 'startInEditMode' attribute on Popup (id=AdditionalTripSegmentPopup) at AdditionalTripSegmentPopup.pcf: line 11, column 80
    function startInEditMode_6 () : java.lang.Boolean {
      return addnlTripSegment.TripSegment == null or isParentInEditMode
    }
    
    override property get CurrentLocation () : pcf.AdditionalTripSegmentPopup {
      return super.CurrentLocation as pcf.AdditionalTripSegmentPopup
    }
    
    property get addnlTripSegment () : AddnlTripSegment {
      return getVariableValue("addnlTripSegment", 0) as AddnlTripSegment
    }
    
    property set addnlTripSegment ($arg :  AddnlTripSegment) {
      setVariableValue("addnlTripSegment", 0, $arg)
    }
    
    property get affectedTripSegment () : TripSegment {
      return getVariableValue("affectedTripSegment", 0) as TripSegment
    }
    
    property set affectedTripSegment ($arg :  TripSegment) {
      setVariableValue("affectedTripSegment", 0, $arg)
    }
    
    property get isNewAddnlTripSegment () : boolean {
      return getVariableValue("isNewAddnlTripSegment", 0) as java.lang.Boolean
    }
    
    property set isNewAddnlTripSegment ($arg :  boolean) {
      setVariableValue("isNewAddnlTripSegment", 0, $arg)
    }
    
    property get isParentInEditMode () : Boolean {
      return getVariableValue("isParentInEditMode", 0) as Boolean
    }
    
    property set isParentInEditMode ($arg :  Boolean) {
      setVariableValue("isParentInEditMode", 0, $arg)
    }
    
    function initIsNew() : boolean {
      var result : boolean = false
      if (addnlTripSegment.TripSegment == null) {
        result = true
        addnlTripSegment.TripSegment = affectedTripSegment
      }
      return result
    }
    
    
  }
  
  
}