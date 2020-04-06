package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleComparisonPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRuleComparisonPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleComparisonPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRuleComparisonPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (version1 :  ActivityRuleVersion, version2 :  ActivityRuleVersion) : int {
      return 0
    }
    
    static function __constructorIndex (importEntry :  RuleImportTaskEntry, importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>) : int {
      return 1
    }
    
    // 'action' attribute on MenuItem (id=Importing) at ActivityRuleComparisonPopup.pcf: line 66, column 72
    function action_12 () : void {
      ActivityRuleEditPopup.push(importEntry, importHelper, RuleImportSide.TC_IMPORTING)
    }
    
    // 'action' attribute on ToolbarButton (id=ChooseExisting) at ActivityRuleComparisonPopup.pcf: line 43, column 50
    function action_5 () : void {
      importHelper.resolveConflict(importEntry, TC_EXISTING); CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=ChooseImporting) at ActivityRuleComparisonPopup.pcf: line 48, column 50
    function action_7 () : void {
      importHelper.resolveConflict(importEntry, TC_IMPORTING); CurrentLocation.cancel()
    }
    
    // 'action' attribute on MenuItem (id=Existing) at ActivityRuleComparisonPopup.pcf: line 60, column 72
    function action_9 () : void {
      ActivityRuleEditPopup.push(importEntry, importHelper, RuleImportSide.TC_EXISTING)
    }
    
    // 'action' attribute on MenuItem (id=Existing) at ActivityRuleComparisonPopup.pcf: line 60, column 72
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ActivityRuleEditPopup.createDestination(importEntry, importHelper, RuleImportSide.TC_EXISTING)
    }
    
    // 'action' attribute on MenuItem (id=Importing) at ActivityRuleComparisonPopup.pcf: line 66, column 72
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ActivityRuleEditPopup.createDestination(importEntry, importHelper, RuleImportSide.TC_IMPORTING)
    }
    
    // 'afterReturnFromPopup' attribute on Popup (id=ActivityRuleComparisonPopup) at ActivityRuleComparisonPopup.pcf: line 9, column 39
    function afterReturnFromPopup_44 (popupCommitted :  boolean) : void {
      if (popupCommitted) CurrentLocation.commit()
    }
    
    // 'available' attribute on ToolbarButton (id=EditNewMerge) at ActivityRuleComparisonPopup.pcf: line 54, column 114
    function available_14 () : java.lang.Boolean {
      return !version1.isDraft()
    }
    
    // 'columns' attribute on Layout at ActivityRuleComparisonPopup.pcf: line 77, column 25
    function columns_17 () : java.lang.Double {
      return controller.TotalColumns
    }
    
    // 'def' attribute on InputSetRef (id=ComparisonHeadings) at ActivityRuleComparisonPopup.pcf: line 80, column 36
    function def_onEnter_18 (def :  pcf.RuleComparisonColumnHeadingsInputSet) : void {
      def.onEnter(controller, {DisplayKey.get("BizRules.Import.Comparison.Existing",navSupport.VersionController.getLabelForExistingVersion(version1,false)), DisplayKey.get("BizRules.Import.Comparison.Importing",navSupport.VersionController.getLabelForImportingVersion(version2))})
    }
    
    // 'def' attribute on InputSetRef (id=RuleDetailsSectionLabel) at ActivityRuleComparisonPopup.pcf: line 83, column 41
    function def_onEnter_20 (def :  pcf.RuleComparisonSectionLabelInputSet) : void {
      def.onEnter(controller, DisplayKey.get("BizRules.Import.Comparison.RuleDetails"))
    }
    
    // 'def' attribute on InputSetRef (id=NameRow) at ActivityRuleComparisonPopup.pcf: line 86, column 25
    function def_onEnter_22 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(controller.NameRow)
    }
    
    // 'def' attribute on InputSetRef (id=DescriptionRow) at ActivityRuleComparisonPopup.pcf: line 89, column 32
    function def_onEnter_24 (def :  pcf.RuleComparisonRowTextAreaInputSet) : void {
      def.onEnter(controller.DescriptionRow)
    }
    
    // 'def' attribute on InputSetRef (id=ContextRow) at ActivityRuleComparisonPopup.pcf: line 92, column 28
    function def_onEnter_26 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(controller.ContextRow)
    }
    
    // 'def' attribute on InputSetRef (id=TriggerRow) at ActivityRuleComparisonPopup.pcf: line 95, column 28
    function def_onEnter_28 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(controller.TriggerRow)
    }
    
    // 'def' attribute on InputSetRef (id=AvailableToRunRow) at ActivityRuleComparisonPopup.pcf: line 98, column 35
    function def_onEnter_30 (def :  pcf.RuleComparisonRowBooleanInputSet) : void {
      def.onEnter(controller.AvailableToRunRow)
    }
    
    // 'def' attribute on InputSetRef (id=ApplicabilityCriteriaSectionLabel) at ActivityRuleComparisonPopup.pcf: line 101, column 51
    function def_onEnter_32 (def :  pcf.RuleComparisonSectionLabelInputSet) : void {
      def.onEnter(controller, "Applicability Criteria")
    }
    
    // 'def' attribute on InputSetRef (id=LossType) at ActivityRuleComparisonPopup.pcf: line 104, column 26
    function def_onEnter_34 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(controller.LossTypeRow)
    }
    
    // 'def' attribute on InputSetRef (id=PolicyType) at ActivityRuleComparisonPopup.pcf: line 107, column 28
    function def_onEnter_36 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(controller.PolicyTypeRow)
    }
    
    // 'def' attribute on InputSetRef (id=Jurisdictions) at ActivityRuleComparisonPopup.pcf: line 110, column 31
    function def_onEnter_38 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(controller.JurisdictionsRow)
    }
    
    // 'def' attribute on InputSetRef (id=RuleCondition) at ActivityRuleComparisonPopup.pcf: line 113, column 31
    function def_onEnter_40 (def :  pcf.RuleComparisonConditionInputSet) : void {
      def.onEnter(controller)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActions) at ActivityRuleComparisonPopup.pcf: line 116, column 29
    function def_onEnter_42 (def :  pcf.RuleComparisonActionsInputSet) : void {
      def.onEnter(controller)
    }
    
    // 'def' attribute on InputSetRef (id=ComparisonHeadings) at ActivityRuleComparisonPopup.pcf: line 80, column 36
    function def_refreshVariables_19 (def :  pcf.RuleComparisonColumnHeadingsInputSet) : void {
      def.refreshVariables(controller, {DisplayKey.get("BizRules.Import.Comparison.Existing",navSupport.VersionController.getLabelForExistingVersion(version1,false)), DisplayKey.get("BizRules.Import.Comparison.Importing",navSupport.VersionController.getLabelForImportingVersion(version2))})
    }
    
    // 'def' attribute on InputSetRef (id=RuleDetailsSectionLabel) at ActivityRuleComparisonPopup.pcf: line 83, column 41
    function def_refreshVariables_21 (def :  pcf.RuleComparisonSectionLabelInputSet) : void {
      def.refreshVariables(controller, DisplayKey.get("BizRules.Import.Comparison.RuleDetails"))
    }
    
    // 'def' attribute on InputSetRef (id=NameRow) at ActivityRuleComparisonPopup.pcf: line 86, column 25
    function def_refreshVariables_23 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(controller.NameRow)
    }
    
    // 'def' attribute on InputSetRef (id=DescriptionRow) at ActivityRuleComparisonPopup.pcf: line 89, column 32
    function def_refreshVariables_25 (def :  pcf.RuleComparisonRowTextAreaInputSet) : void {
      def.refreshVariables(controller.DescriptionRow)
    }
    
    // 'def' attribute on InputSetRef (id=ContextRow) at ActivityRuleComparisonPopup.pcf: line 92, column 28
    function def_refreshVariables_27 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(controller.ContextRow)
    }
    
    // 'def' attribute on InputSetRef (id=TriggerRow) at ActivityRuleComparisonPopup.pcf: line 95, column 28
    function def_refreshVariables_29 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(controller.TriggerRow)
    }
    
    // 'def' attribute on InputSetRef (id=AvailableToRunRow) at ActivityRuleComparisonPopup.pcf: line 98, column 35
    function def_refreshVariables_31 (def :  pcf.RuleComparisonRowBooleanInputSet) : void {
      def.refreshVariables(controller.AvailableToRunRow)
    }
    
    // 'def' attribute on InputSetRef (id=ApplicabilityCriteriaSectionLabel) at ActivityRuleComparisonPopup.pcf: line 101, column 51
    function def_refreshVariables_33 (def :  pcf.RuleComparisonSectionLabelInputSet) : void {
      def.refreshVariables(controller, "Applicability Criteria")
    }
    
    // 'def' attribute on InputSetRef (id=LossType) at ActivityRuleComparisonPopup.pcf: line 104, column 26
    function def_refreshVariables_35 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(controller.LossTypeRow)
    }
    
    // 'def' attribute on InputSetRef (id=PolicyType) at ActivityRuleComparisonPopup.pcf: line 107, column 28
    function def_refreshVariables_37 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(controller.PolicyTypeRow)
    }
    
    // 'def' attribute on InputSetRef (id=Jurisdictions) at ActivityRuleComparisonPopup.pcf: line 110, column 31
    function def_refreshVariables_39 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(controller.JurisdictionsRow)
    }
    
    // 'def' attribute on InputSetRef (id=RuleCondition) at ActivityRuleComparisonPopup.pcf: line 113, column 31
    function def_refreshVariables_41 (def :  pcf.RuleComparisonConditionInputSet) : void {
      def.refreshVariables(controller)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActions) at ActivityRuleComparisonPopup.pcf: line 116, column 29
    function def_refreshVariables_43 (def :  pcf.RuleComparisonActionsInputSet) : void {
      def.refreshVariables(controller)
    }
    
    // 'initialValue' attribute on Variable at ActivityRuleComparisonPopup.pcf: line 23, column 35
    function initialValue_0 () : ActivityRuleVersion {
      return importEntry.ExistingVersion as ActivityRuleVersion
    }
    
    // 'initialValue' attribute on Variable at ActivityRuleComparisonPopup.pcf: line 27, column 35
    function initialValue_1 () : ActivityRuleVersion {
      return importEntry.ImportedVersion as ActivityRuleVersion
    }
    
    // 'initialValue' attribute on Variable at ActivityRuleComparisonPopup.pcf: line 31, column 55
    function initialValue_2 () : gw.bizrules.RuleVersionComparisonHelper {
      return new gw.bizrules.RuleVersionComparisonHelper(version1, version2, CurrentLocation)
    }
    
    // 'initialValue' attribute on Variable at ActivityRuleComparisonPopup.pcf: line 35, column 61
    function initialValue_3 () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return gw.bizrules.ActivityRulesNavigationSupport.getInstance()
    }
    
    // 'visible' attribute on ToolbarButton (id=EditNewMerge) at ActivityRuleComparisonPopup.pcf: line 54, column 114
    function visible_15 () : java.lang.Boolean {
      return importEntry.Status.Conflict and gw.bizrules.pcf.RulePermissionUIHelper.canEditRule(version1)
    }
    
    // 'visible' attribute on AlertBar (id=draftAlert) at ActivityRuleComparisonPopup.pcf: line 72, column 39
    function visible_16 () : java.lang.Boolean {
      return version1.isDraft()
    }
    
    // 'visible' attribute on ToolbarButton (id=ChooseExisting) at ActivityRuleComparisonPopup.pcf: line 43, column 50
    function visible_4 () : java.lang.Boolean {
      return importEntry.Status.Conflict
    }
    
    // 'visible' attribute on MenuItem (id=Existing) at ActivityRuleComparisonPopup.pcf: line 60, column 72
    function visible_8 () : java.lang.Boolean {
      return importEntry.Status != TC_EDITEDRESOLVEDCONFLICT
    }
    
    override property get CurrentLocation () : pcf.ActivityRuleComparisonPopup {
      return super.CurrentLocation as pcf.ActivityRuleComparisonPopup
    }
    
    property get controller () : gw.bizrules.RuleVersionComparisonHelper {
      return getVariableValue("controller", 0) as gw.bizrules.RuleVersionComparisonHelper
    }
    
    property set controller ($arg :  gw.bizrules.RuleVersionComparisonHelper) {
      setVariableValue("controller", 0, $arg)
    }
    
    property get importEntry () : RuleImportTaskEntry {
      return getVariableValue("importEntry", 0) as RuleImportTaskEntry
    }
    
    property set importEntry ($arg :  RuleImportTaskEntry) {
      setVariableValue("importEntry", 0, $arg)
    }
    
    property get importHelper () : gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion> {
      return getVariableValue("importHelper", 0) as gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>
    }
    
    property set importHelper ($arg :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>) {
      setVariableValue("importHelper", 0, $arg)
    }
    
    property get navSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getVariableValue("navSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setVariableValue("navSupport", 0, $arg)
    }
    
    property get version1 () : ActivityRuleVersion {
      return getVariableValue("version1", 0) as ActivityRuleVersion
    }
    
    property set version1 ($arg :  ActivityRuleVersion) {
      setVariableValue("version1", 0, $arg)
    }
    
    property get version2 () : ActivityRuleVersion {
      return getVariableValue("version2", 0) as ActivityRuleVersion
    }
    
    property set version2 ($arg :  ActivityRuleVersion) {
      setVariableValue("version2", 0, $arg)
    }
    
    
  }
  
  
}