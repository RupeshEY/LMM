package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.GroupStacks.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_GroupStacksExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.GroupStacks.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.GroupStacks.pcf: line 18, column 41
    function def_onEnter_0 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.GroupStacks.pcf: line 44, column 101
    function def_onEnter_12 (def :  pcf.ProfilerFrameGroupLV) : void {
      def.onEnter(profilerDataSource, profilerDataSource.ProfilerFrameGroupSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.GroupStacks.pcf: line 18, column 41
    function def_refreshVariables_1 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.GroupStacks.pcf: line 44, column 101
    function def_refreshVariables_13 (def :  pcf.ProfilerFrameGroupLV) : void {
      def.refreshVariables(profilerDataSource, profilerDataSource.ProfilerFrameGroupSource)
    }
    
    // 'value' attribute on TextInput (id=stacks) at ProfilerResultsCV.GroupStacks.pcf: line 30, column 44
    function valueRoot_5 () : java.lang.Object {
      return profilerDataSource.ProfilerFrameGroupSource
    }
    
    // 'value' attribute on TextInput (id=stacks) at ProfilerResultsCV.GroupStacks.pcf: line 30, column 44
    function value_3 () : java.lang.Integer {
      return profilerDataSource.ProfilerFrameGroupSource.StackCount
    }
    
    // 'value' attribute on TextInput (id=frames) at ProfilerResultsCV.GroupStacks.pcf: line 35, column 44
    function value_6 () : java.lang.Integer {
      return profilerDataSource.ProfilerFrameGroupSource.FrameCount
    }
    
    // 'value' attribute on TextInput (id=time) at ProfilerResultsCV.GroupStacks.pcf: line 40, column 44
    function value_9 () : java.lang.Integer {
      return profilerDataSource.ProfilerFrameGroupSource.TotalElapsedTime
    }
    
    // 'visible' attribute on Card (id=Card) at ProfilerResultsCV.GroupStacks.pcf: line 23, column 69
    function visible_14 () : java.lang.Boolean {
      return profilerDataSource.ProfilerFrameGroupSource != null
    }
    
    // 'visible' attribute on Card (id=Empty) at ProfilerResultsCV.GroupStacks.pcf: line 16, column 69
    function visible_2 () : java.lang.Boolean {
      return profilerDataSource.ProfilerFrameGroupSource == null
    }
    
    property get profilerDataSource () : gw.api.profiler.ProfilerDataSource {
      return getRequireValue("profilerDataSource", 0) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerDataSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setRequireValue("profilerDataSource", 0, $arg)
    }
    
    
  }
  
  
}