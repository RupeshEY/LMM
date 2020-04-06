package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CentipedeCacheInfoHistoryExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheInfoHistoryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at CentipedeCacheInfoHistory.pcf: line 20, column 63
    function action_1 () : void {
      pageHelper.reload()
    }
    
    // 'canVisit' attribute on Page (id=CentipedeCacheInfoHistory) at CentipedeCacheInfoHistory.pcf: line 10, column 101
    static function canVisit_50 () : java.lang.Boolean {
      return gw.api.cache2.CacheInfoPageHelper.INSTANCE.NumDaysOfRollupData > 0
    }
    
    // 'dataValues' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 46, column 44
    function dataValues_2 () : java.lang.Object {
      return pageHelper.TodayRollupSnapshot
    }
    
    // 'dataValues' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 52, column 44
    function dataValues_5 () : java.lang.Object {
      return pageHelper.LastWeekRollupSnapshot
    }
    
    // 'height' attribute on ChartPanel (id=SpaceRetainedChart) at CentipedeCacheInfoHistory.pcf: line 31, column 24
    function height_9 () : java.lang.Double {
      return 500
    }
    
    // 'initialValue' attribute on Variable at CentipedeCacheInfoHistory.pcf: line 14, column 49
    function initialValue_0 () : gw.api.cache2.CacheInfoPageHelper {
      return gw.api.cache2.CacheInfoPageHelper.INSTANCE
    }
    
    // 'label' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 80, column 44
    function label_13 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.CacheInfo.TodayRollup") + " (" + DisplayKey.get("Web.InternalTools.InfoPages.CacheInfo.NumHits") + ")"
    }
    
    // 'label' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 86, column 44
    function label_17 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.CacheInfo.TodayRollup") + " (" + DisplayKey.get("Web.InternalTools.InfoPages.CacheInfo.NumMisses") + ")"
    }
    
    // 'label' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 92, column 44
    function label_21 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.String {
      return pageHelper.getLastWeekLabel() + " (" + DisplayKey.get("Web.InternalTools.InfoPages.CacheInfo.NumHits") + ")"
    }
    
    // 'label' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 98, column 44
    function label_25 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.String {
      return pageHelper.getLastWeekLabel() + " (" + DisplayKey.get("Web.InternalTools.InfoPages.CacheInfo.NumMisses") + ")"
    }
    
    // 'label' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 52, column 44
    function label_6 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.String {
      return pageHelper.getLastWeekLabel()
    }
    
    // 'lowerBound' attribute on RangeAxis at CentipedeCacheInfoHistory.pcf: line 74, column 37
    function lowerBound_11 () : java.lang.Double {
      return 0
    }
    
    // Page (id=CentipedeCacheInfoHistory) at CentipedeCacheInfoHistory.pcf: line 10, column 101
    static function parent_51 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfoLG.createDestination()
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 80, column 44
    function value_14 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.Object {
      return value.AverageNumHits
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 86, column 44
    function value_18 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.Object {
      return value.AverageNumMisses
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 46, column 44
    function value_3 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.Object {
      return value.AverageSpaceRetained / 1024
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 126, column 44
    function value_32 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.Object {
      return value.AverageNumMisses + value.AverageNumHits == 0 ? 0 : (value.AverageNumMisses * 100) / (value.AverageNumMisses + value.AverageNumHits)
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 160, column 44
    function value_42 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.Object {
      return value.AverageNumMissesWhenCacheFull
    }
    
    // 'width' attribute on ChartPanel (id=SpaceRetainedChart) at CentipedeCacheInfoHistory.pcf: line 31, column 24
    function width_10 () : java.lang.Double {
      return 1250
    }
    
    // 'xValue' attribute on DataSeries at CentipedeCacheInfoHistory.pcf: line 46, column 44
    function xValue_4 (value :  com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData) : java.lang.Object {
      return value.SliceTimestamp
    }
    
    override property get CurrentLocation () : pcf.CentipedeCacheInfoHistory {
      return super.CurrentLocation as pcf.CentipedeCacheInfoHistory
    }
    
    property get pageHelper () : gw.api.cache2.CacheInfoPageHelper {
      return getVariableValue("pageHelper", 0) as gw.api.cache2.CacheInfoPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.cache2.CacheInfoPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  
}