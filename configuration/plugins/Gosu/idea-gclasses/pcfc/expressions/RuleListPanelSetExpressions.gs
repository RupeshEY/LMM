package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleListPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleListPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleListPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleListPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at RuleListPanelSet.pcf: line 41, column 38
    function action_6 () : void {
      navigationSupport.pushRuleVersionDetailsPopup(entry, false)
    }
    
    // 'value' attribute on TextCell (id=Name) at RuleListPanelSet.pcf: line 41, column 38
    function valueRoot_8 () : java.lang.Object {
      return entry.Rule
    }
    
    // 'value' attribute on TextCell (id=Status) at RuleListPanelSet.pcf: line 54, column 54
    function value_12 () : java.lang.String {
      return pageHelper.getStatusText(entry)
    }
    
    // 'value' attribute on TextCell (id=Name) at RuleListPanelSet.pcf: line 41, column 38
    function value_5 () : java.lang.String {
      return entry.Rule.Name
    }
    
    // 'value' attribute on BooleanRadioCell (id=AvailableToRun) at RuleListPanelSet.pcf: line 49, column 48
    function value_9 () : java.lang.Boolean {
      return entry.Rule.AvailableToRun
    }
    
    property get entry () : RuleVersion {
      return getIteratedValue(1) as RuleVersion
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleListPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleListPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at RuleListPanelSet.pcf: line 17, column 50
    function initialValue_0 () : gw.bizrules.pcf.RuleListPageHelper {
      return new gw.bizrules.pcf.RuleListPageHelper(navigationSupport.VersionController)
    }
    
    // 'value' attribute on TextInput (id=Description) at RuleListPanelSet.pcf: line 24, column 43
    function valueRoot_3 () : java.lang.Object {
      return dataHolder
    }
    
    // 'value' attribute on TextInput (id=Description) at RuleListPanelSet.pcf: line 24, column 43
    function value_1 () : java.lang.String {
      return dataHolder.Description
    }
    
    // 'value' attribute on RowIterator at RuleListPanelSet.pcf: line 34, column 73
    function value_14 () : gw.api.database.IQueryBeanResult<RuleVersion> {
      return dataHolder.Entries
    }
    
    // 'visible' attribute on PanelSet (id=RuleListPanelSet) at RuleListPanelSet.pcf: line 7, column 62
    function visible_15 () : java.lang.Boolean {
      return dataHolder.VisibleIfEmpty || !dataHolder.Empty
    }
    
    // 'visible' attribute on DetailViewPanel at RuleListPanelSet.pcf: line 19, column 87
    function visible_4 () : java.lang.Boolean {
      return !org.apache.commons.lang3.StringUtils.isEmpty(dataHolder.Description)
    }
    
    property get dataHolder () : gw.bizrules.pcf.LVDataHolder<RuleVersion> {
      return getRequireValue("dataHolder", 0) as gw.bizrules.pcf.LVDataHolder<RuleVersion>
    }
    
    property set dataHolder ($arg :  gw.bizrules.pcf.LVDataHolder<RuleVersion>) {
      setRequireValue("dataHolder", 0, $arg)
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getRequireValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setRequireValue("navigationSupport", 0, $arg)
    }
    
    property get pageHelper () : gw.bizrules.pcf.RuleListPageHelper {
      return getVariableValue("pageHelper", 0) as gw.bizrules.pcf.RuleListPageHelper
    }
    
    property set pageHelper ($arg :  gw.bizrules.pcf.RuleListPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  
}