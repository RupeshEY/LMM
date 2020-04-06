package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubrogationMainPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends SubrogationMainPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at SubrogationMainPanelSet.pcf: line 348, column 50
    function action_182 () : void {
      MatterDetailGroup.go(claim, Matter)
    }
    
    // 'action' attribute on TextCell (id=Name) at SubrogationMainPanelSet.pcf: line 348, column 50
    function action_dest_183 () : pcf.api.Destination {
      return pcf.MatterDetailGroup.createDestination(claim, Matter)
    }
    
    // 'value' attribute on TextCell (id=Name) at SubrogationMainPanelSet.pcf: line 348, column 50
    function valueRoot_185 () : java.lang.Object {
      return Matter
    }
    
    // 'value' attribute on DateCell (id=TrialDetails_TrialDate) at SubrogationMainPanelSet.pcf: line 362, column 47
    function valueRoot_191 () : java.lang.Object {
      return Matter.TrialDateActivity
    }
    
    // 'value' attribute on TextCell (id=Name) at SubrogationMainPanelSet.pcf: line 348, column 50
    function value_181 () : java.lang.String {
      return Matter.Name
    }
    
    // 'value' attribute on TypeKeyCell (id=TrialDetails_MatterType) at SubrogationMainPanelSet.pcf: line 354, column 61
    function value_186 () : typekey.MatterType {
      return Matter.MatterType
    }
    
    // 'value' attribute on DateCell (id=TrialDetails_TrialDate) at SubrogationMainPanelSet.pcf: line 362, column 47
    function value_189 () : java.util.Date {
      return Matter.TrialDateActivity.TargetDate
    }
    
    // 'value' attribute on DateCell (id=Matter_CloseDate) at SubrogationMainPanelSet.pcf: line 367, column 47
    function value_192 () : java.util.Date {
      return Matter.CloseDate
    }
    
    property get Matter () : entity.Matter {
      return getIteratedValue(1) as entity.Matter
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SubrogationMainPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function action_129 () : void {
      SubrogationDetail.drilldown(subrogation)
    }
    
    // 'action' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function action_dest_130 () : pcf.api.Destination {
      return pcf.SubrogationDetail.createDestination(subrogation)
    }
    
    // 'available' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function available_124 () : java.lang.Boolean {
      return subrogation.Exposure == null or not subrogation.New
    }
    
    // 'checkBoxVisible' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 240, column 56
    function checkBoxVisible_168 () : java.lang.Boolean {
      return CurrentLocation.InEditMode or subrogationSummary.EscalateSubro
    }
    
    // 'condition' attribute on ToolbarFlag at SubrogationMainPanelSet.pcf: line 243, column 43
    function condition_123 () : java.lang.Boolean {
      return subrogation.Status != TC_OPEN and subrogation.Status != TC_CLOSED
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function defaultSetter_132 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.Exposure = (__VALUE_TO_SET as entity.Exposure)
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at SubrogationMainPanelSet.pcf: line 274, column 65
    function defaultSetter_144 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.Status = (__VALUE_TO_SET as typekey.SubrogationStatus)
    }
    
    // 'value' attribute on TextCell (id=CloseComment) at SubrogationMainPanelSet.pcf: line 294, column 75
    function defaultSetter_159 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.CloseComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=Outcome) at SubrogationMainPanelSet.pcf: line 302, column 75
    function defaultSetter_166 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.Outcome = (__VALUE_TO_SET as typekey.SubroClosedOutcome)
    }
    
    // 'editable' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function editable_125 () : java.lang.Boolean {
      return subrogation.Exposure == null
    }
    
    // 'editable' attribute on TextCell (id=CloseComment) at SubrogationMainPanelSet.pcf: line 294, column 75
    function editable_154 () : java.lang.Boolean {
      return subrogation.Status == TC_CLOSED and subrogation.isFieldChanged(entity.Subrogation#Status)
    }
    
    // 'icon' attribute on BooleanRadioCell (id=CustomizedLiability) at SubrogationMainPanelSet.pcf: line 266, column 110
    function icon_139 () : java.lang.String {
      return 'service_request_complete.png'
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function valueRange_134 () : java.lang.Object {
      return subrogation.Exposure == null ? subrogationSummary.UnsubrogatedExposures : new Exposure[]{subrogation.Exposure}
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function valueRoot_133 () : java.lang.Object {
      return subrogation
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function value_126 () : entity.Exposure {
      return subrogation.Exposure
    }
    
    // 'value' attribute on BooleanRadioCell (id=CustomizedLiability) at SubrogationMainPanelSet.pcf: line 266, column 110
    function value_138 () : java.lang.Boolean {
      return subrogation.CustomizedLiability
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at SubrogationMainPanelSet.pcf: line 274, column 65
    function value_142 () : typekey.SubrogationStatus {
      return subrogation.Status
    }
    
    // 'value' attribute on TextCell (id=Owner) at SubrogationMainPanelSet.pcf: line 283, column 123
    function value_147 () : entity.User {
      return subrogation.AssignedUser
    }
    
    // 'value' attribute on DateCell (id=CloseDate) at SubrogationMainPanelSet.pcf: line 288, column 75
    function value_150 () : java.util.Date {
      return subrogation.CloseDate
    }
    
    // 'value' attribute on TextCell (id=CloseComment) at SubrogationMainPanelSet.pcf: line 294, column 75
    function value_155 () : java.lang.String {
      return subrogation.CloseComment
    }
    
    // 'value' attribute on TypeKeyCell (id=Outcome) at SubrogationMainPanelSet.pcf: line 302, column 75
    function value_162 () : typekey.SubroClosedOutcome {
      return subrogation.Outcome
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function verifyValueRangeIsAllowedType_135 ($$arg :  entity.Exposure[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function verifyValueRangeIsAllowedType_135 ($$arg :  gw.api.database.IQueryBeanResult<entity.Exposure>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function verifyValueRangeIsAllowedType_135 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at SubrogationMainPanelSet.pcf: line 256, column 55
    function verifyValueRange_136 () : void {
      var __valueRangeArg = subrogation.Exposure == null ? subrogationSummary.UnsubrogatedExposures : new Exposure[]{subrogation.Exposure}
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_135(__valueRangeArg)
    }
    
    // 'visible' attribute on BooleanRadioCell (id=CustomizedLiability) at SubrogationMainPanelSet.pcf: line 266, column 110
    function visible_137 () : java.lang.Boolean {
      return not subrogationSummary.Subrogations*.SubroAdversePartyOverrides.IsEmpty
    }
    
    // 'visible' attribute on TextCell (id=Owner) at SubrogationMainPanelSet.pcf: line 283, column 123
    function visible_146 () : java.lang.Boolean {
      return subrogationSummary.EscalateSubro and subrogationSummary.SubrogateIndividualExposures
    }
    
    // 'valueVisible' attribute on DateCell (id=CloseDate) at SubrogationMainPanelSet.pcf: line 288, column 75
    function visible_151 () : java.lang.Boolean {
      return subrogation.Status == TC_CLOSED
    }
    
    property get subrogation () : Subrogation {
      return getIteratedValue(1) as Subrogation
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationMainPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=NewNoteButton) at SubrogationMainPanelSet.pcf: line 387, column 82
    function action_197 () : void {
      NewNotePopup.push(claim, NoteTopicType.TC_SUBROGATION)
    }
    
    // 'action' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationMainPanelSet.pcf: line 422, column 85
    function action_207 () : void {
      ClaimNewDocumentFromTemplateWorksheet.goInWorkspace(claim, subrogationSummary.DocumentInitForUI)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at SubrogationMainPanelSet.pcf: line 427, column 85
    function action_210 () : void {
      ClaimNewDocumentLinkedWorksheet.goInWorkspace(claim, subrogationSummary.DocumentInitForUI)
    }
    
    // 'action' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationMainPanelSet.pcf: line 433, column 75
    function action_213 () : void {
      PickExistingDocumentPopup.push(subrogationSummary.Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationMainPanelSet.pcf: line 440, column 118
    function action_218 () : void {
      
    }
    
    // 'action' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 16, column 225
    function action_54 () : void {
      AddressBookPickerPopup.push(statictypeof (claim.subrogator), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 18, column 285
    function action_56 () : void {
      if (claim.subrogator != null) { ClaimContactDetailPopup.push(claim.subrogator, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function action_58 () : void {
      ClaimContactDetailPopup.push(claim.subrogator, claim)
    }
    
    // 'action' attribute on ToolbarButton (id=NewNoteButton) at SubrogationMainPanelSet.pcf: line 387, column 82
    function action_dest_198 () : pcf.api.Destination {
      return pcf.NewNotePopup.createDestination(claim, NoteTopicType.TC_SUBROGATION)
    }
    
    // 'action' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationMainPanelSet.pcf: line 422, column 85
    function action_dest_208 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentFromTemplateWorksheet.createDestination(claim, subrogationSummary.DocumentInitForUI)
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at SubrogationMainPanelSet.pcf: line 427, column 85
    function action_dest_211 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentLinkedWorksheet.createDestination(claim, subrogationSummary.DocumentInitForUI)
    }
    
    // 'action' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationMainPanelSet.pcf: line 433, column 75
    function action_dest_214 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(subrogationSummary.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_55 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (claim.subrogator), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_59 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(claim.subrogator, claim)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=AssignExposureLevelSubrogation) at SubrogationMainPanelSet.pcf: line 227, column 102
    function allCheckedRowsAction_113 (CheckedValues :  Subrogation[], CheckedValuesErrors :  java.util.Map) : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on CheckBoxInput (id=SubrogateIndividualExposures) at SubrogationMainPanelSet.pcf: line 197, column 105
    function available_102 () : java.lang.Boolean {
      return subrogationSummary.SubrogateIndividualExposures ? not subrogationSummary.Subrogations.hasMatch(\ subrogation -> subrogation.Status == TC_OPEN or subrogation.Status == TC_CLOSED) : subrogationSummary.Claim.Exposures.length > 0 and subrogationSummary.Status != TC_CLOSED
    }
    
    // 'available' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationMainPanelSet.pcf: line 422, column 85
    function available_206 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentTemplateActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=AttachDocument) at SubrogationMainPanelSet.pcf: line 427, column 85
    function available_209 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable and documentsActionsHelper.DocumentContentActionsAvailable
    }
    
    // 'available' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationMainPanelSet.pcf: line 433, column 75
    function available_212 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationMainPanelSet.pcf: line 440, column 118
    function available_216 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentContentServerAvailable
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=EditButton) at SubrogationMainPanelSet.pcf: line 393, column 83
    function checkedRowAction_199 (element :  entity.Note, CheckedValue :  entity.Note) : void {
      EditNotePopup.push(CheckedValue, false, true)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=DeleteButton) at SubrogationMainPanelSet.pcf: line 399, column 85
    function checkedRowAction_200 (element :  entity.Note, CheckedValue :  entity.Note) : void {
      gw.api.note.NotesUtilBase.deleteNote(CheckedValue)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=PrintButton) at SubrogationMainPanelSet.pcf: line 406, column 84
    function checkedRowAction_201 (element :  entity.Note, CheckedValue :  entity.Note) : void {
      gw.api.print.PrintNoteAction.printNote(CheckedValue)
    }
    
    // 'def' attribute on ListViewInput (id=AdversePartyInfo) at SubrogationMainPanelSet.pcf: line 172, column 37
    function def_onEnter_100 (def :  pcf.EditableAdverseGeneralLV) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on ListViewInput (id=StatuteLimitations) at SubrogationMainPanelSet.pcf: line 313, column 37
    function def_onEnter_173 (def :  pcf.EditableStatuteLV) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at SubrogationMainPanelSet.pcf: line 382, column 58
    function def_onEnter_202 (def :  pcf.WideNotesLV) : void {
      def.onEnter(claim.getSubroNotes(), true)
    }
    
    // 'def' attribute on PanelRef at SubrogationMainPanelSet.pcf: line 414, column 42
    function def_onEnter_204 (def :  pcf.DocumentAlertPanelSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at SubrogationMainPanelSet.pcf: line 416, column 77
    function def_onEnter_219 (def :  pcf.SubrogationDocumentsLV) : void {
      def.onEnter(subrogationSummary.RelatedDocuments)
    }
    
    // 'def' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_51 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (claim.subrogator), null, claim)
    }
    
    // 'def' attribute on ListViewInput (id=AdversePartyInfo) at SubrogationMainPanelSet.pcf: line 172, column 37
    function def_refreshVariables_101 (def :  pcf.EditableAdverseGeneralLV) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on ListViewInput (id=StatuteLimitations) at SubrogationMainPanelSet.pcf: line 313, column 37
    function def_refreshVariables_174 (def :  pcf.EditableStatuteLV) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on PanelRef at SubrogationMainPanelSet.pcf: line 382, column 58
    function def_refreshVariables_203 (def :  pcf.WideNotesLV) : void {
      def.refreshVariables(claim.getSubroNotes(), true)
    }
    
    // 'def' attribute on PanelRef at SubrogationMainPanelSet.pcf: line 414, column 42
    function def_refreshVariables_205 (def :  pcf.DocumentAlertPanelSet) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at SubrogationMainPanelSet.pcf: line 416, column 77
    function def_refreshVariables_220 (def :  pcf.SubrogationDocumentsLV) : void {
      def.refreshVariables(subrogationSummary.RelatedDocuments)
    }
    
    // 'def' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_52 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (claim.subrogator), null, claim)
    }
    
    // 'value' attribute on CheckBoxInput (id=SubrogateIndividualExposures) at SubrogationMainPanelSet.pcf: line 197, column 105
    function defaultSetter_107 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogationSummary.SubrogateIndividualExposures = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at SubrogationMainPanelSet.pcf: line 55, column 69
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at SubrogationMainPanelSet.pcf: line 62, column 57
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogationSummary.Status = (__VALUE_TO_SET as typekey.SubrogationStatus)
    }
    
    // 'value' attribute on TextInput (id=CloseComment) at SubrogationMainPanelSet.pcf: line 76, column 46
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogationSummary.CloseComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome) at SubrogationMainPanelSet.pcf: line 84, column 46
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogationSummary.ClosedOutcome = (__VALUE_TO_SET as typekey.SubroClosedOutcome)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SubroExternalOwner) at SubrogationMainPanelSet.pcf: line 91, column 34
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogationSummary.ExtOwned = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.subrogator = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at SubrogationMainPanelSet.pcf: line 44, column 51
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ProrateDeductible) at SubrogationMainPanelSet.pcf: line 142, column 66
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogationSummary.ProrateDeductible = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Status) at SubrogationMainPanelSet.pcf: line 62, column 57
    function editable_16 () : java.lang.Boolean {
      return not subrogationSummary.SubrogateIndividualExposures
    }
    
    // 'editable' attribute on TextInput (id=CloseComment) at SubrogationMainPanelSet.pcf: line 76, column 46
    function editable_27 () : java.lang.Boolean {
      return subrogationSummary.Subrogations.first().isFieldChanged(Subrogation#Status)
    }
    
    // 'initialValue' attribute on Variable at SubrogationMainPanelSet.pcf: line 13, column 34
    function initialValue_0 () : SubrogationSummary {
      return claim.SubrogationSummary
    }
    
    // 'initialValue' attribute on Variable at SubrogationMainPanelSet.pcf: line 18, column 23
    function initialValue_1 () : boolean {
      return not subrogationSummary.SubrogateIndividualExposures and subrogationSummary.Status == TC_CLOSED
    }
    
    // 'initialValue' attribute on Variable at SubrogationMainPanelSet.pcf: line 22, column 52
    function initialValue_2 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'onChange' attribute on PostOnChange at SubrogationMainPanelSet.pcf: line 93, column 113
    function onChange_43 () : void {
      if (!subrogationSummary.ExtOwned) { subrogationSummary.Claim.subrogator = null}
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationMainPanelSet.pcf: line 433, column 75
    function onPick_215 (PickedValue :  Document) : void {
      subrogationSummary.linkDocumentForUI(PickedValue)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function onPick_60 (PickedValue :  Contact) : void {
      var contactType = statictypeof (claim.subrogator); var result = eval("claim.subrogator = claim.resolveContact(claim.subrogator) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'pickLocation' attribute on AddButton (id=AddResponsibleParty) at SubrogationMainPanelSet.pcf: line 180, column 63
    function pickLocation_98 () : void {
      NewSubroAdversePartyPopup.push(claim)
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 256, column 55
    function sortValue_114 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.Exposure
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 266, column 110
    function sortValue_116 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.CustomizedLiability
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 274, column 65
    function sortValue_117 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.Status
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 283, column 123
    function sortValue_119 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.AssignedUser
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 288, column 75
    function sortValue_120 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.CloseDate
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 294, column 75
    function sortValue_121 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.CloseComment
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 302, column 75
    function sortValue_122 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.Outcome
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 348, column 50
    function sortValue_177 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.Name
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 354, column 61
    function sortValue_178 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.MatterType
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 362, column 47
    function sortValue_179 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.TrialDateActivity.TargetDate
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 367, column 47
    function sortValue_180 (Matter :  entity.Matter) : java.lang.Object {
      return Matter.CloseDate
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 240, column 56
    function toCreateAndAdd_169 () : Subrogation {
      return subrogationSummary.createNewSubrogation()
    }
    
    // 'toRemove' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 240, column 56
    function toRemove_170 (subrogation :  Subrogation) : void {
      subrogationSummary.removeExposureSubrogation(subrogation)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_65 () : java.lang.Object {
      return claim.RelatedContacts
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at SubrogationMainPanelSet.pcf: line 62, column 57
    function valueRoot_21 () : java.lang.Object {
      return subrogationSummary
    }
    
    // 'value' attribute on TextInput (id=Jurisdiction) at SubrogationMainPanelSet.pcf: line 38, column 53
    function valueRoot_5 () : java.lang.Object {
      return claim
    }
    
    // 'value' attribute on TextInput (id=SubroReferralOwner) at SubrogationMainPanelSet.pcf: line 117, column 84
    function valueRoot_76 () : java.lang.Object {
      return subrogationSummary.Subrogations.singleWhere( \ subrogation -> subrogation.Exposure == null)
    }
    
    // 'value' attribute on CheckBoxInput (id=SubrogateIndividualExposures) at SubrogationMainPanelSet.pcf: line 197, column 105
    function value_103 () : java.lang.Boolean {
      return subrogationSummary.SubrogateIndividualExposures
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at SubrogationMainPanelSet.pcf: line 55, column 69
    function value_11 () : java.math.BigDecimal {
      return claim.Fault
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at SubrogationMainPanelSet.pcf: line 62, column 57
    function value_17 () : typekey.SubrogationStatus {
      return subrogationSummary.Status
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 240, column 56
    function value_171 () : entity.Subrogation[] {
      return subrogationSummary.Subrogations
    }
    
    // 'value' attribute on TextInput (id=SubroArbThoseInvolved) at SubrogationMainPanelSet.pcf: line 326, column 58
    function value_175 () : java.lang.String {
      return claim.getPartiesInMatters()
    }
    
    // 'value' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 341, column 53
    function value_195 () : entity.Matter[] {
      return claim.getSubroMatters()
    }
    
    // 'value' attribute on DateInput (id=CloseDate) at SubrogationMainPanelSet.pcf: line 70, column 46
    function value_23 () : java.util.Date {
      return subrogationSummary.CloseDate
    }
    
    // 'value' attribute on TextInput (id=CloseComment) at SubrogationMainPanelSet.pcf: line 76, column 46
    function value_29 () : java.lang.String {
      return subrogationSummary.CloseComment
    }
    
    // 'value' attribute on TextInput (id=Jurisdiction) at SubrogationMainPanelSet.pcf: line 38, column 53
    function value_3 () : typekey.Jurisdiction {
      return claim.JurisdictionState
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome) at SubrogationMainPanelSet.pcf: line 84, column 46
    function value_37 () : typekey.SubroClosedOutcome {
      return subrogationSummary.ClosedOutcome
    }
    
    // 'value' attribute on BooleanRadioInput (id=SubroExternalOwner) at SubrogationMainPanelSet.pcf: line 91, column 34
    function value_44 () : java.lang.Boolean {
      return subrogationSummary.ExtOwned
    }
    
    // 'value' attribute on ClaimContactInput (id=Subrogator) at SubrogationMainPanelSet.pcf: line 104, column 58
    function value_49 () : entity.Contact {
      return claim.subrogator
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at SubrogationMainPanelSet.pcf: line 44, column 51
    function value_6 () : typekey.FaultRating {
      return claim.FaultRating
    }
    
    // 'value' attribute on TextInput (id=SubroReferralOwner) at SubrogationMainPanelSet.pcf: line 117, column 84
    function value_73 () : entity.User {
      return subrogationSummary.Subrogations.singleWhere( \ subrogation -> subrogation.Exposure == null).AssignedUser
    }
    
    // 'value' attribute on DateInput (id=SubroReferralDate) at SubrogationMainPanelSet.pcf: line 123, column 67
    function value_77 () : java.util.Date {
      return subrogationSummary.SubroReferralDate
    }
    
    // 'value' attribute on TextAreaInput (id=SubroReferralComment) at SubrogationMainPanelSet.pcf: line 131, column 65
    function value_81 () : java.lang.String {
      return subrogationSummary.SubroReferralComment
    }
    
    // 'value' attribute on BooleanRadioInput (id=ProrateDeductible) at SubrogationMainPanelSet.pcf: line 142, column 66
    function value_86 () : java.lang.Boolean {
      return subrogationSummary.ProrateDeductible
    }
    
    // 'value' attribute on CurrencyInput (id=DeductibleToRepay) at SubrogationMainPanelSet.pcf: line 150, column 67
    function value_90 () : gw.api.financials.CurrencyAmount {
      return subrogationSummary.DeductibleToRepay
    }
    
    // 'value' attribute on CurrencyInput (id=DeductibleRepaid) at SubrogationMainPanelSet.pcf: line 155, column 67
    function value_93 () : gw.api.financials.CurrencyAmount {
      return subrogationSummary.DeductibleRepaid
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_66 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_66 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_66 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_67 () : void {
      var __valueRangeArg = claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_66(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=Notification_AtFaultPercentage) at SubrogationMainPanelSet.pcf: line 55, column 69
    function visible_10 () : java.lang.Boolean {
      return claim.FaultRating == FaultRating.TC_1 
    }
    
    // 'visible' attribute on AddButton (id=AddSubrogation) at SubrogationMainPanelSet.pcf: line 213, column 134
    function visible_109 () : java.lang.Boolean {
      return subrogationSummary.Subrogations.length < claim.Exposures.length and perm.System.editsubrodetails
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=AssignExposureLevelSubrogation) at SubrogationMainPanelSet.pcf: line 227, column 102
    function visible_112 () : java.lang.Boolean {
      return not CurrentLocation.InEditMode and subrogationSummary.EscalateSubro
    }
    
    // 'visible' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 266, column 110
    function visible_115 () : java.lang.Boolean {
      return not subrogationSummary.Subrogations*.SubroAdversePartyOverrides.IsEmpty
    }
    
    // 'visible' attribute on RowIterator at SubrogationMainPanelSet.pcf: line 283, column 123
    function visible_118 () : java.lang.Boolean {
      return subrogationSummary.EscalateSubro and subrogationSummary.SubrogateIndividualExposures
    }
    
    // 'visible' attribute on InputSet at SubrogationMainPanelSet.pcf: line 320, column 114
    function visible_196 () : java.lang.Boolean {
      return claim.getPartiesInMatters().length() > 0 or claim.getSubroMatters().length > 0
    }
    
    // 'visible' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationMainPanelSet.pcf: line 440, column 118
    function visible_217 () : java.lang.Boolean {
      return documentsActionsHelper.isShowAsynchronousRefreshAction(subrogationSummary.RelatedDocuments)
    }
    
    // 'visible' attribute on DateInput (id=CloseDate) at SubrogationMainPanelSet.pcf: line 70, column 46
    function visible_22 () : java.lang.Boolean {
      return showCloseFields
    }
    
    // 'visible' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 14, column 229
    function visible_50 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Subrogator) at ClaimContactWidget.xml: line 16, column 225
    function visible_53 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (claim.subrogator), claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextAreaInput (id=SubroReferralComment) at SubrogationMainPanelSet.pcf: line 131, column 65
    function visible_80 () : java.lang.Boolean {
      return subrogationSummary.EscalateSubro
    }
    
    // 'visible' attribute on InputSet at SubrogationMainPanelSet.pcf: line 134, column 80
    function visible_96 () : java.lang.Boolean {
      return not subrogationSummary.SubroAdverseParties.IsEmpty
    }
    
    // 'visible' attribute on AddButton (id=AddResponsibleParty) at SubrogationMainPanelSet.pcf: line 180, column 63
    function visible_97 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get showCloseFields () : boolean {
      return getVariableValue("showCloseFields", 0) as java.lang.Boolean
    }
    
    property set showCloseFields ($arg :  boolean) {
      setVariableValue("showCloseFields", 0, $arg)
    }
    
    property get subrogationSummary () : SubrogationSummary {
      return getVariableValue("subrogationSummary", 0) as SubrogationSummary
    }
    
    property set subrogationSummary ($arg :  SubrogationSummary) {
      setVariableValue("subrogationSummary", 0, $arg)
    }
    
    
  }
  
  
}