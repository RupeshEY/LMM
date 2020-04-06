package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CentipedeCacheInfoDetailsExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheInfoDetailsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at CentipedeCacheInfoDetails.pcf: line 19, column 63
    function action_1 () : void {
      pageHelper.reload()
    }
    
    // 'initialValue' attribute on Variable at CentipedeCacheInfoDetails.pcf: line 13, column 49
    function initialValue_0 () : gw.api.cache2.CacheInfoPageHelper {
      return gw.api.cache2.CacheInfoPageHelper.INSTANCE
    }
    
    // Page (id=CentipedeCacheInfoDetails) at CentipedeCacheInfoDetails.pcf: line 9, column 87
    static function parent_8 () : pcf.api.Destination {
      return pcf.CentipedeCacheInfoLG.createDestination()
    }
    
    // 'value' attribute on PanelIterator (id=AgeDistributionIterator) at CentipedeCacheInfoDetails.pcf: line 33, column 82
    function value_4 () : com.guidewire.pl.system.cache2.CacheStatisticsSnapshot[] {
      return pageHelper.Snapshots.reverse()
    }
    
    // 'value' attribute on PanelIterator (id=ContentsMapIterator) at CentipedeCacheInfoDetails.pcf: line 49, column 174
    function value_7 () : java.util.ArrayList<gw.util.Pair<java.lang.Integer, java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>>>> {
      return pageHelper.ContentsMapByAge
    }
    
    override property get CurrentLocation () : pcf.CentipedeCacheInfoDetails {
      return super.CurrentLocation as pcf.CentipedeCacheInfoDetails
    }
    
    property get pageHelper () : gw.api.cache2.CacheInfoPageHelper {
      return getVariableValue("pageHelper", 0) as gw.api.cache2.CacheInfoPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.cache2.CacheInfoPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends CentipedeCacheInfoDetailsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at CentipedeCacheInfoDetails.pcf: line 51, column 73
    function def_onEnter_5 (def :  pcf.CentipedeCacheContentsChart) : void {
      def.onEnter(contentsMap, 600, 600)
    }
    
    // 'def' attribute on PanelRef at CentipedeCacheInfoDetails.pcf: line 51, column 73
    function def_refreshVariables_6 (def :  pcf.CentipedeCacheContentsChart) : void {
      def.refreshVariables(contentsMap, 600, 600)
    }
    
    property get contentsMap () : gw.util.Pair<java.lang.Integer, java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>>> {
      return getIteratedValue(1) as gw.util.Pair<java.lang.Integer, java.util.ArrayList<gw.util.Pair<java.lang.String, java.lang.Integer>>>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CentipedeCacheInfoDetailsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at CentipedeCacheInfoDetails.pcf: line 35, column 84
    function def_onEnter_2 (def :  pcf.CentipedeAgeDistributionChart) : void {
      def.onEnter(pageHelper, snapshot, 200, 300)
    }
    
    // 'def' attribute on PanelRef at CentipedeCacheInfoDetails.pcf: line 35, column 84
    function def_refreshVariables_3 (def :  pcf.CentipedeAgeDistributionChart) : void {
      def.refreshVariables(pageHelper, snapshot, 200, 300)
    }
    
    property get snapshot () : com.guidewire.pl.system.cache2.CacheStatisticsSnapshot {
      return getIteratedValue(1) as com.guidewire.pl.system.cache2.CacheStatisticsSnapshot
    }
    
    
  }
  
  
}