package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ChooseExisting) at RuleComparisonToolbarButtonSet.pcf: line 22, column 46
    function action_1 () : void {
      importHelper.resolveConflict(importEntry, TC_EXISTING); CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=ChooseImporting) at RuleComparisonToolbarButtonSet.pcf: line 28, column 46
    function action_3 () : void {
      importHelper.resolveConflict(importEntry, TC_IMPORTING); CurrentLocation.cancel()
    }
    
    // 'action' attribute on MenuItem (id=Existing) at RuleComparisonToolbarButtonSet.pcf: line 40, column 68
    function action_5 () : void {
      navSupport.pushRuleComparisonEditPopup(importEntry, importHelper, TC_EXISTING)
    }
    
    // 'action' attribute on MenuItem (id=Importing) at RuleComparisonToolbarButtonSet.pcf: line 46, column 68
    function action_7 () : void {
      navSupport.pushRuleComparisonEditPopup(importEntry, importHelper, TC_IMPORTING)
    }
    
    // 'available' attribute on ToolbarButton (id=EditNewMerge) at RuleComparisonToolbarButtonSet.pcf: line 34, column 102
    function available_8 () : java.lang.Boolean {
      return not importEntry.ExistingVersionDraft
    }
    
    // 'visible' attribute on ToolbarButton (id=ChooseExisting) at RuleComparisonToolbarButtonSet.pcf: line 22, column 46
    function visible_0 () : java.lang.Boolean {
      return importEntry.Status.Conflict
    }
    
    // 'visible' attribute on MenuItem (id=Existing) at RuleComparisonToolbarButtonSet.pcf: line 40, column 68
    function visible_4 () : java.lang.Boolean {
      return importEntry.Status != TC_EDITEDRESOLVEDCONFLICT
    }
    
    // 'visible' attribute on ToolbarButton (id=EditNewMerge) at RuleComparisonToolbarButtonSet.pcf: line 34, column 102
    function visible_9 () : java.lang.Boolean {
      return importEntry.Status.Conflict and gw.bizrules.pcf.RulePermissionUIHelper.canEditRule()
    }
    
    property get importEntry () : RuleImportTaskEntry {
      return getRequireValue("importEntry", 0) as RuleImportTaskEntry
    }
    
    property set importEntry ($arg :  RuleImportTaskEntry) {
      setRequireValue("importEntry", 0, $arg)
    }
    
    property get importHelper () : gw.bizrules.pcf.RuleExportImportPageHelper {
      return getRequireValue("importHelper", 0) as gw.bizrules.pcf.RuleExportImportPageHelper
    }
    
    property set importHelper ($arg :  gw.bizrules.pcf.RuleExportImportPageHelper) {
      setRequireValue("importHelper", 0, $arg)
    }
    
    property get navSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getRequireValue("navSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setRequireValue("navSupport", 0, $arg)
    }
    
    
  }
  
  
}