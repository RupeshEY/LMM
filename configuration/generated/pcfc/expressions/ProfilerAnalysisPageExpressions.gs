package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerAnalysisPageExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerAnalysisPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (entryPointType :  String) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at ProfilerAnalysisPage.pcf: line 20, column 53
    function def_onEnter_0 (def :  pcf.ProfilerAnalysisScreen) : void {
      def.onEnter(entryPointType)
    }
    
    // 'def' attribute on ScreenRef at ProfilerAnalysisPage.pcf: line 20, column 53
    function def_refreshVariables_1 (def :  pcf.ProfilerAnalysisScreen) : void {
      def.refreshVariables(entryPointType)
    }
    
    // Page (id=ProfilerAnalysisPage) at ProfilerAnalysisPage.pcf: line 13, column 63
    static function parent_2 (entryPointType :  String) : pcf.api.Destination {
      return pcf.ProfilerAnalysisLG.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ProfilerAnalysisPage {
      return super.CurrentLocation as pcf.ProfilerAnalysisPage
    }
    
    property get entryPointType () : java.lang.String {
      return getVariableValue("entryPointType", 0) as java.lang.String
    }
    
    property set entryPointType ($arg :  java.lang.String) {
      setVariableValue("entryPointType", 0, $arg)
    }
    
    
  }
  
  
}