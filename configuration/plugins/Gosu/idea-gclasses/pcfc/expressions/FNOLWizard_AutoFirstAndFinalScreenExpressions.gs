package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_AutoFirstAndFinalScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_AutoFirstAndFinalScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 28, column 23
    function action_2 () : void {
      Wizard.goToFullWizardFromIncompatible("BasicInfo", "Summary")
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_30 () : void {
      AddressBookPickerPopup.push(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_32 () : void {
      if (exposure.Claimant != null) { ClaimContactDetailPopup.push(exposure.Claimant, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_33 () : void {
      ClaimContactDetailPopup.push(exposure.Claimant, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_74 () : void {
      AddressBookPickerPopup.push(statictypeof (serviceRequest.Specialist), Claim, new java.util.ArrayList<SpecialistService>())
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_76 () : void {
      if (serviceRequest.Specialist != null) { ClaimContactDetailPopup.push(serviceRequest.Specialist, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_78 () : void {
      ClaimContactDetailPopup.push(serviceRequest.Specialist, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_31 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_34 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(exposure.Claimant, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_75 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (serviceRequest.Specialist), Claim, new java.util.ArrayList<SpecialistService>())
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_79 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(serviceRequest.Specialist, Claim)
    }
    
    // 'condition' attribute on ReflectCondition at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 99, column 48
    function condition_44 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Claim.Insured==VALUE
    }
    
    // 'def' attribute on PanelRef (id=AutoFirstAndFinalReportedPanelSet) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 47, column 52
    function def_onEnter_10 (def :  pcf.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR) : void {
      def.onEnter(Claim, Wizard, VehicleIncident)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 171, column 86
    function def_onEnter_102 (def :  pcf.FNOLWizardCheckDV_notready) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 171, column 86
    function def_onEnter_104 (def :  pcf.FNOLWizardCheckDV_ready) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 178, column 60
    function def_onEnter_107 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_27 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (exposure.Claimant), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_71 (def :  pcf.ClaimNewRepairShopOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (serviceRequest.Specialist), null, Claim)
    }
    
    // 'def' attribute on PanelRef (id=AutoFirstAndFinalReportedPanelSet) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 47, column 52
    function def_onEnter_8 (def :  pcf.FNOLWizardAutoFirstAndFinalPanelSet_INSURED) : void {
      def.onEnter(Claim, Wizard, VehicleIncident)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 171, column 86
    function def_refreshVariables_103 (def :  pcf.FNOLWizardCheckDV_notready) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 171, column 86
    function def_refreshVariables_105 (def :  pcf.FNOLWizardCheckDV_ready) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 178, column 60
    function def_refreshVariables_108 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on PanelRef (id=AutoFirstAndFinalReportedPanelSet) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 47, column 52
    function def_refreshVariables_11 (def :  pcf.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR) : void {
      def.refreshVariables(Claim, Wizard, VehicleIncident)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_28 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (exposure.Claimant), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_72 (def :  pcf.ClaimNewRepairShopOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (serviceRequest.Specialist), null, Claim)
    }
    
    // 'def' attribute on PanelRef (id=AutoFirstAndFinalReportedPanelSet) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 47, column 52
    function def_refreshVariables_9 (def :  pcf.FNOLWizardAutoFirstAndFinalPanelSet_INSURED) : void {
      def.refreshVariables(Claim, Wizard, VehicleIncident)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReadyToPay) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 164, column 47
    function defaultSetter_100 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.Check.ReadyToPay = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=Claim_lossTime) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 191, column 39
    function defaultSetter_118 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Name) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 65, column 44
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleRU = (__VALUE_TO_SET as entity.VehicleRU)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 75, column 42
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on RangeInput (id=Claimant_Type) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 94, column 48
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=FirstFinalReportedAgencyRadioButton) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 37, column 56
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.FirstFinalReportedAgency = (__VALUE_TO_SET as typekey.FirstFinalReportedAgency)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 126, column 47
    function defaultSetter_65 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.Specialist = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=ServiceRequest_InstructionText) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 148, column 67
    function defaultSetter_93 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.Instruction.InstructionText = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on ClaimContactInput (id=RepairShop_Picker) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 140, column 30
    function editable_68 () : java.lang.Boolean {
      return Wizard.FirstFinalReportedAgency != typekey.FirstFinalReportedAgency.TC_VENDOR
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 16, column 24
    function initialValue_0 () : Exposure {
      return Claim.Exposures.single()
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 20, column 37
    function initialValue_1 () : entity.ServiceRequest {
      return Claim.ServiceRequests.single()
    }
    
    // 'mode' attribute on PanelRef at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 171, column 86
    function mode_106 () : java.lang.Object {
      return Wizard.Check.ReadyToPay ? "ready" : "notready"
    }
    
    // 'mode' attribute on PanelRef (id=AutoFirstAndFinalReportedPanelSet) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 47, column 52
    function mode_12 () : java.lang.Object {
      return Wizard.FirstFinalReportedAgency.Code
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 39, column 179
    function onChange_3 () : void {
      Claim.reporter = ((Wizard.FirstFinalReportedAgency == FirstFinalReportedAgency.TC_INSURED and Claim.Insured typeis entity.Person) ? Claim.Insured : null)
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 142, column 69
    function onChange_67 () : void {
      Wizard.repairShopOnPick(serviceRequest)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_35 (PickedValue :  Contact) : void {
      var contactType = statictypeof (exposure.Claimant); var result = eval("exposure.Claimant = Claim.resolveContact(exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_80 (PickedValue :  Contact) : void {
      var contactType = statictypeof (serviceRequest.Specialist); var result = eval("serviceRequest.Specialist = Claim.resolveContact(serviceRequest.Specialist) as " + contactType.Name + ";return null;"); Wizard.repairShopOnPick(serviceRequest);
    }
    
    // 'onPick' attribute on ClaimContactInput (id=RepairShop_Picker) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 140, column 30
    function onPick_88 (PickedValue :  java.lang.Object) : void {
      Wizard.repairShopOnPick(serviceRequest)
    }
    
    // Reflect at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 96, column 46
    function reflectionValue_45 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 111, column 50
    function reflectionValue_53 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 119, column 59
    function reflectionValue_58 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 184, column 39
    function validationExpression_109 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on RangeInput (id=Vehicle_Name) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 65, column 44
    function validationExpression_13 () : java.lang.Object {
      return !(VehicleIncident.Vehicle.Vin == null and VehicleIncident.Vehicle.LicensePlate == null and (VehicleIncident.Vehicle.Model == null or exposure.VehicleIncident.Vehicle.Make == null)) ? null : DisplayKey.get("NVV.Claim.SubView.NewQuickClaimClaimAutoFirstAndFinal.Claim.Vehicle.ValidationError")
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Name) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 65, column 44
    function valueRange_18 () : java.lang.Object {
      return Claim.Policy.Vehicles
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_39 () : java.lang.Object {
      return Claim.getRelatedContacts(exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'valueRange' attribute on RangeInput (id=Claimant_Type) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 94, column 48
    function valueRange_50 () : java.lang.Object {
      return ClaimantType.getTypeKeys(false)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_84 () : java.lang.Object {
      return Claim.RelatedAutoRepairShopArray
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReadyToPay) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 164, column 47
    function valueRoot_101 () : java.lang.Object {
      return Wizard.Check
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 75, column 42
    function valueRoot_24 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_38 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TextInput (id=Claimant_Workphone) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 108, column 59
    function valueRoot_57 () : java.lang.Object {
      return exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=FirstFinalReportedAgencyRadioButton) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 37, column 56
    function valueRoot_7 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_83 () : java.lang.Object {
      return serviceRequest
    }
    
    // 'value' attribute on TextInput (id=ServiceRequest_InstructionText) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 148, column 67
    function valueRoot_94 () : java.lang.Object {
      return serviceRequest.Instruction
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 184, column 39
    function value_110 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Name) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 65, column 44
    function value_14 () : entity.VehicleRU {
      return VehicleRU
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 75, column 42
    function value_21 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 85, column 92
    function value_25 () : entity.Contact {
      return exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=FirstFinalReportedAgencyRadioButton) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 37, column 56
    function value_4 () : typekey.FirstFinalReportedAgency {
      return Wizard.FirstFinalReportedAgency
    }
    
    // 'value' attribute on RangeInput (id=Claimant_Type) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 94, column 48
    function value_46 () : typekey.ClaimantType {
      return exposure.ClaimantType
    }
    
    // 'value' attribute on TextInput (id=Claimant_Workphone) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 108, column 59
    function value_55 () : java.lang.String {
      return exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 116, column 68
    function value_60 () : java.lang.String {
      return exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 126, column 47
    function value_63 () : java.lang.Boolean {
      return exposure.OtherCoverage
    }
    
    // 'value' attribute on ClaimContactInput (id=RepairShop_Picker) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 140, column 30
    function value_69 () : entity.Contact {
      return serviceRequest.Specialist
    }
    
    // 'value' attribute on TextInput (id=ServiceRequest_InstructionText) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 148, column 67
    function value_91 () : java.lang.String {
      return serviceRequest.Instruction.InstructionText
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_PrimaryCoverage) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 155, column 49
    function value_95 () : typekey.CoverageType {
      return exposure.PrimaryCoverage
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReadyToPay) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 164, column 47
    function value_98 () : java.lang.Boolean {
      return Wizard.Check.ReadyToPay
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Name) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 65, column 44
    function verifyValueRangeIsAllowedType_19 ($$arg :  entity.VehicleRU[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Name) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 65, column 44
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.api.database.IQueryBeanResult<entity.VehicleRU>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Name) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 65, column 44
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_40 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_40 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_40 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claimant_Type) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 94, column 48
    function verifyValueRangeIsAllowedType_51 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claimant_Type) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 94, column 48
    function verifyValueRangeIsAllowedType_51 ($$arg :  typekey.ClaimantType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_85 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_85 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_85 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Name) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 65, column 44
    function verifyValueRange_20 () : void {
      var __valueRangeArg = Claim.Policy.Vehicles
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_41 () : void {
      var __valueRangeArg = Claim.getRelatedContacts(exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_40(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Claimant_Type) at FNOLWizard_AutoFirstAndFinalScreen.pcf: line 94, column 48
    function verifyValueRange_52 () : void {
      var __valueRangeArg = ClaimantType.getTypeKeys(false)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_51(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_86 () : void {
      var __valueRangeArg = Claim.RelatedAutoRepairShopArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_85(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_26 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_29 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=RepairShop_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_73 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (serviceRequest.Specialist), Claim, new java.util.ArrayList<SpecialistService>())" != "" && true
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get exposure () : Exposure {
      return getVariableValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    property get serviceRequest () : entity.ServiceRequest {
      return getVariableValue("serviceRequest", 0) as entity.ServiceRequest
    }
    
    property set serviceRequest ($arg :  entity.ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get VehicleIncident() : VehicleIncident {return exposure.VehicleIncident}
    
    property get VehicleRU() : VehicleRU {
      return Claim.Policy.Vehicles.firstWhere( \ vru -> vru.Vehicle==exposure.VehicleIncident.Vehicle)
    }
    
    property set VehicleRU(riskUnit : VehicleRU) {
      VehicleIncident.Vehicle = riskUnit.Vehicle
      // changing the risk unit will invalidate any existing deductable.  Resetting the Wizard to not apply the deductible in this case
      if (exposure.Coverage.ClaimDeductible != null) {
        Wizard.Check.ApplyDeductible = false
      }
      exposure.updateCoverage(riskUnit)
    }
    
    
  }
  
  
}