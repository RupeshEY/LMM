package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuickClaimDV_QuickClaimPropertyExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuickClaimDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=Assignee_PickerButton) at AssigneeCell.xml: line 7, column 25
    function action_188 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Assignment.Target))))
    }
    
    // 'action' attribute on MenuItem (id=Assignee_PickerButton) at AssigneeCell.xml: line 7, column 25
    function action_dest_189 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Assignment.Target))))
    }
    
    // 'value' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function defaultSetter_191 (__VALUE_TO_SET :  java.lang.Object) : void {
      Assignment.Assignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function valueRange_193 () : java.lang.Object {
      return Assignment.Target.SuggestedAssignees
    }
    
    // 'value' attribute on TextCell (id=ForName) at QuickClaimDV.QuickClaimProperty.pcf: line 335, column 52
    function valueRoot_185 () : java.lang.Object {
      return Assignment
    }
    
    // 'value' attribute on TextCell (id=ForName) at QuickClaimDV.QuickClaimProperty.pcf: line 335, column 52
    function value_183 () : java.lang.String {
      return Assignment.TargetName
    }
    
    // 'value' attribute on AssigneeCell (id=Assignee) at QuickClaimDV.QuickClaimProperty.pcf: line 347, column 57
    function value_187 () : gw.api.assignment.Assignee {
      return Assignment.Assignee
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_194 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_194 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRange_195 () : void {
      var __valueRangeArg = Assignment.Target.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_194(__valueRangeArg)
    }
    
    // 'visible' attribute on AssigneeCell (id=Assignee) at QuickClaimDV.QuickClaimProperty.pcf: line 347, column 57
    function visible_186 () : java.lang.Boolean {
      return !Wizard.CommonAssignment
    }
    
    property get Assignment () : gw.cc.claim.NewClaimAssignmentOption {
      return getIteratedValue(1) as gw.cc.claim.NewClaimAssignmentOption
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaimDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_10 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_11 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_129 () : void {
      AddressBookPickerPopup.push(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_131 () : void {
      if (exposure.Claimant != null) { ClaimContactDetailPopup.push(exposure.Claimant, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_132 () : void {
      ClaimContactDetailPopup.push(exposure.Claimant, Claim)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_166 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_8 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_12 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_130 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_133 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(exposure.Claimant, Claim)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_dest_167 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_9 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.QuickClaimProperty.pcf: line 240, column 36
    function condition_121 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.QuickClaimProperty.pcf: line 257, column 42
    function condition_143 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Claim.Insured==VALUE
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.QuickClaimProperty.pcf: line 51, column 35
    function condition_22 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==null
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.QuickClaimProperty.pcf: line 54, column 39
    function condition_23 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on InputSetRef at QuickClaimDV.QuickClaimProperty.pcf: line 197, column 54
    function def_onEnter_111 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at QuickClaimDV.QuickClaimProperty.pcf: line 205, column 27
    function def_onEnter_113 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_126 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (exposure.Claimant), null, Claim)
    }
    
    // 'def' attribute on InputSetRef (id=IncidentLocation) at QuickClaimDV.QuickClaimProperty.pcf: line 291, column 32
    function def_onEnter_163 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(incidentAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_5 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at QuickClaimDV.QuickClaimProperty.pcf: line 197, column 54
    function def_refreshVariables_112 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at QuickClaimDV.QuickClaimProperty.pcf: line 205, column 27
    function def_refreshVariables_114 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_127 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (exposure.Claimant), null, Claim)
    }
    
    // 'def' attribute on InputSetRef (id=IncidentLocation) at QuickClaimDV.QuickClaimProperty.pcf: line 291, column 32
    function def_refreshVariables_164 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(incidentAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_6 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at QuickClaimDV.QuickClaimProperty.pcf: line 180, column 46
    function defaultSetter_101 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at QuickClaimDV.QuickClaimProperty.pcf: line 186, column 39
    function defaultSetter_105 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_CoverageQuestion) at QuickClaimDV.QuickClaimProperty.pcf: line 192, column 43
    function defaultSetter_109 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.CoverageInQuestion = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_136 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at QuickClaimDV.QuickClaimProperty.pcf: line 252, column 42
    function defaultSetter_147 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at QuickClaimDV.QuickClaimProperty.pcf: line 285, column 41
    function defaultSetter_161 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function defaultSetter_170 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'value' attribute on Choice at QuickClaimDV.QuickClaimProperty.pcf: line 300, column 41
    function defaultSetter_179 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignment = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at QuickClaimDV.QuickClaimProperty.pcf: line 46, column 48
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at QuickClaimDV.QuickClaimProperty.pcf: line 96, column 38
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LOBCode = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 110, column 41
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.QuickClaimProperty.pcf: line 118, column 48
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.PermissionRequired = (__VALUE_TO_SET as typekey.ClaimSecurityType)
    }
    
    // 'value' attribute on TextAreaInput (id=Claim_Description) at QuickClaimDV.QuickClaimProperty.pcf: line 127, column 36
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at QuickClaimDV.QuickClaimProperty.pcf: line 137, column 40
    function defaultSetter_72 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at QuickClaimDV.QuickClaimProperty.pcf: line 143, column 41
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at QuickClaimDV.QuickClaimProperty.pcf: line 159, column 48
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.QuickClaimProperty.pcf: line 169, column 37
    function defaultSetter_93 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at QuickClaimDV.QuickClaimProperty.pcf: line 174, column 40
    function defaultSetter_97 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at QuickClaimDV.QuickClaimProperty.pcf: line 18, column 24
    function initialValue_0 () : Exposure {
      return initializeStep()
    }
    
    // 'initialValue' attribute on Variable at QuickClaimDV.QuickClaimProperty.pcf: line 22, column 30
    function initialValue_1 () : PolicyLocation {
      return getOrCreateNewPolicyLocation()
    }
    
    // 'initialValue' attribute on Variable at QuickClaimDV.QuickClaimProperty.pcf: line 27, column 45
    function initialValue_2 () : gw.api.address.CCAddressOwner {
      return new gw.api.address.FixedPropertyAddressOwner(exposure.FixedPropertyIncident, newPolicyLocation)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_13 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_134 (PickedValue :  Contact) : void {
      var contactType = statictypeof (exposure.Claimant); var result = eval("exposure.Claimant = Claim.resolveContact(exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at QuickClaimDV.QuickClaimProperty.pcf: line 237, column 43
    function reflectionValue_123 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at QuickClaimDV.QuickClaimProperty.pcf: line 254, column 40
    function reflectionValue_144 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at QuickClaimDV.QuickClaimProperty.pcf: line 48, column 40
    function reflectionValue_24 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==null) ? ("") : (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at QuickClaimDV.QuickClaimProperty.pcf: line 66, column 44
    function reflectionValue_29 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at QuickClaimDV.QuickClaimProperty.pcf: line 74, column 53
    function reflectionValue_34 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'required' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function required_168 () : java.lang.Boolean {
      return Wizard.CommonAssignment
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at QuickClaimDV.QuickClaimProperty.pcf: line 152, column 33
    function validationExpression_78 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.QuickClaimProperty.pcf: line 169, column 37
    function validationExpression_89 () : java.lang.Object {
      return Claim.ReportedDate == null || Claim.ReportedDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_138 () : java.lang.Object {
      return Claim.RelatedContacts
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_17 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRange_172 () : java.lang.Object {
      return Claim.SuggestedAssignees
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 110, column 41
    function valueRange_56 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.QuickClaimProperty.pcf: line 118, column 48
    function valueRange_63 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableTypes()
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_LossParty) at QuickClaimDV.QuickClaimProperty.pcf: line 219, column 44
    function valueRoot_117 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TextInput (id=Claimant_Workphone) at QuickClaimDV.QuickClaimProperty.pcf: line 266, column 53
    function valueRoot_153 () : java.lang.Object {
      return exposure.Claimant
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_16 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRoot_171 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_WorkPhone) at QuickClaimDV.QuickClaimProperty.pcf: line 63, column 50
    function valueRoot_33 () : java.lang.Object {
      return Claim.reporter
    }
    
    // 'value' attribute on TextInput (id=Policy_PolicyNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 81, column 44
    function valueRoot_41 () : java.lang.Object {
      return Claim.Policy
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at QuickClaimDV.QuickClaimProperty.pcf: line 186, column 39
    function value_103 () : java.lang.Boolean {
      return Claim.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_CoverageQuestion) at QuickClaimDV.QuickClaimProperty.pcf: line 192, column 43
    function value_107 () : java.lang.Boolean {
      return Claim.CoverageInQuestion
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_LossParty) at QuickClaimDV.QuickClaimProperty.pcf: line 219, column 44
    function value_115 () : typekey.LossPartyType {
      return exposure.LossParty
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_PrimaryCoverage) at QuickClaimDV.QuickClaimProperty.pcf: line 224, column 43
    function value_118 () : typekey.CoverageType {
      return exposure.PrimaryCoverage
    }
    
    // 'value' attribute on ReflectCondition at QuickClaimDV.QuickClaimProperty.pcf: line 240, column 36
    function value_122 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at QuickClaimDV.QuickClaimProperty.pcf: line 235, column 44
    function value_124 () : entity.Contact {
      return exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at QuickClaimDV.QuickClaimProperty.pcf: line 252, column 42
    function value_145 () : typekey.ClaimantType {
      return exposure.ClaimantType
    }
    
    // 'value' attribute on TextInput (id=Claimant_Workphone) at QuickClaimDV.QuickClaimProperty.pcf: line 266, column 53
    function value_151 () : java.lang.String {
      return exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at QuickClaimDV.QuickClaimProperty.pcf: line 275, column 62
    function value_156 () : java.lang.String {
      return exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at QuickClaimDV.QuickClaimProperty.pcf: line 285, column 41
    function value_159 () : java.lang.Boolean {
      return exposure.OtherCoverage
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at QuickClaimDV.QuickClaimProperty.pcf: line 310, column 52
    function value_165 () : gw.api.assignment.Assignee {
      return Wizard.CommonAssignee
    }
    
    // 'value' attribute on Choice at QuickClaimDV.QuickClaimProperty.pcf: line 300, column 41
    function value_181 () : java.lang.Object {
      return Wizard.CommonAssignment
    }
    
    // 'value' attribute on RowIterator at QuickClaimDV.QuickClaimProperty.pcf: line 329, column 68
    function value_198 () : gw.cc.claim.NewClaimAssignmentOption[] {
      return Wizard.IndividualAssignments
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at QuickClaimDV.QuickClaimProperty.pcf: line 46, column 48
    function value_25 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at QuickClaimDV.QuickClaimProperty.pcf: line 39, column 48
    function value_3 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_WorkPhone) at QuickClaimDV.QuickClaimProperty.pcf: line 63, column 50
    function value_31 () : java.lang.String {
      return Claim.reporter.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_Address) at QuickClaimDV.QuickClaimProperty.pcf: line 71, column 59
    function value_36 () : java.lang.String {
      return Claim.reporter.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Policy_PolicyNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 81, column 44
    function value_39 () : java.lang.String {
      return Claim.Policy.PolicyNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Policy_Status) at QuickClaimDV.QuickClaimProperty.pcf: line 86, column 43
    function value_42 () : typekey.PolicyStatus {
      return Claim.Policy.Status
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at QuickClaimDV.QuickClaimProperty.pcf: line 96, column 38
    function value_45 () : typekey.LOBCode {
      return Claim.LOBCode
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossType) at QuickClaimDV.QuickClaimProperty.pcf: line 102, column 39
    function value_49 () : typekey.LossType {
      return Claim.LossType
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 110, column 41
    function value_52 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.QuickClaimProperty.pcf: line 118, column 48
    function value_59 () : typekey.ClaimSecurityType {
      return Claim.PermissionRequired
    }
    
    // 'value' attribute on TextAreaInput (id=Claim_Description) at QuickClaimDV.QuickClaimProperty.pcf: line 127, column 36
    function value_66 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at QuickClaimDV.QuickClaimProperty.pcf: line 137, column 40
    function value_70 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at QuickClaimDV.QuickClaimProperty.pcf: line 143, column 41
    function value_74 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at QuickClaimDV.QuickClaimProperty.pcf: line 152, column 33
    function value_79 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at QuickClaimDV.QuickClaimProperty.pcf: line 159, column 48
    function value_84 () : java.math.BigDecimal {
      return Claim.Fault
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.QuickClaimProperty.pcf: line 169, column 37
    function value_90 () : java.util.Date {
      return Claim.ReportedDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at QuickClaimDV.QuickClaimProperty.pcf: line 174, column 40
    function value_95 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at QuickClaimDV.QuickClaimProperty.pcf: line 180, column 46
    function value_99 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_139 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_139 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_139 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_173 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_173 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 110, column 41
    function verifyValueRangeIsAllowedType_57 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 110, column 41
    function verifyValueRangeIsAllowedType_57 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 110, column 41
    function verifyValueRangeIsAllowedType_57 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.QuickClaimProperty.pcf: line 118, column 48
    function verifyValueRangeIsAllowedType_64 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.QuickClaimProperty.pcf: line 118, column 48
    function verifyValueRangeIsAllowedType_64 ($$arg :  typekey.ClaimSecurityType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_140 () : void {
      var __valueRangeArg = Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_139(__valueRangeArg)
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRange_174 () : void {
      var __valueRangeArg = Claim.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_173(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_19 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.QuickClaimProperty.pcf: line 110, column 41
    function verifyValueRange_58 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_57(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.QuickClaimProperty.pcf: line 118, column 48
    function verifyValueRange_65 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableTypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_64(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_128 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on RowIterator at QuickClaimDV.QuickClaimProperty.pcf: line 347, column 57
    function visible_182 () : java.lang.Boolean {
      return !Wizard.CommonAssignment
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_4 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_7 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=Notification_AtFaultPercentage) at QuickClaimDV.QuickClaimProperty.pcf: line 159, column 48
    function visible_83 () : java.lang.Boolean {
      return  Claim.FaultRating == TC_1 
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
    
    property get exposure () : Exposure {
      return getVariableValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    property get incidentAddressOwner () : gw.api.address.CCAddressOwner {
      return getVariableValue("incidentAddressOwner", 0) as gw.api.address.CCAddressOwner
    }
    
    property set incidentAddressOwner ($arg :  gw.api.address.CCAddressOwner) {
      setVariableValue("incidentAddressOwner", 0, $arg)
    }
    
    property get newPolicyLocation () : PolicyLocation {
      return getVariableValue("newPolicyLocation", 0) as PolicyLocation
    }
    
    property set newPolicyLocation ($arg :  PolicyLocation) {
      setVariableValue("newPolicyLocation", 0, $arg)
    }
    
    function initializeStep() : Exposure {
      if (!Claim.areInitialValuesSet()) {
        Claim.setInitialValues()
      }
      var exposures = Claim.OrderedExposures
      var result : Exposure
      if (exposures.length > 0) {
        result = exposures[0]
      } else {
        result = Wizard.addExposure(Claim, null, TC_CPBLDGCOV, TC_CPBLDGCOV)
        result.Incident.Description = DisplayKey.get("Web.NewClaimWizard.QuickClaim.Property.Exposure.Description")
      }
      return result
    }
    
    function getOrCreateNewPolicyLocation() : PolicyLocation {
      var prop = entity.FixedPropertyIncident.Type.TypeInfo.getProperty("Property") as gw.entity.IEntityPropertyInfo
      return gw.api.address.CCAddressOwnerUtil.getOrCreateNewBeanFor(exposure.FixedPropertyIncident, prop, \ -> new PolicyLocation())
    }
    
    
  }
  
  
}