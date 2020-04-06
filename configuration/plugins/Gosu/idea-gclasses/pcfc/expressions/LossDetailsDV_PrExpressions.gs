package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossDetailsDV_PrExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_69 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_71 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_72 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_94 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_96 () : void {
      if (Claim.maincontact != null) { ClaimContactDetailPopup.push(Claim.maincontact, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_97 () : void {
      ClaimContactDetailPopup.push(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_70 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_73 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_95 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_98 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.maincontact, Claim)
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Pr.pcf: line 183, column 39
    function condition_109 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Pr.pcf: line 158, column 39
    function condition_83 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 202, column 27
    function def_onEnter_119 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 216, column 27
    function def_onEnter_121 (def :  pcf.EditableContributingFactorsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 227, column 27
    function def_onEnter_123 (def :  pcf.MetroReportsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 97, column 27
    function def_onEnter_50 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 110, column 27
    function def_onEnter_52 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Pr.pcf: line 121, column 54
    function def_onEnter_54 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_66 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_91 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 202, column 27
    function def_refreshVariables_120 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 216, column 27
    function def_refreshVariables_122 (def :  pcf.EditableContributingFactorsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 227, column 27
    function def_refreshVariables_124 (def :  pcf.MetroReportsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 97, column 27
    function def_refreshVariables_51 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Pr.pcf: line 110, column 27
    function def_refreshVariables_53 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Pr.pcf: line 121, column 54
    function def_refreshVariables_55 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_67 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_92 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_101 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsDV.Pr.pcf: line 178, column 48
    function defaultSetter_113 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsDV.Pr.pcf: line 195, column 40
    function defaultSetter_117 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateRptdToAgent = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at LossDetailsDV.Pr.pcf: line 41, column 72
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.PropertyFireDamage.Arson = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=LocationOfTheft) at LossDetailsDV.Pr.pcf: line 48, column 51
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LocationOfTheft = (__VALUE_TO_SET as typekey.LocationOfTheft)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsDV.Pr.pcf: line 54, column 41
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Pr.pcf: line 25, column 36
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Pr.pcf: line 65, column 48
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Pr.pcf: line 73, column 41
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on DateInput (id=LossDate) at LossDetailsDV.Pr.pcf: line 82, column 32
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_ComputerSecurity) at LossDetailsDV.Pr.pcf: line 90, column 41
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ComputerSecurity = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Pr.pcf: line 131, column 40
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsDV.Pr.pcf: line 137, column 46
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossCause) at LossDetailsDV.Pr.pcf: line 32, column 39
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsDV.Pr.pcf: line 153, column 48
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'initialValue' attribute on Variable at LossDetailsDV.Pr.pcf: line 14, column 53
    function initialValue_0 () : gw.api.claim.CommercialPropertyHelper {
      return new gw.api.claim.CommercialPropertyHelper(Claim)
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsDV.Pr.pcf: line 84, column 74
    function onChange_39 () : void {
      gw.pcf.ClaimLossDetailsUtil.changedLossDate(Claim)
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsDV.Pr.pcf: line 34, column 80
    function onChange_5 () : void {
      CommercialPropertyHelper.createDamageTypesPerLossCause()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_74 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_99 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.maincontact); var result = eval("Claim.maincontact = Claim.resolveContact(Claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at LossDetailsDV.Pr.pcf: line 180, column 43
    function reflectionValue_110 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at LossDetailsDV.Pr.pcf: line 155, column 42
    function reflectionValue_84 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'validationExpression' attribute on DateInput (id=LossDate) at LossDetailsDV.Pr.pcf: line 82, column 32
    function validationExpression_40 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Pr.pcf: line 73, column 41
    function valueRange_36 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_78 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at LossDetailsDV.Pr.pcf: line 41, column 72
    function valueRoot_15 () : java.lang.Object {
      return Claim.PropertyFireDamage
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Pr.pcf: line 25, column 36
    function valueRoot_4 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Pr.pcf: line 25, column 36
    function value_1 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at LossDetailsDV.Pr.pcf: line 41, column 72
    function value_11 () : java.lang.Boolean {
      return Claim.PropertyFireDamage.Arson
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsDV.Pr.pcf: line 178, column 48
    function value_111 () : typekey.PersonRelationType {
      return Claim.MainContactType
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsDV.Pr.pcf: line 195, column 40
    function value_115 () : java.util.Date {
      return Claim.DateRptdToAgent
    }
    
    // 'value' attribute on TypeKeyInput (id=LocationOfTheft) at LossDetailsDV.Pr.pcf: line 48, column 51
    function value_17 () : typekey.LocationOfTheft {
      return Claim.LocationOfTheft
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsDV.Pr.pcf: line 54, column 41
    function value_22 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Pr.pcf: line 65, column 48
    function value_27 () : java.math.BigDecimal {
      return Claim.Fault
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Pr.pcf: line 73, column 41
    function value_32 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on DateInput (id=LossDate) at LossDetailsDV.Pr.pcf: line 82, column 32
    function value_41 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_ComputerSecurity) at LossDetailsDV.Pr.pcf: line 90, column 41
    function value_46 () : java.lang.Boolean {
      return Claim.ComputerSecurity
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Pr.pcf: line 131, column 40
    function value_56 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on TypeKeyInput (id=LossCause) at LossDetailsDV.Pr.pcf: line 32, column 39
    function value_6 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsDV.Pr.pcf: line 137, column 46
    function value_60 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at LossDetailsDV.Pr.pcf: line 146, column 48
    function value_64 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsDV.Pr.pcf: line 153, column 48
    function value_85 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Pr.pcf: line 172, column 36
    function value_89 () : entity.Person {
      return Claim.maincontact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_104 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_104 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_104 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Pr.pcf: line 73, column 41
    function verifyValueRangeIsAllowedType_37 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Pr.pcf: line 73, column 41
    function verifyValueRangeIsAllowedType_37 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Pr.pcf: line 73, column 41
    function verifyValueRangeIsAllowedType_37 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_79 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_79 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_79 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_105 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_104(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Pr.pcf: line 73, column 41
    function verifyValueRange_38 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_37(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_80 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_79(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Pr.pcf: line 172, column 36
    function verifyValueType_108 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ArsonInvolved) at LossDetailsDV.Pr.pcf: line 41, column 72
    function visible_10 () : java.lang.Boolean {
      return CommercialPropertyHelper.PropertyFireDamage.Present
    }
    
    // 'visible' attribute on TypeKeyInput (id=LocationOfTheft) at LossDetailsDV.Pr.pcf: line 48, column 51
    function visible_16 () : java.lang.Boolean {
      return Claim.LossCause == TC_BURGLARY
    }
    
    // 'visible' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Pr.pcf: line 65, column 48
    function visible_26 () : java.lang.Boolean {
      return  Claim.FaultRating == TC_1 
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_65 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_68 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_93 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get CommercialPropertyHelper () : gw.api.claim.CommercialPropertyHelper {
      return getVariableValue("CommercialPropertyHelper", 0) as gw.api.claim.CommercialPropertyHelper
    }
    
    property set CommercialPropertyHelper ($arg :  gw.api.claim.CommercialPropertyHelper) {
      setVariableValue("CommercialPropertyHelper", 0, $arg)
    }
    
    function createPropertyFireDamageIfNecessary() {
      var claimProperty = entity.Claim.Type.TypeInfo.getProperty("PropertyFireDamage")
      
      if(Claim.LossCause == TC_FIRE) {
        var constructor = claimProperty.FeatureType.TypeInfo.getConstructor({})
        claimProperty.Accessor.setValue(Claim, constructor.Constructor.newInstance({}))
      } else {
        var bean = claimProperty.Accessor.getValue(Claim) as KeyableBean
        if(bean!=null) {
          bean.remove()
          claimProperty.Accessor.setValue(Claim, null)
        }
      }
    }
    
    
  }
  
  
}