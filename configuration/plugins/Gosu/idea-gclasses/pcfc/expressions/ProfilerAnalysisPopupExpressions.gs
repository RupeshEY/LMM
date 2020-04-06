package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerAnalysisPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerAnalysisPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ProfilerAnalysisPopup) at ProfilerAnalysisPopup.pcf: line 13, column 66
    static function canVisit_2 () : java.lang.Boolean {
      return gw.api.tools.InternalTools.isEnabled()
    }
    
    // 'def' attribute on ScreenRef at ProfilerAnalysisPopup.pcf: line 19, column 53
    function def_onEnter_0 (def :  pcf.ProfilerAnalysisScreen) : void {
      def.onEnter(entryPointType)
    }
    
    // 'def' attribute on ScreenRef at ProfilerAnalysisPopup.pcf: line 19, column 53
    function def_refreshVariables_1 (def :  pcf.ProfilerAnalysisScreen) : void {
      def.refreshVariables(entryPointType)
    }
    
    override property get CurrentLocation () : pcf.ProfilerAnalysisPopup {
      return super.CurrentLocation as pcf.ProfilerAnalysisPopup
    }
    
    property get entryPointType () : String {
      return getVariableValue("entryPointType", 0) as String
    }
    
    property set entryPointType ($arg :  String) {
      setVariableValue("entryPointType", 0, $arg)
    }
    
    
  }
  
  
}