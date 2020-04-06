package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimPolicyGeneralPanelSet_AutoExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimPolicyGeneralPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 16, column 225
    function action_115 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.doingbusinessas), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 18, column 285
    function action_117 () : void {
      if (Policy.doingbusinessas != null) { ClaimContactDetailPopup.push(Policy.doingbusinessas, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function action_120 () : void {
      ClaimContactDetailPopup.push(Policy.doingbusinessas, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_148 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.agent), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_150 () : void {
      if (Policy.agent != null) { ClaimContactDetailPopup.push(Policy.agent, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_152 () : void {
      ClaimContactDetailPopup.push(Policy.agent, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_176 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.underwriter), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_178 () : void {
      if (Policy.underwriter != null) { ClaimContactDetailPopup.push(Policy.underwriter, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_180 () : void {
      ClaimContactDetailPopup.push(Policy.underwriter, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_53 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.insured), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_55 () : void {
      if (Policy.insured != null) { ClaimContactDetailPopup.push(Policy.insured, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_57 () : void {
      ClaimContactDetailPopup.push(Policy.insured, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 16, column 225
    function action_90 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.policyholder), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 18, column 285
    function action_92 () : void {
      if (Policy.policyholder != null) { ClaimContactDetailPopup.push(Policy.policyholder, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function action_95 () : void {
      ClaimContactDetailPopup.push(Policy.policyholder, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_116 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.doingbusinessas), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_121 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.doingbusinessas, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_149 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.agent), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_153 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.agent, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_177 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.underwriter), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_181 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.underwriter, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_54 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.insured), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_58 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.insured, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_91 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.policyholder), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_96 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.policyholder, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_112 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.doingbusinessas), null, Policy.Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 122, column 72
    function def_onEnter_136 (def :  pcf.EditableAdditionalInsuredLV) : void {
      def.onEnter(Policy.getClaimContactRolesByRole(TC_COVEREDPARTY), Policy.Claim, Policy, TC_COVEREDPARTY)
    }
    
    // 'def' attribute on ListViewInput at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 134, column 73
    function def_onEnter_140 (def :  pcf.EditableExcludedPartiesLV) : void {
      def.onEnter(Policy.getClaimContactRolesByRole(TC_EXCLUDEDPARTY), Policy, TC_EXCLUDEDPARTY)
    }
    
    // 'def' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_145 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.agent), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_173 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.underwriter), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_50 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.insured), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_87 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.policyholder), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_113 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.doingbusinessas), null, Policy.Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 122, column 72
    function def_refreshVariables_137 (def :  pcf.EditableAdditionalInsuredLV) : void {
      def.refreshVariables(Policy.getClaimContactRolesByRole(TC_COVEREDPARTY), Policy.Claim, Policy, TC_COVEREDPARTY)
    }
    
    // 'def' attribute on ListViewInput at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 134, column 73
    function def_refreshVariables_141 (def :  pcf.EditableExcludedPartiesLV) : void {
      def.refreshVariables(Policy.getClaimContactRolesByRole(TC_EXCLUDEDPARTY), Policy, TC_EXCLUDEDPARTY)
    }
    
    // 'def' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_146 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.agent), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_174 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.underwriter), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_51 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.insured), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_88 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.policyholder), null, Policy.Claim)
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 32, column 41
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.EffectiveDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_124 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.doingbusinessas = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_156 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.agent = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=ProducerCode) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 154, column 40
    function defaultSetter_168 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.ProducerCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=ExpirationDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 39, column 42
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.ExpirationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_184 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.underwriter = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Underwriting_Company) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 173, column 56
    function defaultSetter_197 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.UnderwritingCo = (__VALUE_TO_SET as typekey.UnderwritingCompanyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Underwriting_Group) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 179, column 54
    function defaultSetter_203 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.UnderwritingGroup = (__VALUE_TO_SET as typekey.UnderwritingGroupType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_ForeignCoverage) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 191, column 43
    function defaultSetter_212 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.ForeignCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Other_OtherFinancialInterests) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 196, column 46
    function defaultSetter_218 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.FinancialInterests = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_AssignedRisk) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 201, column 40
    function defaultSetter_224 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.AssignedRisk = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Other_Notes) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 206, column 33
    function defaultSetter_230 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=CancellationDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 44, column 44
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.CancellationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=OrigEffectiveDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 49, column 45
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.OrigEffectiveDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 55, column 45
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.Status = (__VALUE_TO_SET as typekey.PolicyStatus)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 63, column 68
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.insured = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=AccountNumber) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 95, column 40
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.AccountNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.policyholder = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Currency) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 63, column 68
    function editable_38 () : java.lang.Boolean {
      return !Policy.Verified and Policy.CurrencyEditable
    }
    
    // 'editable' attribute on DateInput (id=EffectiveDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 32, column 41
    function editable_6 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    // 'onPick' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function onPick_122 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.doingbusinessas); var result = eval("Policy.doingbusinessas = Policy.Claim.resolveContact(Policy.doingbusinessas) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_154 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.agent); var result = eval("Policy.agent = Policy.Claim.resolveContact(Policy.agent) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_182 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.underwriter); var result = eval("Policy.underwriter = Policy.Claim.resolveContact(Policy.underwriter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_59 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.insured); var result = eval("Policy.insured = Policy.Claim.resolveContact(Policy.insured) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function onPick_97 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.policyholder); var result = eval("Policy.policyholder = Policy.Claim.resolveContact(Policy.policyholder) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 83, column 55
    function reflectionValue_69 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'validationExpression' attribute on DateInput (id=ExpirationDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 39, column 42
    function validationExpression_13 () : java.lang.Object {
      return Policy.EffectiveDate != null and Policy.ExpirationDate != null and Policy.ExpirationDate < Policy.EffectiveDate ? DisplayKey.get("Java.Validation.AdminCatastrophe.Date.ForbidValidReverse") : null
    }
    
    // 'validationExpression' attribute on ListViewInput at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 122, column 72
    function validationExpression_135 () : java.lang.Object {
      return Policy.checkCoveredPartyConstraints()
    }
    
    // 'validationExpression' attribute on ListViewInput at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 134, column 73
    function validationExpression_139 () : java.lang.Object {
      return Policy.checkExcludedPartyConstraints()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_126 () : java.lang.Object {
      return Policy.Claim.RelatedCompanyArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_186 () : java.lang.Object {
      return Policy.Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_63 () : java.lang.Object {
      return Policy.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 20, column 40
    function valueRoot_2 () : java.lang.Object {
      return Policy
    }
    
    // 'value' attribute on TextInput (id=Insured_Address) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 80, column 61
    function valueRoot_73 () : java.lang.Object {
      return Policy.insured
    }
    
    // 'value' attribute on TextInput (id=AccountName) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 89, column 67
    function valueRoot_76 () : java.lang.Object {
      return Policy.PolicyAccount.AccountHolder
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 20, column 40
    function value_0 () : java.lang.String {
      return Policy.PolicyNumber
    }
    
    // 'value' attribute on ClaimContactInput (id=DBA) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 114, column 46
    function value_110 () : entity.Company {
      return Policy.doingbusinessas
    }
    
    // 'value' attribute on DateInput (id=ExpirationDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 39, column 42
    function value_14 () : java.util.Date {
      return Policy.ExpirationDate
    }
    
    // 'value' attribute on ClaimContactInput (id=Agent_Name) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 149, column 54
    function value_143 () : entity.Contact {
      return Policy.agent
    }
    
    // 'value' attribute on TextInput (id=ProducerCode) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 154, column 40
    function value_165 () : java.lang.String {
      return Policy.ProducerCode
    }
    
    // 'value' attribute on ClaimContactInput (id=Underwriter_Name) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 167, column 38
    function value_171 () : entity.Person {
      return Policy.underwriter
    }
    
    // 'value' attribute on TypeKeyInput (id=Underwriting_Company) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 173, column 56
    function value_194 () : typekey.UnderwritingCompanyType {
      return Policy.UnderwritingCo
    }
    
    // 'value' attribute on TypeKeyInput (id=Underwriting_Group) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 179, column 54
    function value_200 () : typekey.UnderwritingGroupType {
      return Policy.UnderwritingGroup
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_VerifiedPolicy) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 186, column 36
    function value_205 () : java.lang.Boolean {
      return Policy.Verified
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_ForeignCoverage) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 191, column 43
    function value_209 () : java.lang.Boolean {
      return Policy.ForeignCoverage
    }
    
    // 'value' attribute on DateInput (id=CancellationDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 44, column 44
    function value_21 () : java.util.Date {
      return Policy.CancellationDate
    }
    
    // 'value' attribute on TextInput (id=Other_OtherFinancialInterests) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 196, column 46
    function value_215 () : java.lang.String {
      return Policy.FinancialInterests
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_AssignedRisk) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 201, column 40
    function value_221 () : java.lang.Boolean {
      return Policy.AssignedRisk
    }
    
    // 'value' attribute on TextInput (id=Other_Notes) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 206, column 33
    function value_227 () : java.lang.String {
      return Policy.Notes
    }
    
    // 'value' attribute on DateInput (id=OrigEffectiveDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 49, column 45
    function value_27 () : java.util.Date {
      return Policy.OrigEffectiveDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 26, column 43
    function value_3 () : typekey.PolicyType {
      return Policy.PolicyType
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 55, column 45
    function value_33 () : typekey.PolicyStatus {
      return Policy.Status
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 63, column 68
    function value_40 () : typekey.Currency {
      return Policy.Currency
    }
    
    // 'value' attribute on ClaimContactInput (id=Insured_Name) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 76, column 54
    function value_48 () : entity.Contact {
      return Policy.insured
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 32, column 41
    function value_7 () : java.util.Date {
      return Policy.EffectiveDate
    }
    
    // 'value' attribute on TextInput (id=Insured_Address) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 80, column 61
    function value_71 () : java.lang.String {
      return Policy.insured.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=AccountName) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 89, column 67
    function value_74 () : java.lang.String {
      return Policy.PolicyAccount.AccountHolder.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AccountNumber) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 95, column 40
    function value_78 () : java.lang.String {
      return Policy.AccountNumber
    }
    
    // 'value' attribute on ClaimContactInput (id=PolicyHolder) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 105, column 46
    function value_85 () : entity.Contact {
      return Policy.policyholder
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_102 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_102 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_102 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_127 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_127 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_127 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_159 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_159 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_159 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_187 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_187 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_187 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_64 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_64 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_64 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_103 () : void {
      var __valueRangeArg = Policy.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_102(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_128 () : void {
      var __valueRangeArg = Policy.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_127(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_160 () : void {
      var __valueRangeArg = Policy.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_159(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_188 () : void {
      var __valueRangeArg = Policy.Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_187(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_65 () : void {
      var __valueRangeArg = Policy.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_64(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=DBA) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 114, column 46
    function verifyValueType_133 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Underwriter_Name) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 167, column 38
    function verifyValueType_192 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 16, column 225
    function visible_114 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.doingbusinessas), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_147 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.agent), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_175 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.underwriter), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 63, column 68
    function visible_39 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_49 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_52 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.insured), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=PolicyHolder) at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 105, column 46
    function visible_84 () : java.lang.Boolean {
      return Policy.CommercialPolicy
    }
    
    // 'visible' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 16, column 225
    function visible_89 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.policyholder), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Policy () : Policy {
      return getRequireValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setRequireValue("Policy", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyCoverageListDetailExpressionsImpl extends NewClaimPolicyGeneralPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 215, column 37
    function def_onEnter_233 (def :  pcf.EditableAutoPolicyCoveragesLV) : void {
      def.onEnter(Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 226, column 26
    function def_onEnter_235 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.onEnter(Coverage)
    }
    
    // 'def' attribute on PanelRef at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 215, column 37
    function def_refreshVariables_234 (def :  pcf.EditableAutoPolicyCoveragesLV) : void {
      def.refreshVariables(Policy)
    }
    
    // 'def' attribute on PanelRef at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 226, column 26
    function def_refreshVariables_236 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.refreshVariables(Coverage)
    }
    
    // 'editable' attribute on PanelRef at NewClaimPolicyGeneralPanelSet.Auto.pcf: line 215, column 37
    function editable_232 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    property get Coverage () : Coverage {
      return getCurrentSelection(1) as Coverage
    }
    
    property set Coverage ($arg :  Coverage) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}