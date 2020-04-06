package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/reports/Reports.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReportsExpressions {
  @javax.annotation.Generated("config/web/pcf/reports/Reports.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on LocationGroup (id=Reports) at Reports.pcf: line 9, column 62
    static function canVisit_0 () : java.lang.Boolean {
      return perm.System.reporting_view and com.guidewire.pl.system.dependency.PLDependencies.getPluginConfig().isStartablePluginStarted(gw.plugin.cognos.CognosPlugin)
    }
    
    // LocationGroup (id=Reports) at Reports.pcf: line 9, column 62
    static function firstVisitableChildDestinationMethod_5 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.CognosReport.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ReportsConfigWarningPage.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuLinks' attribute on LocationGroup (id=Reports) at Reports.pcf: line 9, column 62
    function menuLinks_onEnter_1 (def :  pcf.BlankMenuLinks) : void {
      def.onEnter()
    }
    
    // 'menuLinks' attribute on LocationGroup (id=Reports) at Reports.pcf: line 9, column 62
    function menuLinks_refreshVariables_2 (def :  pcf.BlankMenuLinks) : void {
      def.refreshVariables()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Reports) at Reports.pcf: line 9, column 62
    function tabBar_onEnter_3 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Reports) at Reports.pcf: line 9, column 62
    function tabBar_refreshVariables_4 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Reports {
      return super.CurrentLocation as pcf.Reports
    }
    
    
  }
  
  
}