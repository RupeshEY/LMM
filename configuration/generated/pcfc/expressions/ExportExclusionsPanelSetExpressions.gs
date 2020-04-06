package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExportExclusionsPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportExclusionsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ExportExclusionsPanelSet.pcf: line 45, column 51
    function sortValue_2 (entry :  gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo) : java.lang.Object {
      return entry.DraftVersion.Rule.Name
    }
    
    // 'value' attribute on RowIterator at ExportExclusionsPanelSet.pcf: line 52, column 61
    function sortValue_3 (entry :  gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo) : java.lang.Object {
      return entry.DraftVersion.Rule.AvailableToRun
    }
    
    // 'value' attribute on TextInput (id=Title) at ExportExclusionsPanelSet.pcf: line 28, column 26
    function value_0 () : java.lang.String {
      return title
    }
    
    // 'value' attribute on RowIterator at ExportExclusionsPanelSet.pcf: line 38, column 82
    function value_21 () : gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo[] {
      return exclusions
    }
    
    // 'visible' attribute on PanelSet (id=ExportExclusionsPanelSet) at ExportExclusionsPanelSet.pcf: line 7, column 38
    function visible_22 () : java.lang.Boolean {
      return exclusions.HasElements
    }
    
    // 'visible' attribute on RowIterator at ExportExclusionsPanelSet.pcf: line 59, column 50
    function visible_4 () : java.lang.Boolean {
      return draftVersionColumnVisible
    }
    
    // 'visible' attribute on RowIterator at ExportExclusionsPanelSet.pcf: line 66, column 54
    function visible_5 () : java.lang.Boolean {
      return exportingVersionColumnVisible
    }
    
    property get draftVersionColumnVisible () : boolean {
      return getRequireValue("draftVersionColumnVisible", 0) as java.lang.Boolean
    }
    
    property set draftVersionColumnVisible ($arg :  boolean) {
      setRequireValue("draftVersionColumnVisible", 0, $arg)
    }
    
    property get exclusions () : gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo[] {
      return getRequireValue("exclusions", 0) as gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo[]
    }
    
    property set exclusions ($arg :  gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo[]) {
      setRequireValue("exclusions", 0, $arg)
    }
    
    property get exportingVersionColumnVisible () : boolean {
      return getRequireValue("exportingVersionColumnVisible", 0) as java.lang.Boolean
    }
    
    property set exportingVersionColumnVisible ($arg :  boolean) {
      setRequireValue("exportingVersionColumnVisible", 0, $arg)
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getRequireValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setRequireValue("navigationSupport", 0, $arg)
    }
    
    property get title () : String {
      return getRequireValue("title", 0) as String
    }
    
    property set title ($arg :  String) {
      setRequireValue("title", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ExportExclusionsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=DraftVersion) at ExportExclusionsPanelSet.pcf: line 59, column 50
    function action_15 () : void {
      navigationSupport.pushRuleVersionDetailsPopup(entry.DraftVersion, false)
    }
    
    // 'action' attribute on TextCell (id=ExportingVersion) at ExportExclusionsPanelSet.pcf: line 66, column 54
    function action_19 () : void {
      navigationSupport.pushRuleVersionDetailsPopup(entry.ExportingVersion, false)
    }
    
    // 'action' attribute on TextCell (id=Name) at ExportExclusionsPanelSet.pcf: line 45, column 51
    function action_7 () : void {
      navigationSupport.pushRuleVersionDetailsPopup(entry.DraftVersion, false)
    }
    
    // 'value' attribute on TextCell (id=Name) at ExportExclusionsPanelSet.pcf: line 45, column 51
    function valueRoot_9 () : java.lang.Object {
      return entry.DraftVersion.Rule
    }
    
    // 'value' attribute on BooleanRadioCell (id=AvailableToRun) at ExportExclusionsPanelSet.pcf: line 52, column 61
    function value_10 () : java.lang.Boolean {
      return entry.DraftVersion.Rule.AvailableToRun
    }
    
    // 'value' attribute on TextCell (id=DraftVersion) at ExportExclusionsPanelSet.pcf: line 59, column 50
    function value_14 () : java.lang.String {
      return navigationSupport.VersionController.getLabelForExistingVersion(entry.DraftVersion, false)
    }
    
    // 'value' attribute on TextCell (id=ExportingVersion) at ExportExclusionsPanelSet.pcf: line 66, column 54
    function value_18 () : java.lang.String {
      return navigationSupport.VersionController.getLabelForExistingVersion(entry.ExportingVersion, false)
    }
    
    // 'value' attribute on TextCell (id=Name) at ExportExclusionsPanelSet.pcf: line 45, column 51
    function value_6 () : java.lang.String {
      return entry.DraftVersion.Rule.Name
    }
    
    // 'visible' attribute on TextCell (id=DraftVersion) at ExportExclusionsPanelSet.pcf: line 59, column 50
    function visible_13 () : java.lang.Boolean {
      return draftVersionColumnVisible
    }
    
    // 'visible' attribute on TextCell (id=ExportingVersion) at ExportExclusionsPanelSet.pcf: line 66, column 54
    function visible_17 () : java.lang.Boolean {
      return exportingVersionColumnVisible
    }
    
    property get entry () : gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo {
      return getIteratedValue(1) as gw.bizrules.management.RuleExportRequest.ExcludedDraftInfo
    }
    
    
  }
  
  
}