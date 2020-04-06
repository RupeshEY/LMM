package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentAssessDV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotIncidentAssessDV_700Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentAssessDV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotIncidentAssessDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotIncidentAssessDV.700.pcf: line 20, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return incidentParam
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 103, column 30
    function sortValue_28 (AssessmentSource :  dynamic.Dynamic) : java.lang.Object {
      return AssessmentSource.SourceName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 108, column 46
    function sortValue_29 (AssessmentSource :  dynamic.Dynamic) : java.lang.Object {
      return AssessmentSource.SourceType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 115, column 46
    function sortValue_30 (AssessmentSource :  dynamic.Dynamic) : java.lang.Object {
      return AssessmentSource.Assessor
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 121, column 30
    function sortValue_31 (AssessmentSource :  dynamic.Dynamic) : java.lang.Object {
      return AssessmentSource.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 145, column 46
    function sortValue_58 (assessmentItem :  dynamic.Dynamic) : java.lang.Object {
      return assessmentItem.PropertyCategory
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 152, column 30
    function sortValue_59 (assessmentItem :  dynamic.Dynamic) : java.lang.Object {
      return assessmentItem.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 157, column 46
    function sortValue_60 (assessmentItem :  dynamic.Dynamic) : java.lang.Object {
      return assessmentItem.Action
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 164, column 33
    function sortValue_61 (assessmentItem :  dynamic.Dynamic) : java.lang.Object {
      return assessmentItem.EstimateAmount
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 170, column 30
    function sortValue_62 (assessmentItem :  dynamic.Dynamic) : java.lang.Object {
      return assessmentItem.ItemComment
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 176, column 46
    function sortValue_63 (assessmentItem :  dynamic.Dynamic) : java.lang.Object {
      return assessmentItem.AssessmentSource
    }
    
    // 'value' attribute on TextInput (id=InternalUser_Name) at ClaimSnapshotIncidentAssessDV.700.pcf: line 64, column 38
    function valueRoot_20 () : java.lang.Object {
      return incident.InternalUser
    }
    
    // 'value' attribute on TextInput (id=Display_Name) at ClaimSnapshotIncidentAssessDV.700.pcf: line 28, column 38
    function valueRoot_3 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextInput (id=Display_Name) at ClaimSnapshotIncidentAssessDV.700.pcf: line 28, column 38
    function value_1 () : dynamic.Dynamic {
      return incident.DisplayName
    }
    
    // 'value' attribute on DateInput (id=TargetCloseDate) at ClaimSnapshotIncidentAssessDV.700.pcf: line 48, column 38
    function value_10 () : dynamic.Dynamic {
      return incident.AssessmentTargetCloseDate
    }
    
    // 'value' attribute on DateInput (id=CloseDate) at ClaimSnapshotIncidentAssessDV.700.pcf: line 56, column 75
    function value_14 () : dynamic.Dynamic {
      return incident.AssessmentCloseDate
    }
    
    // 'value' attribute on TextInput (id=InternalUser_Name) at ClaimSnapshotIncidentAssessDV.700.pcf: line 64, column 38
    function value_18 () : dynamic.Dynamic {
      return incident.InternalUser.DisplayName
    }
    
    // 'value' attribute on TextInput (id=General_Comment) at ClaimSnapshotIncidentAssessDV.700.pcf: line 69, column 38
    function value_21 () : dynamic.Dynamic {
      return incident.AssessmentComment
    }
    
    // 'value' attribute on CurrencyInput (id=ApproveTotal) at ClaimSnapshotIncidentAssessDV.700.pcf: line 74, column 51
    function value_24 () : gw.api.financials.CurrencyAmount {
      return approvedTotal(incident.ItemLine)
    }
    
    // 'value' attribute on CurrencyInput (id=ReviewTotal) at ClaimSnapshotIncidentAssessDV.700.pcf: line 79, column 49
    function value_26 () : gw.api.financials.CurrencyAmount {
      return reviewTotal(incident.ItemLine)
    }
    
    // 'value' attribute on TextInput (id=General_Description) at ClaimSnapshotIncidentAssessDV.700.pcf: line 34, column 38
    function value_4 () : dynamic.Dynamic {
      return incident.AssessmentName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 95, column 41
    function value_57 () : dynamic.Dynamic {
      return incident.SourceLine
    }
    
    // 'value' attribute on TextInput (id=Status) at ClaimSnapshotIncidentAssessDV.700.pcf: line 40, column 37
    function value_7 () : dynamic.Dynamic {
      return incident.AssessmentStatus
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentAssessDV.700.pcf: line 139, column 41
    function value_83 () : dynamic.Dynamic {
      return incident.ItemLine
    }
    
    // 'visible' attribute on DateInput (id=CloseDate) at ClaimSnapshotIncidentAssessDV.700.pcf: line 56, column 75
    function visible_13 () : java.lang.Boolean {
      return  incident.AssessmentStatus.Code == "closed" 
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get incident () : dynamic.Dynamic {
      return getVariableValue("incident", 0) as dynamic.Dynamic
    }
    
    property set incident ($arg :  dynamic.Dynamic) {
      setVariableValue("incident", 0, $arg)
    }
    
    property get incidentParam () : dynamic.Dynamic {
      return getRequireValue("incidentParam", 0) as dynamic.Dynamic
    }
    
    property set incidentParam ($arg :  dynamic.Dynamic) {
      setRequireValue("incidentParam", 0, $arg)
    }
    
    property get snapshot () : dynamic.Dynamic {
      return getRequireValue("snapshot", 0) as dynamic.Dynamic
    }
    
    property set snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("snapshot", 0, $arg)
    }
    
    function approvedTotal(itemLine : dynamic.Dynamic) : gw.api.financials.CurrencyAmount {
      var TotalOfApproved: gw.api.financials.CurrencyAmount = gw.api.util.CCCurrencyUtil.getStrict(java.math.BigDecimal.ZERO, Claim.Currency)
      for (aline in itemLine) {
        if (aline.Action == "approve") {
          if (aline.EstimateAmount != null) {
            TotalOfApproved = TotalOfApproved + (aline.EstimateAmount as gw.api.financials.CurrencyAmount)
          }
        }
      }
      return TotalOfApproved;
    }
    
    function reviewTotal(itemLine : dynamic.Dynamic) : gw.api.financials.CurrencyAmount {
      var TotalOfInReview: gw.api.financials.CurrencyAmount = gw.api.util.CCCurrencyUtil.getStrict(java.math.BigDecimal.ZERO, Claim.Currency)
      for (aline in itemLine) {
        if (aline.Action == "Review" or aline.Action == null) {
          if (aline.EstimateAmount != null) {
            TotalOfInReview = TotalOfInReview + (aline.EstimateAmount as gw.api.financials.CurrencyAmount)
          }
        }
      }
      return TotalOfInReview;
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentAssessDV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotIncidentAssessDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at ClaimSnapshotIncidentAssessDV.700.pcf: line 176, column 46
    function valueRange_82 () : java.lang.Object {
      return assessmentItem.Incident.SourceLine
    }
    
    // 'value' attribute on TextCell (id=Category) at ClaimSnapshotIncidentAssessDV.700.pcf: line 145, column 46
    function valueRoot_66 () : java.lang.Object {
      return assessmentItem
    }
    
    // 'value' attribute on TextCell (id=Category) at ClaimSnapshotIncidentAssessDV.700.pcf: line 145, column 46
    function value_64 () : dynamic.Dynamic {
      return assessmentItem.PropertyCategory
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotIncidentAssessDV.700.pcf: line 152, column 30
    function value_67 () : dynamic.Dynamic {
      return assessmentItem.Description
    }
    
    // 'value' attribute on TextCell (id=Action) at ClaimSnapshotIncidentAssessDV.700.pcf: line 157, column 46
    function value_70 () : dynamic.Dynamic {
      return assessmentItem.Action
    }
    
    // 'value' attribute on TextCell (id=EstimateAmount) at ClaimSnapshotIncidentAssessDV.700.pcf: line 164, column 33
    function value_73 () : dynamic.Dynamic {
      return assessmentItem.EstimateAmount
    }
    
    // 'value' attribute on TextCell (id=Comment) at ClaimSnapshotIncidentAssessDV.700.pcf: line 170, column 30
    function value_76 () : dynamic.Dynamic {
      return assessmentItem.ItemComment
    }
    
    // 'value' attribute on RangeCell (id=AssessmentSource) at ClaimSnapshotIncidentAssessDV.700.pcf: line 176, column 46
    function value_79 () : dynamic.Dynamic {
      return assessmentItem.AssessmentSource
    }
    
    property get assessmentItem () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentAssessDV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotIncidentAssessDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 16, column 225
    function action_43 () : void {
      AddressBookPickerPopup.push(statictypeof (AssessmentSource.Assessor), AssessmentSource.Incident.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 18, column 285
    function action_45 () : void {
      if (AssessmentSource.Assessor != null) { ClaimContactDetailPopup.push(AssessmentSource.Assessor, AssessmentSource.Incident.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function action_46 () : void {
      ClaimContactDetailPopup.push(AssessmentSource.Assessor, AssessmentSource.Incident.Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_44 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (AssessmentSource.Assessor), AssessmentSource.Incident.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_47 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(AssessmentSource.Assessor, AssessmentSource.Incident.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_40 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (AssessmentSource.Assessor), null, AssessmentSource.Incident.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_41 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (AssessmentSource.Assessor), null, AssessmentSource.Incident.Claim)
    }
    
    // 'onPick' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function onPick_48 (PickedValue :  Contact) : void {
      var contactType = statictypeof (AssessmentSource.Assessor); var result = eval("AssessmentSource.Assessor = AssessmentSource.Incident.Claim.resolveContact(AssessmentSource.Assessor) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_51 () : java.lang.Object {
      return AssessmentSource.Incident.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotIncidentAssessDV.700.pcf: line 103, column 30
    function valueRoot_34 () : java.lang.Object {
      return AssessmentSource
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotIncidentAssessDV.700.pcf: line 103, column 30
    function value_32 () : dynamic.Dynamic {
      return AssessmentSource.SourceName
    }
    
    // 'value' attribute on TextCell (id=Source) at ClaimSnapshotIncidentAssessDV.700.pcf: line 108, column 46
    function value_35 () : dynamic.Dynamic {
      return AssessmentSource.SourceType
    }
    
    // 'value' attribute on ClaimContactCell (id=Assessor) at ClaimSnapshotIncidentAssessDV.700.pcf: line 115, column 46
    function value_38 () : dynamic.Dynamic {
      return AssessmentSource.Assessor
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotIncidentAssessDV.700.pcf: line 121, column 30
    function value_54 () : dynamic.Dynamic {
      return AssessmentSource.Description
    }
    
    // 'visible' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 14, column 229
    function visible_39 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=Assessor) at ClaimContactWidget.xml: line 16, column 225
    function visible_42 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (AssessmentSource.Assessor), AssessmentSource.Incident.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get AssessmentSource () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}