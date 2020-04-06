package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_BasicInfoScreen_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_BasicInfoScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_101 () : void {
      if (Claim.maincontact != null) { ClaimContactDetailPopup.push(Claim.maincontact, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_103 () : void {
      ClaimContactDetailPopup.push(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_12 () : void {
      AddressBookPickerPopup.push(entity.Person.Type, Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_14 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_15 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ButtonInput (id=EditContact) at FNOLWizard_BasicInfoScreen.default.pcf: line 125, column 49
    function action_76 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim, true)
    }
    
    // 'action' attribute on TextInput (id=Insured_Name) at FNOLWizard_BasicInfoScreen.default.pcf: line 134, column 43
    function action_79 () : void {
      ClaimContactDetailPopup.push(Claim.Insured, Claim, true)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_99 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_100 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_104 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_13 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Person.Type, Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_16 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ButtonInput (id=EditContact) at FNOLWizard_BasicInfoScreen.default.pcf: line 125, column 49
    function action_dest_77 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim, true)
    }
    
    // 'action' attribute on TextInput (id=Insured_Name) at FNOLWizard_BasicInfoScreen.default.pcf: line 134, column 43
    function action_dest_80 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.Insured, Claim, true)
    }
    
    // 'def' attribute on PanelRef (id=RightPanel) at FNOLWizard_BasicInfoScreen.default.pcf: line 183, column 34
    function def_onEnter_123 (def :  pcf.FNOLWizard_BasicInfoRightPanelSet_Auto) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef (id=RightPanel) at FNOLWizard_BasicInfoScreen.default.pcf: line 183, column 34
    function def_onEnter_125 (def :  pcf.FNOLWizard_BasicInfoRightPanelSet_Pr) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef (id=RightPanel) at FNOLWizard_BasicInfoScreen.default.pcf: line 183, column 34
    function def_onEnter_127 (def :  pcf.FNOLWizard_BasicInfoRightPanelSet_Trav) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on InputSetRef (id=reporter_businessphone) at FNOLWizard_BasicInfoScreen.default.pcf: line 96, column 49
    function def_onEnter_52 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Claim.reporter, contact#WorkPhone), DisplayKey.get("Web.BasicInfoScreen.BasicInfoDetailViewPanel.BusinessPhone.Label"), false))
    }
    
    // 'def' attribute on InputSetRef (id=reporter_homephone) at FNOLWizard_BasicInfoScreen.default.pcf: line 101, column 49
    function def_onEnter_56 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Claim.reporter, contact#HomePhone), DisplayKey.get("Web.BasicInfoScreen.BasicInfoDetailViewPanel.HomePhone.Label"), false))
    }
    
    // 'def' attribute on InputSetRef (id=reporter_mobile) at FNOLWizard_BasicInfoScreen.default.pcf: line 106, column 49
    function def_onEnter_60 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Claim.reporter, Person#CellPhone), DisplayKey.get("Web.BasicInfoScreen.BasicInfoDetailViewPanel.Mobile.Label"), false))
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_9 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(entity.Person.Type, null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_96 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_10 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(entity.Person.Type, null, Claim)
    }
    
    // 'def' attribute on PanelRef (id=RightPanel) at FNOLWizard_BasicInfoScreen.default.pcf: line 183, column 34
    function def_refreshVariables_124 (def :  pcf.FNOLWizard_BasicInfoRightPanelSet_Auto) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef (id=RightPanel) at FNOLWizard_BasicInfoScreen.default.pcf: line 183, column 34
    function def_refreshVariables_126 (def :  pcf.FNOLWizard_BasicInfoRightPanelSet_Pr) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef (id=RightPanel) at FNOLWizard_BasicInfoScreen.default.pcf: line 183, column 34
    function def_refreshVariables_128 (def :  pcf.FNOLWizard_BasicInfoRightPanelSet_Trav) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on InputSetRef (id=reporter_businessphone) at FNOLWizard_BasicInfoScreen.default.pcf: line 96, column 49
    function def_refreshVariables_53 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Claim.reporter, contact#WorkPhone), DisplayKey.get("Web.BasicInfoScreen.BasicInfoDetailViewPanel.BusinessPhone.Label"), false))
    }
    
    // 'def' attribute on InputSetRef (id=reporter_homephone) at FNOLWizard_BasicInfoScreen.default.pcf: line 101, column 49
    function def_refreshVariables_57 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Claim.reporter, contact#HomePhone), DisplayKey.get("Web.BasicInfoScreen.BasicInfoDetailViewPanel.HomePhone.Label"), false))
    }
    
    // 'def' attribute on InputSetRef (id=reporter_mobile) at FNOLWizard_BasicInfoScreen.default.pcf: line 106, column 49
    function def_refreshVariables_61 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Claim.reporter, Person#CellPhone), DisplayKey.get("Web.BasicInfoScreen.BasicInfoDetailViewPanel.Mobile.Label"), false))
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_97 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_107 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_MainContactType) at FNOLWizard_BasicInfoScreen.default.pcf: line 174, column 49
    function defaultSetter_120 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at FNOLWizard_BasicInfoScreen.default.pcf: line 65, column 54
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at FNOLWizard_BasicInfoScreen.default.pcf: line 75, column 43
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=HowReported) at FNOLWizard_BasicInfoScreen.default.pcf: line 44, column 52
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on TypeKeyInput (id=reporter_primarytype) at FNOLWizard_BasicInfoScreen.default.pcf: line 113, column 49
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      (Claim.reporter as Person).PrimaryPhone = (__VALUE_TO_SET as typekey.PrimaryPhoneType)
    }
    
    // 'value' attribute on TextInput (id=reporter_email) at FNOLWizard_BasicInfoScreen.default.pcf: line 119, column 49
    function defaultSetter_72 (__VALUE_TO_SET :  java.lang.Object) : void {
      (Claim.reporter as Person).EmailAddress1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=MainContactChoice) at FNOLWizard_BasicInfoScreen.default.pcf: line 153, column 45
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      maincontactSamePerson = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Claim_ReportedByType) at FNOLWizard_BasicInfoScreen.default.pcf: line 65, column 54
    function filter_31 (VALUE :  typekey.PersonRelationType, VALUES :  typekey.PersonRelationType[]) : java.lang.Boolean {
      return VALUE.hasCategory(claimPolicyType)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoScreen.default.pcf: line 17, column 23
    function initialValue_0 () : boolean {
      return ((Claim.maincontact == Claim.reporter and Claim.MainContactType == Claim.ReportedByType) || (Claim.maincontact == null and Claim.MainContactType == null))
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoScreen.default.pcf: line 21, column 26
    function initialValue_1 () : PolicyType {
      return Claim.Policy.PolicyType
    }
    
    // 'mode' attribute on PanelRef (id=RightPanel) at FNOLWizard_BasicInfoScreen.default.pcf: line 183, column 34
    function mode_129 () : java.lang.Object {
      return Claim.LossType
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_BasicInfoScreen.default.pcf: line 67, column 104
    function onChange_26 () : void {
      if (maincontactSamePerson) {Claim.MainContactType = Claim.ReportedByType;}
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_BasicInfoScreen.default.pcf: line 56, column 272
    function onChange_6 () : void {
      if (Claim.reporter == Claim.Insured) Claim.ReportedByType = PersonRelationType.TC_SELF else Claim.ReportedByType = null; if (maincontactSamePerson) {Claim.maincontact = Claim.reporter as Person;  Claim.MainContactType = Claim.ReportedByType;}
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_BasicInfoScreen.default.pcf: line 155, column 215
    function onChange_89 () : void {
      if (maincontactSamePerson) {Claim.maincontact = Claim.reporter as Person;  Claim.MainContactType = Claim.ReportedByType;} else {Claim.maincontact = null;  Claim.MainContactType = null;}
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_105 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.maincontact); var result = eval("Claim.maincontact = Claim.resolveContact(Claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_17 (PickedValue :  Contact) : void {
      var contactType = entity.Person.Type; var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on DateInput (id=Notification_ReportedDate) at FNOLWizard_BasicInfoScreen.default.pcf: line 75, column 43
    function validationExpression_32 () : java.lang.Object {
      return Claim.ReportedDate != null and Claim.ReportedDate > gw.api.util.DateUtil.currentDate() ? DisplayKey.get("Java.Validation.Date.ForbidFuture") : null
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_21 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on DateInput (id=DOB) at FNOLWizard_BasicInfoScreen.default.pcf: line 83, column 49
    function valueRoot_43 () : java.lang.Object {
      return (Claim.reporter as Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=HowReported) at FNOLWizard_BasicInfoScreen.default.pcf: line 44, column 52
    function valueRoot_5 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=Insured_Address) at FNOLWizard_BasicInfoScreen.default.pcf: line 138, column 65
    function valueRoot_85 () : java.lang.Object {
      return Claim.Insured
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_MainContactType) at FNOLWizard_BasicInfoScreen.default.pcf: line 174, column 49
    function value_117 () : typekey.PersonRelationType {
      return Claim.MainContactType
    }
    
    // 'value' attribute on TypeKeyInput (id=HowReported) at FNOLWizard_BasicInfoScreen.default.pcf: line 44, column 52
    function value_2 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at FNOLWizard_BasicInfoScreen.default.pcf: line 65, column 54
    function value_27 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at FNOLWizard_BasicInfoScreen.default.pcf: line 75, column 43
    function value_33 () : java.util.Date {
      return Claim.ReportedDate
    }
    
    // 'value' attribute on DateInput (id=DOB) at FNOLWizard_BasicInfoScreen.default.pcf: line 83, column 49
    function value_40 () : java.util.Date {
      return (Claim.reporter as Person).DateOfBirth
    }
    
    // 'value' attribute on TextInput (id=reporter_Address) at FNOLWizard_BasicInfoScreen.default.pcf: line 91, column 49
    function value_46 () : java.lang.String {
      return (Claim.reporter as Person).PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TypeKeyInput (id=reporter_primarytype) at FNOLWizard_BasicInfoScreen.default.pcf: line 113, column 49
    function value_63 () : typekey.PrimaryPhoneType {
      return (Claim.reporter as Person).PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=reporter_email) at FNOLWizard_BasicInfoScreen.default.pcf: line 119, column 49
    function value_69 () : java.lang.String {
      return (Claim.reporter as Person).EmailAddress1
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at FNOLWizard_BasicInfoScreen.default.pcf: line 54, column 53
    function value_7 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TextInput (id=Insured_Name) at FNOLWizard_BasicInfoScreen.default.pcf: line 134, column 43
    function value_78 () : entity.Contact {
      return Claim.Insured
    }
    
    // 'value' attribute on TextInput (id=Insured_Address) at FNOLWizard_BasicInfoScreen.default.pcf: line 138, column 65
    function value_83 () : java.lang.String {
      return Claim.Insured.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Insured_WorkPhone) at FNOLWizard_BasicInfoScreen.default.pcf: line 142, column 56
    function value_86 () : java.lang.String {
      return Claim.Insured.PrimaryPhoneValue
    }
    
    // 'value' attribute on BooleanRadioInput (id=MainContactChoice) at FNOLWizard_BasicInfoScreen.default.pcf: line 153, column 45
    function value_90 () : java.lang.Boolean {
      return maincontactSamePerson
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Name) at FNOLWizard_BasicInfoScreen.default.pcf: line 166, column 49
    function value_94 () : entity.Person {
      return Claim.maincontact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_110 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_110 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_110 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_22 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_22 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_22 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_111 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_110(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_23 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_22(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Name) at FNOLWizard_BasicInfoScreen.default.pcf: line 166, column 49
    function verifyValueType_115 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_11 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(entity.Person.Type, Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on Label at FNOLWizard_BasicInfoScreen.default.pcf: line 78, column 49
    function visible_38 () : java.lang.Boolean {
      return Claim.reporter != null
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_8 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Name) at FNOLWizard_BasicInfoScreen.default.pcf: line 166, column 49
    function visible_93 () : java.lang.Boolean {
      return !maincontactSamePerson
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_98 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)" != "" && true
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
    
    property get claimPolicyType () : PolicyType {
      return getVariableValue("claimPolicyType", 0) as PolicyType
    }
    
    property set claimPolicyType ($arg :  PolicyType) {
      setVariableValue("claimPolicyType", 0, $arg)
    }
    
    property get contact () : Contact {
      return getVariableValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setVariableValue("contact", 0, $arg)
    }
    
    property get maincontactSamePerson () : boolean {
      return getVariableValue("maincontactSamePerson", 0) as java.lang.Boolean
    }
    
    property set maincontactSamePerson ($arg :  boolean) {
      setVariableValue("maincontactSamePerson", 0, $arg)
    }
    
    
  }
  
  
}