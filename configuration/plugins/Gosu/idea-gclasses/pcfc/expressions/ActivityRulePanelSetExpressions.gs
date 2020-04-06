package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRulePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRulePanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRulePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRulePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ActivityRulePanelSet.pcf: line 25, column 148
    function def_onEnter_1 (def :  pcf.RuleManagementAuditLinkInputSet) : void {
      def.onEnter(gw.bizrules.ActivityRulesNavigationSupport.Instance.VersionController, importingVersion, version)
    }
    
    // 'def' attribute on InputSetRef at ActivityRulePanelSet.pcf: line 69, column 50
    function def_onEnter_24 (def :  pcf.AvailableToRunInputSet) : void {
      def.onEnter(version)
    }
    
    // 'def' attribute on InputSetRef (id=LossTypes) at ActivityRulePanelSet.pcf: line 80, column 29
    function def_onEnter_26 (def :  pcf.ApplicabilityCriteriaInputSet) : void {
      def.onEnter(helper.LossTypesBundle)
    }
    
    // 'def' attribute on InputSetRef (id=PolicyTypes) at ActivityRulePanelSet.pcf: line 83, column 31
    function def_onEnter_28 (def :  pcf.ApplicabilityCriteriaInputSet) : void {
      def.onEnter(helper.PolicyTypesBundle)
    }
    
    // 'def' attribute on InputSetRef (id=Jurisdictions) at ActivityRulePanelSet.pcf: line 86, column 33
    function def_onEnter_30 (def :  pcf.ApplicabilityCriteriaInputSet) : void {
      def.onEnter(helper.JurisdictionsBundle)
    }
    
    // 'def' attribute on PanelRef at ActivityRulePanelSet.pcf: line 91, column 77
    function def_onEnter_32 (def :  pcf.ConditionBuilderPanelSet) : void {
      def.onEnter(controller.ConditionBuilderController)
    }
    
    // 'def' attribute on PanelRef at ActivityRulePanelSet.pcf: line 97, column 62
    function def_onEnter_34 (def :  pcf.RuleCommandDefinitionsListDetailView) : void {
      def.onEnter(controller)
    }
    
    // 'def' attribute on InputSetRef at ActivityRulePanelSet.pcf: line 25, column 148
    function def_refreshVariables_2 (def :  pcf.RuleManagementAuditLinkInputSet) : void {
      def.refreshVariables(gw.bizrules.ActivityRulesNavigationSupport.Instance.VersionController, importingVersion, version)
    }
    
    // 'def' attribute on InputSetRef at ActivityRulePanelSet.pcf: line 69, column 50
    function def_refreshVariables_25 (def :  pcf.AvailableToRunInputSet) : void {
      def.refreshVariables(version)
    }
    
    // 'def' attribute on InputSetRef (id=LossTypes) at ActivityRulePanelSet.pcf: line 80, column 29
    function def_refreshVariables_27 (def :  pcf.ApplicabilityCriteriaInputSet) : void {
      def.refreshVariables(helper.LossTypesBundle)
    }
    
    // 'def' attribute on InputSetRef (id=PolicyTypes) at ActivityRulePanelSet.pcf: line 83, column 31
    function def_refreshVariables_29 (def :  pcf.ApplicabilityCriteriaInputSet) : void {
      def.refreshVariables(helper.PolicyTypesBundle)
    }
    
    // 'def' attribute on InputSetRef (id=Jurisdictions) at ActivityRulePanelSet.pcf: line 86, column 33
    function def_refreshVariables_31 (def :  pcf.ApplicabilityCriteriaInputSet) : void {
      def.refreshVariables(helper.JurisdictionsBundle)
    }
    
    // 'def' attribute on PanelRef at ActivityRulePanelSet.pcf: line 91, column 77
    function def_refreshVariables_33 (def :  pcf.ConditionBuilderPanelSet) : void {
      def.refreshVariables(controller.ConditionBuilderController)
    }
    
    // 'def' attribute on PanelRef at ActivityRulePanelSet.pcf: line 97, column 62
    function def_refreshVariables_35 (def :  pcf.RuleCommandDefinitionsListDetailView) : void {
      def.refreshVariables(controller)
    }
    
    // 'value' attribute on TypeKeyInput (id=RuleContextDefinitionKey) at ActivityRulePanelSet.pcf: line 49, column 28
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      controller.RuleContextDefinitionKey = (__VALUE_TO_SET as typekey.RuleContextDefinitionKey)
    }
    
    // 'value' attribute on TypeKeyInput (id=TriggeringPointKey) at ActivityRulePanelSet.pcf: line 65, column 28
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      version.Rule.TriggeringPointKey = (__VALUE_TO_SET as typekey.TriggeringPointKey)
    }
    
    // 'value' attribute on TextInput (id=Name) at ActivityRulePanelSet.pcf: line 32, column 37
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      version.Rule.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ActivityRulePanelSet.pcf: line 41, column 45
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      version.Rule.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on PanelSet (id=ActivityRulePanelSet) at ActivityRulePanelSet.pcf: line 7, column 31
    function editable_36 () : java.lang.Boolean {
      return version.Rule.Editable
    }
    
    // 'filter' attribute on TypeKeyInput (id=TriggeringPointKey) at ActivityRulePanelSet.pcf: line 65, column 28
    function filter_23 (VALUE :  typekey.TriggeringPointKey, VALUES :  typekey.TriggeringPointKey[]) : java.lang.Boolean {
      return gw.bizrules.BizRulesComponentMapper.getInstance().isSupportedContextForTriggeringPoint(VALUE, controller.RuleContextDefinitionKey)
    }
    
    // 'initialValue' attribute on Variable at ActivityRulePanelSet.pcf: line 21, column 54
    function initialValue_0 () : gw.bizrules.ActivityRulePanelSetHelper {
      return new gw.bizrules.ActivityRulePanelSetHelper(version, CurrentLocation)
    }
    
    // 'onChange' attribute on PostOnChange at ActivityRulePanelSet.pcf: line 52, column 42
    function onChange_11 () : void {
      if (!gw.bizrules.BizRulesComponentMapper.getInstance().isSupportedContextForTriggeringPoint(version.Rule.TriggeringPointKey, controller.RuleContextDefinitionKey)) {version.Rule.TriggeringPointKey = null}
    }
    
    // 'value' attribute on TypeKeyInput (id=RuleContextDefinitionKey) at ActivityRulePanelSet.pcf: line 49, column 28
    function valueRoot_15 () : java.lang.Object {
      return controller
    }
    
    // 'value' attribute on TextInput (id=Name) at ActivityRulePanelSet.pcf: line 32, column 37
    function valueRoot_6 () : java.lang.Object {
      return version.Rule
    }
    
    // 'value' attribute on TypeKeyInput (id=RuleContextDefinitionKey) at ActivityRulePanelSet.pcf: line 49, column 28
    function value_12 () : typekey.RuleContextDefinitionKey {
      return controller.RuleContextDefinitionKey
    }
    
    // 'value' attribute on TextInput (id=ContextDescription) at ActivityRulePanelSet.pcf: line 56, column 67
    function value_16 () : java.lang.String {
      return controller.RuleContextDefinitionKeyDescription
    }
    
    // 'value' attribute on TypeKeyInput (id=TriggeringPointKey) at ActivityRulePanelSet.pcf: line 65, column 28
    function value_19 () : typekey.TriggeringPointKey {
      return version.Rule.TriggeringPointKey
    }
    
    // 'value' attribute on TextInput (id=Name) at ActivityRulePanelSet.pcf: line 32, column 37
    function value_3 () : java.lang.String {
      return version.Rule.Name
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ActivityRulePanelSet.pcf: line 41, column 45
    function value_7 () : java.lang.String {
      return version.Rule.Description
    }
    
    property get controller () : gw.bizrules.pcf.RulePageController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.RulePageController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RulePageController) {
      setRequireValue("controller", 0, $arg)
    }
    
    property get helper () : gw.bizrules.ActivityRulePanelSetHelper {
      return getVariableValue("helper", 0) as gw.bizrules.ActivityRulePanelSetHelper
    }
    
    property set helper ($arg :  gw.bizrules.ActivityRulePanelSetHelper) {
      setVariableValue("helper", 0, $arg)
    }
    
    property get importingVersion () : boolean {
      return getRequireValue("importingVersion", 0) as java.lang.Boolean
    }
    
    property set importingVersion ($arg :  boolean) {
      setRequireValue("importingVersion", 0, $arg)
    }
    
    property get version () : ActivityRuleVersion {
      return getRequireValue("version", 0) as ActivityRuleVersion
    }
    
    property set version ($arg :  ActivityRuleVersion) {
      setRequireValue("version", 0, $arg)
    }
    
    
  }
  
  
}