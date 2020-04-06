package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeAgeDistributionChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CentipedeAgeDistributionChartExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeAgeDistributionChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeAgeDistributionChartExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'categoryLabel' attribute on DataSeries at CentipedeAgeDistributionChart.pcf: line 42, column 29
    function categoryLabel_1 (value :  gw.util.Pair<java.lang.String, java.lang.Integer>) : java.lang.String {
      return value.First
    }
    
    // 'dataValues' attribute on DataSeries at CentipedeAgeDistributionChart.pcf: line 42, column 29
    function dataValues_2 () : java.lang.Object {
      return dataSeries
    }
    
    // 'height' attribute on ChartPanel (id=CentipedeAgeDistributionChart) at CentipedeAgeDistributionChart.pcf: line 11, column 19
    function height_4 () : java.lang.Double {
      return height
    }
    
    // 'initialValue' attribute on Variable at CentipedeAgeDistributionChart.pcf: line 28, column 98
    function initialValue_0 () : java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>> {
      return pageHelper.getDataSeriesForSizeDistribution(snapshot)
    }
    
    // 'label' attribute on ChartPanel (id=CentipedeAgeDistributionChart) at CentipedeAgeDistributionChart.pcf: line 11, column 19
    function label_5 () : java.lang.String {
      return pageHelper.getAgeDistributionLabel(snapshot)
    }
    
    // 'value' attribute on DataSeries at CentipedeAgeDistributionChart.pcf: line 42, column 29
    function value_3 (value :  gw.util.Pair<java.lang.String, java.lang.Integer>) : java.lang.Object {
      return value.Second
    }
    
    // 'width' attribute on ChartPanel (id=CentipedeAgeDistributionChart) at CentipedeAgeDistributionChart.pcf: line 11, column 19
    function width_6 () : java.lang.Double {
      return width
    }
    
    property get dataSeries () : java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>> {
      return getVariableValue("dataSeries", 0) as java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>>
    }
    
    property set dataSeries ($arg :  java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>>) {
      setVariableValue("dataSeries", 0, $arg)
    }
    
    property get height () : int {
      return getRequireValue("height", 0) as java.lang.Integer
    }
    
    property set height ($arg :  int) {
      setRequireValue("height", 0, $arg)
    }
    
    property get pageHelper () : gw.api.cache2.CacheInfoPageHelper {
      return getRequireValue("pageHelper", 0) as gw.api.cache2.CacheInfoPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.cache2.CacheInfoPageHelper) {
      setRequireValue("pageHelper", 0, $arg)
    }
    
    property get snapshot () : com.guidewire.pl.system.cache2.CacheStatisticsSnapshot {
      return getRequireValue("snapshot", 0) as com.guidewire.pl.system.cache2.CacheStatisticsSnapshot
    }
    
    property set snapshot ($arg :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) {
      setRequireValue("snapshot", 0, $arg)
    }
    
    property get width () : int {
      return getRequireValue("width", 0) as java.lang.Integer
    }
    
    property set width ($arg :  int) {
      setRequireValue("width", 0, $arg)
    }
    
    
  }
  
  
}