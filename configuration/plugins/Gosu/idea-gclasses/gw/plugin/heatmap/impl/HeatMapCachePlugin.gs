package gw.plugin.heatmap.impl

uses gw.plugin.heatmap.IHeatMapCachePlugin
uses gw.api.heatmap.HeatMapCache
uses gw.api.heatmap.CatastropheClaimHeatMapCache
uses gw.api.heatmap.CatastrophePolicyLocationHeatMapCache
uses java.util.List

/**
 * Default heat map cache plugin implementation, creates cache for the catastrophe claim and catastrophe
 * policy location heat maps.
 * <p>
 * Other caches can be added to the creation list as needed.
 */
@Export
class HeatMapCachePlugin implements IHeatMapCachePlugin {

  override function createCaches() : List<HeatMapCache<Object, Object>> {
    return {
      CatastropheClaimHeatMapCache.createAndPreload(),
      CatastrophePolicyLocationHeatMapCache.createAndPreload()
    }
  }

}
