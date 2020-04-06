package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicyGeneralPanelSet.Wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyGeneralPanelSet_WcExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicyGeneralPanelSet.Wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyCoverageListDetailExpressionsImpl extends PolicyGeneralPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PolicyGeneralPanelSet.Wc.pcf: line 259, column 37
    function def_onEnter_271 (def :  pcf.EditableWorkersCompPolicyCoveragesLV) : void {
      def.onEnter(Policy)
    }
    
    // 'def' attribute on PanelRef at PolicyGeneralPanelSet.Wc.pcf: line 273, column 26
    function def_onEnter_273 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.onEnter(Coverage)
    }
    
    // 'def' attribute on PanelRef at PolicyGeneralPanelSet.Wc.pcf: line 259, column 37
    function def_refreshVariables_272 (def :  pcf.EditableWorkersCompPolicyCoveragesLV) : void {
      def.refreshVariables(Policy)
    }
    
    // 'def' attribute on PanelRef at PolicyGeneralPanelSet.Wc.pcf: line 273, column 26
    function def_refreshVariables_274 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.refreshVariables(Coverage)
    }
    
    // 'addVisible' attribute on IteratorButtons at PolicyGeneralPanelSet.Wc.pcf: line 268, column 47
    function visible_267 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    property get Coverage () : Coverage {
      return getCurrentSelection(1) as Coverage
    }
    
    property set Coverage ($arg :  Coverage) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicyGeneralPanelSet.Wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyGeneralPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function action_100 () : void {
      ClaimContactDetailPopup.push(Policy.policyholder, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 16, column 225
    function action_120 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.doingbusinessas), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 18, column 285
    function action_122 () : void {
      if (Policy.doingbusinessas != null) { ClaimContactDetailPopup.push(Policy.doingbusinessas, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function action_125 () : void {
      ClaimContactDetailPopup.push(Policy.doingbusinessas, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_153 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.agent), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_155 () : void {
      if (Policy.agent != null) { ClaimContactDetailPopup.push(Policy.agent, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_157 () : void {
      ClaimContactDetailPopup.push(Policy.agent, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_181 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.underwriter), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_183 () : void {
      if (Policy.underwriter != null) { ClaimContactDetailPopup.push(Policy.underwriter, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_185 () : void {
      ClaimContactDetailPopup.push(Policy.underwriter, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_51 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.insured), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_53 () : void {
      if (Policy.insured != null) { ClaimContactDetailPopup.push(Policy.insured, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_55 () : void {
      ClaimContactDetailPopup.push(Policy.insured, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 16, column 225
    function action_95 () : void {
      AddressBookPickerPopup.push(statictypeof (Policy.policyholder), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 18, column 285
    function action_97 () : void {
      if (Policy.policyholder != null) { ClaimContactDetailPopup.push(Policy.policyholder, Policy.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_101 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.policyholder, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_121 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.doingbusinessas), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_126 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.doingbusinessas, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_154 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.agent), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_158 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.agent, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_182 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.underwriter), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_186 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.underwriter, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_52 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.insured), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_56 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Policy.insured, Policy.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_96 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Policy.policyholder), Policy.Claim, null as List<SpecialistService>)
    }
    
    // 'def' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_117 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.doingbusinessas), null, Policy.Claim)
    }
    
    // 'def' attribute on ListViewInput at PolicyGeneralPanelSet.Wc.pcf: line 137, column 72
    function def_onEnter_141 (def :  pcf.EditableAdditionalInsuredLV) : void {
      def.onEnter(Policy.getClaimContactRolesByRole(TC_COVEREDPARTY), Policy.Claim, Policy, TC_COVEREDPARTY)
    }
    
    // 'def' attribute on ListViewInput at PolicyGeneralPanelSet.Wc.pcf: line 149, column 73
    function def_onEnter_145 (def :  pcf.EditableExcludedPartiesLV) : void {
      def.onEnter(Policy.getClaimContactRolesByRole(TC_EXCLUDEDPARTY), Policy, TC_EXCLUDEDPARTY)
    }
    
    // 'def' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_150 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.agent), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_178 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.underwriter), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_48 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.insured), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_92 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Policy.policyholder), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_118 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.doingbusinessas), null, Policy.Claim)
    }
    
    // 'def' attribute on ListViewInput at PolicyGeneralPanelSet.Wc.pcf: line 137, column 72
    function def_refreshVariables_142 (def :  pcf.EditableAdditionalInsuredLV) : void {
      def.refreshVariables(Policy.getClaimContactRolesByRole(TC_COVEREDPARTY), Policy.Claim, Policy, TC_COVEREDPARTY)
    }
    
    // 'def' attribute on ListViewInput at PolicyGeneralPanelSet.Wc.pcf: line 149, column 73
    function def_refreshVariables_146 (def :  pcf.EditableExcludedPartiesLV) : void {
      def.refreshVariables(Policy.getClaimContactRolesByRole(TC_EXCLUDEDPARTY), Policy, TC_EXCLUDEDPARTY)
    }
    
    // 'def' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_151 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.agent), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_179 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.underwriter), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_49 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.insured), null, Policy.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_93 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Policy.policyholder), null, Policy.Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.policyholder = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate) at PolicyGeneralPanelSet.Wc.pcf: line 41, column 41
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.EffectiveDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_129 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.doingbusinessas = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_161 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.agent = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on DateInput (id=ExpirationDate) at PolicyGeneralPanelSet.Wc.pcf: line 47, column 42
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.ExpirationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=ProducerCode) at PolicyGeneralPanelSet.Wc.pcf: line 169, column 40
    function defaultSetter_173 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.ProducerCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_189 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.underwriter = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Underwriting_Company) at PolicyGeneralPanelSet.Wc.pcf: line 188, column 56
    function defaultSetter_202 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.UnderwritingCo = (__VALUE_TO_SET as typekey.UnderwritingCompanyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Underwriting_Group) at PolicyGeneralPanelSet.Wc.pcf: line 194, column 54
    function defaultSetter_208 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.UnderwritingGroup = (__VALUE_TO_SET as typekey.UnderwritingGroupType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_ForeignCoverage) at PolicyGeneralPanelSet.Wc.pcf: line 206, column 43
    function defaultSetter_217 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.ForeignCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Other_OtherFinancialInterests) at PolicyGeneralPanelSet.Wc.pcf: line 211, column 46
    function defaultSetter_223 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.FinancialInterests = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_AssignedRisk) at PolicyGeneralPanelSet.Wc.pcf: line 216, column 40
    function defaultSetter_229 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.AssignedRisk = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=CancellationDate) at PolicyGeneralPanelSet.Wc.pcf: line 52, column 44
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.CancellationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Other_Notes) at PolicyGeneralPanelSet.Wc.pcf: line 221, column 33
    function defaultSetter_235 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=WorkersComp_InsuredSicCode) at PolicyGeneralPanelSet.Wc.pcf: line 229, column 42
    function defaultSetter_241 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.InsuredSICCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=WorkersComp_PolicyRatingPlan) at PolicyGeneralPanelSet.Wc.pcf: line 235, column 49
    function defaultSetter_247 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.PolicyRatingPlan = (__VALUE_TO_SET as typekey.PolicyRatingPlan)
    }
    
    // 'value' attribute on TextInput (id=WorkersComp_States) at PolicyGeneralPanelSet.Wc.pcf: line 240, column 36
    function defaultSetter_253 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.WCStates = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=WorkersComp_OtherStates) at PolicyGeneralPanelSet.Wc.pcf: line 245, column 41
    function defaultSetter_259 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.WCOtherStates = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WorkersComp_ReturnToWorkPrgm) at PolicyGeneralPanelSet.Wc.pcf: line 250, column 44
    function defaultSetter_265 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.ReturnToWorkPrgm = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=OrigEffectiveDate) at PolicyGeneralPanelSet.Wc.pcf: line 57, column 45
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.OrigEffectiveDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at PolicyGeneralPanelSet.Wc.pcf: line 63, column 45
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.Status = (__VALUE_TO_SET as typekey.PolicyStatus)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at PolicyGeneralPanelSet.Wc.pcf: line 70, column 68
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.insured = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=AccountNumber) at PolicyGeneralPanelSet.Wc.pcf: line 102, column 40
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.AccountNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=CustomerServiceTierRange) at PolicyGeneralPanelSet.Wc.pcf: line 111, column 52
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      Policy.CustomerServiceTier = (__VALUE_TO_SET as typekey.CustomerServiceTier)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Currency) at PolicyGeneralPanelSet.Wc.pcf: line 70, column 68
    function editable_37 () : java.lang.Boolean {
      return !Policy.Verified and Policy.CurrencyEditable
    }
    
    // 'editable' attribute on DateInput (id=EffectiveDate) at PolicyGeneralPanelSet.Wc.pcf: line 41, column 41
    function editable_7 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    // 'initialValue' attribute on Variable at PolicyGeneralPanelSet.Wc.pcf: line 19, column 65
    function initialValue_0 () : java.util.List<typekey.CustomerServiceTier> {
      return CustomerServiceTier.findAvailableCustomerTiers()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function onPick_102 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.policyholder); var result = eval("Policy.policyholder = Policy.Claim.resolveContact(Policy.policyholder) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function onPick_127 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.doingbusinessas); var result = eval("Policy.doingbusinessas = Policy.Claim.resolveContact(Policy.doingbusinessas) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_159 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.agent); var result = eval("Policy.agent = Policy.Claim.resolveContact(Policy.agent) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_187 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.underwriter); var result = eval("Policy.underwriter = Policy.Claim.resolveContact(Policy.underwriter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_57 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Policy.insured); var result = eval("Policy.insured = Policy.Claim.resolveContact(Policy.insured) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at PolicyGeneralPanelSet.Wc.pcf: line 90, column 55
    function reflectionValue_67 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'validationExpression' attribute on ListViewInput at PolicyGeneralPanelSet.Wc.pcf: line 137, column 72
    function validationExpression_140 () : java.lang.Object {
      return Policy.checkCoveredPartyConstraints()
    }
    
    // 'validationExpression' attribute on ListViewInput at PolicyGeneralPanelSet.Wc.pcf: line 149, column 73
    function validationExpression_144 () : java.lang.Object {
      return Policy.checkExcludedPartyConstraints()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_131 () : java.lang.Object {
      return Policy.Claim.RelatedCompanyArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_191 () : java.lang.Object {
      return Policy.Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_61 () : java.lang.Object {
      return Policy.Claim.RelatedContacts
    }
    
    // 'valueRange' attribute on RangeInput (id=CustomerServiceTierRange) at PolicyGeneralPanelSet.Wc.pcf: line 111, column 52
    function valueRange_85 () : java.lang.Object {
      return availableCustomerServiceTiers
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at PolicyGeneralPanelSet.Wc.pcf: line 29, column 40
    function valueRoot_3 () : java.lang.Object {
      return Policy
    }
    
    // 'value' attribute on TextInput (id=Insured_Address) at PolicyGeneralPanelSet.Wc.pcf: line 87, column 61
    function valueRoot_71 () : java.lang.Object {
      return Policy.insured
    }
    
    // 'value' attribute on TextInput (id=AccountName) at PolicyGeneralPanelSet.Wc.pcf: line 96, column 67
    function valueRoot_74 () : java.lang.Object {
      return Policy.PolicyAccount.AccountHolder
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at PolicyGeneralPanelSet.Wc.pcf: line 29, column 40
    function value_1 () : java.lang.String {
      return Policy.PolicyNumber
    }
    
    // 'value' attribute on ClaimContactInput (id=DBA) at PolicyGeneralPanelSet.Wc.pcf: line 129, column 46
    function value_115 () : entity.Company {
      return Policy.doingbusinessas
    }
    
    // 'value' attribute on DateInput (id=ExpirationDate) at PolicyGeneralPanelSet.Wc.pcf: line 47, column 42
    function value_14 () : java.util.Date {
      return Policy.ExpirationDate
    }
    
    // 'value' attribute on ClaimContactInput (id=Agent_Name) at PolicyGeneralPanelSet.Wc.pcf: line 164, column 54
    function value_148 () : entity.Contact {
      return Policy.agent
    }
    
    // 'value' attribute on TextInput (id=ProducerCode) at PolicyGeneralPanelSet.Wc.pcf: line 169, column 40
    function value_170 () : java.lang.String {
      return Policy.ProducerCode
    }
    
    // 'value' attribute on ClaimContactInput (id=Underwriter_Name) at PolicyGeneralPanelSet.Wc.pcf: line 182, column 38
    function value_176 () : entity.Person {
      return Policy.underwriter
    }
    
    // 'value' attribute on TypeKeyInput (id=Underwriting_Company) at PolicyGeneralPanelSet.Wc.pcf: line 188, column 56
    function value_199 () : typekey.UnderwritingCompanyType {
      return Policy.UnderwritingCo
    }
    
    // 'value' attribute on DateInput (id=CancellationDate) at PolicyGeneralPanelSet.Wc.pcf: line 52, column 44
    function value_20 () : java.util.Date {
      return Policy.CancellationDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Underwriting_Group) at PolicyGeneralPanelSet.Wc.pcf: line 194, column 54
    function value_205 () : typekey.UnderwritingGroupType {
      return Policy.UnderwritingGroup
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_VerifiedPolicy) at PolicyGeneralPanelSet.Wc.pcf: line 201, column 36
    function value_210 () : java.lang.Boolean {
      return Policy.Verified
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_ForeignCoverage) at PolicyGeneralPanelSet.Wc.pcf: line 206, column 43
    function value_214 () : java.lang.Boolean {
      return Policy.ForeignCoverage
    }
    
    // 'value' attribute on TextInput (id=Other_OtherFinancialInterests) at PolicyGeneralPanelSet.Wc.pcf: line 211, column 46
    function value_220 () : java.lang.String {
      return Policy.FinancialInterests
    }
    
    // 'value' attribute on BooleanRadioInput (id=Other_AssignedRisk) at PolicyGeneralPanelSet.Wc.pcf: line 216, column 40
    function value_226 () : java.lang.Boolean {
      return Policy.AssignedRisk
    }
    
    // 'value' attribute on TextInput (id=Other_Notes) at PolicyGeneralPanelSet.Wc.pcf: line 221, column 33
    function value_232 () : java.lang.String {
      return Policy.Notes
    }
    
    // 'value' attribute on TextInput (id=WorkersComp_InsuredSicCode) at PolicyGeneralPanelSet.Wc.pcf: line 229, column 42
    function value_238 () : java.lang.String {
      return Policy.InsuredSICCode
    }
    
    // 'value' attribute on TypeKeyInput (id=WorkersComp_PolicyRatingPlan) at PolicyGeneralPanelSet.Wc.pcf: line 235, column 49
    function value_244 () : typekey.PolicyRatingPlan {
      return Policy.PolicyRatingPlan
    }
    
    // 'value' attribute on TextInput (id=WorkersComp_States) at PolicyGeneralPanelSet.Wc.pcf: line 240, column 36
    function value_250 () : java.lang.String {
      return Policy.WCStates
    }
    
    // 'value' attribute on TextInput (id=WorkersComp_OtherStates) at PolicyGeneralPanelSet.Wc.pcf: line 245, column 41
    function value_256 () : java.lang.String {
      return Policy.WCOtherStates
    }
    
    // 'value' attribute on DateInput (id=OrigEffectiveDate) at PolicyGeneralPanelSet.Wc.pcf: line 57, column 45
    function value_26 () : java.util.Date {
      return Policy.OrigEffectiveDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=WorkersComp_ReturnToWorkPrgm) at PolicyGeneralPanelSet.Wc.pcf: line 250, column 44
    function value_262 () : java.lang.Boolean {
      return Policy.ReturnToWorkPrgm
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at PolicyGeneralPanelSet.Wc.pcf: line 63, column 45
    function value_32 () : typekey.PolicyStatus {
      return Policy.Status
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at PolicyGeneralPanelSet.Wc.pcf: line 70, column 68
    function value_39 () : typekey.Currency {
      return Policy.Currency
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at PolicyGeneralPanelSet.Wc.pcf: line 35, column 43
    function value_4 () : typekey.PolicyType {
      return Policy.PolicyType
    }
    
    // 'value' attribute on ClaimContactInput (id=Insured_Name) at PolicyGeneralPanelSet.Wc.pcf: line 83, column 54
    function value_46 () : entity.Contact {
      return Policy.insured
    }
    
    // 'value' attribute on TextInput (id=Insured_Address) at PolicyGeneralPanelSet.Wc.pcf: line 87, column 61
    function value_69 () : java.lang.String {
      return Policy.insured.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=AccountName) at PolicyGeneralPanelSet.Wc.pcf: line 96, column 67
    function value_72 () : java.lang.String {
      return Policy.PolicyAccount.AccountHolder.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AccountNumber) at PolicyGeneralPanelSet.Wc.pcf: line 102, column 40
    function value_76 () : java.lang.String {
      return Policy.AccountNumber
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate) at PolicyGeneralPanelSet.Wc.pcf: line 41, column 41
    function value_8 () : java.util.Date {
      return Policy.EffectiveDate
    }
    
    // 'value' attribute on RangeInput (id=CustomerServiceTierRange) at PolicyGeneralPanelSet.Wc.pcf: line 111, column 52
    function value_81 () : typekey.CustomerServiceTier {
      return Policy.CustomerServiceTier
    }
    
    // 'value' attribute on ClaimContactInput (id=PolicyHolder) at PolicyGeneralPanelSet.Wc.pcf: line 120, column 46
    function value_90 () : entity.Contact {
      return Policy.policyholder
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_107 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_107 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_107 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_132 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_132 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_132 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_164 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_164 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_164 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_192 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_192 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_192 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_62 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_62 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_62 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CustomerServiceTierRange) at PolicyGeneralPanelSet.Wc.pcf: line 111, column 52
    function verifyValueRangeIsAllowedType_86 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CustomerServiceTierRange) at PolicyGeneralPanelSet.Wc.pcf: line 111, column 52
    function verifyValueRangeIsAllowedType_86 ($$arg :  typekey.CustomerServiceTier[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_108 () : void {
      var __valueRangeArg = Policy.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_107(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_133 () : void {
      var __valueRangeArg = Policy.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_132(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_165 () : void {
      var __valueRangeArg = Policy.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_164(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_193 () : void {
      var __valueRangeArg = Policy.Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_192(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_63 () : void {
      var __valueRangeArg = Policy.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_62(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=CustomerServiceTierRange) at PolicyGeneralPanelSet.Wc.pcf: line 111, column 52
    function verifyValueRange_87 () : void {
      var __valueRangeArg = availableCustomerServiceTiers
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_86(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=DBA) at PolicyGeneralPanelSet.Wc.pcf: line 129, column 46
    function verifyValueType_138 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Underwriter_Name) at PolicyGeneralPanelSet.Wc.pcf: line 182, column 38
    function verifyValueType_197 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=DBA) at ClaimContactWidget.xml: line 16, column 225
    function visible_119 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.doingbusinessas), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Agent_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_152 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.agent), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Underwriter_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_180 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.underwriter), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at PolicyGeneralPanelSet.Wc.pcf: line 70, column 68
    function visible_38 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_47 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Insured_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_50 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.insured), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=PolicyHolder) at PolicyGeneralPanelSet.Wc.pcf: line 120, column 46
    function visible_89 () : java.lang.Boolean {
      return Policy.CommercialPolicy
    }
    
    // 'visible' attribute on ClaimContactInput (id=PolicyHolder) at ClaimContactWidget.xml: line 16, column 225
    function visible_94 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Policy.policyholder), Policy.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Policy () : Policy {
      return getRequireValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setRequireValue("Policy", 0, $arg)
    }
    
    property get availableCustomerServiceTiers () : java.util.List<typekey.CustomerServiceTier> {
      return getVariableValue("availableCustomerServiceTiers", 0) as java.util.List<typekey.CustomerServiceTier>
    }
    
    property set availableCustomerServiceTiers ($arg :  java.util.List<typekey.CustomerServiceTier>) {
      setVariableValue("availableCustomerServiceTiers", 0, $arg)
    }
    
    
  }
  
  
}