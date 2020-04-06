package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleListMoreButtonMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleListMoreButtonMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=Import) at RuleListMoreButtonMenuItemSet.pcf: line 24, column 86
    function action_2 () : void {
      StartRuleImportPopup.push(navigationSupport)
    }
    
    // 'action' attribute on MenuItem (id=ExportSelected) at RuleListMoreButtonMenuItemSet.pcf: line 28, column 86
    function action_4 () : void {
      gw.bizrules.pcf.RuleExportPageHelper.exportSelected(navigationSupport, checkedValuesAccessor.CheckedValues)
    }
    
    // 'action' attribute on MenuItem (id=ExportAll) at RuleListMoreButtonMenuItemSet.pcf: line 32, column 81
    function action_5 () : void {
      gw.bizrules.pcf.RuleExportPageHelper.exportAll(navigationSupport, allQuery)
    }
    
    // 'action' attribute on MenuItem (id=Import) at RuleListMoreButtonMenuItemSet.pcf: line 24, column 86
    function action_dest_3 () : pcf.api.Destination {
      return pcf.StartRuleImportPopup.createDestination(navigationSupport)
    }
    
    // 'available' attribute on MenuItem (id=Import) at RuleListMoreButtonMenuItemSet.pcf: line 24, column 86
    function available_1 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'initialValue' attribute on Variable at RuleListMoreButtonMenuItemSet.pcf: line 19, column 80
    function initialValue_0 () : gw.bizrules.pcf.IteratorCheckedValuesAccessor<RuleVersion> {
      return gw.bizrules.pcf.IteratorCheckedValuesAccessor.create(CurrentLocation, iteratorId, RuleVersion)
    }
    
    property get allQuery () : gw.api.database.Query<RuleVersion> {
      return getRequireValue("allQuery", 0) as gw.api.database.Query<RuleVersion>
    }
    
    property set allQuery ($arg :  gw.api.database.Query<RuleVersion>) {
      setRequireValue("allQuery", 0, $arg)
    }
    
    property get checkedValuesAccessor () : gw.bizrules.pcf.IteratorCheckedValuesAccessor<RuleVersion> {
      return getVariableValue("checkedValuesAccessor", 0) as gw.bizrules.pcf.IteratorCheckedValuesAccessor<RuleVersion>
    }
    
    property set checkedValuesAccessor ($arg :  gw.bizrules.pcf.IteratorCheckedValuesAccessor<RuleVersion>) {
      setVariableValue("checkedValuesAccessor", 0, $arg)
    }
    
    property get iteratorId () : java.lang.String {
      return getRequireValue("iteratorId", 0) as java.lang.String
    }
    
    property set iteratorId ($arg :  java.lang.String) {
      setRequireValue("iteratorId", 0, $arg)
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getRequireValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setRequireValue("navigationSupport", 0, $arg)
    }
    
    
  }
  
  
}