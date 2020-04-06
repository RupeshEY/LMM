package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/ManageWorkflows.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ManageWorkflowsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/ManageWorkflows.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManageWorkflowsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (workflows :  Workflow[]) : int {
      return 0
    }
    
    static function __constructorIndex (workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, criteria :  WorkflowSearchCriteria) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=refresh) at ManageWorkflows.pcf: line 44, column 23
    function action_2 () : void {
      helper.refresh()
    }
    
    // 'actionOnComplete' attribute on ProgressInput (id=WaitActiveWorkItem) at ManageWorkflows.pcf: line 102, column 41
    function action_24 () : void {
      helper.Waiting = false
    }
    
    // 'action' attribute on ToolbarButton (id=execute) at ManageWorkflows.pcf: line 50, column 25
    function action_4 () : void {
      helper.execute(CurrentLocation)
    }
    
    // 'action' attribute on ToolbarButton (id=cancel) at ManageWorkflows.pcf: line 55, column 25
    function action_5 () : void {
      CurrentLocation.cancel(); WorkflowSearch.go()
    }
    
    // 'action' attribute on ToolbarButton (id=detail) at ManageWorkflows.pcf: line 61, column 46
    function action_7 () : void {
      CurrentLocation.cancel(); WorkflowDetail.go(helper.Workflow)
    }
    
    // 'available' attribute on ToolbarButton (id=execute) at ManageWorkflows.pcf: line 50, column 25
    function available_3 () : java.lang.Boolean {
      return helper.ActionType != null
    }
    
    // 'canVisit' attribute on Page (id=ManageWorkflows) at ManageWorkflows.pcf: line 15, column 73
    static function canVisit_90 (criteria :  WorkflowSearchCriteria, workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, workflows :  Workflow[]) : java.lang.Boolean {
      return perm.System.workflowmanage
    }
    
    // 'value' attribute on TextInput (id=MaxWait) at ManageWorkflows.pcf: line 96, column 84
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      MaxWaitSecs = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on Choice (id=WaitChoice) at ManageWorkflows.pcf: line 89, column 42
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      helper.ActionType = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=InvokeTrigger) at ManageWorkflows.pcf: line 116, column 54
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      helper.TriggerKey = (__VALUE_TO_SET as typekey.WorkflowTriggerKey)
    }
    
    // 'value' attribute on RangeInput (id=ForceBranch) at ManageWorkflows.pcf: line 155, column 61
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      helper.ForceBranch = (__VALUE_TO_SET as com.guidewire.pl.system.workflow.engine.config.WorkflowTimeout)
    }
    
    // 'editable' attribute on DetailViewPanel at ManageWorkflows.pcf: line 71, column 39
    function editable_89 () : java.lang.Boolean {
      return not helper.Waiting
    }
    
    // 'initialValue' attribute on Variable at ManageWorkflows.pcf: line 32, column 19
    function initialValue_0 () : int {
      return 0
    }
    
    // 'initialValue' attribute on Variable at ManageWorkflows.pcf: line 36, column 57
    function initialValue_1 () : gw.api.web.admin.workflow.ManageWorkflows {
      return new gw.api.web.admin.workflow.ManageWorkflows(null, workflows, workflowQuery, criteria)
    }
    
    // 'label' attribute on RangeInput (id=InvokeTrigger) at ManageWorkflows.pcf: line 116, column 54
    function label_33 () : java.lang.Object {
      return ManageWorkflowActionType.TC_INVOKETRIGGER
    }
    
    // 'label' attribute on TextInput (id=Suspend) at ManageWorkflows.pcf: line 128, column 50
    function label_50 () : java.lang.Object {
      return ManageWorkflowActionType.TC_SUSPEND
    }
    
    // 'label' attribute on TextInput (id=Resume) at ManageWorkflows.pcf: line 140, column 49
    function label_62 () : java.lang.Object {
      return ManageWorkflowActionType.TC_RESUME
    }
    
    // 'label' attribute on Verbatim (id=EditCount) at ManageWorkflows.pcf: line 65, column 96
    function label_8 () : java.lang.String {
      return DisplayKey.get("Web.Admin.Workflow.Manage.EditCount", helper.Count)
    }
    
    // 'label' attribute on Verbatim (id=message) at ManageWorkflows.pcf: line 69, column 25
    function label_9 () : java.lang.String {
      return helper.Message
    }
    
    // 'optionLabel' attribute on RangeInput (id=ForceBranch) at ManageWorkflows.pcf: line 155, column 61
    function optionLabel_79 (VALUE :  com.guidewire.pl.system.workflow.engine.config.WorkflowTimeout) : java.lang.String {
      return VALUE.localizeDisplayName()
    }
    
    // 'option' attribute on Choice (id=WaitChoice) at ManageWorkflows.pcf: line 89, column 42
    function option_26 () : java.lang.Object {
      return ManageWorkflowActionType.TC_WAIT.Code
    }
    
    // 'option' attribute on Choice (id=InvokeTriggerChoice) at ManageWorkflows.pcf: line 108, column 42
    function option_43 () : java.lang.Object {
      return ManageWorkflowActionType.TC_INVOKETRIGGER.Code
    }
    
    // 'option' attribute on Choice (id=SuspendChoice) at ManageWorkflows.pcf: line 122, column 42
    function option_55 () : java.lang.Object {
      return ManageWorkflowActionType.TC_SUSPEND.Code
    }
    
    // 'option' attribute on Choice (id=ResumeChoice) at ManageWorkflows.pcf: line 134, column 42
    function option_67 () : java.lang.Object {
      return ManageWorkflowActionType.TC_RESUME.Code
    }
    
    // 'option' attribute on Choice (id=TimeoutChoice) at ManageWorkflows.pcf: line 146, column 42
    function option_83 () : java.lang.Object {
      return ManageWorkflowActionType.TC_SETTIMEOUT.Code
    }
    
    // 'parent' attribute on Page (id=ManageWorkflows) at ManageWorkflows.pcf: line 15, column 73
    static function parent_91 (criteria :  WorkflowSearchCriteria, workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, workflows :  Workflow[]) : pcf.api.Destination {
      return pcf.WorkflowSearch.createDestination()
    }
    
    // 'percentage' attribute on ProgressInput (id=WaitActiveWorkItem) at ManageWorkflows.pcf: line 102, column 41
    function percentage_25 () : java.lang.Double {
      return helper.performWaitAndReturnPercent(MaxWaitSecs * 1000, 0, 0)
    }
    
    // 'valueRange' attribute on RangeInput (id=InvokeTrigger) at ManageWorkflows.pcf: line 116, column 54
    function valueRange_40 () : java.lang.Object {
      return helper.Triggers
    }
    
    // 'valueRange' attribute on RangeInput (id=ForceBranch) at ManageWorkflows.pcf: line 155, column 61
    function valueRange_80 () : java.lang.Object {
      return helper.TimeoutBranches
    }
    
    // 'value' attribute on TextInput (id=Type) at ManageWorkflows.pcf: line 79, column 46
    function valueRoot_12 () : java.lang.Object {
      return helper
    }
    
    // 'value' attribute on TextInput (id=Type) at ManageWorkflows.pcf: line 79, column 46
    function value_10 () : gw.entity.TypeKey {
      return helper.WorkflowType
    }
    
    // 'value' attribute on TextInput (id=CurrentStep) at ManageWorkflows.pcf: line 83, column 43
    function value_13 () : java.lang.String {
      return helper.CurrentStep
    }
    
    // 'value' attribute on TextInput (id=MaxWait) at ManageWorkflows.pcf: line 96, column 84
    function value_18 () : java.lang.Integer {
      return MaxWaitSecs
    }
    
    // 'value' attribute on Choice (id=WaitChoice) at ManageWorkflows.pcf: line 89, column 42
    function value_27 () : java.lang.String {
      return helper.ActionType
    }
    
    // 'value' attribute on Choice (id=WaitChoice) at ManageWorkflows.pcf: line 89, column 42
    function value_31 () : java.lang.Object {
      return helper.ActionType
    }
    
    // 'value' attribute on RangeInput (id=InvokeTrigger) at ManageWorkflows.pcf: line 116, column 54
    function value_34 () : typekey.WorkflowTriggerKey {
      return helper.TriggerKey
    }
    
    // 'value' attribute on TextInput (id=Suspend) at ManageWorkflows.pcf: line 128, column 50
    function value_51 () : java.lang.Object {
      return null
    }
    
    // 'value' attribute on RangeInput (id=ForceBranch) at ManageWorkflows.pcf: line 155, column 61
    function value_74 () : com.guidewire.pl.system.workflow.engine.config.WorkflowTimeout {
      return helper.ForceBranch
    }
    
    // 'valueRange' attribute on RangeInput (id=InvokeTrigger) at ManageWorkflows.pcf: line 116, column 54
    function verifyValueRangeIsAllowedType_41 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InvokeTrigger) at ManageWorkflows.pcf: line 116, column 54
    function verifyValueRangeIsAllowedType_41 ($$arg :  typekey.WorkflowTriggerKey[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ForceBranch) at ManageWorkflows.pcf: line 155, column 61
    function verifyValueRangeIsAllowedType_81 ($$arg :  com.guidewire.pl.system.workflow.engine.config.WorkflowTimeout[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ForceBranch) at ManageWorkflows.pcf: line 155, column 61
    function verifyValueRangeIsAllowedType_81 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InvokeTrigger) at ManageWorkflows.pcf: line 116, column 54
    function verifyValueRange_42 () : void {
      var __valueRangeArg = helper.Triggers
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_41(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ForceBranch) at ManageWorkflows.pcf: line 155, column 61
    function verifyValueRange_82 () : void {
      var __valueRangeArg = helper.TimeoutBranches
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_81(__valueRangeArg)
    }
    
    // 'visible' attribute on InputSet at ManageWorkflows.pcf: line 74, column 50
    function visible_16 () : java.lang.Boolean {
      return helper.CurrentStep != null
    }
    
    // 'visible' attribute on TextInput (id=MaxWait) at ManageWorkflows.pcf: line 96, column 84
    function visible_17 () : java.lang.Boolean {
      return helper.Workflow != null and helper.ActiveWorkItem != null
    }
    
    // 'visible' attribute on ProgressInput (id=WaitActiveWorkItem) at ManageWorkflows.pcf: line 102, column 41
    function visible_22 () : java.lang.Boolean {
      return helper.Waiting
    }
    
    // 'visible' attribute on RangeInput (id=InvokeTrigger) at ManageWorkflows.pcf: line 116, column 54
    function visible_32 () : java.lang.Boolean {
      return helper.Triggers.length != 0
    }
    
    // 'visible' attribute on TextInput (id=Suspend) at ManageWorkflows.pcf: line 128, column 50
    function visible_49 () : java.lang.Boolean {
      return helper.SuspendAvailable
    }
    
    // 'visible' attribute on ToolbarButton (id=detail) at ManageWorkflows.pcf: line 61, column 46
    function visible_6 () : java.lang.Boolean {
      return helper.Workflow != null
    }
    
    // 'visible' attribute on TextInput (id=Resume) at ManageWorkflows.pcf: line 140, column 49
    function visible_61 () : java.lang.Boolean {
      return helper.ResumeAvailable
    }
    
    // 'visible' attribute on RangeInput (id=ForceBranch) at ManageWorkflows.pcf: line 155, column 61
    function visible_73 () : java.lang.Boolean {
      return helper.TimeoutBranches.length != 0
    }
    
    override property get CurrentLocation () : pcf.ManageWorkflows {
      return super.CurrentLocation as pcf.ManageWorkflows
    }
    
    property get MaxWaitSecs () : int {
      return getVariableValue("MaxWaitSecs", 0) as java.lang.Integer
    }
    
    property set MaxWaitSecs ($arg :  int) {
      setVariableValue("MaxWaitSecs", 0, $arg)
    }
    
    property get criteria () : WorkflowSearchCriteria {
      return getVariableValue("criteria", 0) as WorkflowSearchCriteria
    }
    
    property set criteria ($arg :  WorkflowSearchCriteria) {
      setVariableValue("criteria", 0, $arg)
    }
    
    property get helper () : gw.api.web.admin.workflow.ManageWorkflows {
      return getVariableValue("helper", 0) as gw.api.web.admin.workflow.ManageWorkflows
    }
    
    property set helper ($arg :  gw.api.web.admin.workflow.ManageWorkflows) {
      setVariableValue("helper", 0, $arg)
    }
    
    property get workflowQuery () : gw.api.database.IQueryBeanResult<Workflow> {
      return getVariableValue("workflowQuery", 0) as gw.api.database.IQueryBeanResult<Workflow>
    }
    
    property set workflowQuery ($arg :  gw.api.database.IQueryBeanResult<Workflow>) {
      setVariableValue("workflowQuery", 0, $arg)
    }
    
    property get workflows () : Workflow[] {
      return getVariableValue("workflows", 0) as Workflow[]
    }
    
    property set workflows ($arg :  Workflow[]) {
      setVariableValue("workflows", 0, $arg)
    }
    
    
  }
  
  
}