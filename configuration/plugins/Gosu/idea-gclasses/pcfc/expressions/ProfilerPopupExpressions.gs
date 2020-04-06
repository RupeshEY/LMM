package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ProfilerPopup) at ProfilerPopup.pcf: line 13, column 54
    static function canVisit_2 () : java.lang.Boolean {
      return perm.User.EditProfiler or perm.User.DevAllAccess
    }
    
    // 'def' attribute on ScreenRef at ProfilerPopup.pcf: line 15, column 144
    function def_onEnter_0 (def :  pcf.ProfilerConfigurationScreen) : void {
      def.onEnter(\ -> {CurrentLocation.cancel()}, \ -> {CurrentLocation.cancel(); ProfilerAnalysisPopup.push()})
    }
    
    // 'def' attribute on ScreenRef at ProfilerPopup.pcf: line 15, column 144
    function def_refreshVariables_1 (def :  pcf.ProfilerConfigurationScreen) : void {
      def.refreshVariables(\ -> {CurrentLocation.cancel()}, \ -> {CurrentLocation.cancel(); ProfilerAnalysisPopup.push()})
    }
    
    override property get CurrentLocation () : pcf.ProfilerPopup {
      return super.CurrentLocation as pcf.ProfilerPopup
    }
    
    
  }
  
  
}