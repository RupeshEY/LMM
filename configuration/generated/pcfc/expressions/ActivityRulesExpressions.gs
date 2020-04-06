package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRules.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRulesExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRules.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRulesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on AlertBar (id=PendingImportAlert) at ActivityRules.pcf: line 50, column 97
    function action_14 () : void {
      gw.bizrules.ActivityRulesNavigationSupport.Instance.goToExportImportStatusPage()
    }
    
    // 'action' attribute on AlertBar (id=ValidationProgressAlert) at ActivityRules.pcf: line 56, column 83
    function action_16 () : void {
      
    }
    
    // 'action' attribute on AlertBar (id=ValidationProcessFailedAlert) at ActivityRules.pcf: line 62, column 84
    function action_19 () : void {
      gw.bizrules.validator.ValidateAllWorkQueueUtil.startValidationProcess()
    }
    
    // 'action' attribute on ToolbarButton (id=ShowHideFilter) at ActivityRules.pcf: line 39, column 250
    function action_9 () : void {
      areSearchFieldsVisible = !areSearchFieldsVisible
    }
    
    // 'canVisit' attribute on Page (id=ActivityRules) at ActivityRules.pcf: line 8, column 58
    static function canVisit_63 () : java.lang.Boolean {
      return perm.ActivityRule.view
    }
    
    // 'def' attribute on MenuItemSetRef at ActivityRules.pcf: line 34, column 234
    function def_onEnter_7 (def :  pcf.RuleListMoreButtonMenuItemSet) : void {
      def.onEnter(gw.bizrules.ActivityRulesNavigationSupport.Instance, "Rules", activityRuleFilterCriteria.Status?.createQuery(pageHelper.VersionController, null, activityRuleFilterCriteria))
    }
    
    // 'def' attribute on MenuItemSetRef at ActivityRules.pcf: line 34, column 234
    function def_refreshVariables_8 (def :  pcf.RuleListMoreButtonMenuItemSet) : void {
      def.refreshVariables(gw.bizrules.ActivityRulesNavigationSupport.Instance, "Rules", activityRuleFilterCriteria.Status?.createQuery(pageHelper.VersionController, null, activityRuleFilterCriteria))
    }
    
    // 'initialValue' attribute on Variable at ActivityRules.pcf: line 12, column 51
    function initialValue_0 () : gw.bizrules.ActivityRulesPageHelper {
      return new gw.bizrules.ActivityRulesPageHelper(gw.bizrules.ActivityRulesNavigationSupport.Instance.VersionController)
    }
    
    // 'initialValue' attribute on Variable at ActivityRules.pcf: line 16, column 76
    function initialValue_1 () : gw.bizrules.ActivityRuleFilterCriteria {
      return gw.bizrules.ActivityRuleFilterCriteria.getInstance()
    }
    
    // 'label' attribute on ToolbarButton (id=ShowHideFilter) at ActivityRules.pcf: line 39, column 250
    function label_10 () : java.lang.Object {
      return areSearchFieldsVisible ? DisplayKey.get('Web.ActivityRules.Filter.HideFilter') : activityRuleFilterCriteria.Specified ? DisplayKey.get('Web.ActivityRules.Filter.EditFilter') : DisplayKey.get('Web.ActivityRules.Filter.ShowFilter')
    }
    
    // 'label' attribute on AlertBar (id=ValidationProgressAlert) at ActivityRules.pcf: line 56, column 83
    function label_17 () : java.lang.Object {
      return DisplayKey.get('BizRules.ValidateAll.Pending', gw.bizrules.validator.ValidateAllWorkQueueUtil.CountWorkItemsPending)
    }
    
    // 'label' attribute on AlertBar (id=ValidationProcessFailedAlert) at ActivityRules.pcf: line 62, column 84
    function label_20 () : java.lang.Object {
      return DisplayKey.get('BizRules.ValidateAll.Failed', gw.bizrules.validator.ValidateAllWorkQueueUtil.getLastRunFailureReason())
    }
    
    // Page (id=ActivityRules) at ActivityRules.pcf: line 8, column 58
    static function parent_64 () : pcf.api.Destination {
      return pcf.BusinessRules.createDestination()
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRules.pcf: line 25, column 111
    function toolbarButtonSet_onEnter_2 (def :  pcf.CreateRuleToolbarButtonSet) : void {
      def.onEnter(gw.bizrules.ActivityRulesNavigationSupport.Instance)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRules.pcf: line 29, column 69
    function toolbarButtonSet_onEnter_5 (def :  pcf.DeployRulesToolbarButtonSet) : void {
      def.onEnter(gw.bizrules.ActivityRulesNavigationSupport.Instance, "Rules", activityRuleFilterCriteria.Status?.createQuery(pageHelper.VersionController, null, activityRuleFilterCriteria))
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRules.pcf: line 25, column 111
    function toolbarButtonSet_refreshVariables_3 (def :  pcf.CreateRuleToolbarButtonSet) : void {
      def.refreshVariables(gw.bizrules.ActivityRulesNavigationSupport.Instance)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRules.pcf: line 29, column 69
    function toolbarButtonSet_refreshVariables_6 (def :  pcf.DeployRulesToolbarButtonSet) : void {
      def.refreshVariables(gw.bizrules.ActivityRulesNavigationSupport.Instance, "Rules", activityRuleFilterCriteria.Status?.createQuery(pageHelper.VersionController, null, activityRuleFilterCriteria))
    }
    
    // 'value' attribute on ToolbarInput (id=ValidationStatusToolbarInput) at ActivityRules.pcf: line 43, column 41
    function value_11 () : java.lang.String {
      return pageHelper.getTotalFilteredCountMessage(activityRuleFilterCriteria.Status?.createQuery(pageHelper.VersionController, null, activityRuleFilterCriteria), activityRuleFilterCriteria.isSpecified())
    }
    
    // 'visible' attribute on AlertBar (id=PendingImportAlert) at ActivityRules.pcf: line 50, column 97
    function visible_13 () : java.lang.Boolean {
      return pageHelper.VersionController.ExportImportController.doesPendingImportExist()
    }
    
    // 'visible' attribute on AlertBar (id=ValidationProgressAlert) at ActivityRules.pcf: line 56, column 83
    function visible_15 () : java.lang.Boolean {
      return gw.bizrules.validator.ValidateAllWorkQueueUtil.isWorkPending()
    }
    
    // 'visible' attribute on AlertBar (id=ValidationProcessFailedAlert) at ActivityRules.pcf: line 62, column 84
    function visible_18 () : java.lang.Boolean {
      return gw.bizrules.validator.ValidateAllWorkQueueUtil.didLastRunFail()
    }
    
    // 'visible' attribute on ToolbarButtonSetRef at ActivityRules.pcf: line 29, column 69
    function visible_4 () : java.lang.Boolean {
      return pageHelper.VersionController.DeploymentEnabled
    }
    
    override property get CurrentLocation () : pcf.ActivityRules {
      return super.CurrentLocation as pcf.ActivityRules
    }
    
    property get activityRuleFilterCriteria () : gw.bizrules.ActivityRuleFilterCriteria {
      return getVariableValue("activityRuleFilterCriteria", 0) as gw.bizrules.ActivityRuleFilterCriteria
    }
    
    property set activityRuleFilterCriteria ($arg :  gw.bizrules.ActivityRuleFilterCriteria) {
      setVariableValue("activityRuleFilterCriteria", 0, $arg)
    }
    
    property get areSearchFieldsVisible () : Boolean {
      return getVariableValue("areSearchFieldsVisible", 0) as Boolean
    }
    
    property set areSearchFieldsVisible ($arg :  Boolean) {
      setVariableValue("areSearchFieldsVisible", 0, $arg)
    }
    
    property get pageHelper () : gw.bizrules.ActivityRulesPageHelper {
      return getVariableValue("pageHelper", 0) as gw.bizrules.ActivityRulesPageHelper
    }
    
    property set pageHelper ($arg :  gw.bizrules.ActivityRulesPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRules.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SearchPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at ActivityRules.pcf: line 117, column 40
    function action_37 () : void {
      ActivityRuleDetail.go(pageHelper.getHead(version), version)
    }
    
    // 'action' attribute on TextCell (id=Name) at ActivityRules.pcf: line 117, column 40
    function action_dest_38 () : pcf.api.Destination {
      return pcf.ActivityRuleDetail.createDestination(pageHelper.getHead(version), version)
    }
    
    // 'def' attribute on ModalCellRef (id=RuleValidationInfo) at ActivityRules.pcf: line 111, column 27
    function def_onEnter_34 (def :  pcf.RuleValidationInfoCell_default) : void {
      def.onEnter(version.Rule)
    }
    
    // 'def' attribute on ModalCellRef (id=RuleValidationInfo) at ActivityRules.pcf: line 111, column 27
    function def_refreshVariables_35 (def :  pcf.RuleValidationInfoCell_default) : void {
      def.refreshVariables(version.Rule)
    }
    
    // 'value' attribute on TextCell (id=Name) at ActivityRules.pcf: line 117, column 40
    function valueRoot_40 () : java.lang.Object {
      return version.Rule
    }
    
    // 'value' attribute on TextCell (id=Name) at ActivityRules.pcf: line 117, column 40
    function value_36 () : java.lang.String {
      return version.Rule.Name
    }
    
    // 'value' attribute on TextCell (id=Status) at ActivityRules.pcf: line 121, column 58
    function value_41 () : java.lang.String {
      return pageHelper.getStatusText(version)
    }
    
    // 'value' attribute on BooleanRadioCell (id=AvailableToRun) at ActivityRules.pcf: line 128, column 52
    function value_43 () : java.lang.Boolean {
      return version.Rule.AvailableToRun
    }
    
    // 'value' attribute on TypeKeyCell (id=Context) at ActivityRules.pcf: line 133, column 61
    function value_46 () : typekey.RuleContextDefinitionKey {
      return version.Rule.RuleContextDefinitionKey
    }
    
    // 'value' attribute on TypeKeyCell (id=Trigger) at ActivityRules.pcf: line 138, column 55
    function value_49 () : typekey.TriggeringPointKey {
      return version.Rule.TriggeringPointKey
    }
    
    // 'value' attribute on TextCell (id=ActionType) at ActivityRules.pcf: line 143, column 64
    function value_52 () : java.lang.String {
      return pageHelper.getActionTypes(version.Rule)
    }
    
    // 'value' attribute on TextAreaCell (id=LossTypes) at ActivityRules.pcf: line 148, column 87
    function value_54 () : java.lang.String {
      return pageHelper.join(version.Rule.LossTypes*.LossType*.DisplayName)
    }
    
    // 'value' attribute on TextAreaCell (id=PolicyTypes) at ActivityRules.pcf: line 153, column 91
    function value_56 () : java.lang.String {
      return pageHelper.join(version.Rule.PolicyTypes*.PolicyType*.DisplayName)
    }
    
    // 'value' attribute on TextAreaCell (id=Jurisdictions) at ActivityRules.pcf: line 158, column 95
    function value_58 () : java.lang.String {
      return pageHelper.join(version.Rule.Jurisdictions*.Jurisdiction*.DisplayName)
    }
    
    property get version () : entity.ActivityRuleVersion {
      return getIteratedValue(2) as entity.ActivityRuleVersion
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRules.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ActivityRulesExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Filter) at ActivityRules.pcf: line 84, column 74
    function action_24 () : void {
      gw.api.util.SearchUtil.search()
    }
    
    // 'action' attribute on ToolbarButton (id=Clear) at ActivityRules.pcf: line 88, column 55
    function action_25 () : void {
      activityRuleFilterCriteria.clear(); gw.api.util.SearchUtil.search()
    }
    
    // 'def' attribute on PanelRef (id=SearchCriteriaPanelRef) at ActivityRules.pcf: line 75, column 44
    function def_onEnter_22 (def :  pcf.ActivityRuleFilterCriteriaDV) : void {
      def.onEnter(activityRuleFilterCriteria)
    }
    
    // 'def' attribute on PanelRef at ActivityRules.pcf: line 79, column 44
    function def_onEnter_27 (def :  pcf.EmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef (id=SearchCriteriaPanelRef) at ActivityRules.pcf: line 75, column 44
    function def_refreshVariables_23 (def :  pcf.ActivityRuleFilterCriteriaDV) : void {
      def.refreshVariables(activityRuleFilterCriteria)
    }
    
    // 'def' attribute on PanelRef at ActivityRules.pcf: line 79, column 44
    function def_refreshVariables_28 (def :  pcf.EmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'searchCriteria' attribute on SearchPanel at ActivityRules.pcf: line 71, column 96
    function searchCriteria_62 () : gw.bizrules.ActivityRuleFilterCriteria {
      return activityRuleFilterCriteria
    }
    
    // 'search' attribute on SearchPanel at ActivityRules.pcf: line 71, column 96
    function search_61 () : java.lang.Object {
      return activityRuleFilterCriteria.Status?.createQuery(pageHelper.VersionController, null, activityRuleFilterCriteria).select()
    }
    
    // 'value' attribute on RowIterator (id=Rules) at ActivityRules.pcf: line 117, column 40
    function sortValue_29 (version :  entity.ActivityRuleVersion) : java.lang.Object {
      return version.Rule.Name
    }
    
    // 'value' attribute on RowIterator (id=Rules) at ActivityRules.pcf: line 121, column 58
    function sortValue_30 (version :  entity.ActivityRuleVersion) : java.lang.Object {
      return pageHelper.getStatusText(version)
    }
    
    // 'value' attribute on RowIterator (id=Rules) at ActivityRules.pcf: line 128, column 52
    function sortValue_31 (version :  entity.ActivityRuleVersion) : java.lang.Object {
      return version.Rule.AvailableToRun
    }
    
    // 'value' attribute on RowIterator (id=Rules) at ActivityRules.pcf: line 133, column 61
    function sortValue_32 (version :  entity.ActivityRuleVersion) : java.lang.Object {
      return version.Rule.RuleContextDefinitionKey
    }
    
    // 'value' attribute on RowIterator (id=Rules) at ActivityRules.pcf: line 138, column 55
    function sortValue_33 (version :  entity.ActivityRuleVersion) : java.lang.Object {
      return version.Rule.TriggeringPointKey
    }
    
    // 'value' attribute on RowIterator (id=Rules) at ActivityRules.pcf: line 101, column 90
    function value_60 () : gw.api.database.IQueryBeanResult<entity.ActivityRuleVersion> {
      return results
    }
    
    // 'visible' attribute on PanelRef (id=SearchCriteriaPanelRef) at ActivityRules.pcf: line 75, column 44
    function visible_21 () : java.lang.Boolean {
      return areSearchFieldsVisible
    }
    
    property get filterCriteria () : gw.bizrules.ActivityRuleFilterCriteria {
      return getCriteriaValue(1) as gw.bizrules.ActivityRuleFilterCriteria
    }
    
    property set filterCriteria ($arg :  gw.bizrules.ActivityRuleFilterCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get results () : gw.api.database.IQueryBeanResult<entity.ActivityRuleVersion> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<entity.ActivityRuleVersion>
    }
    
    
  }
  
  
}