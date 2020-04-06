package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/statistics/UserStatisticsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserStatisticsWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/statistics/UserStatisticsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserStatisticsWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at UserStatisticsWorksheet.pcf: line 20, column 50
    function def_onEnter_1 (def :  pcf.UserStatisticsScreen) : void {
      def.onEnter(UserStatsBean)
    }
    
    // 'def' attribute on ScreenRef at UserStatisticsWorksheet.pcf: line 20, column 50
    function def_refreshVariables_2 (def :  pcf.UserStatisticsScreen) : void {
      def.refreshVariables(UserStatsBean)
    }
    
    // 'initialValue' attribute on Variable at UserStatisticsWorksheet.pcf: line 18, column 29
    function initialValue_0 () : UserStatsBean {
      return gw.api.team.UserStatisticsUtil.getStatistics()
    }
    
    override property get CurrentLocation () : pcf.UserStatisticsWorksheet {
      return super.CurrentLocation as pcf.UserStatisticsWorksheet
    }
    
    property get UserStatsBean () : UserStatsBean {
      return getVariableValue("UserStatsBean", 0) as UserStatsBean
    }
    
    property set UserStatsBean ($arg :  UserStatsBean) {
      setVariableValue("UserStatsBean", 0, $arg)
    }
    
    
  }
  
  
}