package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.GL.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuickClaimDV_GLExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.GL.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuickClaimDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=Assignee_PickerButton) at AssigneeCell.xml: line 7, column 25
    function action_185 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Assignment.Target))))
    }
    
    // 'action' attribute on MenuItem (id=Assignee_PickerButton) at AssigneeCell.xml: line 7, column 25
    function action_dest_186 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Assignment.Target))))
    }
    
    // 'value' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function defaultSetter_188 (__VALUE_TO_SET :  java.lang.Object) : void {
      Assignment.Assignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function valueRange_190 () : java.lang.Object {
      return Assignment.Target.SuggestedAssignees
    }
    
    // 'value' attribute on TextCell (id=ForAssign) at QuickClaimDV.GL.pcf: line 322, column 52
    function valueRoot_182 () : java.lang.Object {
      return Assignment
    }
    
    // 'value' attribute on TextCell (id=ForAssign) at QuickClaimDV.GL.pcf: line 322, column 52
    function value_180 () : java.lang.String {
      return Assignment.TargetName
    }
    
    // 'value' attribute on AssigneeCell (id=Assignee) at QuickClaimDV.GL.pcf: line 334, column 57
    function value_184 () : gw.api.assignment.Assignee {
      return Assignment.Assignee
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_191 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_191 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRange_192 () : void {
      var __valueRangeArg = Assignment.Target.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_191(__valueRangeArg)
    }
    
    // 'visible' attribute on AssigneeCell (id=Assignee) at QuickClaimDV.GL.pcf: line 334, column 57
    function visible_183 () : java.lang.Boolean {
      return !Wizard.CommonAssignment
    }
    
    property get Assignment () : gw.cc.claim.NewClaimAssignmentOption {
      return getIteratedValue(1) as gw.cc.claim.NewClaimAssignmentOption
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.GL.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaimDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_10 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_128 () : void {
      AddressBookPickerPopup.push(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_130 () : void {
      if (exposure.Claimant != null) { ClaimContactDetailPopup.push(exposure.Claimant, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_131 () : void {
      ClaimContactDetailPopup.push(exposure.Claimant, Claim)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_163 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_7 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_9 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_129 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_132 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(exposure.Claimant, Claim)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_dest_164 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_8 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.GL.pcf: line 235, column 36
    function condition_120 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.GL.pcf: line 252, column 42
    function condition_142 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Claim.Insured==VALUE
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.GL.pcf: line 45, column 35
    function condition_21 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==null
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.GL.pcf: line 48, column 39
    function condition_22 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on InputSetRef at QuickClaimDV.GL.pcf: line 193, column 54
    function def_onEnter_110 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at QuickClaimDV.GL.pcf: line 200, column 27
    function def_onEnter_112 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_125 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (exposure.Claimant), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_4 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at QuickClaimDV.GL.pcf: line 193, column 54
    function def_refreshVariables_111 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at QuickClaimDV.GL.pcf: line 200, column 27
    function def_refreshVariables_113 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_126 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (exposure.Claimant), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_5 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at QuickClaimDV.GL.pcf: line 174, column 46
    function defaultSetter_100 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at QuickClaimDV.GL.pcf: line 180, column 39
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_CoverageQuestion) at QuickClaimDV.GL.pcf: line 186, column 43
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.CoverageInQuestion = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_135 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at QuickClaimDV.GL.pcf: line 247, column 42
    function defaultSetter_146 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at QuickClaimDV.GL.pcf: line 279, column 41
    function defaultSetter_160 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function defaultSetter_167 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'value' attribute on Choice at QuickClaimDV.GL.pcf: line 287, column 41
    function defaultSetter_176 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignment = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at QuickClaimDV.GL.pcf: line 40, column 48
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at QuickClaimDV.GL.pcf: line 90, column 38
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LOBCode = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.GL.pcf: line 104, column 41
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.GL.pcf: line 112, column 48
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.PermissionRequired = (__VALUE_TO_SET as typekey.ClaimSecurityType)
    }
    
    // 'value' attribute on TextAreaInput (id=Claim_Description) at QuickClaimDV.GL.pcf: line 121, column 36
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at QuickClaimDV.GL.pcf: line 131, column 40
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at QuickClaimDV.GL.pcf: line 137, column 41
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at QuickClaimDV.GL.pcf: line 153, column 48
    function defaultSetter_86 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.GL.pcf: line 163, column 37
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at QuickClaimDV.GL.pcf: line 168, column 40
    function defaultSetter_96 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at QuickClaimDV.GL.pcf: line 17, column 24
    function initialValue_0 () : Exposure {
      return initializeStep()
    }
    
    // 'initialValue' attribute on Variable at QuickClaimDV.GL.pcf: line 21, column 23
    function initialValue_1 () : Address {
      return getNewAddress()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_12 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_133 (PickedValue :  Contact) : void {
      var contactType = statictypeof (exposure.Claimant); var result = eval("exposure.Claimant = Claim.resolveContact(exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at QuickClaimDV.GL.pcf: line 232, column 43
    function reflectionValue_122 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at QuickClaimDV.GL.pcf: line 249, column 40
    function reflectionValue_143 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at QuickClaimDV.GL.pcf: line 42, column 40
    function reflectionValue_23 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==null) ? ("") : (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at QuickClaimDV.GL.pcf: line 60, column 44
    function reflectionValue_28 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at QuickClaimDV.GL.pcf: line 68, column 53
    function reflectionValue_33 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'required' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function required_165 () : java.lang.Boolean {
      return Wizard.CommonAssignment
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at QuickClaimDV.GL.pcf: line 146, column 33
    function validationExpression_77 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.GL.pcf: line 163, column 37
    function validationExpression_88 () : java.lang.Object {
      return Claim.ReportedDate == null || Claim.ReportedDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_137 () : java.lang.Object {
      return Claim.getRelatedContacts(exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_16 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRange_169 () : java.lang.Object {
      return Claim.SuggestedAssignees
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.GL.pcf: line 104, column 41
    function valueRange_55 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.GL.pcf: line 112, column 48
    function valueRange_62 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableTypes()
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_LossParty) at QuickClaimDV.GL.pcf: line 214, column 44
    function valueRoot_116 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_15 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=Claimant_Workphone) at QuickClaimDV.GL.pcf: line 261, column 53
    function valueRoot_152 () : java.lang.Object {
      return exposure.Claimant
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRoot_168 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_WorkPhone) at QuickClaimDV.GL.pcf: line 57, column 50
    function valueRoot_32 () : java.lang.Object {
      return Claim.reporter
    }
    
    // 'value' attribute on TextInput (id=Policy_PolicyNumber) at QuickClaimDV.GL.pcf: line 75, column 44
    function valueRoot_40 () : java.lang.Object {
      return Claim.Policy
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at QuickClaimDV.GL.pcf: line 180, column 39
    function value_102 () : java.lang.Boolean {
      return Claim.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_CoverageQuestion) at QuickClaimDV.GL.pcf: line 186, column 43
    function value_106 () : java.lang.Boolean {
      return Claim.CoverageInQuestion
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_LossParty) at QuickClaimDV.GL.pcf: line 214, column 44
    function value_114 () : typekey.LossPartyType {
      return exposure.LossParty
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_PrimaryCoverage) at QuickClaimDV.GL.pcf: line 219, column 43
    function value_117 () : typekey.CoverageType {
      return exposure.PrimaryCoverage
    }
    
    // 'value' attribute on ReflectCondition at QuickClaimDV.GL.pcf: line 235, column 36
    function value_121 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at QuickClaimDV.GL.pcf: line 230, column 85
    function value_123 () : entity.Contact {
      return exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at QuickClaimDV.GL.pcf: line 247, column 42
    function value_144 () : typekey.ClaimantType {
      return exposure.ClaimantType
    }
    
    // 'value' attribute on TextInput (id=Claimant_Workphone) at QuickClaimDV.GL.pcf: line 261, column 53
    function value_150 () : java.lang.String {
      return exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at QuickClaimDV.GL.pcf: line 269, column 62
    function value_155 () : java.lang.String {
      return exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at QuickClaimDV.GL.pcf: line 279, column 41
    function value_158 () : java.lang.Boolean {
      return exposure.OtherCoverage
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at QuickClaimDV.GL.pcf: line 297, column 52
    function value_162 () : gw.api.assignment.Assignee {
      return Wizard.CommonAssignee
    }
    
    // 'value' attribute on Choice at QuickClaimDV.GL.pcf: line 287, column 41
    function value_178 () : java.lang.Object {
      return Wizard.CommonAssignment
    }
    
    // 'value' attribute on RowIterator at QuickClaimDV.GL.pcf: line 316, column 68
    function value_195 () : gw.cc.claim.NewClaimAssignmentOption[] {
      return Wizard.IndividualAssignments
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at QuickClaimDV.GL.pcf: line 33, column 48
    function value_2 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at QuickClaimDV.GL.pcf: line 40, column 48
    function value_24 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_WorkPhone) at QuickClaimDV.GL.pcf: line 57, column 50
    function value_30 () : java.lang.String {
      return Claim.reporter.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_Address) at QuickClaimDV.GL.pcf: line 65, column 59
    function value_35 () : java.lang.String {
      return Claim.reporter.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Policy_PolicyNumber) at QuickClaimDV.GL.pcf: line 75, column 44
    function value_38 () : java.lang.String {
      return Claim.Policy.PolicyNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Policy_Status) at QuickClaimDV.GL.pcf: line 80, column 43
    function value_41 () : typekey.PolicyStatus {
      return Claim.Policy.Status
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at QuickClaimDV.GL.pcf: line 90, column 38
    function value_44 () : typekey.LOBCode {
      return Claim.LOBCode
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossType) at QuickClaimDV.GL.pcf: line 96, column 39
    function value_48 () : typekey.LossType {
      return Claim.LossType
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.GL.pcf: line 104, column 41
    function value_51 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.GL.pcf: line 112, column 48
    function value_58 () : typekey.ClaimSecurityType {
      return Claim.PermissionRequired
    }
    
    // 'value' attribute on TextAreaInput (id=Claim_Description) at QuickClaimDV.GL.pcf: line 121, column 36
    function value_65 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at QuickClaimDV.GL.pcf: line 131, column 40
    function value_69 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at QuickClaimDV.GL.pcf: line 137, column 41
    function value_73 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at QuickClaimDV.GL.pcf: line 146, column 33
    function value_78 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at QuickClaimDV.GL.pcf: line 153, column 48
    function value_83 () : java.math.BigDecimal {
      return Claim.Fault
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.GL.pcf: line 163, column 37
    function value_89 () : java.util.Date {
      return Claim.ReportedDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at QuickClaimDV.GL.pcf: line 168, column 40
    function value_94 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at QuickClaimDV.GL.pcf: line 174, column 46
    function value_98 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_138 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_138 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_138 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
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
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_170 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_170 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.GL.pcf: line 104, column 41
    function verifyValueRangeIsAllowedType_56 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.GL.pcf: line 104, column 41
    function verifyValueRangeIsAllowedType_56 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.GL.pcf: line 104, column 41
    function verifyValueRangeIsAllowedType_56 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.GL.pcf: line 112, column 48
    function verifyValueRangeIsAllowedType_63 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.GL.pcf: line 112, column 48
    function verifyValueRangeIsAllowedType_63 ($$arg :  typekey.ClaimSecurityType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_139 () : void {
      var __valueRangeArg = Claim.getRelatedContacts(exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_138(__valueRangeArg)
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRange_171 () : void {
      var __valueRangeArg = Claim.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_170(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_18 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_17(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at QuickClaimDV.GL.pcf: line 104, column 41
    function verifyValueRange_57 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_56(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at QuickClaimDV.GL.pcf: line 112, column 48
    function verifyValueRange_64 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableTypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_63(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_127 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (exposure.Claimant), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on RowIterator at QuickClaimDV.GL.pcf: line 334, column 57
    function visible_179 () : java.lang.Boolean {
      return !Wizard.CommonAssignment
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_3 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_6 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=Notification_AtFaultPercentage) at QuickClaimDV.GL.pcf: line 153, column 48
    function visible_82 () : java.lang.Boolean {
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
    
    property get localAddress () : Address {
      return getVariableValue("localAddress", 0) as Address
    }
    
    property set localAddress ($arg :  Address) {
      setVariableValue("localAddress", 0, $arg)
    }
    
    function initializeStep() : Exposure {
      if (!Claim.areInitialValuesSet()) {
        Claim.setInitialValues()
      }
      var exposures = Claim.OrderedExposures
      if (exposures.length > 0) {
        return exposures[0]
      } else {
        return Wizard.addExposure(Claim, null, TC_GLCGLCOV, TC_GLCGLCOV_OPS_GD)
      }
    }
    function getNewAddress() : Address {
      if (Claim.LossLocation == null) {
        Claim.LossLocation = new Address(Claim);
        return Claim.LossLocation;
      }
      return new Address(Claim);
    }
    
    
  }
  
  
}