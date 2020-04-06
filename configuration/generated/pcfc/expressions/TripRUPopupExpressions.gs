package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripRUPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripRUPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripRUPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripRUPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aClaim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (aClaim :  Claim, aTripRUParam :  TripRU, startEditable :  Boolean) : int {
      return 1
    }
    
    // 'def' attribute on ScreenRef at TripRUPopup.pcf: line 31, column 73
    function def_onEnter_1 (def :  pcf.TripRUScreen) : void {
      def.onEnter(aClaim, startEditable, aTripRU, aTripRUParam)
    }
    
    // 'def' attribute on ScreenRef at TripRUPopup.pcf: line 31, column 73
    function def_refreshVariables_2 (def :  pcf.TripRUScreen) : void {
      def.refreshVariables(aClaim, startEditable, aTripRU, aTripRUParam)
    }
    
    // 'initialValue' attribute on Variable at TripRUPopup.pcf: line 26, column 22
    function initialValue_0 () : TripRU {
      return aTripRUParam == null ?  addRUToPolicy()  : aTripRUParam
    }
    
    // 'startInEditMode' attribute on Popup (id=TripRUPopup) at TripRUPopup.pcf: line 11, column 161
    function startInEditMode_3 () : java.lang.Boolean {
      return aTripRUParam == null or startEditable == true
    }
    
    // 'title' attribute on Popup (id=TripRUPopup) at TripRUPopup.pcf: line 11, column 161
    static function title_4 (aClaim :  Claim, aTripRUParam :  TripRU, startEditable :  Boolean) : java.lang.Object {
      return aTripRUParam != null ? DisplayKey.get("Web.ClaimPolicy.Trips.TripPopup") : DisplayKey.get("Web.ClaimPolicy.Trips.NewTripPopup")
    }
    
    override property get CurrentLocation () : pcf.TripRUPopup {
      return super.CurrentLocation as pcf.TripRUPopup
    }
    
    property get aClaim () : Claim {
      return getVariableValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setVariableValue("aClaim", 0, $arg)
    }
    
    property get aTripRU () : TripRU {
      return getVariableValue("aTripRU", 0) as TripRU
    }
    
    property set aTripRU ($arg :  TripRU) {
      setVariableValue("aTripRU", 0, $arg)
    }
    
    property get aTripRUParam () : TripRU {
      return getVariableValue("aTripRUParam", 0) as TripRU
    }
    
    property set aTripRUParam ($arg :  TripRU) {
      setVariableValue("aTripRUParam", 0, $arg)
    }
    
    property get startEditable () : Boolean {
      return getVariableValue("startEditable", 0) as Boolean
    }
    
    property set startEditable ($arg :  Boolean) {
      setVariableValue("startEditable", 0, $arg)
    }
    
    function addRUToPolicy() : TripRU {
        var newTripRU = new TripRU()
        aClaim.Policy.addToRiskUnitsAndAssignRUNumber( newTripRU )
        return newTripRU
      }
    
    
  }
  
  
}