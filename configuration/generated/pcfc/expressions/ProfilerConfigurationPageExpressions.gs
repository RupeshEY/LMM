package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerConfigurationPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerConfigurationPageExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerConfigurationPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerConfigurationPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ProfilerConfigurationPage) at ProfilerConfigurationPage.pcf: line 13, column 68
    static function canVisit_2 () : java.lang.Boolean {
      return perm.User.EditProfiler or perm.User.DevAllAccess
    }
    
    // 'def' attribute on ScreenRef at ProfilerConfigurationPage.pcf: line 15, column 66
    function def_onEnter_0 (def :  pcf.ProfilerConfigurationScreen) : void {
      def.onEnter(\ -> {}, \ -> {})
    }
    
    // 'def' attribute on ScreenRef at ProfilerConfigurationPage.pcf: line 15, column 66
    function def_refreshVariables_1 (def :  pcf.ProfilerConfigurationScreen) : void {
      def.refreshVariables(\ -> {}, \ -> {})
    }
    
    // Page (id=ProfilerConfigurationPage) at ProfilerConfigurationPage.pcf: line 13, column 68
    static function parent_3 () : pcf.api.Destination {
      return pcf.Profiler.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ProfilerConfigurationPage {
      return super.CurrentLocation as pcf.ProfilerConfigurationPage
    }
    
    
  }
  
  
}