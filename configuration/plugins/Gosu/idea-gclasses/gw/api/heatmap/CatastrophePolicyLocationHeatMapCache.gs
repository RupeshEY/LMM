package gw.api.heatmap
uses gw.api.system.CCConfigParameters
uses gw.pl.persistence.core.Key
uses java.util.List

/**
 * Caches policy location information associated with a catastrophe for the catastrophe heat map. Maps catastrophe ids to lists
 * of CatastropheHeatMap.PolicyLocationLatLong objects, each of which gives enough information to filter and display a policy location on
 * the catastrophe heat map.
 * <p>
 * This implementation can be edited by customers if they need to change which catastrophes are preloaded on server
 * startup. The cache refresh interval can be altered via the CatastrophePolicyLocationHeatMapCacheRefreshSecs
 * configuration parameter.
 */
@Export
class CatastrophePolicyLocationHeatMapCache extends HeatMapCacheBase<Key,List<CatastrophePolicyLocationLatLong>> {

  construct() {
    super(CCConfigParameters.CatastrophePolicyLocationHeatMapCacheRefreshSecs.Value * 1000)
  }

  /**
   * Called by the HeatMapCachePlugin to create the single CatastrophePolicyLocationHeatMapCache instance. This
   * method will be called once when the server starts up.
   */
  static function createAndPreload() : CatastrophePolicyLocationHeatMapCache {
    var cache = new CatastrophePolicyLocationHeatMapCache()
    for (catastrophe in catastrophesToPreload()) {
      cache.getEntry(catastrophe?.ID).startLoad()
    }
    return cache
  }

  /** Don't preload any catastrophes by default; can be changed by customer */
  private static function catastrophesToPreload() : List<Catastrophe> {
    return {}
  }

  /**
   * Subclasser responsibility, called whenever the cache needs to load or refresh the data for a particular catastrophe
   */
  override function load(catastropheId : Key) : List<CatastrophePolicyLocationLatLong> {
    return CatastrophePolicyLocationDataSet.findPolicyLocationsForCatastrophe(catastropheId)
  }

}
