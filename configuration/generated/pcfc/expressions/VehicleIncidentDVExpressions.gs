package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.Set
@javax.annotation.Generated("config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehicleIncidentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_138 () : void {
      AddressBookPickerPopup.push(statictypeof (VehicleIncident.driver), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_140 () : void {
      if (VehicleIncident.driver != null) { ClaimContactDetailPopup.push(VehicleIncident.driver, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_141 () : void {
      ClaimContactDetailPopup.push(VehicleIncident.driver, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_185 () : void {
      AddressBookPickerPopup.push(statictypeof (VehicleIncident.incidentowner), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_187 () : void {
      if (VehicleIncident.incidentowner != null) { ClaimContactDetailPopup.push(VehicleIncident.incidentowner, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_189 () : void {
      ClaimContactDetailPopup.push(VehicleIncident.incidentowner, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 16, column 225
    function action_367 () : void {
      AddressBookPickerPopup.push(statictypeof (VehicleIncident.InsuredRep), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 18, column 285
    function action_369 () : void {
      if (VehicleIncident.InsuredRep != null) { ClaimContactDetailPopup.push(VehicleIncident.InsuredRep, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function action_371 () : void {
      ClaimContactDetailPopup.push(VehicleIncident.InsuredRep, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_402 () : void {
      AddressBookPickerPopup.push(statictypeof (VehicleIncident.recoveryagent), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_404 () : void {
      if (VehicleIncident.recoveryagent != null) { ClaimContactDetailPopup.push(VehicleIncident.recoveryagent, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_406 () : void {
      ClaimContactDetailPopup.push(VehicleIncident.recoveryagent, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_139 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (VehicleIncident.driver), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_142 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(VehicleIncident.driver, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_186 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (VehicleIncident.incidentowner), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_190 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(VehicleIncident.incidentowner, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_368 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (VehicleIncident.InsuredRep), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_372 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(VehicleIncident.InsuredRep, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_403 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (VehicleIncident.recoveryagent), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_407 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(VehicleIncident.recoveryagent, Claim)
    }
    
    // 'available' attribute on Reflect at VehicleIncidentDV.pcf: line 83, column 31
    function available_25 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return Claim.canEditVehicle(VALUE)
    }
    
    // 'available' attribute on TextInput (id=Vehicle_Year) at VehicleIncidentDV.pcf: line 79, column 39
    function available_28 () : java.lang.Boolean {
      return Claim.canEditVehicle(VehicleIncident.Vehicle)
    }
    
    // 'condition' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 49, column 55
    function condition_11 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Boolean {
      return VehicleIncident.Claim.Policy.isPolicyVehicle(VALUE)
    }
    
    // 'condition' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 242, column 39
    function condition_159 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'condition' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 245, column 43
    function condition_160 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Boolean {
      return VALUE==Claim.reporter
    }
    
    // 'condition' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 248, column 44
    function condition_162 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Boolean {
      return VALUE==Claim.maincontact
    }
    
    // 'condition' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 271, column 27
    function condition_170 (TRIGGER_INDEX :  int, VALUE :  typekey.PersonRelationType) : java.lang.Boolean {
      return VALUE == TC_SELF
    }
    
    // 'condition' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 289, column 45
    function condition_176 (TRIGGER_INDEX :  int, VALUE :  typekey.PersonRelationType) : java.lang.Boolean {
      return VALUE==TC_SELF
    }
    
    // 'def' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_135 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (VehicleIncident.driver), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_182 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (VehicleIncident.incidentowner), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentDV.pcf: line 350, column 57
    function def_onEnter_234 (def :  pcf.LoanInformationInputSet) : void {
      def.onEnter(VehicleIncident)
    }
    
    // 'def' attribute on ListViewInput (id=Driver_Citations) at VehicleIncidentDV.pcf: line 357, column 27
    function def_onEnter_236 (def :  pcf.DriverCitationsLV) : void {
      def.onEnter(VehicleIncident)
    }
    
    // 'def' attribute on ListViewInput (id=Contacts) at VehicleIncidentDV.pcf: line 369, column 27
    function def_onEnter_238 (def :  pcf.EditableIncidentContactsLV) : void {
      def.onEnter(VehicleIncident)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at VehicleIncidentDV.pcf: line 389, column 40
    function def_onEnter_244 (def :  pcf.AppraisalServiceInputSet) : void {
      def.onEnter(PropertyAppraisalServiceRequest, VehicleIncident, unusedServiceRequests, appraisalIncidentCode)
    }
    
    // 'def' attribute on InputSetRef (id=RentalServiceInputSet) at VehicleIncidentDV.pcf: line 392, column 37
    function def_onEnter_246 (def :  pcf.RentalServiceInputSet) : void {
      def.onEnter(RentalServiceRequest, VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentDV.pcf: line 394, column 145
    function def_onEnter_248 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.onEnter(Claim, VehicleIncident, otherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'def' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_364 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (VehicleIncident.InsuredRep), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_399 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (VehicleIncident.recoveryagent), null, Claim)
    }
    
    // 'def' attribute on InputSetRef (id=RecoveryAddress) at VehicleIncidentDV.pcf: line 612, column 143
    function def_onEnter_425 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(VehicleIncident.RecoveryAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_136 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (VehicleIncident.driver), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_183 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (VehicleIncident.incidentowner), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentDV.pcf: line 350, column 57
    function def_refreshVariables_235 (def :  pcf.LoanInformationInputSet) : void {
      def.refreshVariables(VehicleIncident)
    }
    
    // 'def' attribute on ListViewInput (id=Driver_Citations) at VehicleIncidentDV.pcf: line 357, column 27
    function def_refreshVariables_237 (def :  pcf.DriverCitationsLV) : void {
      def.refreshVariables(VehicleIncident)
    }
    
    // 'def' attribute on ListViewInput (id=Contacts) at VehicleIncidentDV.pcf: line 369, column 27
    function def_refreshVariables_239 (def :  pcf.EditableIncidentContactsLV) : void {
      def.refreshVariables(VehicleIncident)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at VehicleIncidentDV.pcf: line 389, column 40
    function def_refreshVariables_245 (def :  pcf.AppraisalServiceInputSet) : void {
      def.refreshVariables(PropertyAppraisalServiceRequest, VehicleIncident, unusedServiceRequests, appraisalIncidentCode)
    }
    
    // 'def' attribute on InputSetRef (id=RentalServiceInputSet) at VehicleIncidentDV.pcf: line 392, column 37
    function def_refreshVariables_247 (def :  pcf.RentalServiceInputSet) : void {
      def.refreshVariables(RentalServiceRequest, VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentDV.pcf: line 394, column 145
    function def_refreshVariables_249 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.refreshVariables(Claim, VehicleIncident, otherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'def' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_365 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (VehicleIncident.InsuredRep), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_400 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (VehicleIncident.recoveryagent), null, Claim)
    }
    
    // 'def' attribute on InputSetRef (id=RecoveryAddress) at VehicleIncidentDV.pcf: line 612, column 143
    function def_refreshVariables_426 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(VehicleIncident.RecoveryAddressOwner)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_LicensePlate) at VehicleIncidentDV.pcf: line 177, column 54
    function defaultSetter_109 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.LicensePlate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_BoatType) at VehicleIncidentDV.pcf: line 190, column 60
    function defaultSetter_120 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.BoatType = (__VALUE_TO_SET as typekey.BoatType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_OffRoadStyle) at VehicleIncidentDV.pcf: line 203, column 109
    function defaultSetter_131 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.OffRoadStyle = (__VALUE_TO_SET as typekey.OffRoadVehicleStyle)
    }
    
    // 'value' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_146 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.driver = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=ReasonForUse) at VehicleIncidentDV.pcf: line 229, column 43
    function defaultSetter_157 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleUseReason = (__VALUE_TO_SET as typekey.ReasonForUse)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at VehicleIncidentDV.pcf: line 44, column 43
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleLossParty = (__VALUE_TO_SET as typekey.LossPartyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=RelationToInsured) at VehicleIncidentDV.pcf: line 237, column 24
    function defaultSetter_168 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.DriverRelation = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=OwnersPermission) at VehicleIncidentDV.pcf: line 266, column 24
    function defaultSetter_174 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.OwnersPermission = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_193 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.incidentowner = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Driver_IsKidInPolicy) at VehicleIncidentDV.pcf: line 301, column 62
    function defaultSetter_205 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.MinorOnPolicy = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on TypeKeyInput (id=Driver_IsKidInPolicy_Percentagedriven) at VehicleIncidentDV.pcf: line 311, column 110
    function defaultSetter_211 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.PercentageDrivenByMinor = (__VALUE_TO_SET as typekey.PercentageDriven)
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_VehicleType) at VehicleIncidentDV.pcf: line 61, column 41
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleType = (__VALUE_TO_SET as typekey.VehicleType)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at VehicleIncidentDV.pcf: line 406, column 46
    function defaultSetter_252 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleParked) at VehicleIncidentDV.pcf: line 413, column 47
    function defaultSetter_256 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleParked = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossOccured) at VehicleIncidentDV.pcf: line 422, column 41
    function defaultSetter_260 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.LossOccured = (__VALUE_TO_SET as typekey.LossOccured)
    }
    
    // 'value' attribute on TextInput (id=LossDesc) at VehicleIncidentDV.pcf: line 430, column 58
    function defaultSetter_266 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.LossDesc = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_AirbagsDeployed) at VehicleIncidentDV.pcf: line 436, column 51
    function defaultSetter_272 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.AirbagsDeployed = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_EquipmentFailure) at VehicleIncidentDV.pcf: line 441, column 51
    function defaultSetter_276 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.EquipmentFailure = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Operable) at VehicleIncidentDV.pcf: line 446, column 50
    function defaultSetter_280 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleOperable = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=TotalLoss) at VehicleIncidentDV.pcf: line 451, column 44
    function defaultSetter_284 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.TotalLoss = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at VehicleIncidentDV.pcf: line 457, column 47
    function defaultSetter_288 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.LossEstimate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Collision_Indicator) at VehicleIncidentDV.pcf: line 465, column 43
    function defaultSetter_292 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Collision = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=HitAndRun) at VehicleIncidentDV.pcf: line 473, column 45
    function defaultSetter_298 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.HitAndRun = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PhantomVehicle) at VehicleIncidentDV.pcf: line 481, column 46
    function defaultSetter_304 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.PhantomVehicle = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Speed) at VehicleIncidentDV.pcf: line 488, column 81
    function defaultSetter_310 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Speed = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleDirection) at VehicleIncidentDV.pcf: line 495, column 46
    function defaultSetter_316 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehicleDirection = (__VALUE_TO_SET as typekey.VehicleDirection)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Year) at VehicleIncidentDV.pcf: line 79, column 39
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Year = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=CollisionPoint) at VehicleIncidentDV.pcf: line 502, column 46
    function defaultSetter_322 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.CollisionPoint = (__VALUE_TO_SET as typekey.CollisionPoint)
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_TrafficViolation) at VehicleIncidentDV.pcf: line 509, column 46
    function defaultSetter_328 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.TrafficViolation = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_Indicator) at VehicleIncidentDV.pcf: line 519, column 145
    function defaultSetter_335 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehStolenInd = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_VehLockInd) at VehicleIncidentDV.pcf: line 527, column 48
    function defaultSetter_341 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.VehLockInd = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_AntiThftInd) at VehicleIncidentDV.pcf: line 535, column 48
    function defaultSetter_347 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.AntiThftInd = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Theft_OdomRead) at VehicleIncidentDV.pcf: line 544, column 48
    function defaultSetter_353 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.OdomRead = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=Theft_AffdvCmplInd) at VehicleIncidentDV.pcf: line 554, column 48
    function defaultSetter_359 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.AffdvCmplInd = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_375 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.InsuredRep = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on DateInput (id=RecoveryDate) at VehicleIncidentDV.pcf: line 584, column 49
    function defaultSetter_388 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.RecovDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryState) at VehicleIncidentDV.pcf: line 591, column 49
    function defaultSetter_394 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.RecovState = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Make) at VehicleIncidentDV.pcf: line 91, column 46
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Make = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_410 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.recoveryagent = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCondition) at VehicleIncidentDV.pcf: line 606, column 48
    function defaultSetter_422 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.RecovCondType = (__VALUE_TO_SET as typekey.RecovCondType)
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle = (__VALUE_TO_SET as entity.Vehicle)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Model) at VehicleIncidentDV.pcf: line 103, column 47
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Model = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_Style) at VehicleIncidentDV.pcf: line 116, column 42
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Style = (__VALUE_TO_SET as typekey.VehicleStyle)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Color) at VehicleIncidentDV.pcf: line 128, column 47
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Color = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_VIN) at VehicleIncidentDV.pcf: line 140, column 155
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Vin = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Vehicle_SerialNumber) at VehicleIncidentDV.pcf: line 152, column 153
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.SerialNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_State) at VehicleIncidentDV.pcf: line 165, column 42
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.State = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Vehicle_State) at VehicleIncidentDV.pcf: line 165, column 42
    function filter_101 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_VEHICLE_REG)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Driver_LicenseState) at VehicleIncidentDV.pcf: line 343, column 42
    function filter_233 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_DRIVING_LIC)
    }
    
    // 'initialValue' attribute on Variable at VehicleIncidentDV.pcf: line 16, column 21
    function initialValue_0 () : Claim {
      return VehicleIncident.Claim
    }
    
    // 'initialValue' attribute on Variable at VehicleIncidentDV.pcf: line 20, column 22
    function initialValue_1 () : String {
      return gw.vendormanagement.SpecialistServiceCodeConstants.AUTOAPPRAISAL
    }
    
    // 'initialValue' attribute on Variable at VehicleIncidentDV.pcf: line 24, column 51
    function initialValue_2 () : java.util.Set<ServiceRequest> {
      return createOtherServiceRequests()
    }
    
    // 'newValue' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function newValue_7 () : java.lang.Object {
      return new Vehicle(VehicleIncident)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_143 (PickedValue :  Contact) : void {
      var contactType = statictypeof (VehicleIncident.driver); var result = eval("VehicleIncident.driver = Claim.resolveContact(VehicleIncident.driver) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_191 (PickedValue :  Contact) : void {
      var contactType = statictypeof (VehicleIncident.incidentowner); var result = eval("VehicleIncident.incidentowner = Claim.resolveContact(VehicleIncident.incidentowner) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function onPick_373 (PickedValue :  Contact) : void {
      var contactType = statictypeof (VehicleIncident.InsuredRep); var result = eval("VehicleIncident.InsuredRep = Claim.resolveContact(VehicleIncident.InsuredRep) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_408 (PickedValue :  Contact) : void {
      var contactType = statictypeof (VehicleIncident.recoveryagent); var result = eval("VehicleIncident.recoveryagent = Claim.resolveContact(VehicleIncident.recoveryagent) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 181, column 39
    function reflectionValue_103 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.LicensePlate
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 194, column 35
    function reflectionValue_112 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.BoatType
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 207, column 39
    function reflectionValue_123 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.OffRoadStyle
    }
    
    // Reflect at VehicleIncidentDV.pcf: line 46, column 39
    function reflectionValue_13 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return (VehicleIncident.Claim.Policy.isPolicyVehicle(VALUE)) ? (typekey.LossPartyType.TC_INSURED) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at VehicleIncidentDV.pcf: line 239, column 38
    function reflectionValue_164 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (VALUE==Claim.reporter) ? (Claim.ReportedByType) : (VALUE==Claim.maincontact) ? (Claim.MainContactType) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at VehicleIncidentDV.pcf: line 268, column 42
    function reflectionValue_171 (TRIGGER_INDEX :  int, VALUE :  typekey.PersonRelationType) : java.lang.Object {
      return (VALUE == TC_SELF) ? (true) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at VehicleIncidentDV.pcf: line 286, column 42
    function reflectionValue_178 (TRIGGER_INDEX :  int, VALUE :  typekey.PersonRelationType) : java.lang.Object {
      return (VALUE==TC_SELF) ? (VehicleIncident.driver) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at VehicleIncidentDV.pcf: line 63, column 39
    function reflectionValue_20 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return (VehicleIncident.Claim.Policy.isPolicyVehicle(VALUE)) ? (typekey.VehicleType.TC_LISTED) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 318, column 44
    function reflectionValue_213 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 328, column 53
    function reflectionValue_218 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 336, column 40
    function reflectionValue_223 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.LicenseNumber
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 346, column 39
    function reflectionValue_228 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.LicenseState
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 83, column 31
    function reflectionValue_26 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Year
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 95, column 31
    function reflectionValue_35 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Make
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 107, column 32
    function reflectionValue_44 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Model
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 120, column 32
    function reflectionValue_53 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Style
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 132, column 32
    function reflectionValue_62 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Color
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 144, column 30
    function reflectionValue_71 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.Vin
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 156, column 39
    function reflectionValue_82 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.SerialNumber
    }
    
    // 'value' attribute on Reflect at VehicleIncidentDV.pcf: line 169, column 32
    function reflectionValue_93 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return VALUE.State
    }
    
    // 'required' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function required_144 () : java.lang.Boolean {
      return !VehicleIncident.VehicleParked
    }
    
    // 'required' attribute on TypeKeyInput (id=RelationToInsured) at VehicleIncidentDV.pcf: line 237, column 24
    function required_166 () : java.lang.Boolean {
      return (VehicleIncident.VehicleLossParty ==  TC_INSURED) and !VehicleIncident.VehicleParked
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_148 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_195 () : java.lang.Object {
      return Claim.RelatedContacts
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function valueRange_8 () : java.lang.Object {
      return VehicleIncident.AvailableVehicles
    }
    
    // 'value' attribute on TextInput (id=Driver_Phone) at VehicleIncidentDV.pcf: line 315, column 58
    function valueRoot_217 () : java.lang.Object {
      return VehicleIncident.driver
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Year) at VehicleIncidentDV.pcf: line 79, column 39
    function valueRoot_33 () : java.lang.Object {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function valueRoot_6 () : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=Vehicle_LicensePlate) at VehicleIncidentDV.pcf: line 177, column 54
    function value_106 () : java.lang.String {
      return VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_BoatType) at VehicleIncidentDV.pcf: line 190, column 60
    function value_116 () : typekey.BoatType {
      return VehicleIncident.Vehicle.BoatType
    }
    
    // 'value' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 49, column 55
    function value_12 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return typekey.LossPartyType.TC_INSURED
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_OffRoadStyle) at VehicleIncidentDV.pcf: line 203, column 109
    function value_127 () : typekey.OffRoadVehicleStyle {
      return VehicleIncident.Vehicle.OffRoadStyle
    }
    
    // 'value' attribute on ClaimContactInput (id=Driver_Picker) at VehicleIncidentDV.pcf: line 223, column 25
    function value_133 () : entity.Person {
      return VehicleIncident.driver
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at VehicleIncidentDV.pcf: line 44, column 43
    function value_14 () : typekey.LossPartyType {
      return VehicleIncident.VehicleLossParty
    }
    
    // 'value' attribute on TypeKeyInput (id=ReasonForUse) at VehicleIncidentDV.pcf: line 229, column 43
    function value_155 () : typekey.ReasonForUse {
      return VehicleIncident.VehicleUseReason
    }
    
    // 'value' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 245, column 43
    function value_161 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 248, column 44
    function value_163 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return Claim.MainContactType
    }
    
    // 'value' attribute on TypeKeyInput (id=RelationToInsured) at VehicleIncidentDV.pcf: line 237, column 24
    function value_165 () : typekey.PersonRelationType {
      return VehicleIncident.DriverRelation
    }
    
    // 'value' attribute on BooleanRadioInput (id=OwnersPermission) at VehicleIncidentDV.pcf: line 266, column 24
    function value_172 () : java.lang.Boolean {
      return VehicleIncident.OwnersPermission
    }
    
    // 'value' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 289, column 45
    function value_177 (TRIGGER_INDEX :  int, VALUE :  typekey.PersonRelationType) : java.lang.Object {
      return VehicleIncident.driver
    }
    
    // 'value' attribute on ClaimContactInput (id=Owner_Picker) at VehicleIncidentDV.pcf: line 284, column 70
    function value_180 () : entity.Contact {
      return VehicleIncident.incidentowner
    }
    
    // 'value' attribute on ReflectCondition at VehicleIncidentDV.pcf: line 66, column 52
    function value_19 (TRIGGER_INDEX :  int, VALUE :  entity.Vehicle) : java.lang.Object {
      return typekey.VehicleType.TC_LISTED
    }
    
    // 'value' attribute on TypeKeyInput (id=Driver_IsKidInPolicy) at VehicleIncidentDV.pcf: line 301, column 62
    function value_202 () : typekey.YesNo {
      return VehicleIncident.MinorOnPolicy
    }
    
    // 'value' attribute on TypeKeyInput (id=Driver_IsKidInPolicy_Percentagedriven) at VehicleIncidentDV.pcf: line 311, column 110
    function value_208 () : typekey.PercentageDriven {
      return VehicleIncident.PercentageDrivenByMinor
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_VehicleType) at VehicleIncidentDV.pcf: line 61, column 41
    function value_21 () : typekey.VehicleType {
      return VehicleIncident.VehicleType
    }
    
    // 'value' attribute on TextInput (id=Driver_Phone) at VehicleIncidentDV.pcf: line 315, column 58
    function value_215 () : java.lang.String {
      return VehicleIncident.driver.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextAreaInput (id=Driver_Address) at VehicleIncidentDV.pcf: line 325, column 67
    function value_220 () : java.lang.String {
      return VehicleIncident.driver.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Driver_License) at VehicleIncidentDV.pcf: line 333, column 54
    function value_225 () : java.lang.String {
      return VehicleIncident.driver.LicenseNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Driver_LicenseState) at VehicleIncidentDV.pcf: line 343, column 42
    function value_230 () : typekey.Jurisdiction {
      return VehicleIncident.driver.LicenseState
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at VehicleIncidentDV.pcf: line 406, column 46
    function value_250 () : java.lang.String {
      return VehicleIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleParked) at VehicleIncidentDV.pcf: line 413, column 47
    function value_254 () : java.lang.Boolean {
      return VehicleIncident.VehicleParked
    }
    
    // 'value' attribute on TypeKeyInput (id=LossOccured) at VehicleIncidentDV.pcf: line 422, column 41
    function value_258 () : typekey.LossOccured {
      return VehicleIncident.LossOccured
    }
    
    // 'value' attribute on TextInput (id=LossDesc) at VehicleIncidentDV.pcf: line 430, column 58
    function value_263 () : java.lang.String {
      return VehicleIncident.LossDesc
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_AirbagsDeployed) at VehicleIncidentDV.pcf: line 436, column 51
    function value_269 () : java.lang.Boolean {
      return VehicleIncident.AirbagsDeployed
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_EquipmentFailure) at VehicleIncidentDV.pcf: line 441, column 51
    function value_274 () : java.lang.Boolean {
      return VehicleIncident.EquipmentFailure
    }
    
    // 'value' attribute on BooleanRadioInput (id=Operable) at VehicleIncidentDV.pcf: line 446, column 50
    function value_278 () : java.lang.Boolean {
      return VehicleIncident.VehicleOperable
    }
    
    // 'value' attribute on BooleanRadioInput (id=TotalLoss) at VehicleIncidentDV.pcf: line 451, column 44
    function value_282 () : java.lang.Boolean {
      return VehicleIncident.TotalLoss
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at VehicleIncidentDV.pcf: line 457, column 47
    function value_286 () : gw.api.financials.CurrencyAmount {
      return VehicleIncident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Year) at VehicleIncidentDV.pcf: line 79, column 39
    function value_29 () : java.lang.Integer {
      return VehicleIncident.Vehicle.Year
    }
    
    // 'value' attribute on BooleanRadioInput (id=Collision_Indicator) at VehicleIncidentDV.pcf: line 465, column 43
    function value_290 () : java.lang.Boolean {
      return VehicleIncident.Collision
    }
    
    // 'value' attribute on BooleanRadioInput (id=HitAndRun) at VehicleIncidentDV.pcf: line 473, column 45
    function value_295 () : java.lang.Boolean {
      return VehicleIncident.HitAndRun
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function value_3 () : entity.Vehicle {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on BooleanRadioInput (id=PhantomVehicle) at VehicleIncidentDV.pcf: line 481, column 46
    function value_301 () : java.lang.Boolean {
      return VehicleIncident.PhantomVehicle
    }
    
    // 'value' attribute on TextInput (id=Speed) at VehicleIncidentDV.pcf: line 488, column 81
    function value_307 () : java.lang.Integer {
      return VehicleIncident.Speed
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleDirection) at VehicleIncidentDV.pcf: line 495, column 46
    function value_313 () : typekey.VehicleDirection {
      return VehicleIncident.VehicleDirection
    }
    
    // 'value' attribute on TypeKeyInput (id=CollisionPoint) at VehicleIncidentDV.pcf: line 502, column 46
    function value_319 () : typekey.CollisionPoint {
      return VehicleIncident.CollisionPoint
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_TrafficViolation) at VehicleIncidentDV.pcf: line 509, column 46
    function value_325 () : typekey.YesNo {
      return VehicleIncident.TrafficViolation
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_Indicator) at VehicleIncidentDV.pcf: line 519, column 145
    function value_332 () : java.lang.Boolean {
      return VehicleIncident.VehStolenInd
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_VehLockInd) at VehicleIncidentDV.pcf: line 527, column 48
    function value_338 () : java.lang.Boolean {
      return VehicleIncident.VehLockInd
    }
    
    // 'value' attribute on BooleanRadioInput (id=Theft_AntiThftInd) at VehicleIncidentDV.pcf: line 535, column 48
    function value_344 () : java.lang.Boolean {
      return VehicleIncident.AntiThftInd
    }
    
    // 'value' attribute on TextInput (id=Theft_OdomRead) at VehicleIncidentDV.pcf: line 544, column 48
    function value_350 () : java.lang.Integer {
      return VehicleIncident.OdomRead
    }
    
    // 'value' attribute on TypeKeyInput (id=Theft_AffdvCmplInd) at VehicleIncidentDV.pcf: line 554, column 48
    function value_356 () : typekey.YesNo {
      return VehicleIncident.AffdvCmplInd
    }
    
    // 'value' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at VehicleIncidentDV.pcf: line 574, column 59
    function value_362 () : entity.Contact {
      return VehicleIncident.InsuredRep
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Make) at VehicleIncidentDV.pcf: line 91, column 46
    function value_38 () : java.lang.String {
      return VehicleIncident.Vehicle.Make
    }
    
    // 'value' attribute on DateInput (id=RecoveryDate) at VehicleIncidentDV.pcf: line 584, column 49
    function value_385 () : java.util.Date {
      return VehicleIncident.RecovDate
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryState) at VehicleIncidentDV.pcf: line 591, column 49
    function value_391 () : typekey.State {
      return VehicleIncident.RecovState
    }
    
    // 'value' attribute on ClaimContactInput (id=RecovAgcy_Picker) at VehicleIncidentDV.pcf: line 599, column 49
    function value_397 () : entity.Contact {
      return VehicleIncident.recoveryagent
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCondition) at VehicleIncidentDV.pcf: line 606, column 48
    function value_419 () : typekey.RecovCondType {
      return VehicleIncident.RecovCondType
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Model) at VehicleIncidentDV.pcf: line 103, column 47
    function value_47 () : java.lang.String {
      return VehicleIncident.Vehicle.Model
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_Style) at VehicleIncidentDV.pcf: line 116, column 42
    function value_56 () : typekey.VehicleStyle {
      return VehicleIncident.Vehicle.Style
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Color) at VehicleIncidentDV.pcf: line 128, column 47
    function value_65 () : java.lang.String {
      return VehicleIncident.Vehicle.Color
    }
    
    // 'value' attribute on TextInput (id=Vehicle_VIN) at VehicleIncidentDV.pcf: line 140, column 155
    function value_75 () : java.lang.String {
      return VehicleIncident.Vehicle.Vin
    }
    
    // 'value' attribute on TextInput (id=Vehicle_SerialNumber) at VehicleIncidentDV.pcf: line 152, column 153
    function value_86 () : java.lang.String {
      return VehicleIncident.Vehicle.SerialNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Vehicle_State) at VehicleIncidentDV.pcf: line 165, column 42
    function value_96 () : typekey.Jurisdiction {
      return VehicleIncident.Vehicle.State
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_149 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_149 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_149 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_196 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_196 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_196 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_378 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_378 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_378 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_413 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_413 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_413 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function verifyValueRangeIsAllowedType_9 ($$arg :  entity.Vehicle[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.database.IQueryBeanResult<entity.Vehicle>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Picker) at VehicleIncidentDV.pcf: line 38, column 37
    function verifyValueRange_10 () : void {
      var __valueRangeArg = VehicleIncident.AvailableVehicles
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_150 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_149(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_197 () : void {
      var __valueRangeArg = Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_196(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_379 () : void {
      var __valueRangeArg = Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_378(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_414 () : void {
      var __valueRangeArg = Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_413(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Driver_Picker) at VehicleIncidentDV.pcf: line 223, column 25
    function verifyValueType_154 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TypeKeyInput (id=Vehicle_BoatType) at VehicleIncidentDV.pcf: line 190, column 60
    function visible_115 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Style == TC_BOAT
    }
    
    // 'visible' attribute on TypeKeyInput (id=Vehicle_OffRoadStyle) at VehicleIncidentDV.pcf: line 203, column 109
    function visible_126 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Style == TC_ATV or VehicleIncident.Vehicle.Style == TC_SNOWMOBILE
    }
    
    // 'visible' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_134 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Driver_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_137 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (VehicleIncident.driver), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Owner_Picker) at VehicleIncidentDV.pcf: line 284, column 70
    function visible_179 () : java.lang.Boolean {
      return VehicleIncident.VehicleLossParty == TC_THIRD_PARTY
    }
    
    // 'visible' attribute on ClaimContactInput (id=Owner_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_184 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (VehicleIncident.incidentowner), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TypeKeyInput (id=Driver_IsKidInPolicy) at VehicleIncidentDV.pcf: line 301, column 62
    function visible_201 () : java.lang.Boolean {
      return VehicleIncident.DriverRelation == TC_CHILD
    }
    
    // 'visible' attribute on TypeKeyInput (id=Driver_IsKidInPolicy_Percentagedriven) at VehicleIncidentDV.pcf: line 311, column 110
    function visible_207 () : java.lang.Boolean {
      return  VehicleIncident.DriverRelToOwner == TC_CHILD and VehicleIncident.MinorOnPolicy == TC_NO 
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at VehicleIncidentDV.pcf: line 381, column 37
    function visible_240 () : java.lang.Boolean {
      return Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at VehicleIncidentDV.pcf: line 386, column 72
    function visible_242 () : java.lang.Boolean {
      return not Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on TextInput (id=LossDesc) at VehicleIncidentDV.pcf: line 430, column 58
    function visible_262 () : java.lang.Boolean {
      return VehicleIncident.LossOccured==TC_OTHER
    }
    
    // 'visible' attribute on TextInput (id=Speed) at VehicleIncidentDV.pcf: line 488, column 81
    function visible_306 () : java.lang.Boolean {
      return VehicleIncident.Collision and !VehicleIncident.VehicleParked
    }
    
    // 'visible' attribute on Label at VehicleIncidentDV.pcf: line 513, column 112
    function visible_330 () : java.lang.Boolean {
      return VehicleIncident.VehicleLossParty ==  TC_INSURED or VehicleIncident.VehicleLossParty == null
    }
    
    // 'visible' attribute on BooleanRadioInput (id=Theft_Indicator) at VehicleIncidentDV.pcf: line 519, column 145
    function visible_331 () : java.lang.Boolean {
      return (VehicleIncident.VehicleLossParty ==  TC_INSURED or VehicleIncident.VehicleLossParty == null) or VehicleIncident.VehStolenInd
    }
    
    // 'visible' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at VehicleIncidentDV.pcf: line 574, column 59
    function visible_361 () : java.lang.Boolean {
      return VehicleIncident.AffdvCmplInd == TC_YES
    }
    
    // 'visible' attribute on ClaimContactInput (id=Theft_AffdvCmplBy) at ClaimContactWidget.xml: line 16, column 225
    function visible_366 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (VehicleIncident.InsuredRep), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_401 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (VehicleIncident.recoveryagent), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on InputSetRef (id=RecoveryAddress) at VehicleIncidentDV.pcf: line 612, column 143
    function visible_424 () : java.lang.Boolean {
      return VehicleIncident.VehStolenInd and (VehicleIncident.RecovCondType != null and VehicleIncident.RecovCondType != TC_NOT_RECOV)
    }
    
    // 'visible' attribute on TextInput (id=Vehicle_VIN) at VehicleIncidentDV.pcf: line 140, column 155
    function visible_74 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Style != TC_BOAT and VehicleIncident.Vehicle.Style != TC_ATV and VehicleIncident.Vehicle.Style != TC_SNOWMOBILE
    }
    
    // 'visible' attribute on TextInput (id=Vehicle_SerialNumber) at VehicleIncidentDV.pcf: line 152, column 153
    function visible_85 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Style == TC_BOAT or VehicleIncident.Vehicle.Style == TC_ATV or VehicleIncident.Vehicle.Style == TC_SNOWMOBILE
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getRequireValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setRequireValue("VehicleIncident", 0, $arg)
    }
    
    property get appraisalIncidentCode () : String {
      return getVariableValue("appraisalIncidentCode", 0) as String
    }
    
    property set appraisalIncidentCode ($arg :  String) {
      setVariableValue("appraisalIncidentCode", 0, $arg)
    }
    
    property get otherServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("otherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set otherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("otherServiceRequests", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
    function findServiceRequest(serviceCode : String) : ServiceRequest {
      return VehicleIncident.ServiceRequests.firstWhere(\ sr ->
          sr.Instruction.Services.Count == 1
              and sr.Instruction.Services.single().Service.Code == serviceCode
              and (otherServiceRequests == null or not otherServiceRequests.contains(sr))
      )
    }
    
    property get PropertyAppraisalServiceRequest() : ServiceRequest {
      return findServiceRequest(appraisalIncidentCode)
    }
    
    property get RentalServiceRequest() : ServiceRequest {
      return findServiceRequest(gw.vendormanagement.SpecialistServiceCodeConstants.AUTORENTAL)
    }
    
    function createOtherServiceRequests() :  Set<ServiceRequest> {
      return VehicleIncident.ServiceRequests.where(\sr -> sr != PropertyAppraisalServiceRequest and sr != RentalServiceRequest).toSet()
    }
    
    function areAllOtherRequestsEditable() : boolean {
      return otherServiceRequests.allMatch( \ sr -> sr.IsEditableInUI)
    }
    
    
  }
  
  
}