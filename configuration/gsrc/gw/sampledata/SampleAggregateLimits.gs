package gw.sampledata
uses gw.pl.persistence.core.Bundle
uses gw.api.financials.CurrencyAmount

@Export
class SampleAggregateLimits extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return "Aggregate Limits"
  }
    
  override function testSampleData(bundle : Bundle) {
    var rayNewtonClaim = gw.api.database.Query.make(entity.Claim).compare("ClaimNumber", Equals, "235-53-365870").select().AtMostOneRow
    var period = rayNewtonClaim.Policy.PolicyPeriods.firstWhere( \ p -> p.PolicyPeriodType == TC_ACCOUNT)
    new gw.api.databuilder.AggregateLimitBuilder()
      .withLimitCurrencyAmount(new CurrencyAmount(1000000bd, rayNewtonClaim.Currency))
      .withPublicId("demo_sample:90006")
      .withLimitType(TC_LOSSDATE)
      .onPolicyPeriod(period)
      .create(bundle)
  }
}
