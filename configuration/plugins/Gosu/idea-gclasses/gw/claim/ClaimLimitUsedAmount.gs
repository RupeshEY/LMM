package gw.claim

uses gw.api.financials.CurrencyAmount
uses gw.lang.reflect.features.PropertyReference
uses java.util.List

@Export
class ClaimLimitUsedAmount {
  //one instance of this class represents the amount of each component used per claim.
  //These are constructed by the factory method fromClaimAggregateLimitRpts which
  //maps a set of ClaimAggLimitRpts into ClaimLimitUsedAmounts by doing a functional "group by"
  //using the ".partition" CoreArrayEnhancement function in gosu on the input array.

  var _claimInfo : ClaimInfo as ClaimInfo
  var _limitUsed : CurrencyAmount as LimitUsed

  var _reserveTotal : CurrencyAmount as ReserveTotal
  var _nonErodingPaymentTotal : CurrencyAmount as NonErodingPaymentTotal
  var _erodingPaymentTotal : CurrencyAmount as ErodingPaymentTotal
  var _recoveryTotal : CurrencyAmount as RecoveryTotal
  var _recoveryReserveTotal : CurrencyAmount as RecoveryReserveTotal
  var _futureErodingPaymentTotal : CurrencyAmount as FutureErodingPaymentTotal
  var _futureNonErodingPaymentTotal : CurrencyAmount as FutureNonErodingPaymentTotal

  property get Claim() : Claim {
    return _claimInfo.Claim
  }

  property get ClaimNumber() : String {
    return _claimInfo.ClaimNumber
  }
  
  property get Archived() : boolean {
    return _claimInfo.ArchiveState != null
  }

  /**
   * Groups the given ClaimAggregateLimitRpts by ClaimInfo and sums the values below for each claimInfo.
   */
  static function fromClaimAggregateLimitRpts(rpts : ClaimAggregateLimitRpt[]) : ClaimLimitUsedAmount[] {
    return rpts.partition(\ rpt -> rpt.ClaimInfo) //group by ClaimInfo
               .entrySet()  //key is claimInfo, value is List of ClaimAggregateLimitRpts for that claimInfo
               .map(\ entry -> {
                  var c = new ClaimLimitUsedAmount()
                  c.ClaimInfo = entry.Key //ClaimInfo, we grouped by this key.
                  c.LimitUsed = sumCurrencyAmountProperty(ClaimAggregateLimitRpt#LimitUsed, entry.Value)
                  c.ReserveTotal = sumCurrencyAmountProperty(ClaimAggregateLimitRpt#ReserveTotal, entry.Value)
                  c.NonErodingPaymentTotal = sumCurrencyAmountProperty(ClaimAggregateLimitRpt#NonErodingPaymentTotal, entry.Value)
                  c.ErodingPaymentTotal = sumCurrencyAmountProperty(ClaimAggregateLimitRpt#ErodingPaymentTotal, entry.Value)
                  c.RecoveryTotal = sumCurrencyAmountProperty(ClaimAggregateLimitRpt#RecoveryTotal, entry.Value)
                  c.RecoveryReserveTotal = sumCurrencyAmountProperty(ClaimAggregateLimitRpt#RecoveryReserveTotal, entry.Value)
                  c.FutureErodingPaymentTotal = sumCurrencyAmountProperty(ClaimAggregateLimitRpt#FutureErodingPaymentTotal, entry.Value)
                  c.FutureNonErodingPaymentTotal = sumCurrencyAmountProperty(ClaimAggregateLimitRpt#FutureNonErodingPaymentTotal, entry.Value)
                  return c})?.toTypedArray()
  }

  /**
   * Returns the sum of the given property of the given ClaimAggregateLimitRpts. Must be a PropertyReference of a CurrencyAmount Property.
   */
  private static function sumCurrencyAmountProperty(prop : PropertyReference<ClaimAggregateLimitRpt, CurrencyAmount>,
                                                    rpts : List<ClaimAggregateLimitRpt>) : CurrencyAmount {
    return rpts.reduce(null as CurrencyAmount, \ sum, rpt -> sum == null ? prop.get(rpt) : sum.add(prop.get(rpt)))
  }

}
