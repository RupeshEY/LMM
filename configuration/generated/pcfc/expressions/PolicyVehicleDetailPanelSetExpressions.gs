package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyVehicleDetailPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleCoverageListDetailExpressionsImpl extends PolicyVehicleDetailPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PolicyVehicleDetailPanelSet.pcf: line 108, column 72
    function def_onEnter_60 (def :  pcf.EditableVehicleCoveragesLV) : void {
      def.onEnter(VehicleRU.Vehicle, VehicleRU)
    }
    
    // 'def' attribute on PanelRef at PolicyVehicleDetailPanelSet.pcf: line 119, column 26
    function def_onEnter_62 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.onEnter(Coverage)
    }
    
    // 'def' attribute on PanelRef at PolicyVehicleDetailPanelSet.pcf: line 108, column 72
    function def_refreshVariables_61 (def :  pcf.EditableVehicleCoveragesLV) : void {
      def.refreshVariables(VehicleRU.Vehicle, VehicleRU)
    }
    
    // 'def' attribute on PanelRef at PolicyVehicleDetailPanelSet.pcf: line 119, column 26
    function def_refreshVariables_63 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.refreshVariables(Coverage)
    }
    
    property get Coverage () : Coverage {
      return getCurrentSelection(1) as Coverage
    }
    
    property set Coverage ($arg :  Coverage) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleDetailPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at PolicyVehicleDetailPanelSet.pcf: line 94, column 74
    function def_onEnter_58 (def :  pcf.EditableVehicleLienholdersLV) : void {
      def.onEnter(VehicleRU.Vehicle, VehicleRU.Policy.Claim)
    }
    
    // 'def' attribute on ListViewInput at PolicyVehicleDetailPanelSet.pcf: line 94, column 74
    function def_refreshVariables_59 (def :  pcf.EditableVehicleLienholdersLV) : void {
      def.refreshVariables(VehicleRU.Vehicle, VehicleRU.Policy.Claim)
    }
    
    // 'value' attribute on TextInput (id=Model) at PolicyVehicleDetailPanelSet.pcf: line 31, column 44
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.Model = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Year) at PolicyVehicleDetailPanelSet.pcf: line 37, column 42
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.Year = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=Style) at PolicyVehicleDetailPanelSet.pcf: line 43, column 44
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.Style = (__VALUE_TO_SET as typekey.VehicleStyle)
    }
    
    // 'value' attribute on TextInput (id=Number) at PolicyVehicleDetailPanelSet.pcf: line 19, column 42
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.RUNumber = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=VIN) at PolicyVehicleDetailPanelSet.pcf: line 51, column 154
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.Vin = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=SerialNumber) at PolicyVehicleDetailPanelSet.pcf: line 57, column 138
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.SerialNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Color) at PolicyVehicleDetailPanelSet.pcf: line 62, column 44
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.Color = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at PolicyVehicleDetailPanelSet.pcf: line 69, column 45
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.State = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at PolicyVehicleDetailPanelSet.pcf: line 74, column 51
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.LicensePlate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=BoatType) at PolicyVehicleDetailPanelSet.pcf: line 81, column 57
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.BoatType = (__VALUE_TO_SET as typekey.BoatType)
    }
    
    // 'value' attribute on TypeKeyInput (id=OffRoadStyle) at PolicyVehicleDetailPanelSet.pcf: line 88, column 100
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.OffRoadStyle = (__VALUE_TO_SET as typekey.OffRoadVehicleStyle)
    }
    
    // 'value' attribute on TextInput (id=Make) at PolicyVehicleDetailPanelSet.pcf: line 25, column 43
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU.Vehicle.Make = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'filter' attribute on TypeKeyInput (id=State) at PolicyVehicleDetailPanelSet.pcf: line 69, column 45
    function filter_40 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_VEHICLE_REG)
    }
    
    // 'validationExpression' attribute on ListViewInput at PolicyVehicleDetailPanelSet.pcf: line 94, column 74
    function validationExpression_57 () : java.lang.Object {
      return VehicleRU.Vehicle.validateLienholders()
    }
    
    // 'value' attribute on TextInput (id=Number) at PolicyVehicleDetailPanelSet.pcf: line 19, column 42
    function valueRoot_3 () : java.lang.Object {
      return VehicleRU
    }
    
    // 'value' attribute on TextInput (id=Make) at PolicyVehicleDetailPanelSet.pcf: line 25, column 43
    function valueRoot_7 () : java.lang.Object {
      return VehicleRU.Vehicle
    }
    
    // 'value' attribute on TextInput (id=Number) at PolicyVehicleDetailPanelSet.pcf: line 19, column 42
    function value_0 () : java.lang.Integer {
      return VehicleRU.RUNumber
    }
    
    // 'value' attribute on TextInput (id=Year) at PolicyVehicleDetailPanelSet.pcf: line 37, column 42
    function value_12 () : java.lang.Integer {
      return VehicleRU.Vehicle.Year
    }
    
    // 'value' attribute on TypeKeyInput (id=Style) at PolicyVehicleDetailPanelSet.pcf: line 43, column 44
    function value_16 () : typekey.VehicleStyle {
      return VehicleRU.Vehicle.Style
    }
    
    // 'value' attribute on TextInput (id=VIN) at PolicyVehicleDetailPanelSet.pcf: line 51, column 154
    function value_21 () : java.lang.String {
      return VehicleRU.Vehicle.Vin
    }
    
    // 'value' attribute on TextInput (id=SerialNumber) at PolicyVehicleDetailPanelSet.pcf: line 57, column 138
    function value_27 () : java.lang.String {
      return VehicleRU.Vehicle.SerialNumber
    }
    
    // 'value' attribute on TextInput (id=Color) at PolicyVehicleDetailPanelSet.pcf: line 62, column 44
    function value_32 () : java.lang.String {
      return VehicleRU.Vehicle.Color
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at PolicyVehicleDetailPanelSet.pcf: line 69, column 45
    function value_36 () : typekey.Jurisdiction {
      return VehicleRU.Vehicle.State
    }
    
    // 'value' attribute on TextInput (id=Make) at PolicyVehicleDetailPanelSet.pcf: line 25, column 43
    function value_4 () : java.lang.String {
      return VehicleRU.Vehicle.Make
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at PolicyVehicleDetailPanelSet.pcf: line 74, column 51
    function value_41 () : java.lang.String {
      return VehicleRU.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TypeKeyInput (id=BoatType) at PolicyVehicleDetailPanelSet.pcf: line 81, column 57
    function value_46 () : typekey.BoatType {
      return VehicleRU.Vehicle.BoatType
    }
    
    // 'value' attribute on TypeKeyInput (id=OffRoadStyle) at PolicyVehicleDetailPanelSet.pcf: line 88, column 100
    function value_52 () : typekey.OffRoadVehicleStyle {
      return VehicleRU.Vehicle.OffRoadStyle
    }
    
    // 'value' attribute on TextInput (id=Model) at PolicyVehicleDetailPanelSet.pcf: line 31, column 44
    function value_8 () : java.lang.String {
      return VehicleRU.Vehicle.Model
    }
    
    // 'visible' attribute on TextInput (id=VIN) at PolicyVehicleDetailPanelSet.pcf: line 51, column 154
    function visible_20 () : java.lang.Boolean {
      return VehicleRU.Vehicle.Style != TC_BOAT && VehicleRU.Vehicle.Style != TC_ATV && VehicleRU.Vehicle.Style != TC_SNOWMOBILE
    }
    
    // 'visible' attribute on TextInput (id=SerialNumber) at PolicyVehicleDetailPanelSet.pcf: line 57, column 138
    function visible_26 () : java.lang.Boolean {
      return VehicleRU.Vehicle.Style == TC_BOAT || VehicleRU.Vehicle.Style == TC_ATV || VehicleRU.Vehicle.Style == TC_SNOWMOBILE
    }
    
    // 'visible' attribute on TypeKeyInput (id=BoatType) at PolicyVehicleDetailPanelSet.pcf: line 81, column 57
    function visible_45 () : java.lang.Boolean {
      return VehicleRU.Vehicle.Style == TC_BOAT
    }
    
    // 'visible' attribute on TypeKeyInput (id=OffRoadStyle) at PolicyVehicleDetailPanelSet.pcf: line 88, column 100
    function visible_51 () : java.lang.Boolean {
      return VehicleRU.Vehicle.Style == TC_ATV || VehicleRU.Vehicle.Style == TC_SNOWMOBILE
    }
    
    property get VehicleRU () : VehicleRU {
      return getRequireValue("VehicleRU", 0) as VehicleRU
    }
    
    property set VehicleRU ($arg :  VehicleRU) {
      setRequireValue("VehicleRU", 0, $arg)
    }
    
    
  }
  
  
}