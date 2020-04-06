package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Gl.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossDetailsDV_GlExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Gl.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_51 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_53 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_54 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_76 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_78 () : void {
      if (Claim.maincontact != null) { ClaimContactDetailPopup.push(Claim.maincontact, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_79 () : void {
      ClaimContactDetailPopup.push(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_52 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_55 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_77 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_80 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.maincontact, Claim)
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Gl.pcf: line 134, column 39
    function condition_65 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Gl.pcf: line 159, column 39
    function condition_91 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Gl.pcf: line 190, column 27
    function def_onEnter_109 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Gl.pcf: line 203, column 27
    function def_onEnter_111 (def :  pcf.EditableContributingFactorsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Gl.pcf: line 214, column 27
    function def_onEnter_113 (def :  pcf.MetroReportsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Gl.pcf: line 70, column 54
    function def_onEnter_32 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput (id=Claim_Properties) at LossDetailsDV.Gl.pcf: line 80, column 27
    function def_onEnter_34 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Gl.pcf: line 93, column 27
    function def_onEnter_36 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_48 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_73 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Gl.pcf: line 190, column 27
    function def_refreshVariables_110 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Gl.pcf: line 203, column 27
    function def_refreshVariables_112 (def :  pcf.EditableContributingFactorsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Gl.pcf: line 214, column 27
    function def_refreshVariables_114 (def :  pcf.MetroReportsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Gl.pcf: line 70, column 54
    function def_refreshVariables_33 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput (id=Claim_Properties) at LossDetailsDV.Gl.pcf: line 80, column 27
    function def_refreshVariables_35 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Gl.pcf: line 93, column 27
    function def_refreshVariables_37 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_49 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_74 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsDV.Gl.pcf: line 34, column 41
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToInsured) at LossDetailsDV.Gl.pcf: line 177, column 42
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateRptdToInsured = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedofManifestation) at LossDetailsDV.Gl.pcf: line 183, column 42
    function defaultSetter_107 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ManifestationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Gl.pcf: line 45, column 48
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Gl.pcf: line 21, column 36
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Gl.pcf: line 53, column 41
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on DateInput (id=LossDate) at LossDetailsDV.Gl.pcf: line 62, column 32
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Gl.pcf: line 107, column 40
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsDV.Gl.pcf: line 113, column 46
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossCause) at LossDetailsDV.Gl.pcf: line 28, column 40
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsDV.Gl.pcf: line 129, column 48
    function defaultSetter_69 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsDV.Gl.pcf: line 154, column 48
    function defaultSetter_95 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsDV.Gl.pcf: line 171, column 40
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateRptdToAgent = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsDV.Gl.pcf: line 64, column 74
    function onChange_25 () : void {
      gw.pcf.ClaimLossDetailsUtil.changedLossDate(Claim)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_56 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_81 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.maincontact); var result = eval("Claim.maincontact = Claim.resolveContact(Claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at LossDetailsDV.Gl.pcf: line 131, column 42
    function reflectionValue_66 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at LossDetailsDV.Gl.pcf: line 156, column 43
    function reflectionValue_92 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'validationExpression' attribute on DateInput (id=LossDate) at LossDetailsDV.Gl.pcf: line 62, column 32
    function validationExpression_26 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Gl.pcf: line 53, column 41
    function valueRange_22 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_60 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Gl.pcf: line 21, column 36
    function valueRoot_3 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsDV.Gl.pcf: line 21, column 36
    function value_0 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToInsured) at LossDetailsDV.Gl.pcf: line 177, column 42
    function value_101 () : java.util.Date {
      return Claim.DateRptdToInsured
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedofManifestation) at LossDetailsDV.Gl.pcf: line 183, column 42
    function value_105 () : java.util.Date {
      return Claim.ManifestationDate
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Gl.pcf: line 45, column 48
    function value_13 () : java.math.BigDecimal {
      return Claim.Fault
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Gl.pcf: line 53, column 41
    function value_18 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on DateInput (id=LossDate) at LossDetailsDV.Gl.pcf: line 62, column 32
    function value_27 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Gl.pcf: line 107, column 40
    function value_38 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on TypeKeyInput (id=LossCause) at LossDetailsDV.Gl.pcf: line 28, column 40
    function value_4 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsDV.Gl.pcf: line 113, column 46
    function value_42 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at LossDetailsDV.Gl.pcf: line 122, column 48
    function value_46 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsDV.Gl.pcf: line 129, column 48
    function value_67 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Gl.pcf: line 148, column 36
    function value_71 () : entity.Person {
      return Claim.maincontact
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsDV.Gl.pcf: line 34, column 41
    function value_8 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsDV.Gl.pcf: line 154, column 48
    function value_93 () : typekey.PersonRelationType {
      return Claim.MainContactType
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsDV.Gl.pcf: line 171, column 40
    function value_97 () : java.util.Date {
      return Claim.DateRptdToAgent
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Gl.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Gl.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Gl.pcf: line 53, column 41
    function verifyValueRangeIsAllowedType_23 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Gl.pcf: line 53, column 41
    function verifyValueRange_24 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_23(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_62 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_61(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_87 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_86(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Gl.pcf: line 148, column 36
    function verifyValueType_90 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TextInput (id=Notification_AtFaultPercentage) at LossDetailsDV.Gl.pcf: line 45, column 48
    function visible_12 () : java.lang.Boolean {
      return  Claim.FaultRating == TC_1 
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_47 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_50 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_75 () : java.lang.Boolean {
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