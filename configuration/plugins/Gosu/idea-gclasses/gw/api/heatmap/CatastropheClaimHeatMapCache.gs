package gw.api.heatmap
uses gw.api.system.CCConfigParameters
uses java.util.List
uses gw.pl.persistence.core.Key

/**
 * Caches claim information associated with a catastrophe for the catastrophe heat map. Maps catastrophe ids to lists
 * of CatastropheHeatMap.ClaimLatLong objects, each of which gives enough information to filter and display a claim on
 * the catastrophe heat map.
 * <p>
 * This implementation can be edited by customers if they need to change which catastrophes are preloaded on server
 * startup. The cache refresh interval can be altered via the CatastropheClaimHeatMapCacheRefreshSecs configuration
 * parameter.
 */
@Export
class CatastropheClaimHeatMapCache extends HeatMapCacheBase<Key,List<CatastropheClaimLatLong>> {
  
  construct() {
    super(CCConfigParameters.CatastropheClaimHeatMapCacheRefreshSecs.Value * 1000)
  }

  /**
   * Called by the HeatMapCachePlugin to create the single CatastropheClaimHeatMapCache instance. This
   * method will be called once when the server starts up.
   */
  static function createAndPreload() : CatastropheClaimHeatMapCache {
    var cache = new CatastropheClaimHeatMapCache()
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
  override function load(catastropheId : Key) : List<CatastropheClaimLatLong> {
    return CatastropheClaimDataSet.findClaimsForCatastrophe(catastropheId)
  }

}
