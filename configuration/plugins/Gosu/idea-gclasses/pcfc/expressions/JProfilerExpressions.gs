package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/JProfiler.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class JProfilerExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/JProfiler.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JProfilerExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (Result :  String) : int {
      return 1
    }
    
    // 'canVisit' attribute on Page (id=JProfiler) at JProfiler.pcf: line 13, column 69
    static function canVisit_21 (Result :  String) : java.lang.Boolean {
      return perm.User.EditJProfiler or perm.User.DevAllAccess
    }
    
    // 'parent' attribute on Page (id=JProfiler) at JProfiler.pcf: line 13, column 69
    static function parent_22 (Result :  String) : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    override property get CurrentLocation () : pcf.JProfiler {
      return super.CurrentLocation as pcf.JProfiler
    }
    
    property get Result () : String {
      return getVariableValue("Result", 0) as String
    }
    
    property set Result ($arg :  String) {
      setVariableValue("Result", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/JProfiler.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JProfilerScreenExpressionsImpl extends JProfilerExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=startthread) at JProfiler.pcf: line 59, column 90
    function action_11 () : void {
      Result = gw.api.tools.InternalToolsUtil.doJProfilerAction("startthread")
    }
    
    // 'action' attribute on ButtonInput (id=stopAndRestartCPUAndThread) at JProfiler.pcf: line 67, column 105
    function action_14 () : void {
      Result = gw.api.tools.InternalToolsUtil.doJProfilerAction("stopAndRestartCPUAndThread")
    }
    
    // 'action' attribute on ButtonInput (id=stop) at JProfiler.pcf: line 75, column 83
    function action_17 () : void {
      Result = gw.api.tools.InternalToolsUtil.doJProfilerAction("stop")
    }
    
    // 'action' attribute on ButtonInput (id=dump) at JProfiler.pcf: line 83, column 83
    function action_20 () : void {
      Result = gw.api.tools.InternalToolsUtil.doJProfilerAction("dump")
    }
    
    // 'action' attribute on ButtonInput (id=startmemory) at JProfiler.pcf: line 43, column 90
    function action_5 () : void {
      Result = gw.api.tools.InternalToolsUtil.doJProfilerAction("startmemory")
    }
    
    // 'action' attribute on ButtonInput (id=startcpu) at JProfiler.pcf: line 51, column 87
    function action_8 () : void {
      Result = gw.api.tools.InternalToolsUtil.doJProfilerAction("startcpu")
    }
    
    // 'available' attribute on ButtonInput (id=startmemory) at JProfiler.pcf: line 43, column 90
    function available_3 () : java.lang.Boolean {
      return JProfilerAvailable
    }
    
    // 'initialValue' attribute on Variable at JProfiler.pcf: line 26, column 25
    function initialValue_0 () : boolean {
      return gw.api.tools.InternalToolsUtil.isJProfilerAvailable()
    }
    
    // 'label' attribute on Verbatim at JProfiler.pcf: line 28, column 25
    function label_1 () : java.lang.String {
      return Result
    }
    
    // 'visible' attribute on AlertBar (id=JProfilerIsNotAvailable) at JProfiler.pcf: line 32, column 43
    function visible_2 () : java.lang.Boolean {
      return not JProfilerAvailable
    }
    
    property get JProfilerAvailable () : boolean {
      return getVariableValue("JProfilerAvailable", 1) as java.lang.Boolean
    }
    
    property set JProfilerAvailable ($arg :  boolean) {
      setVariableValue("JProfilerAvailable", 1, $arg)
    }
    
    
  }
  
  
}