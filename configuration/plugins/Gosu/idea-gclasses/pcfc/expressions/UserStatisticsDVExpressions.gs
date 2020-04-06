package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/statistics/UserStatisticsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserStatisticsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/statistics/UserStatisticsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserStatisticsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_OpenActivities) at UserStatisticsDV.pcf: line 18, column 40
    function valueRoot_2 () : java.lang.Object {
      return UserStatsBean
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_OpenActivities) at UserStatisticsDV.pcf: line 18, column 40
    function value_0 () : java.lang.Integer {
      return UserStatsBean.OpenActs
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_NewClaims) at UserStatisticsDV.pcf: line 44, column 42
    function value_12 () : java.lang.Integer {
      return UserStatsBean.NewClaims
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_ClosedClaims) at UserStatisticsDV.pcf: line 49, column 42
    function value_15 () : java.lang.Integer {
      return UserStatsBean.ClosedClaims
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_Team_OverdueActivities) at UserStatisticsDV.pcf: line 61, column 42
    function value_19 () : java.lang.Integer {
      return UserStatsBean.TeamOverdueActs
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_Team_OpenClaims) at UserStatisticsDV.pcf: line 66, column 42
    function value_22 () : java.lang.Integer {
      return UserStatsBean.TeamOpenClaims
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_Team_NewClaims) at UserStatisticsDV.pcf: line 71, column 42
    function value_25 () : java.lang.Integer {
      return UserStatsBean.TeamNewClaims
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_Team_ClosedClaims) at UserStatisticsDV.pcf: line 76, column 42
    function value_28 () : java.lang.Integer {
      return UserStatsBean.TeamClosedClaims
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_OverdueActivities) at UserStatisticsDV.pcf: line 23, column 40
    function value_3 () : java.lang.Integer {
      return UserStatsBean.OverdueActs
    }
    
    // 'value' attribute on DateInput (id=Timestamp) at UserStatisticsDV.pcf: line 87, column 48
    function value_32 () : java.util.Date {
      return UserStatsBean.StatsUpdateTime
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_CompletedActivities) at UserStatisticsDV.pcf: line 28, column 40
    function value_6 () : java.lang.Integer {
      return UserStatsBean.CompletedActs
    }
    
    // 'value' attribute on TextInput (id=NVV_Admin_UserStatistics_Statistics_OpenClaims) at UserStatisticsDV.pcf: line 39, column 42
    function value_9 () : java.lang.Integer {
      return UserStatsBean.OpenClaims
    }
    
    // 'visible' attribute on InputSet at UserStatisticsDV.pcf: line 32, column 40
    function visible_18 () : java.lang.Boolean {
      return perm.System.claimown
    }
    
    // 'visible' attribute on InputSet at UserStatisticsDV.pcf: line 54, column 40
    function visible_31 () : java.lang.Boolean {
      return perm.System.viewteam
    }
    
    property get UserStatsBean () : UserStatsBean {
      return getRequireValue("UserStatsBean", 0) as UserStatsBean
    }
    
    property set UserStatsBean ($arg :  UserStatsBean) {
      setRequireValue("UserStatsBean", 0, $arg)
    }
    
    
  }
  
  
}