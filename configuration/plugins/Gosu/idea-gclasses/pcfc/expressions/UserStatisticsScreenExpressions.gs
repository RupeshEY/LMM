package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/statistics/UserStatisticsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserStatisticsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/statistics/UserStatisticsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserStatisticsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=UserStatisticsScreen_RefreshButton) at UserStatisticsScreen.pcf: line 15, column 23
    function action_0 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=UserStatisticsScreen_CloseErrorWindowButton) at UserStatisticsScreen.pcf: line 20, column 23
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on PanelRef at UserStatisticsScreen.pcf: line 24, column 24
    function def_onEnter_2 (def :  pcf.UserStatisticsDV) : void {
      def.onEnter(UserStatsBean)
    }
    
    // 'def' attribute on PanelRef at UserStatisticsScreen.pcf: line 24, column 24
    function def_refreshVariables_3 (def :  pcf.UserStatisticsDV) : void {
      def.refreshVariables(UserStatsBean)
    }
    
    property get UserStatsBean () : UserStatsBean {
      return getRequireValue("UserStatsBean", 0) as UserStatsBean
    }
    
    property set UserStatsBean ($arg :  UserStatsBean) {
      setRequireValue("UserStatsBean", 0, $arg)
    }
    
    
  }
  
  
}