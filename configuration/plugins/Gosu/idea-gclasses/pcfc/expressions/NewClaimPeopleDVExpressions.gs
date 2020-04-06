package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPeopleDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimPeopleDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPeopleDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimPeopleDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_10 () : void {
      ClaimContactDetailPopup.push(claim.reporter, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_38 () : void {
      AddressBookPickerPopup.push(statictypeof (claim.maincontact), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_40 () : void {
      if (claim.maincontact != null) { ClaimContactDetailPopup.push(claim.maincontact, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_41 () : void {
      ClaimContactDetailPopup.push(claim.maincontact, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_7 () : void {
      AddressBookPickerPopup.push(statictypeof (claim.reporter), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_74 () : void {
      AddressBookPickerPopup.push(statictypeof (claim.Insured), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_76 () : void {
      if (claim.Insured != null) { ClaimContactDetailPopup.push(claim.Insured, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_77 () : void {
      ClaimContactDetailPopup.push(claim.Insured, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_9 () : void {
      if (claim.reporter != null) { ClaimContactDetailPopup.push(claim.reporter, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(claim.reporter, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_39 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (claim.maincontact), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_42 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(claim.maincontact, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_75 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (claim.Insured), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_78 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(claim.Insured, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_8 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (claim.reporter), claim, null as List<SpecialistService>)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_35 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (claim.maincontact), null, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_4 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (claim.reporter), null, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_71 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (claim.Insured), null, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_36 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (claim.maincontact), null, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_5 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (claim.reporter), null, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_72 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (claim.Insured), null, claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at NewClaimPeopleDV.pcf: line 40, column 49
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=MainContact_Type) at NewClaimPeopleDV.pcf: line 77, column 49
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Claim_ReportedByType) at NewClaimPeopleDV.pcf: line 40, column 49
    function filter_25 (VALUE :  typekey.PersonRelationType, VALUES :  typekey.PersonRelationType[]) : java.lang.Boolean {
      return VALUE.hasCategory(claimPolicyType)
    }
    
    // 'initialValue' attribute on Variable at NewClaimPeopleDV.pcf: line 16, column 26
    function initialValue_0 () : PolicyType {
      return claim.Policy.PolicyType
    }
    
    // 'inputConversion' attribute on HiddenInput (id=HiddenInsured) at NewClaimPeopleDV.pcf: line 70, column 37
    function inputConversion_54 (VALUE :  java.lang.String) : java.lang.Object {
      return gw.api.tools.KeyEncoder.decodeFromString(VALUE)
    }
    
    // 'onChange' attribute on PostOnChange at NewClaimPeopleDV.pcf: line 31, column 42
    function onChange_1 () : void {
      if (claim.reporter == claim.Insured) claim.ReportedByType = PersonRelationType.TC_SELF
    }
    
    // 'onChange' attribute on PostOnChange at NewClaimPeopleDV.pcf: line 63, column 38
    function onChange_32 () : void {
      if (claim.maincontact == claim.Insured) claim.MainContactType = PersonRelationType.TC_SELF
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_12 (PickedValue :  Contact) : void {
      var contactType = statictypeof (claim.reporter); var result = eval("claim.reporter = claim.resolveContact(claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_43 (PickedValue :  Contact) : void {
      var contactType = statictypeof (claim.maincontact); var result = eval("claim.maincontact = claim.resolveContact(claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_79 (PickedValue :  Contact) : void {
      var contactType = statictypeof (claim.Insured); var result = eval("claim.Insured = claim.resolveContact(claim.Insured) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'outputConversion' attribute on HiddenInput (id=HiddenInsured) at NewClaimPeopleDV.pcf: line 70, column 37
    function outputConversion_55 (VALUE :  entity.Contact) : java.lang.String {
      return VALUE == null ? null : gw.api.tools.KeyEncoder.encodeIdToString(VALUE)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_16 () : java.lang.Object {
      return claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_82 () : java.lang.Object {
      return claim.RelatedContacts
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_15 () : java.lang.Object {
      return claim
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_PrimaryPhone) at NewClaimPeopleDV.pcf: line 44, column 51
    function valueRoot_28 () : java.lang.Object {
      return claim.reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact_PrimaryPhone) at NewClaimPeopleDV.pcf: line 81, column 54
    function valueRoot_65 () : java.lang.Object {
      return claim.maincontact
    }
    
    // 'value' attribute on TextInput (id=Insured_PrimaryPhone) at NewClaimPeopleDV.pcf: line 100, column 50
    function valueRoot_89 () : java.lang.Object {
      return claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at NewClaimPeopleDV.pcf: line 28, column 47
    function value_2 () : entity.Contact {
      return claim.reporter
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at NewClaimPeopleDV.pcf: line 40, column 49
    function value_21 () : typekey.PersonRelationType {
      return claim.ReportedByType
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_PrimaryPhone) at NewClaimPeopleDV.pcf: line 44, column 51
    function value_26 () : java.lang.String {
      return claim.reporter.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_Address) at NewClaimPeopleDV.pcf: line 48, column 60
    function value_29 () : java.lang.String {
      return claim.reporter.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Name) at NewClaimPeopleDV.pcf: line 60, column 35
    function value_33 () : entity.Person {
      return claim.maincontact
    }
    
    // 'value' attribute on HiddenInput (id=HiddenInsured) at NewClaimPeopleDV.pcf: line 70, column 37
    function value_53 () : entity.Contact {
      return claim.Insured
    }
    
    // 'value' attribute on TypeKeyInput (id=MainContact_Type) at NewClaimPeopleDV.pcf: line 77, column 49
    function value_58 () : typekey.PersonRelationType {
      return claim.MainContactType
    }
    
    // 'value' attribute on TextInput (id=MainContact_PrimaryPhone) at NewClaimPeopleDV.pcf: line 81, column 54
    function value_63 () : java.lang.String {
      return claim.maincontact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=MainContact_Address) at NewClaimPeopleDV.pcf: line 85, column 63
    function value_66 () : java.lang.String {
      return claim.maincontact.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Insured_PrimaryPhone) at NewClaimPeopleDV.pcf: line 100, column 50
    function value_87 () : java.lang.String {
      return claim.Insured.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Insured_Address) at NewClaimPeopleDV.pcf: line 104, column 59
    function value_90 () : java.lang.String {
      return claim.Insured.PrimaryAddressDisplayValue
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_17 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_17 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_17 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_83 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_83 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_83 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_18 () : void {
      var __valueRangeArg = claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_17(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_49 () : void {
      var __valueRangeArg = claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_48(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_84 () : void {
      var __valueRangeArg = claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_83(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Name) at NewClaimPeopleDV.pcf: line 60, column 35
    function verifyValueType_52 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_3 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_37 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (claim.maincontact), claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_6 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (claim.reporter), claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_73 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (claim.Insured), claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get claimPolicyType () : PolicyType {
      return getVariableValue("claimPolicyType", 0) as PolicyType
    }
    
    property set claimPolicyType ($arg :  PolicyType) {
      setVariableValue("claimPolicyType", 0, $arg)
    }
    
    
  }
  
  
}