package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.plugin.policy.refresh.ui.DiffDisplay
uses gw.plugin.policy.refresh.ui.EntityDiffDisplay
uses gw.plugin.policy.refresh.ui.DiffDisplays
@javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyComparisonScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyComparisonScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // RowTree (id=lv2) at PolicyComparisonScreen.pcf: line 34, column 22
    function containerLabel_10 (diff :  java.lang.Object) : java.lang.String {
      return ""
    }
    
    // 'initialValue' attribute on Variable at PolicyComparisonScreen.pcf: line 16, column 43
    function initialValue_0 () : gw.api.tree.RowTreeRootNode {
      return getRowTreeRoot()
    }
    
    // 'initialValue' attribute on Variable at PolicyComparisonScreen.pcf: line 21, column 23
    function initialValue_1 () : boolean {
      return comparisonHasErrors()
    }
    
    // 'sortBy' attribute on RowTree (id=lv2) at PolicyComparisonScreen.pcf: line 42, column 44
    function sortValue_2 (diff :  gw.plugin.policy.refresh.ui.DiffDisplay) : java.lang.Object {
      return getSortBy(diff)
    }
    
    // 'value' attribute on RowTree (id=lv2) at PolicyComparisonScreen.pcf: line 34, column 22
    function value_9 () : java.lang.Object {
      return root
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get hasErrors () : boolean {
      return getVariableValue("hasErrors", 0) as java.lang.Boolean
    }
    
    property set hasErrors ($arg :  boolean) {
      setVariableValue("hasErrors", 0, $arg)
    }
    
    property get root () : gw.api.tree.RowTreeRootNode {
      return getVariableValue("root", 0) as gw.api.tree.RowTreeRootNode
    }
    
    property set root ($arg :  gw.api.tree.RowTreeRootNode) {
      setVariableValue("root", 0, $arg)
    }
    
    property get wizard () : gw.api.policy.refresh.PolicyRefreshAlgorithm {
      return getRequireValue("wizard", 0) as gw.api.policy.refresh.PolicyRefreshAlgorithm
    }
    
    property set wizard ($arg :  gw.api.policy.refresh.PolicyRefreshAlgorithm) {
      setRequireValue("wizard", 0, $arg)
    }
    
    
    function getRowTreeRoot() : gw.api.tree.RowTreeRootNode {
      return new gw.api.tree.RowTreeRootNode({wizard.UI.PolicyDisplay}, 
        \r ->(r typeis gw.plugin.policy.refresh.ui.DiffDisplay) ? DiffDisplays.getVisibleChildren(r) : {}, DiffDisplays.getVisibleChildren(wizard.UI.PolicyDisplay).HasElements ? 1 : 0)
    }
    
    function getSortBy (diff : DiffDisplay) : String {
      return ((diff typeis EntityDiffDisplay) ? "B:" : "A:") + diff.Label
    }
    
    function getFontColor(diff : DiffDisplay) : String {
      return diff.HasDeepChanges ? "red" : "black"
    }
    
    function comparisonHasErrors() : boolean {
      var messages = wizard.Messages
      messages?.display()
      return messages?.containsMessageOfType(ERROR)
    }
    
    function oldValue(diff : DiffDisplay) : String {
      if (not DiffDisplays.getAllChildren(diff).Empty and (diff.Type==CHANGED or (diff.Type==UNCHANGED and diff.HasDeepChanges)))
        return DisplayKey.get("Web.PolicyRefresh.PolicyComparisonScreen.Changed")  // default display key is empty string
      else if ((diff.Type == REMOVED or diff.Type == MOVED_FROM))
        return DisplayKey.get("Web.PolicyRefresh.PolicyComparisonScreen.Check")
      else
        return diff.OldValue?.elide(60)
    }
    
    
    function newValue(diff : DiffDisplay) : String {
      if ((diff.Type == ADDED or diff.Type == MOVED_TO))
        return DisplayKey.get("Web.PolicyRefresh.PolicyComparisonScreen.Check")
      else if (diff.Type == REMOVED or diff.Type == MOVED_FROM)
        return DisplayKey.get("Web.PolicyRefresh.PolicyComparisonScreen.Removed")
      else
        return diff.NewValue?.elide(60)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RowTreeEntryExpressionsImpl extends PolicyComparisonScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=LabelField) at PolicyComparisonScreen.pcf: line 42, column 44
    function value_3 () : java.lang.String {
      return diff.Label?.elide(80)
    }
    
    // 'value' attribute on TextCell (id=OldPolicyField) at PolicyComparisonScreen.pcf: line 47, column 37
    function value_5 () : java.lang.String {
      return oldValue(diff)
    }
    
    // 'value' attribute on TextCell (id=NewPolicyField) at PolicyComparisonScreen.pcf: line 52, column 37
    function value_7 () : java.lang.String {
      return newValue(diff)
    }
    
    property get diff () : gw.plugin.policy.refresh.ui.DiffDisplay {
      return getIteratedValue(1) as gw.plugin.policy.refresh.ui.DiffDisplay
    }
    
    
  }
  
  
}