package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/GroupStatisticsBarChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupStatisticsBarChartExpressions {
  @javax.annotation.Generated("config/web/pcf/team/summary/GroupStatisticsBarChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupStatisticsBarChartExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'categoryLabel' attribute on DataSeries at GroupStatisticsBarChart.pcf: line 29, column 55
    function categoryLabel_0 (value :  gw.api.statistics.Statistics) : java.lang.String {
      return value.Name
    }
    
    // 'dataValues' attribute on DataSeries at GroupStatisticsBarChart.pcf: line 29, column 55
    function dataValues_1 () : java.lang.Object {
      return StatisticsList
    }
    
    // 'height' attribute on ChartPanel (id=GroupStatisticsBarChart) at GroupStatisticsBarChart.pcf: line 10, column 17
    function height_6 () : java.lang.Double {
      return 340
    }
    
    // 'value' attribute on DataSeries at GroupStatisticsBarChart.pcf: line 29, column 55
    function value_2 (value :  gw.api.statistics.Statistics) : java.lang.Object {
      return value.OpenClaims - value.FlaggedClaims
    }
    
    // 'value' attribute on DataSeries at GroupStatisticsBarChart.pcf: line 35, column 36
    function value_5 (value :  gw.api.statistics.Statistics) : java.lang.Object {
      return value.FlaggedClaims
    }
    
    // 'width' attribute on ChartPanel (id=GroupStatisticsBarChart) at GroupStatisticsBarChart.pcf: line 10, column 17
    function width_7 () : java.lang.Double {
      return 800
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    property get StatisticsList () : gw.api.statistics.Statistics[] {
      return getRequireValue("StatisticsList", 0) as gw.api.statistics.Statistics[]
    }
    
    property set StatisticsList ($arg :  gw.api.statistics.Statistics[]) {
      setRequireValue("StatisticsList", 0, $arg)
    }
    
    
  }
  
  
}