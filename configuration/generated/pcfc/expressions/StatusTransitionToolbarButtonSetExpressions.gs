package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatusTransitionToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusTransitionToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteDraft) at StatusTransitionToolbarButtonSet.pcf: line 47, column 49
    function action_12 () : void {
      stateHolder.deleteDraftInNewBundle()
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteWip) at StatusTransitionToolbarButtonSet.pcf: line 56, column 47
    function action_16 () : void {
      stateHolder.deleteWipInNewBundle()
    }
    
    // 'action' attribute on ToolbarButton (id=Edit) at StatusTransitionToolbarButtonSet.pcf: line 18, column 52
    function action_2 () : void {
      CurrentLocation.startEditing(); stateHolder.makeLatestVersionEditable()
    }
    
    // 'action' attribute on ToolbarButton (id=PromoteToStaged) at StatusTransitionToolbarButtonSet.pcf: line 64, column 121
    function action_21 () : void {
      stateHolder.changeHeadVersionStatusInNewBundle(TC_STAGED)
    }
    
    // 'action' attribute on ToolbarButton (id=PromoteToApproved) at StatusTransitionToolbarButtonSet.pcf: line 72, column 122
    function action_25 () : void {
      stateHolder.changeHeadVersionStatusInNewBundle(RuleStatus.TC_APPROVED)
    }
    
    // 'action' attribute on ToolbarButton (id=Deploy) at StatusTransitionToolbarButtonSet.pcf: line 81, column 97
    function action_29 () : void {
      stateHolder.deploySelectedVersion()
    }
    
    // 'action' attribute on ToolbarButton (id=Update) at StatusTransitionToolbarButtonSet.pcf: line 24, column 21
    function action_4 () : void {
      CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=Cancel) at StatusTransitionToolbarButtonSet.pcf: line 30, column 21
    function action_5 () : void {
      CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=Revert) at StatusTransitionToolbarButtonSet.pcf: line 38, column 105
    function action_8 () : void {
      CurrentLocation.startEditing(); stateHolder.createDraftBasedOnSelectedVersion()
    }
    
    // 'available' attribute on ToolbarButton (id=Edit) at StatusTransitionToolbarButtonSet.pcf: line 18, column 52
    function available_0 () : java.lang.Boolean {
      return !stateHolder.ImportInProgress && gw.bizrules.pcf.RulePermissionUIHelper.canEditRule(stateHolder.getSelectedVersion())
    }
    
    // 'available' attribute on ToolbarButton (id=PromoteToApproved) at StatusTransitionToolbarButtonSet.pcf: line 72, column 122
    function available_23 () : java.lang.Boolean {
      return !stateHolder.ImportInProgress and gw.bizrules.pcf.RulePermissionUIHelper.canApproveRule(stateHolder.getSelectedVersion())
    }
    
    // 'available' attribute on ToolbarButton (id=Deploy) at StatusTransitionToolbarButtonSet.pcf: line 81, column 97
    function available_27 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canDeployRule(stateHolder.getSelectedVersion())
    }
    
    // 'confirmMessage' attribute on ToolbarButton (id=DeleteWip) at StatusTransitionToolbarButtonSet.pcf: line 56, column 47
    function confirmMessage_17 () : java.lang.String {
      return stateHolder.History.Count == 1 ? DisplayKey.get('BizRules.StatusTransitionToolbarButtonSet.DeleteRuleConfirmation') : DisplayKey.get('BizRules.StatusTransitionToolbarButtonSet.DeleteVersionConfirmation')
    }
    
    // 'confirmMessage' attribute on ToolbarButton (id=Deploy) at StatusTransitionToolbarButtonSet.pcf: line 81, column 97
    function confirmMessage_30 () : java.lang.String {
      return stateHolder.getDeployConfirmationText()
    }
    
    // 'tooltip' attribute on ToolbarButton (id=PromoteToApproved) at StatusTransitionToolbarButtonSet.pcf: line 72, column 122
    function tooltip_26 () : java.lang.String {
      return gw.bizrules.pcf.RulePermissionUIHelper.checkAndGetApprovePermissionMsg(stateHolder.getSelectedVersion())
    }
    
    // 'tooltip' attribute on ToolbarButton (id=Edit) at StatusTransitionToolbarButtonSet.pcf: line 18, column 52
    function tooltip_3 () : java.lang.String {
      return gw.bizrules.pcf.RulePermissionUIHelper.checkAndGetEditPermissionMsg(stateHolder.getSelectedVersion())
    }
    
    // 'tooltip' attribute on ToolbarButton (id=Deploy) at StatusTransitionToolbarButtonSet.pcf: line 81, column 97
    function tooltip_31 () : java.lang.String {
      return gw.bizrules.pcf.RulePermissionUIHelper.checkAndGetDeployPermissionMsg(stateHolder.getSelectedVersion())
    }
    
    // 'visible' attribute on ToolbarButton (id=Edit) at StatusTransitionToolbarButtonSet.pcf: line 18, column 52
    function visible_1 () : java.lang.Boolean {
      return stateHolder.LatestVersionSelected
    }
    
    // 'visible' attribute on ToolbarButton (id=DeleteDraft) at StatusTransitionToolbarButtonSet.pcf: line 47, column 49
    function visible_11 () : java.lang.Boolean {
      return stateHolder.DeleteDraftVisible
    }
    
    // 'visible' attribute on ToolbarButton (id=DeleteWip) at StatusTransitionToolbarButtonSet.pcf: line 56, column 47
    function visible_15 () : java.lang.Boolean {
      return stateHolder.DeleteWipVisible
    }
    
    // 'visible' attribute on ToolbarButton (id=PromoteToStaged) at StatusTransitionToolbarButtonSet.pcf: line 64, column 121
    function visible_20 () : java.lang.Boolean {
      return stateHolder.LatestVersionSelected && stateHolder.SelectedVersion.Status == RuleStatus.TC_DRAFT
    }
    
    // 'visible' attribute on ToolbarButton (id=PromoteToApproved) at StatusTransitionToolbarButtonSet.pcf: line 72, column 122
    function visible_24 () : java.lang.Boolean {
      return stateHolder.LatestVersionSelected && stateHolder.SelectedVersion.Status == RuleStatus.TC_STAGED
    }
    
    // 'visible' attribute on ToolbarButton (id=Deploy) at StatusTransitionToolbarButtonSet.pcf: line 81, column 97
    function visible_28 () : java.lang.Boolean {
      return stateHolder.DeploymentEnabled && stateHolder.SelectedVersionDeployable
    }
    
    // 'visible' attribute on ToolbarButton (id=Revert) at StatusTransitionToolbarButtonSet.pcf: line 38, column 105
    function visible_7 () : java.lang.Boolean {
      return stateHolder.NotLatestVersionSelected && !stateHolder.Head.HeadVersion.Editable
    }
    
    property get stateHolder () : gw.bizrules.pcf.RuleDetailsStateHolder {
      return getRequireValue("stateHolder", 0) as gw.bizrules.pcf.RuleDetailsStateHolder
    }
    
    property set stateHolder ($arg :  gw.bizrules.pcf.RuleDetailsStateHolder) {
      setRequireValue("stateHolder", 0, $arg)
    }
    
    
  }
  
  
}