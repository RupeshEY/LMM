package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.cc.claim.NewClaimAssignmentOption
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_AssignSaveScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_AssignSaveScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_1 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_21 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_dest_2 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimAssign_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_dest_22 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))), Claim)
    }
    
    // 'value' attribute on Choice (id=CommonAssignChoice) at FNOLWizard_AssignSaveScreen.pcf: line 24, column 41
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignment = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CCAssigneeInput (id=ClaimAssign) at CCAssigneeWidget.xml: line 8, column 25
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssignableInstanceForClaim.Assignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at FNOLWizard_AssignSaveScreen.pcf: line 66, column 45
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.AssignSaveNoteBody = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'required' attribute on CCAssigneeInput (id=ClaimAssign) at CCAssigneeWidget.xml: line 8, column 25
    function required_25 () : java.lang.Boolean {
      return !Wizard.CommonAssignment
    }
    
    // 'required' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function required_3 () : java.lang.Boolean {
      return Wizard.CommonAssignment
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_AssignSaveScreen.pcf: line 136, column 44
    function sortValue_57 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_AssignSaveScreen.pcf: line 142, column 49
    function sortValue_58 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_AssignSaveScreen.pcf: line 148, column 49
    function sortValue_59 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_AssignSaveScreen.pcf: line 159, column 44
    function sortValue_60 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_AssignSaveScreen.pcf: line 164, column 50
    function sortValue_61 (Exposure :  entity.Exposure) : java.lang.Object {
      return Exposure.State
    }
    
    // 'toRemove' attribute on RowIterator at FNOLWizard_AssignSaveScreen.pcf: line 127, column 41
    function toRemove_100 (Exposure :  entity.Exposure) : void {
      Wizard.deleteExposure(Exposure)
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRange_7 () : java.lang.Object {
      return Claim.SuggestedAssignees
    }
    
    // 'value' attribute on CCAssigneeInput (id=ClaimAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRoot_28 () : java.lang.Object {
      return AssignableInstanceForClaim
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function valueRoot_6 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on CCAssigneeInput (id=CommonAssign) at FNOLWizard_AssignSaveScreen.pcf: line 34, column 52
    function value_0 () : gw.api.assignment.Assignee {
      return Wizard.CommonAssignee
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_AssignSaveScreen.pcf: line 127, column 41
    function value_101 () : entity.Exposure[] {
      return Claim.Exposures
    }
    
    // 'value' attribute on Choice (id=CommonAssignChoice) at FNOLWizard_AssignSaveScreen.pcf: line 24, column 41
    function value_16 () : java.lang.Object {
      return Wizard.CommonAssignment
    }
    
    // 'value' attribute on CCAssigneeInput (id=ClaimAssign) at FNOLWizard_AssignSaveScreen.pcf: line 55, column 95
    function value_20 () : gw.api.assignment.Assignee {
      return AssignableInstanceForClaim.Assignee
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at FNOLWizard_AssignSaveScreen.pcf: line 66, column 45
    function value_41 () : java.lang.String {
      return Wizard.AssignSaveNoteBody
    }
    
    // 'value' attribute on MenuItemTree at FNOLWizard_AssignSaveScreen.pcf: line 89, column 63
    function value_51 () : gw.api.exposure.NewExposureMenuItem[] {
      return gw.api.exposure.NewExposureMenuUtil.createItemsByCoverage(Claim)
    }
    
    // 'value' attribute on MenuItemTree at FNOLWizard_AssignSaveScreen.pcf: line 104, column 65
    function value_56 () : gw.api.exposure.NewExposureMenuItem[] {
      return gw.api.exposure.NewExposureMenuUtil.createItemsByCoverageType(Claim)
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=ClaimAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_30 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=ClaimAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_30 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_8 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=ClaimAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRange_31 () : void {
      var __valueRangeArg = Claim.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_30(__valueRangeArg)
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=CommonAssign) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRange_9 () : void {
      var __valueRangeArg = Claim.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on Label at FNOLWizard_AssignSaveScreen.pcf: line 44, column 95
    function visible_17 () : java.lang.Boolean {
      return ((Claim.Exposures != null) && (Claim.Exposures.length > 0))
    }
    
    // 'visible' attribute on DetailViewPanel at FNOLWizard_AssignSaveScreen.pcf: line 72, column 50
    function visible_45 () : java.lang.Boolean {
      return Claim.LossType != LossType.TC_WC
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
    
    
    property get AssignableInstanceForClaim() : NewClaimAssignmentOption {
      var allAssignments = Wizard.IndividualAssignments
      for (var instanceAssignment in allAssignments){
        if (instanceAssignment.Target == Claim) {
           return instanceAssignment
        }
      }
      return null   
    }
          
    
    function getAssignableInstanceForExposure(exposureToFind : Exposure) : NewClaimAssignmentOption {  
      var allAssignments = Wizard.IndividualAssignments
      for (var instanceAssignment in allAssignments){
        if (instanceAssignment.Target == exposureToFind) {
           return instanceAssignment
        }
      }  
      return null
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_AssignSaveScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Exposures_Order) at FNOLWizard_AssignSaveScreen.pcf: line 136, column 44
    function action_65 () : void {
      NewClaimWizard_ExposurePagePopup.push(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TypeKeyCell (id=Exposures_Type) at FNOLWizard_AssignSaveScreen.pcf: line 142, column 49
    function action_70 () : void {
      NewClaimWizard_ExposurePagePopup.push(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TypeKeyCell (id=Exposures_Coverage) at FNOLWizard_AssignSaveScreen.pcf: line 148, column 49
    function action_75 () : void {
      NewClaimWizard_ExposurePagePopup.push(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=Exposures_Assignee_PickerButton) at AssigneeCell.xml: line 7, column 25
    function action_90 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Exposure))))
    }
    
    // 'action' attribute on TextCell (id=Exposures_Order) at FNOLWizard_AssignSaveScreen.pcf: line 136, column 44
    function action_dest_66 () : pcf.api.Destination {
      return pcf.NewClaimWizard_ExposurePagePopup.createDestination(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TypeKeyCell (id=Exposures_Type) at FNOLWizard_AssignSaveScreen.pcf: line 142, column 49
    function action_dest_71 () : pcf.api.Destination {
      return pcf.NewClaimWizard_ExposurePagePopup.createDestination(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on TypeKeyCell (id=Exposures_Coverage) at FNOLWizard_AssignSaveScreen.pcf: line 148, column 49
    function action_dest_76 () : pcf.api.Destination {
      return pcf.NewClaimWizard_ExposurePagePopup.createDestination(Claim, Exposure, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=Exposures_Assignee_PickerButton) at AssigneeCell.xml: line 7, column 25
    function action_dest_91 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Exposure))))
    }
    
    // 'value' attribute on AssigneeCell (id=Exposures_Assignee) at AssigneeCell.xml: line 7, column 25
    function defaultSetter_93 (__VALUE_TO_SET :  java.lang.Object) : void {
      getAssignableInstanceForExposure(Exposure).Assignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposures_Order) at FNOLWizard_AssignSaveScreen.pcf: line 136, column 44
    function outputConversion_67 (VALUE :  entity.Exposure) : java.lang.String {
      return VALUE.ClaimOrder as String
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Exposures_Assignee) at AssigneeCell.xml: line 7, column 25
    function valueRange_95 () : java.lang.Object {
      return getAssignableInstanceForExposure(Exposure).Target.SuggestedAssignees
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Type) at FNOLWizard_AssignSaveScreen.pcf: line 142, column 49
    function valueRoot_73 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on AssigneeCell (id=Exposures_Assignee) at AssigneeCell.xml: line 7, column 25
    function valueRoot_94 () : java.lang.Object {
      return getAssignableInstanceForExposure(Exposure)
    }
    
    // 'value' attribute on TextCell (id=Exposures_Order) at FNOLWizard_AssignSaveScreen.pcf: line 136, column 44
    function value_64 () : entity.Exposure {
      return Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Type) at FNOLWizard_AssignSaveScreen.pcf: line 142, column 49
    function value_69 () : typekey.ExposureType {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Coverage) at FNOLWizard_AssignSaveScreen.pcf: line 148, column 49
    function value_74 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Exposures_Claimant) at FNOLWizard_AssignSaveScreen.pcf: line 154, column 43
    function value_79 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextCell (id=Incident) at FNOLWizard_AssignSaveScreen.pcf: line 159, column 44
    function value_82 () : entity.Incident {
      return Exposure.Incident
    }
    
    // 'value' attribute on TypeKeyCell (id=Exposures_Status) at FNOLWizard_AssignSaveScreen.pcf: line 164, column 50
    function value_85 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on AssigneeCell (id=Exposures_Assignee) at FNOLWizard_AssignSaveScreen.pcf: line 176, column 51
    function value_89 () : gw.api.assignment.Assignee {
      return getAssignableInstanceForExposure(Exposure).Assignee
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Exposures_Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_96 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Exposures_Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_96 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Exposures_Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRange_97 () : void {
      var __valueRangeArg = getAssignableInstanceForExposure(Exposure).Target.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_96(__valueRangeArg)
    }
    
    // 'visible' attribute on AssigneeCell (id=Exposures_Assignee) at FNOLWizard_AssignSaveScreen.pcf: line 176, column 51
    function visible_88 () : java.lang.Boolean {
      return !Wizard.CommonAssignment
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuItemTreeEntry2ExpressionsImpl extends FNOLWizard_AssignSaveScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at FNOLWizard_AssignSaveScreen.pcf: line 110, column 44
    function action_52 () : void {
      NewClaimWizard_NewExposurePopup.push(Claim, Wizard, item.loadCoverageFromBundle(Claim), item.CoverageType, item.CoverageSubtype)
    }
    
    // 'action' attribute on MenuItem (id=item) at FNOLWizard_AssignSaveScreen.pcf: line 110, column 44
    function action_dest_53 () : pcf.api.Destination {
      return pcf.NewClaimWizard_NewExposurePopup.createDestination(Claim, Wizard, item.loadCoverageFromBundle(Claim), item.CoverageType, item.CoverageSubtype)
    }
    
    // 'children' attribute on MenuItemTree at FNOLWizard_AssignSaveScreen.pcf: line 104, column 65
    function children_55 () : java.lang.Object {
      return item.Children
    }
    
    // 'label' attribute on MenuItem (id=item) at FNOLWizard_AssignSaveScreen.pcf: line 110, column 44
    function label_54 () : java.lang.Object {
      return item.DisplayLabel
    }
    
    property get item () : gw.api.exposure.NewExposureMenuItem {
      return getIteratedValue(1) as gw.api.exposure.NewExposureMenuItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuItemTreeEntryExpressionsImpl extends FNOLWizard_AssignSaveScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at FNOLWizard_AssignSaveScreen.pcf: line 95, column 42
    function action_47 () : void {
      NewClaimWizard_NewExposurePopup.push(Claim, Wizard, item.loadCoverageFromBundle(Claim), item.CoverageType, item.CoverageSubtype)
    }
    
    // 'action' attribute on MenuItem (id=item) at FNOLWizard_AssignSaveScreen.pcf: line 95, column 42
    function action_dest_48 () : pcf.api.Destination {
      return pcf.NewClaimWizard_NewExposurePopup.createDestination(Claim, Wizard, item.loadCoverageFromBundle(Claim), item.CoverageType, item.CoverageSubtype)
    }
    
    // 'available' attribute on MenuItem (id=item) at FNOLWizard_AssignSaveScreen.pcf: line 95, column 42
    function available_46 () : java.lang.Boolean {
      return (item.CoverageType != null and item.CoverageSubtype != null) or item.Children.length > 0
    }
    
    // 'children' attribute on MenuItemTree at FNOLWizard_AssignSaveScreen.pcf: line 89, column 63
    function children_50 () : java.lang.Object {
      return item.Children
    }
    
    // 'label' attribute on MenuItem (id=item) at FNOLWizard_AssignSaveScreen.pcf: line 95, column 42
    function label_49 () : java.lang.Object {
      return item.DisplayLabel
    }
    
    property get item () : gw.api.exposure.NewExposureMenuItem {
      return getIteratedValue(1) as gw.api.exposure.NewExposureMenuItem
    }
    
    
  }
  
  
}