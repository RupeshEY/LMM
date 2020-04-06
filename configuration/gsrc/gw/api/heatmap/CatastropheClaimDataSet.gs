package gw.api.heatmap

uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.database.spatial.SpatialPoint
uses gw.api.financials.CurrencyAmount
uses gw.api.path.Paths
uses gw.api.util.CurrencyUtil
uses gw.cc.domain.group.GroupFilter
uses gw.pl.persistence.core.Key

uses java.math.BigDecimal
uses java.util.ArrayList
uses java.util.Date
uses java.util.List
uses gw.api.database.DBFunction
uses gw.api.upgrade.Coercions

/**
 * Dataset with claim data for the catastrophe heat map.  Uses CatastropheClaimHeatMapCache to share
 * the buffer among all users.  (In clusters, that will be one buffer per cluster member.)
 */
@Export
class CatastropheClaimDataSet extends HeatMapDataSet {
  static final var OPEN_RESERVES_REPORTING = "OpenReservesReporting"
  static final var TOTAL_PAYMENTS_REPORTING = "TotalPaymentsReporting"
  static final var TOTAL_RECOVERIES_REPORTING = "TotalRecoveriesReporting"
  static final var LOSS_LOCATION_SPATIAL_DENORM = "LossLocationSpatialDenorm"
  static final var CLAIM_ID = "ClaimID"
  static final var STATE = "State"
  static final var GROUP_ID = "GroupID"
  static final var REPORTED_DATE = "ReportedDate"

  var earliestReportedDate : Date
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
      return new ArrayList<CatastropheClaimLatLong>()

    earliestReportedDate = HeatMap.ReportedDateRange != null ? Date.Today.addDays(-(Coercions.makePIntFrom(HeatMap.ReportedDateRange.Code.substring(1)))) : null
    var result = HeatMapCaches.getCacheWithType(CatastropheClaimHeatMapCache).getEntry(HeatMap.CatastropheKey).value()
    return result
  }
    
  override property get MapPoints() : List<LatLong> {
    // fetch value from cache
    return mapPointQuery()
  }

  override function filter(latLong : LatLong) : boolean {
    var claimLatLong = latLong as CatastropheClaimLatLong
    if (HeatMap.ClaimState != null and claimLatLong.State != HeatMap.ClaimState) {
      return false
    }
    if (earliestReportedDate != null and claimLatLong.ReportedDate < earliestReportedDate) {
      return false
    }
    if (HeatMap.AssignedToGroup typeis GroupFilter) {
      if (not HeatMap.AssignedToGroup.filter(claimLatLong.AssignedGroupId)) {
        return false
      }
    } else if (HeatMap.AssignedToGroup typeis Group) {
      if (HeatMap.AssignedToGroup.ID != claimLatLong.AssignedGroupId) {
        return false
      }
    }
    // AssignedToGroup == null means don't filter on assigned group
    return true
  }

  override function getWeight(mapPoint : LatLong) : int {
    if (HeatMap.MapView == HeatMap.MapViews.ClaimTotalView)
      return (mapPoint as CatastropheClaimLatLong).Amount
    else
      return 1
  }
  
  /** The query used to initialize the cache */
  static function findClaimsForCatastrophe(catastropheId : Key) : List<CatastropheClaimLatLong> {
    var query = Query.make(Claim)
    query.compare("Catastrophe", Equals, catastropheId)
    query.compare("LossLocationSpatialDenorm", NotEquals, null)

//    var rows = query
//        .select(\ row -> {
//          var open = row.ClaimRpt.OpenReservesReporting
//          var payments = row.ClaimRpt.TotalPaymentsReporting
//          var recoveries = row.ClaimRpt.TotalRecoveriesReporting
//          var netIncurred = open.addStrict(payments).subtractStrict(recoveries)
//          return new CatastropheClaimLatLong(
//              row.LossLocationSpatialDenorm, row.ID,
//              netIncurred, row.State, row.AssignedGroup?.ID, row.ReportedDate)
//        })
//    var result = rows.toList()

    var row2 = query
      .select({QuerySelectColumns.pathWithAlias(OPEN_RESERVES_REPORTING, Paths.make(Claim#ClaimRpt, ClaimRpt#OpenReservesReporting)),
               QuerySelectColumns.pathWithAlias(TOTAL_PAYMENTS_REPORTING, Paths.make(Claim#ClaimRpt, ClaimRpt#TotalPaymentsReporting)),
               QuerySelectColumns.pathWithAlias(TOTAL_RECOVERIES_REPORTING, Paths.make(Claim#ClaimRpt, ClaimRpt#TotalRecoveriesReporting)),
               QuerySelectColumns.pathWithAlias(LOSS_LOCATION_SPATIAL_DENORM, Claim.LOSSLOCATIONSPATIALDENORM_PROP.get()),
               QuerySelectColumns.pathWithAlias(CLAIM_ID, Paths.make(Claim#ID)),
               QuerySelectColumns.pathWithAlias(STATE, Paths.make(Claim#State)),
               QuerySelectColumns.pathWithAlias(GROUP_ID, Paths.make(Claim#AssignedGroup, Group#ID)),
               QuerySelectColumns.pathWithAlias(REPORTED_DATE, Paths.make(Claim#ReportedDate))
              })
      .transformQueryRow(\row -> {
          var open = new CurrencyAmount(row.getColumn(OPEN_RESERVES_REPORTING) as BigDecimal, CurrencyUtil.getDefaultCurrency())
          var payments = new CurrencyAmount(row.getColumn(TOTAL_PAYMENTS_REPORTING) as BigDecimal, CurrencyUtil.getDefaultCurrency())
          var recoveries = new CurrencyAmount(row.getColumn(TOTAL_RECOVERIES_REPORTING) as BigDecimal, CurrencyUtil.getDefaultCurrency())
          var netIncurred = open.addStrict(payments).subtractStrict(recoveries)
          return new CatastropheClaimLatLong(
              row.getColumn(LOSS_LOCATION_SPATIAL_DENORM) as SpatialPoint,
              row.getColumn(CLAIM_ID) as Key,
              netIncurred,
              row.getColumn(STATE) as ClaimState,
              row.getColumn(GROUP_ID) as Key,
              row.getColumn(REPORTED_DATE) as Date)
      })
    var result2 = row2.toList()
    return result2
  }
}
