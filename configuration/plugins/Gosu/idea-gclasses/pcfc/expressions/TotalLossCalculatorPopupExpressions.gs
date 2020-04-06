package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TotalLossCalculatorPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalLossCalculatorPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (VehicleIncident :  VehicleIncident) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=TotalLossCalculatorPopup) at TotalLossCalculatorPopup.pcf: line 10, column 76
    function beforeCommit_98 (pickedValue :  java.lang.Object) : void {
      VehicleIncident.TotalLossCalculatorPreUpdate()
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAge5Years) at TotalLossCalculatorPopup.pcf: line 84, column 55
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleAge5Years = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAge10Years) at TotalLossCalculatorPopup.pcf: line 90, column 56
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleAge10Years = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Mileage100K) at TotalLossCalculatorPopup.pcf: line 96, column 50
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Mileage100K = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Extrication) at TotalLossCalculatorPopup.pcf: line 107, column 50
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Extrication = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleRollOver) at TotalLossCalculatorPopup.pcf: line 122, column 54
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleRollOver = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnDash) at TotalLossCalculatorPopup.pcf: line 132, column 51
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.FireBurnDash = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnEngine) at TotalLossCalculatorPopup.pcf: line 138, column 53
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.FireBurnEngine = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnWindshield) at TotalLossCalculatorPopup.pcf: line 144, column 57
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.FireBurnWindshield = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleSubmerged) at TotalLossCalculatorPopup.pcf: line 154, column 55
    function defaultSetter_72 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleSubmerged = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaterLevelDash) at TotalLossCalculatorPopup.pcf: line 160, column 53
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.WaterLevelDash = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FloodSaltWater) at TotalLossCalculatorPopup.pcf: line 166, column 53
    function defaultSetter_80 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.FloodSaltWater = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaterLevelSeats) at TotalLossCalculatorPopup.pcf: line 172, column 54
    function defaultSetter_84 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.WaterLevelSeats = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ComponentsMissing) at TotalLossCalculatorPopup.pcf: line 182, column 56
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.ComponentsMissing = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InteriorMissing) at TotalLossCalculatorPopup.pcf: line 188, column 54
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.InteriorMissing = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AirbagsMissing) at TotalLossCalculatorPopup.pcf: line 194, column 53
    function defaultSetter_96 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.AirbagsMissing = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'filter' attribute on TypeKeyInput (id=VehicleLicensePlateState) at TotalLossCalculatorPopup.pcf: line 60, column 47
    function filter_25 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_VEHICLE_REG)
    }
    
    // EditButtons at TotalLossCalculatorPopup.pcf: line 18, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'value' attribute on TextInput (id=TotalLossPoints) at TotalLossCalculatorPopup.pcf: line 68, column 44
    function valueRoot_28 () : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=VehicleYear) at TotalLossCalculatorPopup.pcf: line 29, column 44
    function valueRoot_3 () : java.lang.Object {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on TextInput (id=VehicleYear) at TotalLossCalculatorPopup.pcf: line 29, column 44
    function value_1 () : java.lang.Integer {
      return VehicleIncident.Vehicle.Year
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleStyle) at TotalLossCalculatorPopup.pcf: line 42, column 47
    function value_10 () : typekey.VehicleStyle {
      return VehicleIncident.Vehicle.Style
    }
    
    // 'value' attribute on TextInput (id=VehicleColor) at TotalLossCalculatorPopup.pcf: line 46, column 52
    function value_13 () : java.lang.String {
      return VehicleIncident.Vehicle.Color
    }
    
    // 'value' attribute on TextInput (id=VehicleVin) at TotalLossCalculatorPopup.pcf: line 50, column 50
    function value_16 () : java.lang.String {
      return VehicleIncident.Vehicle.Vin
    }
    
    // 'value' attribute on TextInput (id=VehicleLicensePlate) at TotalLossCalculatorPopup.pcf: line 54, column 59
    function value_19 () : java.lang.String {
      return VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleLicensePlateState) at TotalLossCalculatorPopup.pcf: line 60, column 47
    function value_22 () : typekey.Jurisdiction {
      return VehicleIncident.Vehicle.State
    }
    
    // 'value' attribute on TextInput (id=TotalLossPoints) at TotalLossCalculatorPopup.pcf: line 68, column 44
    function value_26 () : java.lang.Integer {
      return VehicleIncident.TotalLossPoints
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleTotalLoss) at TotalLossCalculatorPopup.pcf: line 74, column 48
    function value_29 () : java.lang.Boolean {
      return VehicleIncident.TotalLoss
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAge5Years) at TotalLossCalculatorPopup.pcf: line 84, column 55
    function value_32 () : java.lang.Boolean {
      return VehicleIncident.VehicleAge5Years
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAge10Years) at TotalLossCalculatorPopup.pcf: line 90, column 56
    function value_36 () : java.lang.Boolean {
      return VehicleIncident.VehicleAge10Years
    }
    
    // 'value' attribute on TextInput (id=VehicleMake) at TotalLossCalculatorPopup.pcf: line 33, column 51
    function value_4 () : java.lang.String {
      return VehicleIncident.Vehicle.Make
    }
    
    // 'value' attribute on BooleanRadioInput (id=Mileage100K) at TotalLossCalculatorPopup.pcf: line 96, column 50
    function value_40 () : java.lang.Boolean {
      return VehicleIncident.Mileage100K
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleTowed) at TotalLossCalculatorPopup.pcf: line 101, column 56
    function value_44 () : java.lang.Boolean {
      return VehicleIncident.HasTowingServices
    }
    
    // 'value' attribute on BooleanRadioInput (id=Extrication) at TotalLossCalculatorPopup.pcf: line 107, column 50
    function value_47 () : java.lang.Boolean {
      return VehicleIncident.Extrication
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAirbagsDeployed) at TotalLossCalculatorPopup.pcf: line 116, column 54
    function value_51 () : java.lang.Boolean {
      return VehicleIncident.AirbagsDeployed
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleRollOver) at TotalLossCalculatorPopup.pcf: line 122, column 54
    function value_54 () : java.lang.Boolean {
      return VehicleIncident.VehicleRollOver
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnDash) at TotalLossCalculatorPopup.pcf: line 132, column 51
    function value_58 () : java.lang.Boolean {
      return VehicleIncident.FireBurnDash
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnEngine) at TotalLossCalculatorPopup.pcf: line 138, column 53
    function value_62 () : java.lang.Boolean {
      return VehicleIncident.FireBurnEngine
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnWindshield) at TotalLossCalculatorPopup.pcf: line 144, column 57
    function value_66 () : java.lang.Boolean {
      return VehicleIncident.FireBurnWindshield
    }
    
    // 'value' attribute on TextInput (id=VehicleModel) at TotalLossCalculatorPopup.pcf: line 37, column 52
    function value_7 () : java.lang.String {
      return VehicleIncident.Vehicle.Model
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleSubmerged) at TotalLossCalculatorPopup.pcf: line 154, column 55
    function value_70 () : java.lang.Boolean {
      return VehicleIncident.VehicleSubmerged
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaterLevelDash) at TotalLossCalculatorPopup.pcf: line 160, column 53
    function value_74 () : java.lang.Boolean {
      return VehicleIncident.WaterLevelDash
    }
    
    // 'value' attribute on BooleanRadioInput (id=FloodSaltWater) at TotalLossCalculatorPopup.pcf: line 166, column 53
    function value_78 () : java.lang.Boolean {
      return VehicleIncident.FloodSaltWater
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaterLevelSeats) at TotalLossCalculatorPopup.pcf: line 172, column 54
    function value_82 () : java.lang.Boolean {
      return VehicleIncident.WaterLevelSeats
    }
    
    // 'value' attribute on BooleanRadioInput (id=ComponentsMissing) at TotalLossCalculatorPopup.pcf: line 182, column 56
    function value_86 () : java.lang.Boolean {
      return VehicleIncident.ComponentsMissing
    }
    
    // 'value' attribute on BooleanRadioInput (id=InteriorMissing) at TotalLossCalculatorPopup.pcf: line 188, column 54
    function value_90 () : java.lang.Boolean {
      return VehicleIncident.InteriorMissing
    }
    
    // 'value' attribute on BooleanRadioInput (id=AirbagsMissing) at TotalLossCalculatorPopup.pcf: line 194, column 53
    function value_94 () : java.lang.Boolean {
      return VehicleIncident.AirbagsMissing
    }
    
    override property get CurrentLocation () : pcf.TotalLossCalculatorPopup {
      return super.CurrentLocation as pcf.TotalLossCalculatorPopup
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getVariableValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setVariableValue("VehicleIncident", 0, $arg)
    }
    
    
  }
  
  
}