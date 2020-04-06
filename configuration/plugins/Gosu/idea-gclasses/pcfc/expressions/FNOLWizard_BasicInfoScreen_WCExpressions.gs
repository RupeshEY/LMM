package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.WC.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_BasicInfoScreen_WCExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.WC.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_BasicInfoScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_15 () : void {
      AddressBookPickerPopup.push(entity.Person.Type, Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_17 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_18 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_45 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_47 () : void {
      if (Claim.maincontact != null) { ClaimContactDetailPopup.push(Claim.maincontact, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_49 () : void {
      ClaimContactDetailPopup.push(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_75 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_77 () : void {
      if (Claim.claimant != null) { ClaimContactDetailPopup.push(Claim.claimant, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_79 () : void {
      ClaimContactDetailPopup.push(Claim.claimant, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_16 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Person.Type, Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_19 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_46 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_50 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_76 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_80 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.claimant, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_12 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(entity.Person.Type, null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_42 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_72 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.claimant), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_13 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(entity.Person.Type, null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_43 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_73 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.claimant), null, Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at FNOLWizard_BasicInfoScreen.WC.pcf: line 72, column 54
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=MainContactChoice) at FNOLWizard_BasicInfoScreen.WC.pcf: line 86, column 45
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      maincontactSamePerson = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Claim_LocationCode) at FNOLWizard_BasicInfoScreen.WC.pcf: line 40, column 50
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LocationCode = (__VALUE_TO_SET as entity.PolicyLocation)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_MainContactType) at FNOLWizard_BasicInfoScreen.WC.pcf: line 107, column 49
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.claimant = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on PrivacyInput (id=Claimant_TaxNumber) at FNOLWizard_BasicInfoScreen.WC.pcf: line 130, column 45
    function defaultSetter_94 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.claimant.TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=Claimant_TaxNumber) at FNOLWizard_BasicInfoScreen.WC.pcf: line 130, column 45
    function encryptionExpression_96 (VALUE :  java.lang.String) : java.lang.String {
      return Claim.claimant.maskTaxId(VALUE)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Claim_ReportedByType) at FNOLWizard_BasicInfoScreen.WC.pcf: line 72, column 54
    function filter_34 (VALUE :  typekey.PersonRelationType, VALUES :  typekey.PersonRelationType[]) : java.lang.Boolean {
      return VALUE.hasCategory(claimPolicyType)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoScreen.WC.pcf: line 17, column 23
    function initialValue_0 () : boolean {
      return ((Claim.maincontact == Claim.reporter and Claim.MainContactType == Claim.ReportedByType) || (Claim.maincontact == null and Claim.MainContactType == null))
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoScreen.WC.pcf: line 21, column 26
    function initialValue_1 () : PolicyType {
      return Claim.Policy.PolicyType
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_BasicInfoScreen.WC.pcf: line 74, column 104
    function onChange_29 () : void {
      if (maincontactSamePerson) {Claim.MainContactType = Claim.ReportedByType;}
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_BasicInfoScreen.WC.pcf: line 88, column 217
    function onChange_35 () : void {
      if (maincontactSamePerson) {Claim.maincontact = (Claim.reporter as Person);  Claim.MainContactType = Claim.ReportedByType;} else {Claim.maincontact = null;  Claim.MainContactType = null;}
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_BasicInfoScreen.WC.pcf: line 63, column 274
    function onChange_9 () : void {
      if (Claim.reporter == Claim.Insured) Claim.ReportedByType = PersonRelationType.TC_SELF else Claim.ReportedByType = null; if (maincontactSamePerson) {Claim.maincontact = (Claim.reporter as Person);  Claim.MainContactType = Claim.ReportedByType;}
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_20 (PickedValue :  Contact) : void {
      var contactType = entity.Person.Type; var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_51 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.maincontact); var result = eval("Claim.maincontact = Claim.resolveContact(Claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_81 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.claimant); var result = eval("Claim.claimant = Claim.resolveContact(Claim.claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on ClaimContactInput (id=Claimant_Name) at FNOLWizard_BasicInfoScreen.WC.pcf: line 122, column 41
    function validationExpression_69 () : java.lang.Object {
      return !Claim.claimant.DisplayName.HasContent ? DisplayKey.get("NVV.Claim.SubView.NewClaimLossDetailsWorkersComp.Claim.Claimant.Picker.ValidationError") : null
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_24 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_LocationCode) at FNOLWizard_BasicInfoScreen.WC.pcf: line 40, column 50
    function valueRange_6 () : java.lang.Object {
      return Claim.PolicyProperties
    }
    
    // 'value' attribute on RangeInput (id=Claim_LocationCode) at FNOLWizard_BasicInfoScreen.WC.pcf: line 40, column 50
    function valueRoot_5 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on PrivacyInput (id=Claimant_TaxNumber) at FNOLWizard_BasicInfoScreen.WC.pcf: line 130, column 45
    function valueRoot_95 () : java.lang.Object {
      return Claim.claimant
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at FNOLWizard_BasicInfoScreen.WC.pcf: line 61, column 53
    function value_10 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on RangeInput (id=Claim_LocationCode) at FNOLWizard_BasicInfoScreen.WC.pcf: line 40, column 50
    function value_2 () : entity.PolicyLocation {
      return Claim.LocationCode
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at FNOLWizard_BasicInfoScreen.WC.pcf: line 72, column 54
    function value_30 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on BooleanRadioInput (id=MainContactChoice) at FNOLWizard_BasicInfoScreen.WC.pcf: line 86, column 45
    function value_36 () : java.lang.Boolean {
      return maincontactSamePerson
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Name) at FNOLWizard_BasicInfoScreen.WC.pcf: line 99, column 49
    function value_40 () : entity.Person {
      return Claim.maincontact
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_MainContactType) at FNOLWizard_BasicInfoScreen.WC.pcf: line 107, column 49
    function value_63 () : typekey.PersonRelationType {
      return Claim.MainContactType
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Name) at FNOLWizard_BasicInfoScreen.WC.pcf: line 122, column 41
    function value_70 () : entity.Person {
      return Claim.claimant
    }
    
    // 'value' attribute on PrivacyInput (id=Claimant_TaxNumber) at FNOLWizard_BasicInfoScreen.WC.pcf: line 130, column 45
    function value_92 () : java.lang.String {
      return Claim.claimant.TaxID
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_25 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_25 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_25 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_56 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_56 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_56 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_LocationCode) at FNOLWizard_BasicInfoScreen.WC.pcf: line 40, column 50
    function verifyValueRangeIsAllowedType_7 ($$arg :  entity.PolicyLocation[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_LocationCode) at FNOLWizard_BasicInfoScreen.WC.pcf: line 40, column 50
    function verifyValueRangeIsAllowedType_7 ($$arg :  gw.api.database.IQueryBeanResult<entity.PolicyLocation>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_LocationCode) at FNOLWizard_BasicInfoScreen.WC.pcf: line 40, column 50
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_26 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_25(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_57 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_56(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_LocationCode) at FNOLWizard_BasicInfoScreen.WC.pcf: line 40, column 50
    function verifyValueRange_8 () : void {
      var __valueRangeArg = Claim.PolicyProperties
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_7(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_87 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_86(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Name) at FNOLWizard_BasicInfoScreen.WC.pcf: line 99, column 49
    function verifyValueType_61 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Claimant_Name) at FNOLWizard_BasicInfoScreen.WC.pcf: line 122, column 41
    function verifyValueType_91 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_11 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_14 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(entity.Person.Type, Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Name) at FNOLWizard_BasicInfoScreen.WC.pcf: line 99, column 49
    function visible_39 () : java.lang.Boolean {
      return !maincontactSamePerson
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_44 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_74 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)" != "" && true
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