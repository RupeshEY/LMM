package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuickClaimDV_TravelCancelOnlyExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuickClaimDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=aTripRU) at QuickClaimDV.TravelCancelOnly.pcf: line 198, column 30
    function action_84 () : void {
      TripRUPopup.push( Claim, aTripRU, false )
    }
    
    // 'action' attribute on TextCell (id=aTripRU) at QuickClaimDV.TravelCancelOnly.pcf: line 198, column 30
    function action_dest_85 () : pcf.api.Destination {
      return pcf.TripRUPopup.createDestination( Claim, aTripRU, false )
    }
    
    // 'condition' attribute on ToolbarFlag at QuickClaimDV.TravelCancelOnly.pcf: line 184, column 34
    function condition_81 () : java.lang.Boolean {
      return Claim.TripIncidentsOnly.where( \ i -> i.TripRU == aTripRU ).Count == 0
    }
    
    // 'condition' attribute on ToolbarFlag at QuickClaimDV.TravelCancelOnly.pcf: line 190, column 37
    function condition_82 () : java.lang.Boolean {
      return Claim.TripIncidentsOnly.where( \ i -> i.TripRU == aTripRU ).Count > 0
    }
    
    // 'value' attribute on TextCell (id=aTripRU) at QuickClaimDV.TravelCancelOnly.pcf: line 198, column 30
    function value_83 () : java.lang.String {
      return aTripRU.DisplayName.length > 60 ? aTripRU.DisplayName.substring( 0, 57 ) + "..." : aTripRU.DisplayName
    }
    
    // 'value' attribute on TextCell (id=CancelledTrip) at QuickClaimDV.TravelCancelOnly.pcf: line 201, column 215
    function value_87 () : java.lang.String {
      return Claim.TripIncidentsOnly.where( \ i -> i.TripRU == aTripRU ).Count > 0 ? DisplayKey.get("NVV.Claim.SubView.NewQuickClaimClaimTravel.Trips.CancelledTripLabel") : ""
    }
    
    property get aTripRU () : entity.TripRU {
      return getIteratedValue(1) as entity.TripRU
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaimDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_5 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_7 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_8 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_95 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_6 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_dest_96 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=CancelTrips_ToolbarButton) at QuickClaimDV.TravelCancelOnly.pcf: line 166, column 119
    function allCheckedRowsAction_78 (CheckedValues :  entity.TripRU[], CheckedValuesErrors :  java.util.Map) : void {
      Claim.cancelTrips( CheckedValues )
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UndoCancellations_ToolbarButton) at QuickClaimDV.TravelCancelOnly.pcf: line 172, column 120
    function allCheckedRowsAction_79 (CheckedValues :  entity.TripRU[], CheckedValuesErrors :  java.util.Map) : void {
      Claim.undoTripCancellation( CheckedValues )
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.TravelCancelOnly.pcf: line 52, column 35
    function condition_19 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==null
    }
    
    // 'condition' attribute on ReflectCondition at QuickClaimDV.TravelCancelOnly.pcf: line 55, column 39
    function condition_20 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_2 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at QuickClaimDV.TravelCancelOnly.pcf: line 155, column 26
    function def_onEnter_76 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput (id=EditableTripIncidentsLV) at QuickClaimDV.TravelCancelOnly.pcf: line 214, column 55
    function def_onEnter_92 (def :  pcf.EditableTripIncidentsLV) : void {
      def.onEnter(Claim, true)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_3 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at QuickClaimDV.TravelCancelOnly.pcf: line 155, column 26
    function def_refreshVariables_77 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput (id=EditableTripIncidentsLV) at QuickClaimDV.TravelCancelOnly.pcf: line 214, column 55
    function def_refreshVariables_93 (def :  pcf.EditableTripIncidentsLV) : void {
      def.refreshVariables(Claim, true)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at QuickClaimDV.TravelCancelOnly.pcf: line 47, column 48
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at QuickClaimDV.TravelCancelOnly.pcf: line 97, column 38
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LOBCode = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'value' attribute on TextAreaInput (id=Claim_Description) at QuickClaimDV.TravelCancelOnly.pcf: line 112, column 36
    function defaultSetter_51 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at QuickClaimDV.TravelCancelOnly.pcf: line 122, column 40
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.TravelCancelOnly.pcf: line 136, column 37
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at QuickClaimDV.TravelCancelOnly.pcf: line 142, column 39
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_CoverageQuestion) at QuickClaimDV.TravelCancelOnly.pcf: line 148, column 43
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.CoverageInQuestion = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_10 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at QuickClaimDV.TravelCancelOnly.pcf: line 49, column 40
    function reflectionValue_21 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==null) ? ("") : (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at QuickClaimDV.TravelCancelOnly.pcf: line 67, column 44
    function reflectionValue_26 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at QuickClaimDV.TravelCancelOnly.pcf: line 75, column 53
    function reflectionValue_31 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'required' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function required_97 () : java.lang.Boolean {
      return Wizard.CommonAssignment
    }
    
    // 'sortBy' attribute on IteratorSort at QuickClaimDV.TravelCancelOnly.pcf: line 187, column 30
    function sortBy_80 (aTripRU :  entity.TripRU) : java.lang.Object {
      return aTripRU.DisplayName
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at QuickClaimDV.TravelCancelOnly.pcf: line 129, column 33
    function validationExpression_57 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.TravelCancelOnly.pcf: line 136, column 37
    function validationExpression_62 () : java.lang.Object {
      return Claim.ReportedDate == null || Claim.ReportedDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRange_101 () : java.lang.Object {
      return Claim.SuggestedAssignees
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_14 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRoot_100 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_13 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_WorkPhone) at QuickClaimDV.TravelCancelOnly.pcf: line 64, column 50
    function valueRoot_30 () : java.lang.Object {
      return Claim.reporter
    }
    
    // 'value' attribute on TextInput (id=Policy_PolicyNumber) at QuickClaimDV.TravelCancelOnly.pcf: line 82, column 44
    function valueRoot_38 () : java.lang.Object {
      return Claim.Policy
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Name) at QuickClaimDV.TravelCancelOnly.pcf: line 40, column 48
    function value_0 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at QuickClaimDV.TravelCancelOnly.pcf: line 47, column 48
    function value_22 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_WorkPhone) at QuickClaimDV.TravelCancelOnly.pcf: line 64, column 50
    function value_28 () : java.lang.String {
      return Claim.reporter.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=ReportedBy_Address) at QuickClaimDV.TravelCancelOnly.pcf: line 72, column 59
    function value_33 () : java.lang.String {
      return Claim.reporter.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Policy_PolicyNumber) at QuickClaimDV.TravelCancelOnly.pcf: line 82, column 44
    function value_36 () : java.lang.String {
      return Claim.Policy.PolicyNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Policy_Status) at QuickClaimDV.TravelCancelOnly.pcf: line 87, column 43
    function value_39 () : typekey.PolicyStatus {
      return Claim.Policy.Status
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at QuickClaimDV.TravelCancelOnly.pcf: line 97, column 38
    function value_42 () : typekey.LOBCode {
      return Claim.LOBCode
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossType) at QuickClaimDV.TravelCancelOnly.pcf: line 103, column 39
    function value_46 () : typekey.LossType {
      return Claim.LossType
    }
    
    // 'value' attribute on TextAreaInput (id=Claim_Description) at QuickClaimDV.TravelCancelOnly.pcf: line 112, column 36
    function value_49 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at QuickClaimDV.TravelCancelOnly.pcf: line 122, column 40
    function value_53 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at QuickClaimDV.TravelCancelOnly.pcf: line 129, column 33
    function value_58 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at QuickClaimDV.TravelCancelOnly.pcf: line 136, column 37
    function value_63 () : java.util.Date {
      return Claim.ReportedDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at QuickClaimDV.TravelCancelOnly.pcf: line 142, column 39
    function value_68 () : java.lang.Boolean {
      return Claim.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_CoverageQuestion) at QuickClaimDV.TravelCancelOnly.pcf: line 148, column 43
    function value_72 () : java.lang.Boolean {
      return Claim.CoverageInQuestion
    }
    
    // 'value' attribute on RowIterator at QuickClaimDV.TravelCancelOnly.pcf: line 181, column 41
    function value_89 () : entity.TripRU[] {
      return Claim.Policy.RiskUnits.whereTypeIs(TripRU)
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at QuickClaimDV.TravelCancelOnly.pcf: line 229, column 48
    function value_94 () : gw.api.assignment.Assignee {
      return Wizard.CommonAssignee
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_102 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_102 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_15 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_15 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRange_103 () : void {
      var __valueRangeArg = Claim.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_102(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_16 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_1 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_4 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on InputDivider at QuickClaimDV.TravelCancelOnly.pcf: line 207, column 56
    function visible_90 () : java.lang.Boolean {
      return Claim.TripIncidentsOnly.HasElements
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
    
    
  }
  
  
}