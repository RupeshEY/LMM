package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailDV_WcinjurydamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_48 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.altcontact), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_50 () : void {
      if (Exposure.altcontact != null) { ClaimContactDetailPopup.push(Exposure.altcontact, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_51 () : void {
      ClaimContactDetailPopup.push(Exposure.altcontact, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 16, column 225
    function action_68 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.nursecasemgr), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Wcinjurydamage.pcf: line 40, column 55
    function action_7 () : void {
      UserContactDetailPopup.push(Exposure.AssignedUser)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 18, column 285
    function action_70 () : void {
      if (Claim.nursecasemgr != null) { ClaimContactDetailPopup.push(Claim.nursecasemgr, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function action_71 () : void {
      ClaimContactDetailPopup.push(Claim.nursecasemgr, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_49 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.altcontact), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_52 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.altcontact, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_69 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.nursecasemgr), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_72 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.nursecasemgr, Claim)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Wcinjurydamage.pcf: line 40, column 55
    function action_dest_8 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Exposure.AssignedUser)
    }
    
    // 'available' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Wcinjurydamage.pcf: line 40, column 55
    function available_4 () : java.lang.Boolean {
      return Exposure.AssignedUser.Contact != null
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 149, column 28
    function def_onEnter_107 (def :  pcf.EditableBodyPartDetailsLV) : void {
      def.onEnter(Claim.ensureClaimInjuryIncident(), true)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 156, column 28
    function def_onEnter_109 (def :  pcf.MedicalDiagnosisLV) : void {
      def.onEnter(Claim.ensureClaimInjuryIncident(), false)
    }
    
    // 'def' attribute on PanelRef (id=PlannedActivities) at ExposureDetailDV.Wcinjurydamage.pcf: line 164, column 38
    function def_onEnter_111 (def :  pcf.WCExposureActivitiesLV) : void {
      def.onEnter( gw.api.database.Query.make(entity.Activity).compare("Exposure", Equals, Exposure).select() )
    }
    
    // 'def' attribute on PanelRef (id=MedicalNotes) at ExposureDetailDV.Wcinjurydamage.pcf: line 173, column 33
    function def_onEnter_113 (def :  pcf.NotesLV) : void {
      def.onEnter(Exposure.Claim != null ? Exposure.Claim.getViewableNotes(NoteTopicType.TC_MEDICAL) : null)
    }
    
    // 'def' attribute on InputSetRef at ExposureDetailDV.Wcinjurydamage.pcf: line 183, column 57
    function def_onEnter_115 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 192, column 43
    function def_onEnter_118 (def :  pcf.WCInjuryDamageDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 200, column 26
    function def_onEnter_120 (def :  pcf.MedCaseMgrDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 207, column 39
    function def_onEnter_123 (def :  pcf.ISODetailsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_45 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.altcontact), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_65 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.nursecasemgr), null, Claim)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 149, column 28
    function def_refreshVariables_108 (def :  pcf.EditableBodyPartDetailsLV) : void {
      def.refreshVariables(Claim.ensureClaimInjuryIncident(), true)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 156, column 28
    function def_refreshVariables_110 (def :  pcf.MedicalDiagnosisLV) : void {
      def.refreshVariables(Claim.ensureClaimInjuryIncident(), false)
    }
    
    // 'def' attribute on PanelRef (id=PlannedActivities) at ExposureDetailDV.Wcinjurydamage.pcf: line 164, column 38
    function def_refreshVariables_112 (def :  pcf.WCExposureActivitiesLV) : void {
      def.refreshVariables( gw.api.database.Query.make(entity.Activity).compare("Exposure", Equals, Exposure).select() )
    }
    
    // 'def' attribute on PanelRef (id=MedicalNotes) at ExposureDetailDV.Wcinjurydamage.pcf: line 173, column 33
    function def_refreshVariables_114 (def :  pcf.NotesLV) : void {
      def.refreshVariables(Exposure.Claim != null ? Exposure.Claim.getViewableNotes(NoteTopicType.TC_MEDICAL) : null)
    }
    
    // 'def' attribute on InputSetRef at ExposureDetailDV.Wcinjurydamage.pcf: line 183, column 57
    function def_refreshVariables_116 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 192, column 43
    function def_refreshVariables_119 (def :  pcf.WCInjuryDamageDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 200, column 26
    function def_refreshVariables_121 (def :  pcf.MedCaseMgrDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Wcinjurydamage.pcf: line 207, column 39
    function def_refreshVariables_124 (def :  pcf.ISODetailsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_46 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.altcontact), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_66 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.nursecasemgr), null, Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.altcontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.nursecasemgr = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'initialValue' attribute on Variable at ExposureDetailDV.Wcinjurydamage.pcf: line 18, column 21
    function initialValue_0 () : Claim {
      return Exposure.Claim
    }
    
    // 'onPick' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_53 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.altcontact); var result = eval("Exposure.altcontact = Exposure.Claim.resolveContact(Exposure.altcontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function onPick_73 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.nursecasemgr); var result = eval("Claim.nursecasemgr = Claim.resolveContact(Claim.nursecasemgr) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_57 () : java.lang.Object {
      return Exposure.Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_77 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at ExposureDetailDV.Wcinjurydamage.pcf: line 33, column 49
    function valueRoot_3 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_76 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at ExposureDetailDV.Wcinjurydamage.pcf: line 105, column 70
    function valueRoot_85 () : java.lang.Object {
      return Claim.ensureClaimInjuryIncident()
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at ExposureDetailDV.Wcinjurydamage.pcf: line 114, column 63
    function valueRoot_88 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at ExposureDetailDV.Wcinjurydamage.pcf: line 33, column 49
    function value_1 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at ExposureDetailDV.Wcinjurydamage.pcf: line 139, column 49
    function value_101 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at ExposureDetailDV.Wcinjurydamage.pcf: line 144, column 50
    function value_104 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at ExposureDetailDV.Wcinjurydamage.pcf: line 44, column 64
    function value_11 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at ExposureDetailDV.Wcinjurydamage.pcf: line 49, column 50
    function value_14 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on DateInput (id=ReOpenDate) at ExposureDetailDV.Wcinjurydamage.pcf: line 55, column 56
    function value_18 () : java.util.Date {
      return Exposure.ReOpenDate
    }
    
    // 'value' attribute on TypeKeyInput (id=ReopenedReason) at ExposureDetailDV.Wcinjurydamage.pcf: line 61, column 56
    function value_23 () : typekey.ExposureReopenedReason {
      return Exposure.ReopenedReason
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at ExposureDetailDV.Wcinjurydamage.pcf: line 66, column 56
    function value_28 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at ExposureDetailDV.Wcinjurydamage.pcf: line 72, column 56
    function value_33 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ExposureDetailDV.Wcinjurydamage.pcf: line 76, column 44
    function value_37 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on TypeKeyInput (id=ValidationLevel) at ExposureDetailDV.Wcinjurydamage.pcf: line 81, column 52
    function value_40 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on ClaimContactInput (id=AltContact_Name) at ExposureDetailDV.Wcinjurydamage.pcf: line 90, column 42
    function value_43 () : entity.Person {
      return Exposure.altcontact
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Wcinjurydamage.pcf: line 40, column 55
    function value_5 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ExposureDetailDV.Wcinjurydamage.pcf: line 101, column 42
    function value_63 () : entity.Person {
      return Claim.nursecasemgr
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at ExposureDetailDV.Wcinjurydamage.pcf: line 105, column 70
    function value_83 () : java.lang.String {
      return Claim.ensureClaimInjuryIncident().Description
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at ExposureDetailDV.Wcinjurydamage.pcf: line 114, column 63
    function value_86 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at ExposureDetailDV.Wcinjurydamage.pcf: line 118, column 60
    function value_89 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at ExposureDetailDV.Wcinjurydamage.pcf: line 122, column 59
    function value_92 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at ExposureDetailDV.Wcinjurydamage.pcf: line 126, column 61
    function value_95 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at ExposureDetailDV.Wcinjurydamage.pcf: line 131, column 62
    function value_98 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_58 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_58 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_58 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_78 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_78 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_78 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_59 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_58(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_79 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_78(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=AltContact_Name) at ExposureDetailDV.Wcinjurydamage.pcf: line 90, column 42
    function verifyValueType_62 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ExposureDetailDV.Wcinjurydamage.pcf: line 101, column 42
    function verifyValueType_82 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on Card (id=WCMedCaseMgmt_MainCard) at ExposureDetailDV.Wcinjurydamage.pcf: line 22, column 50
    function visible_117 () : java.lang.Boolean {
      return Claim.LossType == LossType.TC_WC
    }
    
    // 'visible' attribute on Card (id=Exposure_ISOCard) at ExposureDetailDV.Wcinjurydamage.pcf: line 205, column 56
    function visible_125 () : java.lang.Boolean {
      return !Exposure.Claim.ISOClaimLevelMessaging
    }
    
    // 'visible' attribute on DateInput (id=ReOpenDate) at ExposureDetailDV.Wcinjurydamage.pcf: line 55, column 56
    function visible_17 () : java.lang.Boolean {
      return  Exposure.ReOpenDate != null 
    }
    
    // 'visible' attribute on DateInput (id=ClosedDate) at ExposureDetailDV.Wcinjurydamage.pcf: line 66, column 56
    function visible_27 () : java.lang.Boolean {
      return  Exposure.State == TC_CLOSED 
    }
    
    // 'visible' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_44 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_47 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.altcontact), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claim_NurseCaseManager) at ClaimContactWidget.xml: line 16, column 225
    function visible_67 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.nursecasemgr), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}