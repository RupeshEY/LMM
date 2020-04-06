package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationAddressPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalTripAccommodationAddressPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationAddressPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripAccommodationAddressPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (anAddnlTripAccommodation :  AddnlTripAccommodation, affectedTripAccommodation :  TripAccommodation, isParentInEditMode :  Boolean) : int {
      return 0
    }
    
    // 'def' attribute on InputSetRef at AdditionalTripAccommodationAddressPopup.pcf: line 37, column 124
    function def_onEnter_3 (def :  pcf.AdditionalTripAccommodationInputSet) : void {
      def.onEnter(anAddnlTripAccommodation, affectedTripAccommodation.TripIncident)
    }
    
    // 'def' attribute on InputSetRef at AdditionalTripAccommodationAddressPopup.pcf: line 37, column 124
    function def_refreshVariables_4 (def :  pcf.AdditionalTripAccommodationInputSet) : void {
      def.refreshVariables(anAddnlTripAccommodation, affectedTripAccommodation.TripIncident)
    }
    
    // 'initialValue' attribute on Variable at AdditionalTripAccommodationAddressPopup.pcf: line 26, column 23
    function initialValue_0 () : boolean {
      return initIsNew()
    }
    
    // 'updateLabel' attribute on EditButtons at AdditionalTripAccommodationAddressPopup.pcf: line 31, column 138
    function label_2 () : java.lang.Object {
      return isNewAddnlTripAccommodation ? DisplayKey.get("Button.OK") : DisplayKey.get("Button.Update")
    }
    
    // 'pickValue' attribute on EditButtons at AdditionalTripAccommodationAddressPopup.pcf: line 31, column 138
    function pickValue_1 () : AddnlTripAccommodation {
      return anAddnlTripAccommodation
    }
    
    // 'startInEditMode' attribute on Popup (id=AdditionalTripAccommodationAddressPopup) at AdditionalTripAccommodationAddressPopup.pcf: line 11, column 86
    function startInEditMode_5 () : java.lang.Boolean {
      return isParentInEditMode
    }
    
    override property get CurrentLocation () : pcf.AdditionalTripAccommodationAddressPopup {
      return super.CurrentLocation as pcf.AdditionalTripAccommodationAddressPopup
    }
    
    property get affectedTripAccommodation () : TripAccommodation {
      return getVariableValue("affectedTripAccommodation", 0) as TripAccommodation
    }
    
    property set affectedTripAccommodation ($arg :  TripAccommodation) {
      setVariableValue("affectedTripAccommodation", 0, $arg)
    }
    
    property get anAddnlTripAccommodation () : AddnlTripAccommodation {
      return getVariableValue("anAddnlTripAccommodation", 0) as AddnlTripAccommodation
    }
    
    property set anAddnlTripAccommodation ($arg :  AddnlTripAccommodation) {
      setVariableValue("anAddnlTripAccommodation", 0, $arg)
    }
    
    property get isNewAddnlTripAccommodation () : boolean {
      return getVariableValue("isNewAddnlTripAccommodation", 0) as java.lang.Boolean
    }
    
    property set isNewAddnlTripAccommodation ($arg :  boolean) {
      setVariableValue("isNewAddnlTripAccommodation", 0, $arg)
    }
    
    property get isParentInEditMode () : Boolean {
      return getVariableValue("isParentInEditMode", 0) as Boolean
    }
    
    property set isParentInEditMode ($arg :  Boolean) {
      setVariableValue("isParentInEditMode", 0, $arg)
    }
    
    
    function initIsNew() : boolean {
      var result : boolean = false
      if (anAddnlTripAccommodation.TripAccommodation == null) {
        result = true
        anAddnlTripAccommodation.TripAccommodation = affectedTripAccommodation
      }
      return result
    }
          
        
    
    
  }
  
  
}