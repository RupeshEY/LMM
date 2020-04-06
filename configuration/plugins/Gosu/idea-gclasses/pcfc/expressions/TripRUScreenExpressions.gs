package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripRUScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripRUScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripRUScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripRUScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=PolicyTripCoverageLDVPanel) at TripRUScreen.pcf: line 64, column 40
    function def_onEnter_25 (def :  pcf.PolicyTripCoverageLDV) : void {
      def.onEnter(aTripRU)
    }
    
    // 'def' attribute on PanelRef (id=PolicyTripCoverageLDVPanel) at TripRUScreen.pcf: line 64, column 40
    function def_refreshVariables_26 (def :  pcf.PolicyTripCoverageLDV) : void {
      def.refreshVariables(aTripRU)
    }
    
    // 'value' attribute on TypeKeyInput (id=GeographicalRegion) at TripRUScreen.pcf: line 44, column 51
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripRU.GeographicalRegion = (__VALUE_TO_SET as typekey.GeographicalRegion)
    }
    
    // 'value' attribute on DateInput (id=StartDate) at TripRUScreen.pcf: line 51, column 38
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripRU.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=EndDate) at TripRUScreen.pcf: line 59, column 36
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripRU.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=RUNumber) at TripRUScreen.pcf: line 31, column 42
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripRU.RUNumber = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=TripDescription) at TripRUScreen.pcf: line 36, column 44
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripRU.TripDescription = (__VALUE_TO_SET as java.lang.String)
    }
    
    // EditButtons at TripRUScreen.pcf: line 22, column 30
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at TripRUScreen.pcf: line 22, column 30
    function pickValue_0 () : TripRU {
      return aTripRU
    }
    
    // 'validationExpression' attribute on DateInput (id=EndDate) at TripRUScreen.pcf: line 59, column 36
    function validationExpression_19 () : java.lang.Object {
      return aTripRU.EndDate < aTripRU.StartDate ? DisplayKey.get("Web.ClaimPolicy.Trips.EndDate.InvalidEndDateBeforeStartDate") : null
    }
    
    // 'value' attribute on TextInput (id=RUNumber) at TripRUScreen.pcf: line 31, column 42
    function valueRoot_6 () : java.lang.Object {
      return aTripRU
    }
    
    // 'value' attribute on TypeKeyInput (id=GeographicalRegion) at TripRUScreen.pcf: line 44, column 51
    function value_11 () : typekey.GeographicalRegion {
      return aTripRU.GeographicalRegion
    }
    
    // 'value' attribute on DateInput (id=StartDate) at TripRUScreen.pcf: line 51, column 38
    function value_15 () : java.util.Date {
      return aTripRU.StartDate
    }
    
    // 'value' attribute on DateInput (id=EndDate) at TripRUScreen.pcf: line 59, column 36
    function value_20 () : java.util.Date {
      return aTripRU.EndDate
    }
    
    // 'value' attribute on TextInput (id=RUNumber) at TripRUScreen.pcf: line 31, column 42
    function value_3 () : java.lang.Integer {
      return aTripRU.RUNumber
    }
    
    // 'value' attribute on TextInput (id=TripDescription) at TripRUScreen.pcf: line 36, column 44
    function value_7 () : java.lang.String {
      return aTripRU.TripDescription
    }
    
    // 'editVisible' attribute on EditButtons at TripRUScreen.pcf: line 22, column 30
    function visible_1 () : java.lang.Boolean {
      return !aClaim.Policy.Verified and perm.Policy.edit(aClaim)
    }
    
    property get aClaim () : Claim {
      return getRequireValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setRequireValue("aClaim", 0, $arg)
    }
    
    property get aTripRU () : TripRU {
      return getRequireValue("aTripRU", 0) as TripRU
    }
    
    property set aTripRU ($arg :  TripRU) {
      setRequireValue("aTripRU", 0, $arg)
    }
    
    property get aTripRUParam () : TripRU {
      return getRequireValue("aTripRUParam", 0) as TripRU
    }
    
    property set aTripRUParam ($arg :  TripRU) {
      setRequireValue("aTripRUParam", 0, $arg)
    }
    
    property get startEditable () : Boolean {
      return getRequireValue("startEditable", 0) as Boolean
    }
    
    property set startEditable ($arg :  Boolean) {
      setRequireValue("startEditable", 0, $arg)
    }
    
    
  }
  
  
}