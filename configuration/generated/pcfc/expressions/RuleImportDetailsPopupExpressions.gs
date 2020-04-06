package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleImportDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleImportDetailsPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextCell (id=ExistingVersion) at RuleImportDetailsPopup.pcf: line 329, column 63
    function actionAvailable_104 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canViewRule()
    }
    
    // 'action' attribute on TextCell (id=ExistingVersion) at RuleImportDetailsPopup.pcf: line 329, column 63
    function action_103 () : void {
      pageHelper.actionExistingVersionLink(navigationSupport,entry)
    }
    
    // 'action' attribute on TextCell (id=ImportingVersion) at RuleImportDetailsPopup.pcf: line 336, column 94
    function action_107 () : void {
      pageHelper.actionImportingVersionLink(navigationSupport,entry,pending)
    }
    
    // 'action' attribute on Link (id=AnotherRuleWithSameNameLink) at RuleImportDetailsPopup.pcf: line 258, column 93
    function action_75 () : void {
      ruleVersionController.pushRulesWithSameNamePopup(entry.ImportedVersion)
    }
    
    // 'action' attribute on Link (id=EditedVersionLink) at RuleImportDetailsPopup.pcf: line 280, column 89
    function action_82 () : void {
      pageHelper.actionEditedVersionLink(navigationSupport, entry, pending)
    }
    
    // 'action' attribute on Link (id=ChooseExistingRadioIcon) at RuleImportDetailsPopup.pcf: line 285, column 88
    function action_85 () : void {
      pageHelper.resolveConflict(entry, TC_EXISTING)
    }
    
    // 'action' attribute on Link (id=ChooseExistingSelectedRadioIcon) at RuleImportDetailsPopup.pcf: line 290, column 88
    function action_87 () : void {
      pageHelper.resolveConflict(entry, TC_EXISTING)
    }
    
    // 'action' attribute on Link (id=ChooseExistingLink) at RuleImportDetailsPopup.pcf: line 295, column 52
    function action_89 () : void {
      pageHelper.resolveConflict(entry, TC_EXISTING)
    }
    
    // 'action' attribute on Link (id=ChooseImportingRadioIcon) at RuleImportDetailsPopup.pcf: line 300, column 89
    function action_91 () : void {
      pageHelper.resolveConflict(entry, TC_IMPORTING)
    }
    
    // 'action' attribute on Link (id=ChooseImportingSelectedRadioIcon) at RuleImportDetailsPopup.pcf: line 305, column 89
    function action_93 () : void {
      pageHelper.resolveConflict(entry, TC_IMPORTING)
    }
    
    // 'action' attribute on Link (id=ChooseImportingLink) at RuleImportDetailsPopup.pcf: line 310, column 52
    function action_95 () : void {
      pageHelper.resolveConflict(entry, TC_IMPORTING)
    }
    
    // 'action' attribute on Link (id=CompareVersions) at RuleImportDetailsPopup.pcf: line 320, column 85
    function action_98 () : void {
      navigationSupport.pushRuleComparisonPopup(entry, pageHelper)
    }
    
    // 'available' attribute on LinkCell at RuleImportDetailsPopup.pcf: line 268, column 29
    function available_99 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=EntriesIterator) at RuleImportDetailsPopup.pcf: line 226, column 85
    function checkBoxVisible_110 () : java.lang.Boolean {
      return pending
    }
    
    // 'condition' attribute on ToolbarFlag at RuleImportDetailsPopup.pcf: line 233, column 34
    function condition_70 () : java.lang.Boolean {
      return entry.NewHeadVersion != null
    }
    
    // 'def' attribute on ModalCellRef (id=RuleValidationInfo) at RuleImportDetailsPopup.pcf: line 241, column 29
    function def_onEnter_71 (def :  pcf.RuleValidationInfoCell_default) : void {
      def.onEnter(entry.NewHeadVersion.Rule)
    }
    
    // 'def' attribute on ModalCellRef (id=RuleValidationInfo) at RuleImportDetailsPopup.pcf: line 241, column 29
    function def_refreshVariables_72 (def :  pcf.RuleValidationInfoCell_default) : void {
      def.refreshVariables(entry.NewHeadVersion.Rule)
    }
    
    // 'initialValue' attribute on Variable at RuleImportDetailsPopup.pcf: line 230, column 31
    function initialValue_69 () : boolean {
      return !entry.Status.Final
    }
    
    // RowIterator (id=EntriesIterator) at RuleImportDetailsPopup.pcf: line 226, column 85
    function initializeVariables_111 () : void {
        pending = !entry.Status.Final;

    }
    
    // 'label' attribute on Link (id=Name) at RuleImportDetailsPopup.pcf: line 250, column 43
    function label_73 () : java.lang.Object {
      return entry.RuleName
    }
    
    // 'label' attribute on Link (id=AvailableActionTextLink) at RuleImportDetailsPopup.pcf: line 271, column 69
    function label_79 () : java.lang.Object {
      return pageHelper.getAvailableActionText(entry)
    }
    
    // 'label' attribute on Link (id=EditedVersionLink) at RuleImportDetailsPopup.pcf: line 280, column 89
    function label_83 () : java.lang.Object {
      return pageHelper.getLabelForEditedVersionLink(navigationSupport, entry)
    }
    
    // 'value' attribute on TextCell (id=Status) at RuleImportDetailsPopup.pcf: line 264, column 55
    function valueRoot_78 () : java.lang.Object {
      return entry
    }
    
    // 'value' attribute on TextCell (id=ExistingVersion) at RuleImportDetailsPopup.pcf: line 329, column 63
    function value_101 () : java.lang.String {
      return pageHelper.getLabelForExistingVersionLink(navigationSupport,entry)
    }
    
    // 'value' attribute on TextCell (id=ImportingVersion) at RuleImportDetailsPopup.pcf: line 336, column 94
    function value_106 () : java.lang.String {
      return pageHelper.getLabelForImportingVersionLink(navigationSupport,entry)
    }
    
    // 'value' attribute on TextCell (id=Status) at RuleImportDetailsPopup.pcf: line 264, column 55
    function value_76 () : typekey.RuleImportStatus {
      return entry.Status
    }
    
    // 'valueVisible' attribute on TextCell (id=ExistingVersion) at RuleImportDetailsPopup.pcf: line 329, column 63
    function visible_102 () : java.lang.Boolean {
      return entry.ExistingVersion != null
    }
    
    // 'visible' attribute on Link (id=AnotherRuleWithSameNameLink) at RuleImportDetailsPopup.pcf: line 258, column 93
    function visible_74 () : java.lang.Boolean {
      return !ruleVersionController.isRuleNameUnique(entry.ImportedVersion)
    }
    
    // 'visible' attribute on Link (id=EditedVersionLinkSeparator) at RuleImportDetailsPopup.pcf: line 275, column 89
    function visible_80 () : java.lang.Boolean {
      return entry.Status == RuleImportStatus.TC_EDITEDRESOLVEDCONFLICT
    }
    
    // 'visible' attribute on Link (id=ChooseExistingRadioIcon) at RuleImportDetailsPopup.pcf: line 285, column 88
    function visible_84 () : java.lang.Boolean {
      return entry.Status.Conflict and entry.ChosenSide != TC_EXISTING
    }
    
    // 'visible' attribute on Link (id=ChooseExistingSelectedRadioIcon) at RuleImportDetailsPopup.pcf: line 290, column 88
    function visible_86 () : java.lang.Boolean {
      return entry.Status.Conflict and entry.ChosenSide == TC_EXISTING
    }
    
    // 'visible' attribute on Link (id=ChooseExistingLink) at RuleImportDetailsPopup.pcf: line 295, column 52
    function visible_88 () : java.lang.Boolean {
      return entry.Status.Conflict
    }
    
    // 'visible' attribute on Link (id=ChooseImportingRadioIcon) at RuleImportDetailsPopup.pcf: line 300, column 89
    function visible_90 () : java.lang.Boolean {
      return entry.Status.Conflict and entry.ChosenSide != TC_IMPORTING
    }
    
    // 'visible' attribute on Link (id=ChooseImportingSelectedRadioIcon) at RuleImportDetailsPopup.pcf: line 305, column 89
    function visible_92 () : java.lang.Boolean {
      return entry.Status.Conflict and entry.ChosenSide == TC_IMPORTING
    }
    
    // 'visible' attribute on Link (id=CompareSeparator) at RuleImportDetailsPopup.pcf: line 314, column 85
    function visible_96 () : java.lang.Boolean {
      return entry.Status.Conflict or entry.Status == TC_NOCONFLICT
    }
    
    property get entry () : RuleImportTaskEntry {
      return getIteratedValue(1) as RuleImportTaskEntry
    }
    
    property get pending () : boolean {
      return getVariableValue("pending", 1) as java.lang.Boolean
    }
    
    property set pending ($arg :  boolean) {
      setVariableValue("pending", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleImportDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, importTask :  RuleImportTask, completed :  boolean) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ImportAllRemaining) at RuleImportDetailsPopup.pcf: line 192, column 90
    function action_56 () : void {
      RuleImportAllPopup.push(pageHelper, importTask)
    }
    
    // 'action' attribute on ToolbarButton (id=DiscardAllRemaining) at RuleImportDetailsPopup.pcf: line 198, column 92
    function action_59 () : void {
      pageHelper.discardAllRemainingRules(importTask)
    }
    
    // 'action' attribute on AlertBar (id=ImportCompletedAlert) at RuleImportDetailsPopup.pcf: line 45, column 54
    function action_6 () : void {
      navigationSupport.goToRulesListPage()
    }
    
    // 'action' attribute on ToolbarButton (id=ImportAllRemaining) at RuleImportDetailsPopup.pcf: line 192, column 90
    function action_dest_57 () : pcf.api.Destination {
      return pcf.RuleImportAllPopup.createDestination(pageHelper, importTask)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ImportSelected) at RuleImportDetailsPopup.pcf: line 179, column 86
    function allCheckedRowsAction_52 (CheckedValues :  RuleImportTaskEntry[], CheckedValuesErrors :  java.util.Map) : void {
      pageHelper.importRules(CheckedValues.toList())
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DiscardSelected) at RuleImportDetailsPopup.pcf: line 186, column 88
    function allCheckedRowsAction_54 (CheckedValues :  RuleImportTaskEntry[], CheckedValuesErrors :  java.util.Map) : void {
      pageHelper.discardRules(CheckedValues.toList())
    }
    
    // 'available' attribute on AlertBar (id=ImportCompletedAlert) at RuleImportDetailsPopup.pcf: line 45, column 54
    function available_4 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canViewRule()
    }
    
    // 'available' attribute on CheckedValuesToolbarButton (id=ImportSelected) at RuleImportDetailsPopup.pcf: line 179, column 86
    function available_51 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'available' attribute on ToolbarButton (id=ImportAllRemaining) at RuleImportDetailsPopup.pcf: line 192, column 90
    function available_55 () : java.lang.Boolean {
      return rulesDisposition.Outstanding > 0 and pageHelper.isAllConflictsResolved(importTask) and gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'available' attribute on ToolbarButton (id=DiscardAllRemaining) at RuleImportDetailsPopup.pcf: line 198, column 92
    function available_58 () : java.lang.Boolean {
      return rulesDisposition.Outstanding > 0 and gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'canVisit' attribute on Popup (id=RuleImportDetailsPopup) at RuleImportDetailsPopup.pcf: line 8, column 155
    static function canVisit_113 (completed :  boolean, importTask :  RuleImportTask, navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport) : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'confirmMessage' attribute on ToolbarButton (id=DiscardAllRemaining) at RuleImportDetailsPopup.pcf: line 198, column 92
    function confirmMessage_60 () : java.lang.String {
      return DisplayKey.get('BizRules.RuleImportDetailsPopup.DiscardAllRemaining.Confirmation', rulesDisposition.Outstanding)
    }
    
    // 'filter' attribute on ToolbarFilterOption at RuleImportDetailsPopup.pcf: line 204, column 93
    function filter_61 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.bizrules.pcf.ImportingRulesDisposition.createOutstandingFilter()
    }
    
    // 'filter' attribute on ToolbarFilterOption at RuleImportDetailsPopup.pcf: line 206, column 93
    function filter_62 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.bizrules.pcf.ImportingRulesDisposition.createAllImportedFilter()
    }
    
    // 'filter' attribute on ToolbarFilterOption at RuleImportDetailsPopup.pcf: line 208, column 102
    function filter_63 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.bizrules.pcf.ImportingRulesDisposition.createFilterByStatus(TC_DISCARDED)
    }
    
    // 'filter' attribute on ToolbarFilterOption at RuleImportDetailsPopup.pcf: line 210, column 91
    function filter_64 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.bizrules.pcf.ImportingRulesDisposition.createAllEditedFilter()
    }
    
    // 'filter' attribute on ToolbarFilterOption at RuleImportDetailsPopup.pcf: line 212, column 93
    function filter_65 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.bizrules.pcf.ImportingRulesDisposition.createAllNoActionFilter()
    }
    
    // 'filter' attribute on ToolbarFilterOption at RuleImportDetailsPopup.pcf: line 215, column 37
    function filter_66 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.util.CoreFilters.AllFilter()
    }
    
    // 'initialValue' attribute on Variable at RuleImportDetailsPopup.pcf: line 24, column 57
    function initialValue_0 () : gw.bizrules.pcf.ImportingRulesDisposition {
      return gw.bizrules.pcf.ImportingRulesDisposition.create(navigationSupport.VersionController.ExportImportController, importTask)
    }
    
    // 'initialValue' attribute on Variable at RuleImportDetailsPopup.pcf: line 28, column 58
    function initialValue_1 () : gw.bizrules.pcf.RuleExportImportPageHelper {
      return new gw.bizrules.pcf.RuleExportImportPageHelper(navigationSupport.VersionController.ExportImportController)
    }
    
    // 'initialValue' attribute on Variable at RuleImportDetailsPopup.pcf: line 32, column 53
    function initialValue_2 () : gw.bizrules.pcf.RuleVersionController {
      return new gw.bizrules.pcf.RuleVersionController(navigationSupport)
    }
    
    // 'initialValue' attribute on Variable at RuleImportDetailsPopup.pcf: line 37, column 30
    function initialValue_3 () : java.lang.Void {
      pageHelper.onImportDetailsPopupRefresh(importTask); return null
    }
    
    // 'label' attribute on Label at RuleImportDetailsPopup.pcf: line 55, column 108
    function label_11 () : java.lang.String {
      return DisplayKey.get('BizRules.RuleImportDetailsPopup.Disposition', rulesDisposition.Total)
    }
    
    // 'label' attribute on AlertBar (id=ImportCompletedAlert) at RuleImportDetailsPopup.pcf: line 45, column 54
    function label_7 () : java.lang.Object {
      return gw.bizrules.pcf.RulePermissionUIHelper.canViewRule() ? DisplayKey.get("BizRules.RuleImportDetailsPopup.Alert.ImportCompleted.WithReturnToRules"): DisplayKey.get("BizRules.RuleImportDetailsPopup.Alert.ImportCompleted")
    }
    
    // 'sortBy' attribute on RowIterator (id=EntriesIterator) at RuleImportDetailsPopup.pcf: line 247, column 29
    function sortValue_67 (entry :  RuleImportTaskEntry) : java.lang.Object {
      return entry.RuleName
    }
    
    // 'value' attribute on RowIterator (id=EntriesIterator) at RuleImportDetailsPopup.pcf: line 264, column 55
    function sortValue_68 (entry :  RuleImportTaskEntry) : java.lang.Object {
      return entry.Status
    }
    
    // 'title' attribute on Popup (id=RuleImportDetailsPopup) at RuleImportDetailsPopup.pcf: line 8, column 155
    static function title_114 (completed :  boolean, importTask :  RuleImportTask, navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport) : java.lang.Object {
      return completed ? DisplayKey.get('BizRules.RuleImportDetailsPopup.ReviewImport') : DisplayKey.get('BizRules.RuleImportDetailsPopup.CompleteImport')
    }
    
    // 'value' attribute on TextInput (id=SourceName) at RuleImportDetailsPopup.pcf: line 53, column 44
    function valueRoot_10 () : java.lang.Object {
      return importTask
    }
    
    // 'value' attribute on TextCell (id=DiscardedHeader) at RuleImportDetailsPopup.pcf: line 74, column 64
    function valueRoot_16 () : java.lang.Object {
      return RuleImportStatus.TC_DISCARDED
    }
    
    // 'value' attribute on TextCell (id=NoActionHeader) at RuleImportDetailsPopup.pcf: line 82, column 63
    function valueRoot_19 () : java.lang.Object {
      return RuleImportStatus.TC_NOACTION
    }
    
    // 'value' attribute on TextCell (id=NewCountHeader) at RuleImportDetailsPopup.pcf: line 91, column 26
    function valueRoot_22 () : java.lang.Object {
      return RuleImportStatus.TC_NEW
    }
    
    // 'value' attribute on TextCell (id=NoConflictCountHeader) at RuleImportDetailsPopup.pcf: line 96, column 26
    function valueRoot_25 () : java.lang.Object {
      return RuleImportStatus.TC_NOCONFLICT
    }
    
    // 'value' attribute on TextCell (id=DeployedCountHeader) at RuleImportDetailsPopup.pcf: line 101, column 26
    function valueRoot_28 () : java.lang.Object {
      return RuleImportStatus.TC_DEPLOYED
    }
    
    // 'value' attribute on TextCell (id=ConflictCountHeader) at RuleImportDetailsPopup.pcf: line 106, column 26
    function valueRoot_31 () : java.lang.Object {
      return RuleImportStatus.TC_CONFLICT
    }
    
    // 'value' attribute on TextCell (id=ConflictCount) at RuleImportDetailsPopup.pcf: line 144, column 44
    function valueRoot_40 () : java.lang.Object {
      return rulesDisposition
    }
    
    // 'value' attribute on RowIterator (id=EntriesIterator) at RuleImportDetailsPopup.pcf: line 226, column 85
    function value_112 () : gw.api.database.IQueryBeanResult<RuleImportTaskEntry> {
      return navigationSupport.VersionController.ExportImportController.createImportTaskEntriesQuery(importTask).select()
    }
    
    // 'value' attribute on TextCell (id=OutstandingCountHeader) at RuleImportDetailsPopup.pcf: line 66, column 177
    function value_12 () : java.lang.String {
      return DisplayKey.get('BizRules.RuleImportDetailsPopup.StatusWithCount', DisplayKey.get('BizRules.Import.Disposition.Outstanding'), rulesDisposition.Outstanding)
    }
    
    // 'value' attribute on TextCell (id=DiscardedHeader) at RuleImportDetailsPopup.pcf: line 74, column 64
    function value_14 () : java.lang.String {
      return RuleImportStatus.TC_DISCARDED.DisplayName
    }
    
    // 'value' attribute on TextCell (id=NoActionHeader) at RuleImportDetailsPopup.pcf: line 82, column 63
    function value_17 () : java.lang.String {
      return RuleImportStatus.TC_NOACTION.DisplayName
    }
    
    // 'value' attribute on TextCell (id=NewCountHeader) at RuleImportDetailsPopup.pcf: line 91, column 26
    function value_20 () : java.lang.String {
      return RuleImportStatus.TC_NEW.DisplayName
    }
    
    // 'value' attribute on TextCell (id=NoConflictCountHeader) at RuleImportDetailsPopup.pcf: line 96, column 26
    function value_23 () : java.lang.String {
      return RuleImportStatus.TC_NOCONFLICT.DisplayName
    }
    
    // 'value' attribute on TextCell (id=DeployedCountHeader) at RuleImportDetailsPopup.pcf: line 101, column 26
    function value_26 () : java.lang.String {
      return RuleImportStatus.TC_DEPLOYED.DisplayName
    }
    
    // 'value' attribute on TextCell (id=ConflictCountHeader) at RuleImportDetailsPopup.pcf: line 106, column 26
    function value_29 () : java.lang.String {
      return RuleImportStatus.TC_CONFLICT.DisplayName
    }
    
    // 'value' attribute on TextCell (id=NewCount) at RuleImportDetailsPopup.pcf: line 129, column 44
    function value_32 () : java.lang.Integer {
      return rulesDisposition.getRulesWithStatus(TC_NEW)
    }
    
    // 'value' attribute on TextCell (id=NoConflictCount) at RuleImportDetailsPopup.pcf: line 134, column 44
    function value_34 () : java.lang.Integer {
      return rulesDisposition.getRulesWithStatus(TC_NOCONFLICT)
    }
    
    // 'value' attribute on TextCell (id=DeployedCount) at RuleImportDetailsPopup.pcf: line 139, column 44
    function value_36 () : java.lang.Integer {
      return rulesDisposition.getRulesWithStatus(TC_DEPLOYED)
    }
    
    // 'value' attribute on TextCell (id=ConflictCount) at RuleImportDetailsPopup.pcf: line 144, column 44
    function value_38 () : java.lang.Integer {
      return rulesDisposition.AllConflict
    }
    
    // 'value' attribute on TextCell (id=ImportedCount) at RuleImportDetailsPopup.pcf: line 150, column 44
    function value_41 () : java.lang.Integer {
      return rulesDisposition.AllImported
    }
    
    // 'value' attribute on TextCell (id=DiscardedCount) at RuleImportDetailsPopup.pcf: line 155, column 44
    function value_44 () : java.lang.Integer {
      return rulesDisposition.getRulesWithStatus(TC_DISCARDED)
    }
    
    // 'value' attribute on TextCell (id=EditedCount) at RuleImportDetailsPopup.pcf: line 160, column 44
    function value_46 () : java.lang.Integer {
      return rulesDisposition.getRulesWithStatus(TC_IMPORTEDEDITEDCONFLICT)
    }
    
    // 'value' attribute on TextCell (id=NoActionCount) at RuleImportDetailsPopup.pcf: line 165, column 44
    function value_48 () : java.lang.Integer {
      return rulesDisposition.AllNoAction
    }
    
    // 'value' attribute on TextInput (id=SourceName) at RuleImportDetailsPopup.pcf: line 53, column 44
    function value_8 () : java.lang.String {
      return importTask.SourceName
    }
    
    // 'visible' attribute on AlertBar (id=ImportCompletedAlert) at RuleImportDetailsPopup.pcf: line 45, column 54
    function visible_5 () : java.lang.Boolean {
      return rulesDisposition.Outstanding == 0
    }
    
    override property get CurrentLocation () : pcf.RuleImportDetailsPopup {
      return super.CurrentLocation as pcf.RuleImportDetailsPopup
    }
    
    property get completed () : boolean {
      return getVariableValue("completed", 0) as java.lang.Boolean
    }
    
    property set completed ($arg :  boolean) {
      setVariableValue("completed", 0, $arg)
    }
    
    property get ignore () : java.lang.Void {
      return getVariableValue("ignore", 0) as java.lang.Void
    }
    
    property set ignore ($arg :  java.lang.Void) {
      setVariableValue("ignore", 0, $arg)
    }
    
    property get importTask () : RuleImportTask {
      return getVariableValue("importTask", 0) as RuleImportTask
    }
    
    property set importTask ($arg :  RuleImportTask) {
      setVariableValue("importTask", 0, $arg)
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getVariableValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setVariableValue("navigationSupport", 0, $arg)
    }
    
    property get pageHelper () : gw.bizrules.pcf.RuleExportImportPageHelper {
      return getVariableValue("pageHelper", 0) as gw.bizrules.pcf.RuleExportImportPageHelper
    }
    
    property set pageHelper ($arg :  gw.bizrules.pcf.RuleExportImportPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    property get ruleVersionController () : gw.bizrules.pcf.RuleVersionController {
      return getVariableValue("ruleVersionController", 0) as gw.bizrules.pcf.RuleVersionController
    }
    
    property set ruleVersionController ($arg :  gw.bizrules.pcf.RuleVersionController) {
      setVariableValue("ruleVersionController", 0, $arg)
    }
    
    property get rulesDisposition () : gw.bizrules.pcf.ImportingRulesDisposition {
      return getVariableValue("rulesDisposition", 0) as gw.bizrules.pcf.ImportingRulesDisposition
    }
    
    property set rulesDisposition ($arg :  gw.bizrules.pcf.ImportingRulesDisposition) {
      setVariableValue("rulesDisposition", 0, $arg)
    }
    
    
  }
  
  
}