package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossDetailsDV_TravExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_56 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_58 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_59 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_81 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_83 () : void {
      if (Claim.maincontact != null) { ClaimContactDetailPopup.push(Claim.maincontact, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_84 () : void {
      ClaimContactDetailPopup.push(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_57 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_60 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_82 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_85 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.maincontact, Claim)
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Trav.pcf: line 117, column 39
    function condition_70 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Trav.pcf: line 142, column 39
    function condition_96 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 163, column 27
    function def_onEnter_106 (def :  pcf.EditableTripIncidentsLV) : void {
      def.onEnter(Claim, false)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 175, column 27
    function def_onEnter_108 (def :  pcf.EditableBaggageIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 188, column 27
    function def_onEnter_110 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 201, column 27
    function def_onEnter_112 (def :  pcf.EditableVehicleIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 214, column 27
    function def_onEnter_114 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 227, column 27
    function def_onEnter_116 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 243, column 27
    function def_onEnter_118 (def :  pcf.EditableWitnessesLV) : void {
      def.onEnter(Claim.getClaimContactRolesByRole(TC_WITNESS), Claim, TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 254, column 27
    function def_onEnter_120 (def :  pcf.EditableContributingFactorsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Trav.pcf: line 82, column 49
    function def_onEnter_40 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_53 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_78 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 163, column 27
    function def_refreshVariables_107 (def :  pcf.EditableTripIncidentsLV) : void {
      def.refreshVariables(Claim, false)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 175, column 27
    function def_refreshVariables_109 (def :  pcf.EditableBaggageIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 188, column 27
    function def_refreshVariables_111 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 201, column 27
    function def_refreshVariables_113 (def :  pcf.EditableVehicleIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 214, column 27
    function def_refreshVariables_115 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 227, column 27
    function def_refreshVariables_117 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 243, column 27
    function def_refreshVariables_119 (def :  pcf.EditableWitnessesLV) : void {
      def.refreshVariables(Claim.getClaimContactRolesByRole(TC_WITNESS), Claim, TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Trav.pcf: line 254, column 27
    function def_refreshVariables_121 (def :  pcf.EditableContributingFactorsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Trav.pcf: line 82, column 49
    function def_refreshVariables_41 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_54 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_79 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsDV.Trav.pcf: line 34, column 41
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsDV.Trav.pcf: line 137, column 48
    function defaultSetter_100 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsDV.Trav.pcf: line 154, column 40
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateRptdToAgent = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Trav.pcf: line 45, column 46
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Trav.pcf: line 21, column 36
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Trav.pcf: line 53, column 41
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Weather) at LossDetailsDV.Trav.pcf: line 59, column 42
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Weather = (__VALUE_TO_SET as typekey.WeatherType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_EmploymentCourse) at LossDetailsDV.Trav.pcf: line 64, column 41
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentInjury = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=LossDate) at LossDetailsDV.Trav.pcf: line 73, column 32
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Trav.pcf: line 90, column 40
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsDV.Trav.pcf: line 96, column 46
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossCause) at LossDetailsDV.Trav.pcf: line 28, column 40
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsDV.Trav.pcf: line 112, column 48
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'mode' attribute on InputSetRef at LossDetailsDV.Trav.pcf: line 82, column 49
    function mode_42 () : java.lang.Object {
      return Claim.AddressOwner.InputSetMode
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsDV.Trav.pcf: line 75, column 74
    function onChange_33 () : void {
      gw.pcf.ClaimLossDetailsUtil.changedLossDate(Claim)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_61 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_86 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.maincontact); var result = eval("Claim.maincontact = Claim.resolveContact(Claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at LossDetailsDV.Trav.pcf: line 114, column 42
    function reflectionValue_71 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at LossDetailsDV.Trav.pcf: line 139, column 43
    function reflectionValue_97 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'validationExpression' attribute on DateInput (id=LossDate) at LossDetailsDV.Trav.pcf: line 73, column 32
    function validationExpression_34 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Trav.pcf: line 53, column 41
    function valueRange_22 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_65 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Trav.pcf: line 21, column 36
    function valueRoot_3 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Trav.pcf: line 21, column 36
    function value_0 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsDV.Trav.pcf: line 154, column 40
    function value_102 () : java.util.Date {
      return Claim.DateRptdToAgent
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Trav.pcf: line 45, column 46
    function value_13 () : java.math.BigDecimal {
      return Claim.Fault
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Trav.pcf: line 53, column 41
    function value_18 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Weather) at LossDetailsDV.Trav.pcf: line 59, column 42
    function value_25 () : typekey.WeatherType {
      return Claim.Weather
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_EmploymentCourse) at LossDetailsDV.Trav.pcf: line 64, column 41
    function value_29 () : java.lang.Boolean {
      return Claim.EmploymentInjury
    }
    
    // 'value' attribute on DateInput (id=LossDate) at LossDetailsDV.Trav.pcf: line 73, column 32
    function value_35 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TypeKeyInput (id=LossCause) at LossDetailsDV.Trav.pcf: line 28, column 40
    function value_4 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Trav.pcf: line 90, column 40
    function value_43 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsDV.Trav.pcf: line 96, column 46
    function value_47 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at LossDetailsDV.Trav.pcf: line 105, column 48
    function value_51 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsDV.Trav.pcf: line 112, column 48
    function value_72 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Trav.pcf: line 131, column 36
    function value_76 () : entity.Person {
      return Claim.maincontact
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsDV.Trav.pcf: line 34, column 41
    function value_8 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsDV.Trav.pcf: line 137, column 48
    function value_98 () : typekey.PersonRelationType {
      return Claim.MainContactType
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Trav.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Trav.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Trav.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_66 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_66 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_66 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_91 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_91 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_91 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Trav.pcf: line 53, column 41
    function verifyValueRange_24 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_23(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_67 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_66(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_92 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_91(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Trav.pcf: line 131, column 36
    function verifyValueType_95 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Trav.pcf: line 45, column 46
    function visible_12 () : java.lang.Boolean {
      return Claim.FaultRating == TC_1
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_52 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_55 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_80 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}