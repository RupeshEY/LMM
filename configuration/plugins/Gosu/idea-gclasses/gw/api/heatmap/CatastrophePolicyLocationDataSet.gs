package gw.api.heatmap
uses java.math.BigDecimal
uses java.util.ArrayList
uses gw.api.database.DBFunction
uses gw.api.database.QuerySelectColumns
uses gw.api.database.Relop
uses gw.api.database.Query
uses gw.api.financials.CurrencyAmount
uses gw.api.path.Paths
uses gw.api.util.CurrencyUtil
uses gw.entity.IEntityPropertyInfo
uses gw.pl.persistence.core.Key
uses java.util.List

/**
 * Dataset with policy location data for the catastrophe heat map.  Uses CatastrophePolicyLocationHeatMapCache to share
 * the buffer among all users.  (In clusters, that will be one buffer per cluster member.)
 */
@Export
class CatastrophePolicyLocationDataSet extends HeatMapDataSet {

  static final var LATITUDE = "Latitude"
  static final var LONGITUDE = "Longitude"
  static final var ID = "ID"
  static final var CLAIM_JOIN_COUNT = "ClaimJoinCount"
  static final var TOTAL_INSURED = "TotalInsured"

  var _heatMap : CatastropheHeatMap as HeatMap
  
  construct(aHeatMap : CatastropheHeatMap) {
    HeatMap = aHeatMap
  }


  /**
   * Returns the latitude, longitude and claim ID of geocoded claims associated with the catastrophe.
   * @return  the list of LongLats
   */
  override function mapPointQuery() : List<LatLong> {
    if (HeatMap.CatastropheKey == null or HeatMap.CatastropheKey.Value < 0)  // skip query if catastrophe is being created
      return new ArrayList<CatastrophePolicyLocationLatLong>()

    var result = HeatMapCaches.getCacheWithType(CatastrophePolicyLocationHeatMapCache).getEntry(HeatMap.CatastropheKey).value()
    return result
  }

  override property get MapPoints() : List<LatLong> {
    // fetch value from cache
    return mapPointQuery()
  }

  override function filter(latLong : LatLong) : boolean {
    var policyLocationLatLong = latLong as CatastrophePolicyLocationLatLong
    if (HeatMap.PolicyLocations == null)
      return true // "Any" case
    return HeatMap.PolicyLocations.filter(policyLocationLatLong.HasClaim)
  }
  
  override function getWeight(mapPoint : LatLong) : int {
    if (HeatMap.MapView == HeatMap.MapViews.PolicyTotalView)
      return (mapPoint as CatastrophePolicyLocationLatLong).Amount
    else
      return 1
  }

  /** The query used to initialize the cache */
  static function findPolicyLocationsForCatastrophe(catastropheId : Key) : List<CatastrophePolicyLocationLatLong> {
    var query = Query.make(PolicyLocationSummary)
                     .compare("Catastrophe", Relop.Equals, catastropheId)
    var associatedClaimJoinSummaryProperties = Arrays.asList({PolicyLocationSummary.CLAIMJOIN_PROP.get() as IEntityPropertyInfo, PolicyLocationSummaryJoin.POLICYLOCATIONSUMMARY_PROP.get() as IEntityPropertyInfo})
    var rows = query
        .select({QuerySelectColumns.pathWithAlias(LATITUDE, Paths.make(PolicyLocationSummary#Latitude)),
                 QuerySelectColumns.pathWithAlias(LONGITUDE, Paths.make(PolicyLocationSummary#Longitude)),
                 QuerySelectColumns.pathWithAlias(ID, Paths.make(PolicyLocationSummary#ID)),
                 QuerySelectColumns.dbFunctionWithAlias(CLAIM_JOIN_COUNT, DBFunction.Count(associatedClaimJoinSummaryProperties)),
                 QuerySelectColumns.pathWithAlias(TOTAL_INSURED, Paths.make(PolicyLocationSummary#TotalInsured))})
        .transformQueryRow(\row -> new CatastrophePolicyLocationLatLong(
            row.getColumn(LATITUDE) as double,
            row.getColumn(LONGITUDE) as double,
            row.getColumn(ID) as Key,
            ((row.getColumn(CLAIM_JOIN_COUNT) as int) > 0),
            new CurrencyAmount(row.getColumn(TOTAL_INSURED) as BigDecimal, CurrencyUtil.getDefaultCurrency())))
    return rows.toList()
  }
  
}