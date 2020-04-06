package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossDetailsDV_AutoExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_55 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_57 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_58 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_80 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_82 () : void {
      if (Claim.maincontact != null) { ClaimContactDetailPopup.push(Claim.maincontact, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_83 () : void {
      ClaimContactDetailPopup.push(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_56 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_59 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_81 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_84 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.maincontact, Claim)
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Auto.pcf: line 116, column 39
    function condition_69 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Auto.pcf: line 141, column 39
    function condition_95 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 162, column 27
    function def_onEnter_105 (def :  pcf.EditableVehicleIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=Claim_Properties) at LossDetailsDV.Auto.pcf: line 177, column 27
    function def_onEnter_107 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 191, column 27
    function def_onEnter_109 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 205, column 27
    function def_onEnter_111 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 222, column 27
    function def_onEnter_113 (def :  pcf.EditableWitnessesLV) : void {
      def.onEnter(Claim.getClaimContactRolesByRole(TC_WITNESS), Claim, TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 233, column 27
    function def_onEnter_115 (def :  pcf.EditableContributingFactorsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 246, column 37
    function def_onEnter_118 (def :  pcf.MetroReportsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Auto.pcf: line 81, column 54
    function def_onEnter_40 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_52 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_77 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 162, column 27
    function def_refreshVariables_106 (def :  pcf.EditableVehicleIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=Claim_Properties) at LossDetailsDV.Auto.pcf: line 177, column 27
    function def_refreshVariables_108 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 191, column 27
    function def_refreshVariables_110 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 205, column 27
    function def_refreshVariables_112 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 222, column 27
    function def_refreshVariables_114 (def :  pcf.EditableWitnessesLV) : void {
      def.refreshVariables(Claim.getClaimContactRolesByRole(TC_WITNESS), Claim, TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 233, column 27
    function def_refreshVariables_116 (def :  pcf.EditableContributingFactorsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 246, column 37
    function def_refreshVariables_119 (def :  pcf.MetroReportsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Auto.pcf: line 81, column 54
    function def_refreshVariables_41 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_53 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_78 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsDV.Auto.pcf: line 34, column 41
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsDV.Auto.pcf: line 153, column 40
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateRptdToAgent = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Auto.pcf: line 45, column 46
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Auto.pcf: line 21, column 36
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Auto.pcf: line 53, column 41
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Weather) at LossDetailsDV.Auto.pcf: line 59, column 42
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Weather = (__VALUE_TO_SET as typekey.WeatherType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_EmploymentCourse) at LossDetailsDV.Auto.pcf: line 64, column 41
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentInjury = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=LossDate) at LossDetailsDV.Auto.pcf: line 73, column 32
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Auto.pcf: line 89, column 40
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsDV.Auto.pcf: line 95, column 46
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossCause) at LossDetailsDV.Auto.pcf: line 28, column 40
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsDV.Auto.pcf: line 111, column 48
    function defaultSetter_73 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsDV.Auto.pcf: line 136, column 48
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsDV.Auto.pcf: line 75, column 74
    function onChange_33 () : void {
      gw.pcf.ClaimLossDetailsUtil.changedLossDate(Claim)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_60 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_85 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.maincontact); var result = eval("Claim.maincontact = Claim.resolveContact(Claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at LossDetailsDV.Auto.pcf: line 113, column 42
    function reflectionValue_70 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at LossDetailsDV.Auto.pcf: line 138, column 43
    function reflectionValue_96 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'validationExpression' attribute on DateInput (id=LossDate) at LossDetailsDV.Auto.pcf: line 73, column 32
    function validationExpression_34 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Auto.pcf: line 53, column 41
    function valueRange_22 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_64 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Auto.pcf: line 21, column 36
    function valueRoot_3 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Auto.pcf: line 21, column 36
    function value_0 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsDV.Auto.pcf: line 153, column 40
    function value_101 () : java.util.Date {
      return Claim.DateRptdToAgent
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Auto.pcf: line 45, column 46
    function value_13 () : java.math.BigDecimal {
      return Claim.Fault
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Auto.pcf: line 53, column 41
    function value_18 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Weather) at LossDetailsDV.Auto.pcf: line 59, column 42
    function value_25 () : typekey.WeatherType {
      return Claim.Weather
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_EmploymentCourse) at LossDetailsDV.Auto.pcf: line 64, column 41
    function value_29 () : java.lang.Boolean {
      return Claim.EmploymentInjury
    }
    
    // 'value' attribute on DateInput (id=LossDate) at LossDetailsDV.Auto.pcf: line 73, column 32
    function value_35 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TypeKeyInput (id=LossCause) at LossDetailsDV.Auto.pcf: line 28, column 40
    function value_4 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Auto.pcf: line 89, column 40
    function value_42 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsDV.Auto.pcf: line 95, column 46
    function value_46 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at LossDetailsDV.Auto.pcf: line 104, column 48
    function value_50 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsDV.Auto.pcf: line 111, column 48
    function value_71 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Auto.pcf: line 130, column 36
    function value_75 () : entity.Person {
      return Claim.maincontact
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsDV.Auto.pcf: line 34, column 41
    function value_8 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsDV.Auto.pcf: line 136, column 48
    function value_97 () : typekey.PersonRelationType {
      return Claim.MainContactType
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Auto.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Auto.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Auto.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_65 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_65 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_65 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_90 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_90 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_90 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Auto.pcf: line 53, column 41
    function verifyValueRange_24 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_23(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_66 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_65(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_91 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_90(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Auto.pcf: line 130, column 36
    function verifyValueType_94 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ListViewInput at LossDetailsDV.Auto.pcf: line 246, column 37
    function visible_117 () : java.lang.Boolean {
      return Claim.MetroEnable
    }
    
    // 'visible' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Auto.pcf: line 45, column 46
    function visible_12 () : java.lang.Boolean {
      return Claim.FaultRating == TC_1
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_51 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_54 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_79 () : java.lang.Boolean {
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