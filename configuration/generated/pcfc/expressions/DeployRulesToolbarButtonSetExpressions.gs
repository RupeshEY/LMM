package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/DeployRulesToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DeployRulesToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/DeployRulesToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeployRulesToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=DeploySelected) at DeployRulesToolbarButtonSet.pcf: line 34, column 25
    function action_2 () : void {
      gw.bizrules.pcf.RuleDeploymentPageHelper.deployFromList(navigationSupport, checkedValuesAccessor.CheckedValues)
    }
    
    // 'action' attribute on MenuItem (id=DeployAll) at DeployRulesToolbarButtonSet.pcf: line 40, column 25
    function action_4 () : void {
      gw.bizrules.pcf.RuleDeploymentPageHelper.deployFromQuery(navigationSupport, visibleRulesQuery)
    }
    
    // 'available' attribute on MenuItem (id=DeploySelected) at DeployRulesToolbarButtonSet.pcf: line 34, column 25
    function available_1 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canDeployRule(null)
    }
    
    // 'initialValue' attribute on Variable at DeployRulesToolbarButtonSet.pcf: line 23, column 80
    function initialValue_0 () : gw.bizrules.pcf.IteratorCheckedValuesAccessor<RuleVersion> {
      return gw.bizrules.pcf.IteratorCheckedValuesAccessor.create(CurrentLocation, iteratorId, RuleVersion)
    }
    
    // 'tooltip' attribute on ToolbarButton (id=DeployButton) at DeployRulesToolbarButtonSet.pcf: line 28, column 93
    function tooltip_6 () : java.lang.String {
      return gw.bizrules.pcf.RulePermissionUIHelper.checkAndGetDeployPermissionMsg(null)
    }
    
    property get checkedValuesAccessor () : gw.bizrules.pcf.IteratorCheckedValuesAccessor<RuleVersion> {
      return getVariableValue("checkedValuesAccessor", 0) as gw.bizrules.pcf.IteratorCheckedValuesAccessor<RuleVersion>
    }
    
    property set checkedValuesAccessor ($arg :  gw.bizrules.pcf.IteratorCheckedValuesAccessor<RuleVersion>) {
      setVariableValue("checkedValuesAccessor", 0, $arg)
    }
    
    property get iteratorId () : String {
      return getRequireValue("iteratorId", 0) as String
    }
    
    property set iteratorId ($arg :  String) {
      setRequireValue("iteratorId", 0, $arg)
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getRequireValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setRequireValue("navigationSupport", 0, $arg)
    }
    
    property get visibleRulesQuery () : gw.api.database.Query<RuleVersion> {
      return getRequireValue("visibleRulesQuery", 0) as gw.api.database.Query<RuleVersion>
    }
    
    property set visibleRulesQuery ($arg :  gw.api.database.Query<RuleVersion>) {
      setRequireValue("visibleRulesQuery", 0, $arg)
    }
    
    
  }
  
  
}