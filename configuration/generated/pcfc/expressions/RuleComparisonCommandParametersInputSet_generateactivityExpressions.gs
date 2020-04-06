package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonCommandParametersInputSet_generateactivityExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonCommandParametersInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=pattern) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 16, column 178
    function def_onEnter_0 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.PATTERN.Name))
    }
    
    // 'def' attribute on InputSetRef (id=target_days) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 31, column 194
    function def_onEnter_10 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsInteger(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.TARGET_DAYS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=target_hours) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 34, column 195
    function def_onEnter_12 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsInteger(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.TARGET_HOURS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=target_start_point) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 37, column 200
    function def_onEnter_14 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.TARGET_STARTPOINT.Name))
    }
    
    // 'def' attribute on InputSetRef (id=target_included_days) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 40, column 201
    function def_onEnter_16 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.TARGET_INCLUDEDAYS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=escalation_days) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 43, column 198
    function def_onEnter_18 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsInteger(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ESCALATION_DAYS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=subject) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 19, column 180
    function def_onEnter_2 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.SUBJECT.Name))
    }
    
    // 'def' attribute on InputSetRef (id=escalation_hours) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 46, column 199
    function def_onEnter_20 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsInteger(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ESCALATION_HOURS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=escalation_start_point) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 49, column 204
    function def_onEnter_22 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ESCALATION_STARTPOINT.Name))
    }
    
    // 'def' attribute on InputSetRef (id=escalation_include_days) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 52, column 205
    function def_onEnter_24 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ESCALATION_INCLUDEDAYS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=additional_restrictions) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 55, column 193
    function def_onEnter_26 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ACTIVITY_RESTRICTION.Name))
    }
    
    // 'def' attribute on InputSetRef (id=related_to) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 58, column 183
    function def_onEnter_28 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.RELATED_TO.Name))
    }
    
    // 'def' attribute on InputSetRef (id=assigned_to) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 61, column 184
    function def_onEnter_30 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ASSIGNED_TO.Name))
    }
    
    // 'def' attribute on InputSetRef (id=group_id) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 65, column 157
    function def_onEnter_33 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.GROUP_ID.Name))
    }
    
    // 'def' attribute on InputSetRef (id=queue_id) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 69, column 157
    function def_onEnter_36 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.QUEUE_ID.Name))
    }
    
    // 'def' attribute on InputSetRef (id=role) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 73, column 153
    function def_onEnter_39 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ROLE.Name))
    }
    
    // 'def' attribute on InputSetRef (id=description) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 22, column 186
    function def_onEnter_4 (def :  pcf.RuleComparisonRowTextAreaInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.DESCRIPTION.Name))
    }
    
    // 'def' attribute on InputSetRef (id=calendar_importance) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 25, column 202
    function def_onEnter_6 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.CALENDAR_IMPORTANCE.Name))
    }
    
    // 'def' attribute on InputSetRef (id=priority) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 28, column 191
    function def_onEnter_8 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.PRIORITY.Name))
    }
    
    // 'def' attribute on InputSetRef (id=pattern) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 16, column 178
    function def_refreshVariables_1 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.PATTERN.Name))
    }
    
    // 'def' attribute on InputSetRef (id=target_days) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 31, column 194
    function def_refreshVariables_11 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsInteger(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.TARGET_DAYS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=target_hours) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 34, column 195
    function def_refreshVariables_13 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsInteger(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.TARGET_HOURS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=target_start_point) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 37, column 200
    function def_refreshVariables_15 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.TARGET_STARTPOINT.Name))
    }
    
    // 'def' attribute on InputSetRef (id=target_included_days) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 40, column 201
    function def_refreshVariables_17 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.TARGET_INCLUDEDAYS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=escalation_days) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 43, column 198
    function def_refreshVariables_19 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsInteger(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ESCALATION_DAYS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=escalation_hours) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 46, column 199
    function def_refreshVariables_21 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsInteger(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ESCALATION_HOURS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=escalation_start_point) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 49, column 204
    function def_refreshVariables_23 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ESCALATION_STARTPOINT.Name))
    }
    
    // 'def' attribute on InputSetRef (id=escalation_include_days) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 52, column 205
    function def_refreshVariables_25 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ESCALATION_INCLUDEDAYS.Name))
    }
    
    // 'def' attribute on InputSetRef (id=additional_restrictions) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 55, column 193
    function def_refreshVariables_27 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ACTIVITY_RESTRICTION.Name))
    }
    
    // 'def' attribute on InputSetRef (id=related_to) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 58, column 183
    function def_refreshVariables_29 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.RELATED_TO.Name))
    }
    
    // 'def' attribute on InputSetRef (id=subject) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 19, column 180
    function def_refreshVariables_3 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.SUBJECT.Name))
    }
    
    // 'def' attribute on InputSetRef (id=assigned_to) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 61, column 184
    function def_refreshVariables_31 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ASSIGNED_TO.Name))
    }
    
    // 'def' attribute on InputSetRef (id=group_id) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 65, column 157
    function def_refreshVariables_34 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.GROUP_ID.Name))
    }
    
    // 'def' attribute on InputSetRef (id=queue_id) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 69, column 157
    function def_refreshVariables_37 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.QUEUE_ID.Name))
    }
    
    // 'def' attribute on InputSetRef (id=role) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 73, column 153
    function def_refreshVariables_40 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ROLE.Name))
    }
    
    // 'def' attribute on InputSetRef (id=description) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 22, column 186
    function def_refreshVariables_5 (def :  pcf.RuleComparisonRowTextAreaInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.DESCRIPTION.Name))
    }
    
    // 'def' attribute on InputSetRef (id=calendar_importance) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 25, column 202
    function def_refreshVariables_7 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.CALENDAR_IMPORTANCE.Name))
    }
    
    // 'def' attribute on InputSetRef (id=priority) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 28, column 191
    function def_refreshVariables_9 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.PRIORITY.Name))
    }
    
    // 'visible' attribute on InputSetRef (id=group_id) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 65, column 157
    function visible_32 () : java.lang.Boolean {
      return !commandDefinitionDiff.isRowEmpty(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.GROUP_ID.Name)
    }
    
    // 'visible' attribute on InputSetRef (id=queue_id) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 69, column 157
    function visible_35 () : java.lang.Boolean {
      return !commandDefinitionDiff.isRowEmpty(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.QUEUE_ID.Name)
    }
    
    // 'visible' attribute on InputSetRef (id=role) at RuleComparisonCommandParametersInputSet.generateactivity.pcf: line 73, column 153
    function visible_38 () : java.lang.Boolean {
      return !commandDefinitionDiff.isRowEmpty(gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterSet.Config.ROLE.Name)
    }
    
    property get commandDefinitionDiff () : gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition> {
      return getRequireValue("commandDefinitionDiff", 0) as gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition>
    }
    
    property set commandDefinitionDiff ($arg :  gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition>) {
      setRequireValue("commandDefinitionDiff", 0, $arg)
    }
    
    property get controller () : gw.bizrules.pcf.RuleVersionComparisonController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.RuleVersionComparisonController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RuleVersionComparisonController) {
      setRequireValue("controller", 0, $arg)
    }
    
    
  }
  
  
}