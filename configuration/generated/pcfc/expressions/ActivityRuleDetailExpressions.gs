package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRuleDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRuleDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (head :  ActivityRuleHead, version :  ActivityRuleVersion) : int {
      return 0
    }
    
    // 'action' attribute on AlertBar (id=NotLatestAlert) at ActivityRuleDetail.pcf: line 54, column 57
    function action_19 () : void {
      stateHolder.SelectedVersion = stateHolder.Head.HeadVersion
    }
    
    // 'action' attribute on AlertBar (id=UnavailableToRunAlert) at ActivityRuleDetail.pcf: line 62, column 114
    function action_22 () : void {
      stateHolder.makeLatestVersionAvailableToRunInNewBundle()
    }
    
    // 'action' attribute on AlertBar (id=PendingImportAlert) at ActivityRuleDetail.pcf: line 68, column 49
    function action_25 () : void {
      RuleImportDetailsPopup.push(stateHolder.NavigationSupport, stateHolder.Head.InProgressImportTaskEntry.Task, false)
    }
    
    // 'action' attribute on AlertBar (id=DuplicatedNameAlertBar) at ActivityRuleDetail.pcf: line 74, column 142
    function action_28 () : void {
      stateHolder.VersionController.pushRulesWithSameNamePopup(head.HeadVersion)
    }
    
    // 'action' attribute on AlertBar (id=RuleDeletedByAnotherUserAlert) at ActivityRuleDetail.pcf: line 81, column 49
    function action_30 () : void {
      stateHolder.NavigationSupport.goToRulesListPage()
    }
    
    // 'action' attribute on AlertBar (id=PendingImportAlert) at ActivityRuleDetail.pcf: line 68, column 49
    function action_dest_26 () : pcf.api.Destination {
      return pcf.RuleImportDetailsPopup.createDestination(stateHolder.NavigationSupport, stateHolder.Head.InProgressImportTaskEntry.Task, false)
    }
    
    // 'afterCancel' attribute on Page (id=ActivityRuleDetail) at ActivityRuleDetail.pcf: line 12, column 131
    function afterCancel_34 () : void {
      stateHolder.afterCancel()
    }
    
    // 'available' attribute on AlertBar (id=UnavailableToRunAlert) at ActivityRuleDetail.pcf: line 62, column 114
    function available_20 () : java.lang.Boolean {
      return !stateHolder.ImportInProgress  && gw.bizrules.pcf.RulePermissionUIHelper.canEditRule(stateHolder.getSelectedVersion())
    }
    
    // 'available' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function available_6 () : java.lang.Boolean {
      return !CurrentLocation.InEditMode
    }
    
    // 'beforeCommit' attribute on Page (id=ActivityRuleDetail) at ActivityRuleDetail.pcf: line 12, column 131
    function beforeCommit_35 (pickedValue :  java.lang.Object) : void {
      stateHolder.beforeUpdate()
    }
    
    // 'def' attribute on PanelRef at ActivityRuleDetail.pcf: line 84, column 56
    function def_onEnter_32 (def :  pcf.ActivityRulePanelSet) : void {
      def.onEnter(stateHolder.SelectedVersion, false, stateHolder.RulePageController)
    }
    
    // 'def' attribute on PanelRef at ActivityRuleDetail.pcf: line 84, column 56
    function def_refreshVariables_33 (def :  pcf.ActivityRulePanelSet) : void {
      def.refreshVariables(stateHolder.SelectedVersion, false, stateHolder.RulePageController)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      stateHolder.SelectedVersion = (__VALUE_TO_SET as entity.ActivityRuleVersion)
    }
    
    // 'initialValue' attribute on Variable at ActivityRuleDetail.pcf: line 24, column 58
    function initialValue_0 () : gw.bizrules.ActivityRuleDetailsStateHolder {
      return new gw.bizrules.ActivityRuleDetailsStateHolder(head, gw.bizrules.ActivityRulesNavigationSupport.Instance, gw.bizrules.ActivityRulePanelSetHelper.UIConfigs, CurrentLocation)
    }
    
    // 'label' attribute on AlertBar (id=UnavailableToRunAlert) at ActivityRuleDetail.pcf: line 62, column 114
    function label_23 () : java.lang.Object {
      return !stateHolder.ImportInProgress && gw.bizrules.pcf.RulePermissionUIHelper.canEditRule(stateHolder.getSelectedVersion()) ? DisplayKey.get('BizRules.RuleDetailsPage.Alert.UnavailableToRun.WithMakeAvailableAction') : DisplayKey.get('BizRules.RuleDetailsPage.Alert.UnavailableToRun')
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function optionLabel_14 (VALUE :  entity.ActivityRuleVersion) : java.lang.String {
      return stateHolder.formatVersion(VALUE)
    }
    
    // 'parent' attribute on Page (id=ActivityRuleDetail) at ActivityRuleDetail.pcf: line 12, column 131
    static function parent_36 (head :  ActivityRuleHead, version :  ActivityRuleVersion) : pcf.api.Destination {
      return pcf.ActivityRules.createDestination()
    }
    
    // 'title' attribute on Page (id=ActivityRuleDetail) at ActivityRuleDetail.pcf: line 12, column 131
    static function title_37 (head :  ActivityRuleHead, version :  ActivityRuleVersion) : java.lang.Object {
      return DisplayKey.get('Web.ActivityRules.Rule.Title',gw.bizrules.pcf.RuleDetailsStateHolder.getRuleName(head)?:"")
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRuleDetail.pcf: line 28, column 75
    function toolbarButtonSet_onEnter_1 (def :  pcf.StatusTransitionToolbarButtonSet) : void {
      def.onEnter(stateHolder)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRuleDetail.pcf: line 31, column 50
    function toolbarButtonSet_onEnter_4 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.onEnter(stateHolder.RulePageController)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRuleDetail.pcf: line 28, column 75
    function toolbarButtonSet_refreshVariables_2 (def :  pcf.StatusTransitionToolbarButtonSet) : void {
      def.refreshVariables(stateHolder)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRuleDetail.pcf: line 31, column 50
    function toolbarButtonSet_refreshVariables_5 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.refreshVariables(stateHolder.RulePageController)
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function valueRange_15 () : java.lang.Object {
      return stateHolder.History
    }
    
    // 'value' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function valueRoot_13 () : java.lang.Object {
      return stateHolder
    }
    
    // 'value' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function value_8 () : entity.ActivityRuleVersion {
      return stateHolder.SelectedVersion
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function verifyValueRangeIsAllowedType_16 ($$arg :  entity.ActivityRuleVersion[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.database.IQueryBeanResult<entity.ActivityRuleVersion>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Version) at ActivityRuleDetail.pcf: line 44, column 49
    function verifyValueRange_17 () : void {
      var __valueRangeArg = stateHolder.History
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'visible' attribute on AlertBar (id=NotLatestAlert) at ActivityRuleDetail.pcf: line 54, column 57
    function visible_18 () : java.lang.Boolean {
      return stateHolder.NotLatestVersionSelected
    }
    
    // 'visible' attribute on AlertBar (id=UnavailableToRunAlert) at ActivityRuleDetail.pcf: line 62, column 114
    function visible_21 () : java.lang.Boolean {
      return stateHolder.LatestVersionSelected && !stateHolder.SelectedVersion.Rule.AvailableToRun
    }
    
    // 'visible' attribute on AlertBar (id=PendingImportAlert) at ActivityRuleDetail.pcf: line 68, column 49
    function visible_24 () : java.lang.Boolean {
      return stateHolder.ImportInProgress
    }
    
    // 'visible' attribute on AlertBar (id=DuplicatedNameAlertBar) at ActivityRuleDetail.pcf: line 74, column 142
    function visible_27 () : java.lang.Boolean {
      return stateHolder.LatestVersionSelected && !stateHolder.VersionController.isRuleNameUnique(stateHolder.SelectedVersion)
    }
    
    // 'visible' attribute on AlertBar (id=RuleDeletedByAnotherUserAlert) at ActivityRuleDetail.pcf: line 81, column 49
    function visible_29 () : java.lang.Boolean {
      return !stateHolder.doesHeadExist()
    }
    
    // 'visible' attribute on ToolbarButtonSetRef at ActivityRuleDetail.pcf: line 31, column 50
    function visible_3 () : java.lang.Boolean {
      return stateHolder.doesHeadExist()
    }
    
    // 'visible' attribute on PanelRef at ActivityRuleDetail.pcf: line 84, column 56
    function visible_31 () : java.lang.Boolean {
      return stateHolder.SelectedVersion != null
    }
    
    override property get CurrentLocation () : pcf.ActivityRuleDetail {
      return super.CurrentLocation as pcf.ActivityRuleDetail
    }
    
    property get head () : ActivityRuleHead {
      return getVariableValue("head", 0) as ActivityRuleHead
    }
    
    property set head ($arg :  ActivityRuleHead) {
      setVariableValue("head", 0, $arg)
    }
    
    property get stateHolder () : gw.bizrules.ActivityRuleDetailsStateHolder {
      return getVariableValue("stateHolder", 0) as gw.bizrules.ActivityRuleDetailsStateHolder
    }
    
    property set stateHolder ($arg :  gw.bizrules.ActivityRuleDetailsStateHolder) {
      setVariableValue("stateHolder", 0, $arg)
    }
    
    property get version () : ActivityRuleVersion {
      return getVariableValue("version", 0) as ActivityRuleVersion
    }
    
    property set version ($arg :  ActivityRuleVersion) {
      setVariableValue("version", 0, $arg)
    }
    
    
  }
  
  
}