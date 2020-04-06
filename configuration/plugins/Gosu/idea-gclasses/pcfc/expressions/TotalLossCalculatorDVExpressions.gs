package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/TotalLossCalculatorDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TotalLossCalculatorDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/TotalLossCalculatorDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalLossCalculatorDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleRollOver) at TotalLossCalculatorDV.pcf: line 150, column 57
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.VehicleRollOver = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnDash) at TotalLossCalculatorDV.pcf: line 165, column 57
    function defaultSetter_118 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.FireBurnDash = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnEngine) at TotalLossCalculatorDV.pcf: line 172, column 57
    function defaultSetter_124 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.FireBurnEngine = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnWindshield) at TotalLossCalculatorDV.pcf: line 179, column 57
    function defaultSetter_130 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.FireBurnWindshield = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleSubmerged) at TotalLossCalculatorDV.pcf: line 194, column 57
    function defaultSetter_140 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.VehicleSubmerged = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaterLevelDash) at TotalLossCalculatorDV.pcf: line 201, column 57
    function defaultSetter_146 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.WaterLevelDash = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FloodSaltWater) at TotalLossCalculatorDV.pcf: line 208, column 57
    function defaultSetter_152 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.FloodSaltWater = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaterLevelSeats) at TotalLossCalculatorDV.pcf: line 215, column 57
    function defaultSetter_158 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.WaterLevelSeats = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ComponentsMissing) at TotalLossCalculatorDV.pcf: line 230, column 57
    function defaultSetter_168 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.ComponentsMissing = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InteriorMissing) at TotalLossCalculatorDV.pcf: line 237, column 57
    function defaultSetter_174 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.InteriorMissing = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AirbagsMissing) at TotalLossCalculatorDV.pcf: line 244, column 57
    function defaultSetter_180 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.AirbagsMissing = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleTotalLoss) at TotalLossCalculatorDV.pcf: line 85, column 56
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.TotalLoss = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAge5Years) at TotalLossCalculatorDV.pcf: line 102, column 57
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.VehicleAge5Years = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAge10Years) at TotalLossCalculatorDV.pcf: line 109, column 57
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.VehicleAge10Years = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Mileage100K) at TotalLossCalculatorDV.pcf: line 116, column 57
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.Mileage100K = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Extrication) at TotalLossCalculatorDV.pcf: line 129, column 57
    function defaultSetter_93 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.Extrication = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=VehicleTotalLoss) at TotalLossCalculatorDV.pcf: line 85, column 56
    function editable_54 () : java.lang.Boolean {
      return Exposure.New
    }
    
    // 'filter' attribute on TypeKeyInput (id=VehicleLicensePlateState) at TotalLossCalculatorDV.pcf: line 68, column 55
    function filter_48 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_VEHICLE_REG)
    }
    
    // 'value' attribute on TextInput (id=VehicleYear) at TotalLossCalculatorDV.pcf: line 30, column 57
    function valueRoot_12 () : java.lang.Object {
      return Exposure.VehicleIncident.Vehicle
    }
    
    // 'value' attribute on TextInput (id=TotalLossPoints) at TotalLossCalculatorDV.pcf: line 77, column 57
    function valueRoot_53 () : java.lang.Object {
      return Exposure.VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=TotalLossCalculator_NonAuto) at TotalLossCalculatorDV.pcf: line 17, column 57
    function value_1 () : java.lang.Object {
      return null
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAirbagsDeployed) at TotalLossCalculatorDV.pcf: line 143, column 57
    function value_100 () : java.lang.Boolean {
      return Exposure.VehicleIncident.AirbagsDeployed
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleRollOver) at TotalLossCalculatorDV.pcf: line 150, column 57
    function value_105 () : java.lang.Boolean {
      return Exposure.VehicleIncident.VehicleRollOver
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnDash) at TotalLossCalculatorDV.pcf: line 165, column 57
    function value_115 () : java.lang.Boolean {
      return Exposure.VehicleIncident.FireBurnDash
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnEngine) at TotalLossCalculatorDV.pcf: line 172, column 57
    function value_121 () : java.lang.Boolean {
      return Exposure.VehicleIncident.FireBurnEngine
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireBurnWindshield) at TotalLossCalculatorDV.pcf: line 179, column 57
    function value_127 () : java.lang.Boolean {
      return Exposure.VehicleIncident.FireBurnWindshield
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleSubmerged) at TotalLossCalculatorDV.pcf: line 194, column 57
    function value_137 () : java.lang.Boolean {
      return Exposure.VehicleIncident.VehicleSubmerged
    }
    
    // 'value' attribute on TextInput (id=VehicleMake) at TotalLossCalculatorDV.pcf: line 35, column 57
    function value_14 () : java.lang.String {
      return Exposure.VehicleIncident.Vehicle.Make
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaterLevelDash) at TotalLossCalculatorDV.pcf: line 201, column 57
    function value_143 () : java.lang.Boolean {
      return Exposure.VehicleIncident.WaterLevelDash
    }
    
    // 'value' attribute on BooleanRadioInput (id=FloodSaltWater) at TotalLossCalculatorDV.pcf: line 208, column 57
    function value_149 () : java.lang.Boolean {
      return Exposure.VehicleIncident.FloodSaltWater
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaterLevelSeats) at TotalLossCalculatorDV.pcf: line 215, column 57
    function value_155 () : java.lang.Boolean {
      return Exposure.VehicleIncident.WaterLevelSeats
    }
    
    // 'value' attribute on BooleanRadioInput (id=ComponentsMissing) at TotalLossCalculatorDV.pcf: line 230, column 57
    function value_165 () : java.lang.Boolean {
      return Exposure.VehicleIncident.ComponentsMissing
    }
    
    // 'value' attribute on BooleanRadioInput (id=InteriorMissing) at TotalLossCalculatorDV.pcf: line 237, column 57
    function value_171 () : java.lang.Boolean {
      return Exposure.VehicleIncident.InteriorMissing
    }
    
    // 'value' attribute on BooleanRadioInput (id=AirbagsMissing) at TotalLossCalculatorDV.pcf: line 244, column 57
    function value_177 () : java.lang.Boolean {
      return Exposure.VehicleIncident.AirbagsMissing
    }
    
    // 'value' attribute on TextInput (id=VehicleModel) at TotalLossCalculatorDV.pcf: line 40, column 57
    function value_19 () : java.lang.String {
      return Exposure.VehicleIncident.Vehicle.Model
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleStyle) at TotalLossCalculatorDV.pcf: line 46, column 57
    function value_24 () : typekey.VehicleStyle {
      return Exposure.VehicleIncident.Vehicle.Style
    }
    
    // 'value' attribute on TextInput (id=VehicleColor) at TotalLossCalculatorDV.pcf: line 51, column 57
    function value_29 () : java.lang.String {
      return Exposure.VehicleIncident.Vehicle.Color
    }
    
    // 'value' attribute on TextInput (id=VehicleVin) at TotalLossCalculatorDV.pcf: line 56, column 57
    function value_34 () : java.lang.String {
      return Exposure.VehicleIncident.Vehicle.Vin
    }
    
    // 'value' attribute on TextInput (id=VehicleLicensePlate) at TotalLossCalculatorDV.pcf: line 61, column 57
    function value_39 () : java.lang.String {
      return Exposure.VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleLicensePlateState) at TotalLossCalculatorDV.pcf: line 68, column 55
    function value_44 () : typekey.Jurisdiction {
      return Exposure.VehicleIncident.Vehicle.State
    }
    
    // 'value' attribute on TextInput (id=TotalLossPoints) at TotalLossCalculatorDV.pcf: line 77, column 57
    function value_50 () : java.lang.Integer {
      return Exposure.VehicleIncident.TotalLossPoints
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleTotalLoss) at TotalLossCalculatorDV.pcf: line 85, column 56
    function value_56 () : java.lang.Boolean {
      return Exposure.VehicleIncident.TotalLoss
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAge5Years) at TotalLossCalculatorDV.pcf: line 102, column 57
    function value_67 () : java.lang.Boolean {
      return Exposure.VehicleIncident.VehicleAge5Years
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleAge10Years) at TotalLossCalculatorDV.pcf: line 109, column 57
    function value_73 () : java.lang.Boolean {
      return Exposure.VehicleIncident.VehicleAge10Years
    }
    
    // 'value' attribute on BooleanRadioInput (id=Mileage100K) at TotalLossCalculatorDV.pcf: line 116, column 57
    function value_79 () : java.lang.Boolean {
      return Exposure.VehicleIncident.Mileage100K
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleTowed) at TotalLossCalculatorDV.pcf: line 122, column 57
    function value_85 () : java.lang.Boolean {
      return Exposure.VehicleIncident.HasTowingServices
    }
    
    // 'value' attribute on TextInput (id=VehicleYear) at TotalLossCalculatorDV.pcf: line 30, column 57
    function value_9 () : java.lang.Integer {
      return Exposure.VehicleIncident.Vehicle.Year
    }
    
    // 'value' attribute on BooleanRadioInput (id=Extrication) at TotalLossCalculatorDV.pcf: line 129, column 57
    function value_90 () : java.lang.Boolean {
      return Exposure.VehicleIncident.Extrication
    }
    
    // 'visible' attribute on TextInput (id=TotalLossCalculator_NonAuto) at TotalLossCalculatorDV.pcf: line 17, column 57
    function visible_0 () : java.lang.Boolean {
      return  Exposure.Claim.LossType != TC_AUTO 
    }
    
    // 'visible' attribute on TextInput (id=TotalLossCalculator_Vehicle) at TotalLossCalculatorDV.pcf: line 24, column 57
    function visible_4 () : java.lang.Boolean {
      return  Exposure.Claim.LossType == TC_AUTO 
    }
    
    // 'visible' attribute on TypeKeyInput (id=VehicleLicensePlateState) at TotalLossCalculatorDV.pcf: line 68, column 55
    function visible_43 () : java.lang.Boolean {
      return Exposure.Claim.LossType == TC_AUTO
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}