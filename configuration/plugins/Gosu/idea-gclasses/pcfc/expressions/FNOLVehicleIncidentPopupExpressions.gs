package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.claim.FnolServiceRequestHelper
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLVehicleIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLVehicleIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Wizard :  gw.api.claim.NewClaimWizardInfo) : int {
      return 1
    }
    
    static function __constructorIndex (VehicleIncident :  VehicleIncident, Wizard :  gw.api.claim.NewClaimWizardInfo) : int {
      return 0
    }
    
    // 'action' attribute on MenuItem (id=VehicleDetailMenuItem) at FNOLVehicleIncidentPopup.pcf: line 75, column 113
    function action_10 () : void {
      NewClaimWizard_PolicyVehicleDetailPopup.push(Claim.Policy.getVehicleRU( VehicleIncident.Vehicle?.ID ), Claim.Policy)
    }
    
    // 'action' attribute on MenuItem (id=NewVehicleMenuItem) at FNOLVehicleIncidentPopup.pcf: line 79, column 110
    function action_12 () : void {
      VehicleIncident.Vehicle = new Vehicle(); NewVehicle = true;
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_123 () : void {
      AddressBookPickerPopup.push(statictypeof (VehicleIncident.incidentowner), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_125 () : void {
      if (VehicleIncident.incidentowner != null) { ClaimContactDetailPopup.push(VehicleIncident.incidentowner, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_127 () : void {
      ClaimContactDetailPopup.push(VehicleIncident.incidentowner, Claim)
    }
    
    // 'action' attribute on MenuItem (id=CalculateButton) at FNOLVehicleIncidentPopup.pcf: line 241, column 51
    function action_154 () : void {
      TotalLossCalculatorPopup.push(VehicleIncident)
    }
    
    // 'action' attribute on ToolbarButton (id=AddDriverButton) at FNOLVehicleIncidentPopup.pcf: line 361, column 63
    function action_223 () : void {
      FNOLContactPopup.push(Claim, null, ContactRole.TC_DRIVER, VehicleIncident, Wizard);
    }
    
    // 'action' attribute on ToolbarButton (id=AddPassengerButton) at FNOLVehicleIncidentPopup.pcf: line 367, column 35
    function action_224 () : void {
      FNOLContactPopup.push(Claim, null, ContactRole.TC_PASSENGER, VehicleIncident, Wizard);
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 16, column 225
    function action_263 () : void {
      AddressBookPickerPopup.push(statictypeof (VehicleIncident.InsuredRep), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 18, column 285
    function action_265 () : void {
      if (VehicleIncident.InsuredRep != null) { ClaimContactDetailPopup.push(VehicleIncident.InsuredRep, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function action_267 () : void {
      ClaimContactDetailPopup.push(VehicleIncident.InsuredRep, Claim)
    }
    
    // 'action' attribute on MenuItem (id=VehicleDetailMenuItem) at FNOLVehicleIncidentPopup.pcf: line 75, column 113
    function action_dest_11 () : pcf.api.Destination {
      return pcf.NewClaimWizard_PolicyVehicleDetailPopup.createDestination(Claim.Policy.getVehicleRU( VehicleIncident.Vehicle?.ID ), Claim.Policy)
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_124 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (VehicleIncident.incidentowner), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_128 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(VehicleIncident.incidentowner, Claim)
    }
    
    // 'action' attribute on MenuItem (id=CalculateButton) at FNOLVehicleIncidentPopup.pcf: line 241, column 51
    function action_dest_155 () : pcf.api.Destination {
      return pcf.TotalLossCalculatorPopup.createDestination(VehicleIncident)
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_264 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (VehicleIncident.InsuredRep), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_268 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(VehicleIncident.InsuredRep, Claim)
    }
    
    // 'afterEnter' attribute on Popup (id=FNOLVehicleIncidentPopup) at FNOLVehicleIncidentPopup.pcf: line 14, column 76
    function afterEnter_282 () : void {
      initializeVariable()
    }
    
    // 'available' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 106, column 39
    function available_28 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return Claim.canEditVehicle(VALUE)
    }
    
    // 'available' attribute on TextInput (id=Vehicle_Year) at FNOLVehicleIncidentPopup.pcf: line 102, column 54
    function available_31 () : java.lang.Boolean {
      return Claim.canEditVehicle(VehicleIncident.Vehicle)
    }
    
    // 'beforeCancel' attribute on Popup (id=FNOLVehicleIncidentPopup) at FNOLVehicleIncidentPopup.pcf: line 14, column 76
    function beforeCancel_283 () : void {
      Wizard.VehicleIncidentOtherServiceRequests.removeWhere( \ sr -> not vehicleIncidentOtherServiceRequestsCopy.contains(sr))
    }
    
    // 'beforeCommit' attribute on Popup (id=FNOLVehicleIncidentPopup) at FNOLVehicleIncidentPopup.pcf: line 14, column 76
    function beforeCommit_284 (pickedValue :  VehicleIncident) : void {
      cleanBeforeCommit()
    }
    
    // 'condition' attribute on ReflectCondition at FNOLVehicleIncidentPopup.pcf: line 92, column 49
    function condition_20 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Boolean {
      return VehicleIncident.Claim.Policy.isPolicyVehicle(VALUE)
    }
    
    // 'def' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_120 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (VehicleIncident.incidentowner), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at FNOLVehicleIncidentPopup.pcf: line 332, column 57
    function def_onEnter_220 (def :  pcf.DriverCitationsLV) : void {
      def.onEnter(VehicleIncident)
    }
    
    // 'def' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_260 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (VehicleIncident.InsuredRep), null, Claim)
    }
    
    // 'def' attribute on PanelRef at FNOLVehicleIncidentPopup.pcf: line 478, column 135
    function def_onEnter_280 (def :  pcf.VehicleIncidentPanelSet) : void {
      def.onEnter(VehicleIncident, Wizard.UnusedServiceRequests, Wizard.VehicleIncidentOtherServiceRequests)
    }
    
    // 'def' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_121 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (VehicleIncident.incidentowner), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at FNOLVehicleIncidentPopup.pcf: line 332, column 57
    function def_refreshVariables_221 (def :  pcf.DriverCitationsLV) : void {
      def.refreshVariables(VehicleIncident)
    }
    
    // 'def' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_261 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (VehicleIncident.InsuredRep), null, Claim)
    }
    
    // 'def' attribute on PanelRef at FNOLVehicleIncidentPopup.pcf: line 478, column 135
    function def_refreshVariables_281 (def :  pcf.VehicleIncidentPanelSet) : void {
      def.refreshVariables(VehicleIncident, Wizard.UnusedServiceRequests, Wizard.VehicleIncidentOtherServiceRequests)
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_State) at FNOLVehicleIncidentPopup.pcf: line 181, column 56
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.State = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_VIN) at FNOLVehicleIncidentPopup.pcf: line 193, column 235
    function defaultSetter_115 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Vin = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_131 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.incidentowner = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_Indicator) at FNOLVehicleIncidentPopup.pcf: line 212, column 39
    function defaultSetter_143 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehStolenInd = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleParked) at FNOLVehicleIncidentPopup.pcf: line 219, column 55
    function defaultSetter_147 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleParked = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Picker) at FNOLVehicleIncidentPopup.pcf: line 71, column 39
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle = (__VALUE_TO_SET as entity.Vehicle)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLVehicleIncidentPopup.pcf: line 236, column 54
    function defaultSetter_151 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=TotalLoss) at FNOLVehicleIncidentPopup.pcf: line 241, column 51
    function defaultSetter_157 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.TotalLoss = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Operable) at FNOLVehicleIncidentPopup.pcf: line 256, column 58
    function defaultSetter_164 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleOperable = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_AirbagsDeployed) at FNOLVehicleIncidentPopup.pcf: line 262, column 57
    function defaultSetter_171 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.AirbagsDeployed = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_EquipmentFailure) at FNOLVehicleIncidentPopup.pcf: line 271, column 58
    function defaultSetter_177 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.EquipmentFailure = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Speed) at FNOLVehicleIncidentPopup.pcf: line 286, column 93
    function defaultSetter_183 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Speed = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleDirection) at FNOLVehicleIncidentPopup.pcf: line 293, column 93
    function defaultSetter_189 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleDirection = (__VALUE_TO_SET as typekey.VehicleDirection)
    }
    
    // 'value' attribute on TypeKeyInput (id=CollisionPoint) at FNOLVehicleIncidentPopup.pcf: line 300, column 58
    function defaultSetter_195 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.CollisionPoint = (__VALUE_TO_SET as typekey.CollisionPoint)
    }
    
    // 'value' attribute on BooleanRadioInput (id=LoanInformation_Loan) at FNOLVehicleIncidentPopup.pcf: line 305, column 54
    function defaultSetter_199 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Loan = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=MonthlyPayment) at FNOLVehicleIncidentPopup.pcf: line 313, column 68
    function defaultSetter_205 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.LoanMonthlyPayment = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=MonthsRemaining) at FNOLVehicleIncidentPopup.pcf: line 320, column 67
    function defaultSetter_211 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.LoanMonthsRemaining = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on CurrencyInput (id=PayoffAmount) at FNOLVehicleIncidentPopup.pcf: line 326, column 67
    function defaultSetter_217 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.LoanPayoffAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_VehLockInd) at FNOLVehicleIncidentPopup.pcf: line 419, column 52
    function defaultSetter_243 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehLockInd = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_AntiThftInd) at FNOLVehicleIncidentPopup.pcf: line 426, column 53
    function defaultSetter_247 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.AntiThftInd = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Theft_OdomRead) at FNOLVehicleIncidentPopup.pcf: line 434, column 47
    function defaultSetter_251 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.OdomRead = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=Theft_AffdvCmplInd) at FNOLVehicleIncidentPopup.pcf: line 443, column 43
    function defaultSetter_255 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.AffdvCmplInd = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_VehicleType) at FNOLVehicleIncidentPopup.pcf: line 87, column 106
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleType = (__VALUE_TO_SET as typekey.VehicleType)
    }
    
    // 'value' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_271 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.InsuredRep = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Year) at FNOLVehicleIncidentPopup.pcf: line 102, column 54
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Year = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Make) at FNOLVehicleIncidentPopup.pcf: line 115, column 54
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Make = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Model) at FNOLVehicleIncidentPopup.pcf: line 128, column 54
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Model = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=LossParty) at FNOLVehicleIncidentPopup.pcf: line 58, column 37
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      InsurerLoss = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_Style) at FNOLVehicleIncidentPopup.pcf: line 142, column 54
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Style = (__VALUE_TO_SET as typekey.VehicleStyle)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Color) at FNOLVehicleIncidentPopup.pcf: line 155, column 54
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Color = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_LicensePlate) at FNOLVehicleIncidentPopup.pcf: line 167, column 54
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.LicensePlate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Vehicle_State) at FNOLVehicleIncidentPopup.pcf: line 181, column 56
    function filter_105 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_VEHICLE_REG)
    }
    
    // 'icon' attribute on TitleBar at FNOLVehicleIncidentPopup.pcf: line 41, column 44
    function icon_1 () : java.lang.String {
      return VehicleIncident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at FNOLVehicleIncidentPopup.pcf: line 37, column 51
    function initialValue_0 () : java.util.Set<ServiceRequest> {
      return Wizard.VehicleIncidentOtherServiceRequests.copy()
    }
    
    // EditButtons at FNOLVehicleIncidentPopup.pcf: line 44, column 40
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onChange' attribute on PostOnChange at FNOLVehicleIncidentPopup.pcf: line 264, column 78
    function onChange_166 () : void {
      VehicleIncident.TotalLossCalculatorPreUpdate()
    }
    
    // 'onChange' attribute on PostOnChange at FNOLVehicleIncidentPopup.pcf: line 60, column 138
    function onChange_4 () : void {
      VehicleIncident.VehicleLossParty = (InsurerLoss ? LossPartyType.TC_INSURED : LossPartyType.TC_THIRD_PARTY)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_129 (PickedValue :  Contact) : void {
      var contactType = statictypeof (VehicleIncident.incidentowner); var result = eval("VehicleIncident.incidentowner = Claim.resolveContact(VehicleIncident.incidentowner) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function onPick_269 (PickedValue :  Contact) : void {
      var contactType = statictypeof (VehicleIncident.InsuredRep); var result = eval("VehicleIncident.InsuredRep = Claim.resolveContact(VehicleIncident.InsuredRep) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'pickValue' attribute on EditButtons at FNOLVehicleIncidentPopup.pcf: line 44, column 40
    function pickValue_2 () : VehicleIncident {
      return VehicleIncident
    }
    
    // 'value' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 197, column 38
    function reflectionValue_107 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Vin
    }
    
    // Reflect at FNOLVehicleIncidentPopup.pcf: line 89, column 47
    function reflectionValue_21 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return (VehicleIncident.Claim.Policy.isPolicyVehicle(VALUE)) ? ("listed") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 106, column 39
    function reflectionValue_29 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Year
    }
    
    // 'value' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 119, column 39
    function reflectionValue_40 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Make
    }
    
    // 'value' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 132, column 40
    function reflectionValue_51 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Model
    }
    
    // 'value' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 146, column 40
    function reflectionValue_62 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Style
    }
    
    // 'value' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 159, column 40
    function reflectionValue_73 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Color
    }
    
    // 'value' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 171, column 47
    function reflectionValue_84 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.LicensePlate
    }
    
    // 'value' attribute on Reflect at FNOLVehicleIncidentPopup.pcf: line 185, column 40
    function reflectionValue_95 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.State
    }
    
    // 'value' attribute on RowIterator at FNOLVehicleIncidentPopup.pcf: line 399, column 249
    function sortValue_225 (ContactPerson :  entity.Contact) : java.lang.Object {
      return DisplayKey.get("Web.FNOLVehicleIncidentPopup.NamePosition", ContactPerson.DisplayName, (VehicleIncident.driver == ContactPerson ? ContactRole.TC_DRIVER.DisplayName : ContactRole.TC_PASSENGER.DisplayName))
    }
    
    // 'value' attribute on RowIterator at FNOLVehicleIncidentPopup.pcf: line 403, column 102
    function sortValue_226 (ContactPerson :  entity.Contact) : java.lang.Object {
      return Wizard.getInjuryDescription( Claim.getClaimContact(ContactPerson) )
    }
    
    // 'toRemove' attribute on RowIterator at FNOLVehicleIncidentPopup.pcf: line 380, column 50
    function toRemove_238 (ContactPerson :  entity.Contact) : void {
      removeContact(ContactPerson)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_133 () : java.lang.Object {
      return Claim.RelatedContacts
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at FNOLVehicleIncidentPopup.pcf: line 71, column 39
    function valueRange_17 () : java.lang.Object {
      return VehicleIncident.AvailableVehicles
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Picker) at FNOLVehicleIncidentPopup.pcf: line 71, column 39
    function valueRoot_16 () : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Year) at FNOLVehicleIncidentPopup.pcf: line 102, column 54
    function valueRoot_38 () : java.lang.Object {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on TextInput (id=Vehicle_VIN) at FNOLVehicleIncidentPopup.pcf: line 193, column 235
    function value_111 () : java.lang.String {
      return VehicleIncident.Vehicle.Vin
    }
    
    // 'value' attribute on ClaimContactInput (id=Owner_Picker) at FNOLVehicleIncidentPopup.pcf: line 206, column 93
    function value_118 () : entity.Contact {
      return VehicleIncident.incidentowner
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_Indicator) at FNOLVehicleIncidentPopup.pcf: line 212, column 39
    function value_140 () : java.lang.Boolean {
      return VehicleIncident.VehStolenInd
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleParked) at FNOLVehicleIncidentPopup.pcf: line 219, column 55
    function value_145 () : java.lang.Boolean {
      return VehicleIncident.VehicleParked
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLVehicleIncidentPopup.pcf: line 236, column 54
    function value_149 () : java.lang.String {
      return VehicleIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=TotalLoss) at FNOLVehicleIncidentPopup.pcf: line 241, column 51
    function value_153 () : java.lang.Boolean {
      return VehicleIncident.TotalLoss
    }
    
    // 'value' attribute on TextInput (id=TotalLossPoints) at FNOLVehicleIncidentPopup.pcf: line 251, column 48
    function value_159 () : java.lang.Integer {
      return VehicleIncident.TotalLossPoints
    }
    
    // 'value' attribute on BooleanRadioInput (id=Operable) at FNOLVehicleIncidentPopup.pcf: line 256, column 58
    function value_162 () : java.lang.Boolean {
      return VehicleIncident.VehicleOperable
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_AirbagsDeployed) at FNOLVehicleIncidentPopup.pcf: line 262, column 57
    function value_168 () : java.lang.Boolean {
      return VehicleIncident.AirbagsDeployed
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_EquipmentFailure) at FNOLVehicleIncidentPopup.pcf: line 271, column 58
    function value_174 () : java.lang.Boolean {
      return VehicleIncident.EquipmentFailure
    }
    
    // 'value' attribute on TextInput (id=Speed) at FNOLVehicleIncidentPopup.pcf: line 286, column 93
    function value_180 () : java.lang.Integer {
      return VehicleIncident.Speed
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleDirection) at FNOLVehicleIncidentPopup.pcf: line 293, column 93
    function value_186 () : typekey.VehicleDirection {
      return VehicleIncident.VehicleDirection
    }
    
    // 'value' attribute on TypeKeyInput (id=CollisionPoint) at FNOLVehicleIncidentPopup.pcf: line 300, column 58
    function value_192 () : typekey.CollisionPoint {
      return VehicleIncident.CollisionPoint
    }
    
    // 'value' attribute on BooleanRadioInput (id=LoanInformation_Loan) at FNOLVehicleIncidentPopup.pcf: line 305, column 54
    function value_197 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Loan
    }
    
    // 'value' attribute on CurrencyInput (id=MonthlyPayment) at FNOLVehicleIncidentPopup.pcf: line 313, column 68
    function value_202 () : gw.api.financials.CurrencyAmount {
      return VehicleIncident.Vehicle.LoanMonthlyPayment
    }
    
    // 'value' attribute on TextInput (id=MonthsRemaining) at FNOLVehicleIncidentPopup.pcf: line 320, column 67
    function value_208 () : java.lang.Integer {
      return VehicleIncident.Vehicle.LoanMonthsRemaining
    }
    
    // 'value' attribute on CurrencyInput (id=PayoffAmount) at FNOLVehicleIncidentPopup.pcf: line 326, column 67
    function value_214 () : gw.api.financials.CurrencyAmount {
      return VehicleIncident.Vehicle.LoanPayoffAmount
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_VehicleType) at FNOLVehicleIncidentPopup.pcf: line 87, column 106
    function value_23 () : typekey.VehicleType {
      return VehicleIncident.VehicleType
    }
    
    // 'value' attribute on RowIterator at FNOLVehicleIncidentPopup.pcf: line 380, column 50
    function value_239 () : entity.Contact[] {
      return VehicleIncident.getContactsByRoles( {ContactRole.TC_DRIVER, ContactRole.TC_PASSENGER} )
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_VehLockInd) at FNOLVehicleIncidentPopup.pcf: line 419, column 52
    function value_241 () : java.lang.Boolean {
      return VehicleIncident.VehLockInd
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_AntiThftInd) at FNOLVehicleIncidentPopup.pcf: line 426, column 53
    function value_245 () : java.lang.Boolean {
      return VehicleIncident.AntiThftInd
    }
    
    // 'value' attribute on TextInput (id=Theft_OdomRead) at FNOLVehicleIncidentPopup.pcf: line 434, column 47
    function value_249 () : java.lang.Integer {
      return VehicleIncident.OdomRead
    }
    
    // 'value' attribute on TypeKeyInput (id=Theft_AffdvCmplInd) at FNOLVehicleIncidentPopup.pcf: line 443, column 43
    function value_253 () : typekey.YesNo {
      return VehicleIncident.AffdvCmplInd
    }
    
    // 'value' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at FNOLVehicleIncidentPopup.pcf: line 463, column 67
    function value_258 () : entity.Contact {
      return VehicleIncident.InsuredRep
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Year) at FNOLVehicleIncidentPopup.pcf: line 102, column 54
    function value_33 () : java.lang.Integer {
      return VehicleIncident.Vehicle.Year
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Make) at FNOLVehicleIncidentPopup.pcf: line 115, column 54
    function value_44 () : java.lang.String {
      return VehicleIncident.Vehicle.Make
    }
    
    // 'value' attribute on BooleanRadioInput (id=LossParty) at FNOLVehicleIncidentPopup.pcf: line 58, column 37
    function value_5 () : java.lang.Boolean {
      return InsurerLoss
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Model) at FNOLVehicleIncidentPopup.pcf: line 128, column 54
    function value_55 () : java.lang.String {
      return VehicleIncident.Vehicle.Model
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_Style) at FNOLVehicleIncidentPopup.pcf: line 142, column 54
    function value_66 () : typekey.VehicleStyle {
      return VehicleIncident.Vehicle.Style
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Color) at FNOLVehicleIncidentPopup.pcf: line 155, column 54
    function value_77 () : java.lang.String {
      return VehicleIncident.Vehicle.Color
    }
    
    // 'value' attribute on TextInput (id=Vehicle_LicensePlate) at FNOLVehicleIncidentPopup.pcf: line 167, column 54
    function value_88 () : java.lang.String {
      return VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Picker) at FNOLVehicleIncidentPopup.pcf: line 71, column 39
    function value_9 () : entity.Vehicle {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_State) at FNOLVehicleIncidentPopup.pcf: line 181, column 56
    function value_99 () : typekey.Jurisdiction {
      return VehicleIncident.Vehicle.State
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_134 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_134 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_134 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at FNOLVehicleIncidentPopup.pcf: line 71, column 39
    function verifyValueRangeIsAllowedType_18 ($$arg :  entity.Vehicle[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at FNOLVehicleIncidentPopup.pcf: line 71, column 39
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.api.database.IQueryBeanResult<entity.Vehicle>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at FNOLVehicleIncidentPopup.pcf: line 71, column 39
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_274 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_274 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_274 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_135 () : void {
      var __valueRangeArg = Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_134(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at FNOLVehicleIncidentPopup.pcf: line 71, column 39
    function verifyValueRange_19 () : void {
      var __valueRangeArg = VehicleIncident.AvailableVehicles
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_275 () : void {
      var __valueRangeArg = Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_274(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=Vehicle_VIN) at FNOLVehicleIncidentPopup.pcf: line 193, column 235
    function visible_110 () : java.lang.Boolean {
      return (!InsurerLoss or NewVehicle) and VehicleIncident.Vehicle.Style != VehicleStyle.TC_BOAT and VehicleIncident.Vehicle.Style != VehicleStyle.TC_ATV and VehicleIncident.Vehicle.Style != VehicleStyle.TC_SNOWMOBILE
    }
    
    // 'visible' attribute on ClaimContactInput (id=Owner_Picker) at FNOLVehicleIncidentPopup.pcf: line 206, column 93
    function visible_117 () : java.lang.Boolean {
      return VehicleIncident.VehicleLossParty == LossPartyType.TC_THIRD_PARTY
    }
    
    // 'visible' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_119 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_122 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (VehicleIncident.incidentowner), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on BooleanRadioInput (id=Exposure_AirbagsDeployed) at FNOLVehicleIncidentPopup.pcf: line 262, column 57
    function visible_167 () : java.lang.Boolean {
      return !VehicleIncident.VehStolenInd
    }
    
    // 'visible' attribute on TextInput (id=Speed) at FNOLVehicleIncidentPopup.pcf: line 286, column 93
    function visible_179 () : java.lang.Boolean {
      return !(VehicleIncident.VehStolenInd or VehicleIncident.VehicleParked)
    }
    
    // 'visible' attribute on CurrencyInput (id=MonthlyPayment) at FNOLVehicleIncidentPopup.pcf: line 313, column 68
    function visible_201 () : java.lang.Boolean {
      return  VehicleIncident.Vehicle.Loan == true  
    }
    
    // 'visible' attribute on TextInput (id=MonthsRemaining) at FNOLVehicleIncidentPopup.pcf: line 320, column 67
    function visible_207 () : java.lang.Boolean {
      return  VehicleIncident.Vehicle.Loan == true 
    }
    
    // 'visible' attribute on TypeKeyInput (id=Vehicle_VehicleType) at FNOLVehicleIncidentPopup.pcf: line 87, column 106
    function visible_22 () : java.lang.Boolean {
      return NewVehicle or VehicleIncident.VehicleLossParty == LossPartyType.TC_THIRD_PARTY
    }
    
    // 'visible' attribute on ToolbarButton (id=AddDriverButton) at FNOLVehicleIncidentPopup.pcf: line 361, column 63
    function visible_222 () : java.lang.Boolean {
      return VehicleIncident.driver == null
    }
    
    // 'visible' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at FNOLVehicleIncidentPopup.pcf: line 463, column 67
    function visible_257 () : java.lang.Boolean {
      return VehicleIncident.AffdvCmplInd == TC_YES
    }
    
    // 'visible' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 16, column 225
    function visible_262 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (VehicleIncident.InsuredRep), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=Vehicle_Year) at FNOLVehicleIncidentPopup.pcf: line 102, column 54
    function visible_32 () : java.lang.Boolean {
      return !InsurerLoss or NewVehicle
    }
    
    // 'visible' attribute on TypeKeyInput (id=Vehicle_State) at FNOLVehicleIncidentPopup.pcf: line 181, column 56
    function visible_98 () : java.lang.Boolean {
      return (!InsurerLoss or NewVehicle)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FNOLVehicleIncidentPopup {
      return super.CurrentLocation as pcf.FNOLVehicleIncidentPopup
    }
    
    property get InsurerLoss () : boolean {
      return getVariableValue("InsurerLoss", 0) as java.lang.Boolean
    }
    
    property set InsurerLoss ($arg :  boolean) {
      setVariableValue("InsurerLoss", 0, $arg)
    }
    
    property get NewVehicle () : boolean {
      return getVariableValue("NewVehicle", 0) as java.lang.Boolean
    }
    
    property set NewVehicle ($arg :  boolean) {
      setVariableValue("NewVehicle", 0, $arg)
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getVariableValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setVariableValue("VehicleIncident", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getVariableValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setVariableValue("Wizard", 0, $arg)
    }
    
    property get vehicleIncidentOtherServiceRequestsCopy () : java.util.Set<ServiceRequest> {
      return getVariableValue("vehicleIncidentOtherServiceRequestsCopy", 0) as java.util.Set<ServiceRequest>
    }
    
    property set vehicleIncidentOtherServiceRequestsCopy ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("vehicleIncidentOtherServiceRequestsCopy", 0, $arg)
    }
    
    
    function initializeVariable() {
      if (Claim == null) {
        Claim = VehicleIncident.getClaim();
      }
      if (VehicleIncident == null) {
        VehicleIncident = new VehicleIncident();
        VehicleIncident.Vehicle = new Vehicle();
        NewVehicle = true;
        if (Claim.VehicleIncidentsOnly.length == 0) {
          InsurerLoss = true;
          VehicleIncident.VehicleLossParty = LossPartyType.TC_INSURED;
        } else if(Claim.LossType == TC_TRAV) {
          //Travel vehicle incidents should default to 3rd party
          InsurerLoss = false;
          VehicleIncident.VehicleLossParty = LossPartyType.TC_THIRD_PARTY;
        } else {
          InsurerLoss = false;
          VehicleIncident.VehicleLossParty = LossPartyType.TC_THIRD_PARTY;
        }
        Claim.addToIncidents(VehicleIncident);
      }
      else {
        InsurerLoss = checkForIncident();
      }
    }    
    
    function checkForIncident() : boolean {
      if (VehicleIncident.VehicleLossParty == LossPartyType.TC_INSURED) {
        return true;
      } else if (VehicleIncident.VehicleLossParty == LossPartyType.TC_THIRD_PARTY) {
        return false;
      } else {
        for (currentVehicle in Claim.Policy.Vehicles) {
          if ((currentVehicle).Vehicle == VehicleIncident.Vehicle) {
            VehicleIncident.VehicleLossParty = LossPartyType.TC_INSURED;
            return true;
          }
        }
        VehicleIncident.VehicleLossParty = LossPartyType.TC_THIRD_PARTY;
        return false;
      }
    }
    
    /**
     * Removes any orphaned injury incidents that were created that no longer have any involvement 
     * with the vehicle incident.  Also finishes initializing any service requests that were created.
     */
    function cleanBeforeCommit() {   
      // Travel LOB does not need to remove the injury incidents
      if(VehicleIncident.Claim.LossType != TC_TRAV) {
        var involvedPersons = new java.util.HashSet<Contact>();
        var injuryIncidents = VehicleIncident.Claim.InjuryIncidentsOnly
        
        // retrieve a list of all drivers and passegners on the all vehicle incidents
        Claim.VehicleIncidentsOnly.each(\ v -> v.getContactsByRoles( {ContactRole.TC_DRIVER, ContactRole.TC_PASSENGER} ).each(\ c -> involvedPersons.add(c)))
        Claim.getContactsByRole(ContactRole.TC_PEDESTRIAN).each(\ c-> involvedPersons.add(c))
        
        injuryIncidents.each( \ ii -> {
          // if the injured person for the incident is not related to any contacts on a vehicle incidents, remove it. 
          if (!involvedPersons.contains( ii.injured )) {
            Claim.removeFromIncidents( ii )
            gw.api.claim.FnolServiceRequestHelper.removeIncidentServiceRequests(ii, Wizard)
          }
        })
      }
      
      FnolServiceRequestHelper.cleanAndFinishServiceRequests(Wizard)
    }
    
    function removeContact(contact : Contact) {  
      if (VehicleIncident.driver == contact) {
        VehicleIncident.driver = null;
      } else {
        VehicleIncident.removeRole( ContactRole.TC_PASSENGER, contact );
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLVehicleIncidentPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=name) at FNOLVehicleIncidentPopup.pcf: line 399, column 249
    function action_233 () : void {
      FNOLContactPopup.push(Claim, Claim.getClaimContact(ContactPerson), typekey.ContactRole.get(VehicleIncident.driver == ContactPerson ? "driver" : "passenger"), VehicleIncident, Wizard)
    }
    
    // 'action' attribute on TextCell (id=name) at FNOLVehicleIncidentPopup.pcf: line 399, column 249
    function action_dest_234 () : pcf.api.Destination {
      return pcf.FNOLContactPopup.createDestination(Claim, Claim.getClaimContact(ContactPerson), typekey.ContactRole.get(VehicleIncident.driver == ContactPerson ? "driver" : "passenger"), VehicleIncident, Wizard)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=RoleIcon) at FNOLVehicleIncidentPopup.pcf: line 394, column 46
    function iconLabel_231 () : java.lang.String {
      return VehicleIncident.driver == ContactPerson ? DisplayKey.get("Web.FNOLVehicleIncidentPopup.DriverIcon.Label") : DisplayKey.get("Web.FNOLVehicleIncidentPopup.PassengerIcon.Label")
    }
    
    // 'icon' attribute on BooleanRadioCell (id=InjuredIcon) at FNOLVehicleIncidentPopup.pcf: line 387, column 89
    function icon_228 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(ContactPerson)) == SeverityType.TC_FATAL ? "icon_fatality.png" : "icon_injury.png"
    }
    
    // 'icon' attribute on BooleanRadioCell (id=RoleIcon) at FNOLVehicleIncidentPopup.pcf: line 394, column 46
    function icon_230 () : java.lang.String {
      return VehicleIncident.driver == ContactPerson ? "icon_driver.png" : "icon_passenger.png"
    }
    
    // 'value' attribute on BooleanRadioCell (id=InjuredIcon) at FNOLVehicleIncidentPopup.pcf: line 387, column 89
    function value_227 () : java.lang.Boolean {
      return Wizard.isInjured(Claim.getClaimContact(ContactPerson))
    }
    
    // 'value' attribute on TextCell (id=name) at FNOLVehicleIncidentPopup.pcf: line 399, column 249
    function value_232 () : java.lang.String {
      return DisplayKey.get("Web.FNOLVehicleIncidentPopup.NamePosition", ContactPerson.DisplayName, (VehicleIncident.driver == ContactPerson ? ContactRole.TC_DRIVER.DisplayName : ContactRole.TC_PASSENGER.DisplayName))
    }
    
    // 'value' attribute on TextCell (id=Injuries) at FNOLVehicleIncidentPopup.pcf: line 403, column 102
    function value_236 () : java.lang.String {
      return Wizard.getInjuryDescription( Claim.getClaimContact(ContactPerson) )
    }
    
    property get ContactPerson () : entity.Contact {
      return getIteratedValue(1) as entity.Contact
    }
    
    
  }
  
  
}