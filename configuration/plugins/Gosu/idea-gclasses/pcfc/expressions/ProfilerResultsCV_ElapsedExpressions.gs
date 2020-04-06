package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_ElapsedExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=stackName) at ProfilerResultsCV.Elapsed.pcf: line 39, column 44
    function valueRoot_7 () : java.lang.Object {
      return lvStack
    }
    
    // 'value' attribute on TextCell (id=stackName) at ProfilerResultsCV.Elapsed.pcf: line 39, column 44
    function value_5 () : java.lang.String {
      return lvStack.StackName
    }
    
    // 'value' attribute on TextCell (id=frameCount) at ProfilerResultsCV.Elapsed.pcf: line 44, column 48
    function value_8 () : java.lang.Integer {
      return lvStack.FrameCount
    }
    
    property get lvStack () : gw.api.profiler.ProfilerStack {
      return getIteratedValue(2) as gw.api.profiler.ProfilerStack
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ProfilerResultsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.Elapsed.pcf: line 39, column 44
    function sortValue_3 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.StackName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.Elapsed.pcf: line 44, column 48
    function sortValue_4 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.FrameCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.Elapsed.pcf: line 33, column 57
    function value_11 () : gw.api.profiler.ProfilerStack[] {
      return profilerDataSource.ProfilerStacks
    }
    
    property get stack () : gw.api.profiler.ProfilerStack {
      return getCurrentSelection(1) as gw.api.profiler.ProfilerStack
    }
    
    property set stack ($arg :  gw.api.profiler.ProfilerStack) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.Elapsed.pcf: line 18, column 41
    function def_onEnter_0 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.Elapsed.pcf: line 18, column 41
    function def_refreshVariables_1 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'visible' attribute on Card (id=Card) at ProfilerResultsCV.Elapsed.pcf: line 23, column 65
    function visible_15 () : java.lang.Boolean {
      return profilerDataSource.ProfilerStacks.length > 0
    }
    
    // 'visible' attribute on Card (id=Empty) at ProfilerResultsCV.Elapsed.pcf: line 16, column 63
    function visible_2 () : java.lang.Boolean {
      return profilerDataSource.ProfilerStacks.length == 0
    }
    
    property get profilerDataSource () : gw.api.profiler.ProfilerDataSource {
      return getRequireValue("profilerDataSource", 0) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerDataSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setRequireValue("profilerDataSource", 0, $arg)
    }
    
    function createTreeRoot(frame : gw.api.profiler.ProfilerFrame) : gw.api.tree.TreeNode {
      var rootNode = new gw.api.profiler.ProfilerLazyLoadingTreeNode(
                        frame,
                        \x->((x as gw.api.profiler.ProfilerFrame).Children).copy().sortBy(\ p -> -p.ElapsedTime ),
                        \x->((x as gw.api.profiler.ProfilerFrame).Children.Count)
                        )
      return rootNode
    }
    
    function getTreeLabel(node : Object) : String {
       if (node typeis gw.api.profiler.ProfilerFrame) {
        return "[" + node.FrameTime + "/" + node.ElapsedTime + "] " + " (" + node.Tag.Name + ") " + node.PropertiesAndCounters
      } else if (node typeis String) {
        return node
      }
      return "unknown"
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerTreeViewExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'elementLabel' attribute on TreeView (id=ProfilerTreeView) at ProfilerResultsCV.Elapsed.pcf: line 67, column 64
    function elementLabel_12 () : java.lang.Object {
      return getTreeLabel(profilerFrame)
    }
    
    // 'elementName' attribute on TreeView (id=ProfilerTreeView) at ProfilerResultsCV.Elapsed.pcf: line 67, column 64
    function elementValueSetter_13 (__VALUE :  java.lang.Object) : void {
      profilerFrame = __VALUE
    }
    
    // 'value' attribute on TreeView (id=ProfilerTreeView) at ProfilerResultsCV.Elapsed.pcf: line 67, column 64
    function value_14 () : gw.api.tree.TreeNode {
      return createTreeRoot(stack.EntryPointFrame)
    }
    
    property get profilerFrame () : java.lang.Object {
      return getTreeViewValue(2) as java.lang.Object
    }
    
    property set profilerFrame ($arg :  java.lang.Object) {
      setTreeViewValue(2, $arg)
    }
    
    
  }
  
  
}