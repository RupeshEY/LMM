package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CentipedeCacheInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at CentipedeCacheInfo.pcf: line 20, column 63
    function action_2 () : void {
      pageHelper.reload()
    }
    
    // 'action' attribute on ToolbarButton (id=DownloadButton) at CentipedeCacheInfo.pcf: line 25, column 105
    function action_3 () : void {
      pageHelper.download()
    }
    
    // 'action' attribute on ToolbarButton (id=ClearButton) at CentipedeCacheInfo.pcf: line 30, column 85
    function action_4 () : void {
      com.guidewire.pl.system.dependency.PLDependencies.getGlobalCache().flushCaches()
    }
    
    // 'categoryLabel' attribute on DataSeries at CentipedeCacheInfo.pcf: line 82, column 53
    function categoryLabel_19 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.String {
      return pageHelper.getCategoryLabel(value)
    }
    
    // 'categoryLabel' attribute on DualAxisDataSeries at CentipedeCacheInfo.pcf: line 92, column 43
    function categoryLabel_22 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return pageHelper.getCategoryLabel(value)
    }
    
    // 'dataValues' attribute on DataSeries at CentipedeCacheInfo.pcf: line 82, column 53
    function dataValues_20 () : java.lang.Object {
      return pageHelper.Snapshots
    }
    
    // 'def' attribute on PanelRef at CentipedeCacheInfo.pcf: line 234, column 98
    function def_onEnter_72 (def :  pcf.CentipedeAgeDistributionChart) : void {
      def.onEnter(pageHelper, pageHelper.LatestSnapshot, 500, 700)
    }
    
    // 'def' attribute on PanelRef at CentipedeCacheInfo.pcf: line 241, column 89
    function def_onEnter_75 (def :  pcf.CentipedeCacheContentsChart) : void {
      def.onEnter(pageHelper.CombinedContentsMap, 500, 700)
    }
    
    // 'def' attribute on PanelRef at CentipedeCacheInfo.pcf: line 234, column 98
    function def_refreshVariables_73 (def :  pcf.CentipedeAgeDistributionChart) : void {
      def.refreshVariables(pageHelper, pageHelper.LatestSnapshot, 500, 700)
    }
    
    // 'def' attribute on PanelRef at CentipedeCacheInfo.pcf: line 241, column 89
    function def_refreshVariables_76 (def :  pcf.CentipedeCacheContentsChart) : void {
      def.refreshVariables(pageHelper.CombinedContentsMap, 500, 700)
    }
    
    // 'value' attribute on TextInput (id=StaleTime) at CentipedeCacheInfo.pcf: line 45, column 44
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      (com.guidewire.pl.system.dependency.PLDependencies.getGlobalCache() as com.guidewire.pl.system.cache2.GlobalCacheImpl).CacheStaleTimeMinutes = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=MaxCacheSpace) at CentipedeCacheInfo.pcf: line 39, column 41
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      (com.guidewire.pl.system.dependency.PLDependencies.getGlobalCache() as com.guidewire.pl.system.cache2.GlobalCacheImpl).MaxCacheSpaceKB = (__VALUE_TO_SET as java.lang.Long)
    }
    
    // 'height' attribute on ChartPanel (id=TotalChart) at CentipedeCacheInfo.pcf: line 65, column 27
    function height_26 () : java.lang.Double {
      return 500
    }
    
    // 'initialValue' attribute on Variable at CentipedeCacheInfo.pcf: line 13, column 49
    function initialValue_0 () : gw.api.cache2.CacheInfoPageHelper {
      return gw.api.cache2.CacheInfoPageHelper.INSTANCE
    }
    
    // EditButtons at CentipedeCacheInfo.pcf: line 16, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'lowerBound' attribute on DomainAxis at CentipedeCacheInfo.pcf: line 71, column 41
    function lowerBound_16 () : java.lang.Double {
      return - pageHelper.NumAges
    }
    
    // Page (id=CentipedeCacheInfo) at CentipedeCacheInfo.pcf: line 9, column 87
    static function parent_77 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfoLG.createDestination()
    }
    
    // 'title' attribute on TitleBar at CentipedeCacheInfo.pcf: line 236, column 86
    function title_71 () : java.lang.String {
      return pageHelper.getAgeDistributionLabel(pageHelper.LatestSnapshot)
    }
    
    // 'title' attribute on TitleBar at CentipedeCacheInfo.pcf: line 243, column 112
    function title_74 () : java.lang.String {
      return gw.api.cache2.CacheInfoPageHelper.getCacheContentsLabel(pageHelper.CombinedContentsMap)
    }
    
    // 'upperBound' attribute on DomainAxis at CentipedeCacheInfo.pcf: line 71, column 41
    function upperBound_17 () : java.lang.Double {
      return 0
    }
    
    // 'value' attribute on DateInput (id=Timestamp) at CentipedeCacheInfo.pcf: line 51, column 43
    function valueRoot_15 () : java.lang.Object {
      return pageHelper
    }
    
    // 'value' attribute on TextInput (id=MaxCacheSpace) at CentipedeCacheInfo.pcf: line 39, column 41
    function valueRoot_8 () : java.lang.Object {
      return (com.guidewire.pl.system.dependency.PLDependencies.getGlobalCache() as com.guidewire.pl.system.cache2.GlobalCacheImpl)
    }
    
    // 'value' attribute on DateInput (id=Timestamp) at CentipedeCacheInfo.pcf: line 51, column 43
    function value_13 () : java.util.Date {
      return pageHelper.Timestamp
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 82, column 53
    function value_21 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.SpaceRetained / 1024
    }
    
    // 'value' attribute on DualAxisDataSeries at CentipedeCacheInfo.pcf: line 92, column 43
    function value_25 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumInCache
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 123, column 42
    function value_33 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumMisses
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 129, column 83
    function value_36 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumMisses + value.NumHits /* To make it stacked */
    }
    
    // 'value' attribute on DualAxisDataSeries at CentipedeCacheInfo.pcf: line 138, column 129
    function value_40 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumHits + value.NumMisses == 0 ? 0 : (value.NumMisses * 100) / (value.NumHits + value.NumMisses)
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 172, column 69
    function value_48 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumMissesBecauseEvictedWhenCacheFull
    }
    
    // 'value' attribute on TextInput (id=MaxCacheSpace) at CentipedeCacheInfo.pcf: line 39, column 41
    function value_5 () : java.lang.Long {
      return (com.guidewire.pl.system.dependency.PLDependencies.getGlobalCache() as com.guidewire.pl.system.cache2.GlobalCacheImpl).MaxCacheSpaceKB
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 178, column 65
    function value_51 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumMissesBecauseEvictedDueToReap
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 208, column 60
    function value_58 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumTimesNoneToEvictWhenFull
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 214, column 58
    function value_61 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumEvictsWithinActiveTime
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 220, column 56
    function value_64 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumEvictsDueToCacheFull
    }
    
    // 'value' attribute on DataSeries at CentipedeCacheInfo.pcf: line 226, column 54
    function value_67 (value :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot) : java.lang.Object {
      return value.NumEvictsDueToReaping
    }
    
    // 'value' attribute on TextInput (id=StaleTime) at CentipedeCacheInfo.pcf: line 45, column 44
    function value_9 () : java.lang.Integer {
      return (com.guidewire.pl.system.dependency.PLDependencies.getGlobalCache() as com.guidewire.pl.system.cache2.GlobalCacheImpl).CacheStaleTimeMinutes
    }
    
    // 'visible' attribute on PanelRow at CentipedeCacheInfo.pcf: line 144, column 83
    function visible_70 () : java.lang.Boolean {
      return gw.api.system.PLConfigParameters.GlobalCacheDetailedStats.Value
    }
    
    // 'width' attribute on ChartPanel (id=TotalChart) at CentipedeCacheInfo.pcf: line 65, column 27
    function width_27 () : java.lang.Double {
      return 700
    }
    
    override property get CurrentLocation () : pcf.CentipedeCacheInfo {
      return super.CurrentLocation as pcf.CentipedeCacheInfo
    }
    
    property get pageHelper () : gw.api.cache2.CacheInfoPageHelper {
      return getVariableValue("pageHelper", 0) as gw.api.cache2.CacheInfoPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.cache2.CacheInfoPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  
}