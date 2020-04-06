package gw.sampledata

uses gw.api.financials.CurrencyAmount
uses gw.api.testdata.TestDataUtil
uses gw.api.util.CurrencyUtil
uses gw.cc.config.Resources
uses gw.lang.reflect.TypeSystem
uses gw.pl.persistence.core.Bundle

uses java.lang.IllegalStateException
uses java.lang.Integer
uses java.math.BigDecimal

@Export
class SampleMetricLimits extends SampleDataBase {
  
  /**
   * Nested class for creating Claim metric limits. The addLimits() method
   * is effectively a terse description of all the limits we add. It could
   * also be replaced by code that reads in values from a spreadsheet.
   */
  private class ClaimMetricLimits {

    private var _bundle : Bundle
    
    construct(bundle : Bundle) {
      _bundle = bundle
    }
    
    function addLimits() {
      add(TC_WORKERSCOMP, TC_DAYSOPENCLAIMMETRIC, null, 3, 2, 5)
      add(TC_WORKERSCOMP, TC_DAYSOPENCLAIMMETRIC, TC_MEDICALONLY, 45, 40, 90)
      add(TC_WORKERSCOMP, TC_DAYSOPENCLAIMMETRIC, TC_INDEMNITY, 90, 80, 150)
      add(TC_WORKERSCOMP, TC_DAYSOPENCLAIMMETRIC, TC_EL, 180, 165, 270)
      add(TC_PERSONALAUTO, TC_DAYSOPENCLAIMMETRIC, null, 30, 25, 60)
      add(TC_PERSONALAUTO, TC_DAYSOPENCLAIMMETRIC, TC_LOW, 10, 8, 20)
      add(TC_PERSONALAUTO, TC_DAYSOPENCLAIMMETRIC, TC_HIGH, 150, 140, 180)
      add(TC_HOMEOWNERS, TC_DAYSOPENCLAIMMETRIC, null, 90, 80, 120)
      add(TC_HOMEOWNERS, TC_DAYSOPENCLAIMMETRIC, TC_LOW, 30, 25, 40)
      add(TC_HOMEOWNERS, TC_DAYSOPENCLAIMMETRIC, TC_HIGH, 180, 160, 200)
      add(TC_GENERALLIABILITY, TC_DAYSOPENCLAIMMETRIC, null, 250, 200, 300)
      add(TC_GENERALLIABILITY, TC_DAYSOPENCLAIMMETRIC, TC_LOW, 50, 40, 80)
      add(TC_GENERALLIABILITY, TC_DAYSOPENCLAIMMETRIC, TC_HIGH, 500, 400, 750)
      add(TC_BUSINESSOWNERS, TC_DAYSOPENCLAIMMETRIC, null, 90, null, null)
      add(TC_BUSINESSAUTO, TC_DAYSOPENCLAIMMETRIC, null, 60, null, null)
      add(TC_COMMERCIALPROPERTY, TC_DAYSOPENCLAIMMETRIC, null, 180, null, null)
      add(TC_FARMOWNERS, TC_DAYSOPENCLAIMMETRIC, null, 60, null, null)
      add(TC_TRAVEL_PER, TC_DAYSOPENCLAIMMETRIC, null, 30, null, null)
      add(TC_WORKERSCOMP, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_PERSONALAUTO, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_HOMEOWNERS, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_GENERALLIABILITY, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_BUSINESSOWNERS, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_BUSINESSAUTO, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_COMMERCIALPROPERTY, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_FARMOWNERS, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_TRAVEL_PER, TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, null, 1, 1, 2)
      add(TC_WORKERSCOMP, TC_TIMETOFIRSTPAYMENTCLAIMMETRIC, null, 20, 17, 30)
      add(TC_WORKERSCOMP, TC_TIMETOFIRSTPAYMENTCLAIMMETRIC, TC_EL, 60, 50, 120)
      add(TC_WORKERSCOMP, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 10, 8, 20)
      add(TC_WORKERSCOMP, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, TC_INDEMNITY, 15, 12, 25)
      add(TC_WORKERSCOMP, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, TC_EL, 20, 17, 40)
      add(TC_PERSONALAUTO, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 10, 8, 15)
      add(TC_PERSONALAUTO, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, TC_HIGH, 20, 18, 30)
      add(TC_HOMEOWNERS, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 12, 10, 20)
      add(TC_HOMEOWNERS, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, TC_HIGH, 20, 25, 40)
      add(TC_GENERALLIABILITY, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 30, 25, 50)
      add(TC_GENERALLIABILITY, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, TC_LOW, 20, 25, 40)
      add(TC_BUSINESSOWNERS, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 30, 25, 50)
      add(TC_BUSINESSAUTO, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 20, 25, 40)
      add(TC_COMMERCIALPROPERTY, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 30, 25, 50)
      add(TC_FARMOWNERS, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 20, 25, 40)
      add(TC_TRAVEL_PER, TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, null, 12, 10, 20)
      add(TC_WORKERSCOMP, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 20, 17, 40)
      add(TC_WORKERSCOMP, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, TC_INDEMNITY, 30, 25, 45)
      add(TC_WORKERSCOMP, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, TC_EL, 20, 17, 40)
      add(TC_PERSONALAUTO, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 20, 16, 40)
      add(TC_PERSONALAUTO, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, TC_HIGH, 30, 25, 50)
      add(TC_HOMEOWNERS, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 20, 16, 40)
      add(TC_HOMEOWNERS, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, TC_HIGH, 30, 25, 50)
      add(TC_GENERALLIABILITY, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 60, 50, 100)
      add(TC_GENERALLIABILITY, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, TC_LOW, 30, 25, 50)
      add(TC_BUSINESSOWNERS, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 60, 50, 100)
      add(TC_BUSINESSAUTO, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 30, 25, 50)
      add(TC_COMMERCIALPROPERTY, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 60, 50, 100)
      add(TC_FARMOWNERS, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 30, 25, 50)
      add(TC_TRAVEL_PER, TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, null, 20, 16, 40)
      add(TC_WORKERSCOMP, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_WORKERSCOMP, TC_OVERDUEACTIVITIESCLAIMMETRIC, TC_INDEMNITY, null, 3, 5)
      add(TC_WORKERSCOMP, TC_OVERDUEACTIVITIESCLAIMMETRIC, TC_EL, null, 3, 6)
      add(TC_PERSONALAUTO, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_HOMEOWNERS, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_GENERALLIABILITY, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_BUSINESSOWNERS, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_BUSINESSAUTO, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_COMMERCIALPROPERTY, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_FARMOWNERS, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_TRAVEL_PER, TC_OVERDUEACTIVITIESCLAIMMETRIC, null, null, 2, 3)
      add(TC_WORKERSCOMP, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_WORKERSCOMP, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, TC_INDEMNITY, 0, 1, 2)
      add(TC_WORKERSCOMP, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, TC_EL, 0, 1, 2)
      add(TC_PERSONALAUTO, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_HOMEOWNERS, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_GENERALLIABILITY, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_BUSINESSOWNERS, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_BUSINESSAUTO, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_COMMERCIALPROPERTY, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_FARMOWNERS, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_TRAVEL_PER, TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, null, 0, null, 1)
      add(TC_WORKERSCOMP, TC_ALLESCALATEDACTIVITIESCLAIMMETRIC, null, 1, 1, 2)
      add(TC_WORKERSCOMP, TC_ALLESCALATEDACTIVITIESCLAIMMETRIC, TC_INDEMNITY, 2, 2, 3)
      add(TC_WORKERSCOMP, TC_ALLESCALATEDACTIVITIESCLAIMMETRIC, TC_EL, 3, 2, 4)
      add(TC_PERSONALAUTO, TC_ALLESCALATEDACTIVITIESCLAIMMETRIC, null, 1, 1, 2)
      add(TC_HOMEOWNERS, TC_ALLESCALATEDACTIVITIESCLAIMMETRIC, null, 1, 1, 2)
      add(TC_GENERALLIABILITY, TC_ALLESCALATEDACTIVITIESCLAIMMETRIC, null, 1, 1, 2)
      add(TC_WORKERSCOMP, TC_RESERVECHANGECOUNTCLAIMMETRIC, TC_MEDICALONLY, 3, 2, 4)
      add(TC_WORKERSCOMP, TC_RESERVECHANGECOUNTCLAIMMETRIC, TC_INDEMNITY, 4, 3, 5)
      add(TC_WORKERSCOMP, TC_RESERVECHANGECOUNTCLAIMMETRIC, TC_EL, 5, 4, 6)
      add(TC_WORKERSCOMP, TC_NETTOTALINCURREDCLAIMMETRIC, null, 9000, null, null)
      add(TC_WORKERSCOMP, TC_NETTOTALINCURREDCLAIMMETRIC, TC_INCIDENTREPORT, 0, null, 1)
      add(TC_WORKERSCOMP, TC_NETTOTALINCURREDCLAIMMETRIC, TC_MEDICALONLY, 6000, null, null)
      add(TC_WORKERSCOMP, TC_NETTOTALINCURREDCLAIMMETRIC, TC_INDEMNITY, 12000, null, null)
      add(TC_WORKERSCOMP, TC_NETTOTALINCURREDCLAIMMETRIC, TC_EL, 10000, null, null)
      add(TC_PERSONALAUTO, TC_NETTOTALINCURREDCLAIMMETRIC, null, 8000, null, null)
      add(TC_PERSONALAUTO, TC_NETTOTALINCURREDCLAIMMETRIC, TC_LOW, 500, null, null)
      add(TC_PERSONALAUTO, TC_NETTOTALINCURREDCLAIMMETRIC, TC_HIGH, 20000, null, null)
      add(TC_HOMEOWNERS, TC_NETTOTALINCURREDCLAIMMETRIC, null, 5000, null, null)
      add(TC_HOMEOWNERS, TC_NETTOTALINCURREDCLAIMMETRIC, TC_LOW, 1500, null, null)
      add(TC_HOMEOWNERS, TC_NETTOTALINCURREDCLAIMMETRIC, TC_HIGH, 25000, null, null)
      add(TC_GENERALLIABILITY, TC_NETTOTALINCURREDCLAIMMETRIC, null, 10000, null, null)
      add(TC_GENERALLIABILITY, TC_NETTOTALINCURREDCLAIMMETRIC, TC_LOW, 2000, null, null)
      add(TC_GENERALLIABILITY, TC_NETTOTALINCURREDCLAIMMETRIC, TC_HIGH, 50000, null, null)
    }
    
    private function add(policyType : PolicyType, metricType : typekey.ClaimMetric, tier : ClaimTier, target : Integer, yellow : Integer, red : Integer) {
      var limit = createLimitForType(metricType)
      limit.PolicyTypeMetricLimits = PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType)
      limit.ClaimTier = tier
      limit.Currency = CurrencyUtil.getDefaultCurrency()
      if (limit typeis IntegerClaimMetricLimit) {
        limit.IntegerTargetValue = target
        limit.IntegerYellowValue = yellow
        limit.IntegerRedValue = red
      } else if (limit typeis PercentClaimMetricLimit) {
        limit.PercentTargetValue = target
        limit.PercentYellowValue = yellow
        limit.PercentRedValue = red
      } else if (limit typeis MoneyClaimMetricLimit) {
        limit.MoneyTargetValue = target != null ? new CurrencyAmount(new BigDecimal(target), limit.Currency) : null
        limit.MoneyYellowValue = yellow != null ? new CurrencyAmount(new BigDecimal(yellow), limit.Currency) : null
        limit.MoneyRedValue = red != null ? new CurrencyAmount(new BigDecimal(red), limit.Currency) : null
      } else {
        throw new IllegalStateException("Unexpected ClaimMetricLimit type: " + typeof limit)
      }
    }
    
    private function createLimitForType(metricType : typekey.ClaimMetric) : ClaimMetricLimit {
      var result : ClaimMetricLimit
      TestDataUtil.runWithExistingBundleNoCommit(_bundle, \ -> {
        var type = TypeSystem.getByFullName("entity." + metricType.Code)
        var metric = type.TypeInfo.getConstructor({}).Constructor.newInstance({}) as ClaimMetric
        result = metric.createDefaultLimit() as ClaimMetricLimit
        metric.remove()
      })
      return result
    }
  }

  /**
   * Nested class for creating Exposure metric limits. The add limits method is
   * just following the prescription: "For all 11 Policy types, for Initial
   * Contact with Claimant (Days) set a default target of 1 day, Yellow of 1 day
   * and Red of 2 days"
   */
  private class ExposureMetricLimits {

    var _bundle : Bundle
    
    construct(bundle : Bundle) {
      _bundle = bundle
    }
    
    function addLimits() {
      for (policyType in PolicyType.getTypeKeys(false)) {
        add(policyType, TC_DAYSINITIALCONTACTWITHCLAIMANTEXPOSUREMETRIC, null, 1, 1, 3)
      }
    }

    private function add(policyType : PolicyType, metricType : typekey.ExposureMetric, tier : ExposureTier, target : Integer, yellow : Integer, red : Integer) {
      var limit = createLimitForType(metricType)
      limit.PolicyTypeMetricLimits = PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType)
      limit.ExposureTier = tier
      limit.Currency = CurrencyUtil.getDefaultCurrency()
      if (limit typeis IntegerExposureMetricLimit) {
        limit.IntegerTargetValue = target
        limit.IntegerYellowValue = yellow
        limit.IntegerRedValue = red
      } else if (limit typeis PercentExposureMetricLimit) {
        limit.PercentTargetValue = target
        limit.PercentYellowValue = yellow
        limit.PercentRedValue = red
      } else if (limit typeis MoneyExposureMetricLimit) {
        limit.MoneyTargetValue = new CurrencyAmount(new BigDecimal(target), limit.Currency)
        limit.MoneyYellowValue = new CurrencyAmount(new BigDecimal(yellow), limit.Currency)
        limit.MoneyRedValue = new CurrencyAmount(new BigDecimal(red), limit.Currency)
      } else {
        throw new IllegalStateException("Unexpected ExposureMetricLimit type: " + typeof limit)
      }
    }
    
    private function createLimitForType(metricType : typekey.ExposureMetric) : ExposureMetricLimit {
      var result : ExposureMetricLimit
      TestDataUtil.runWithExistingBundleNoCommit(_bundle, \ -> {
        var type = TypeSystem.getByFullName("entity." + metricType.Code)
        var metric = type.TypeInfo.getConstructor({}).Constructor.newInstance({}) as ExposureMetric
        result = metric.createDefaultLimit() as ExposureMetricLimit
        metric.remove()
      })
      return result
    }
  }

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return "Claim, exposure and service request metric limits"
  }

  override function testSampleData( bundle : Bundle ) {
    // Tests create their own metric limits
  }

  override function demoSampleData(bundle : Bundle) {
    var claimMetricLimits = new ClaimMetricLimits(bundle)
    claimMetricLimits.addLimits()
    var exposureMetricLimits = new ExposureMetricLimits(bundle)
    exposureMetricLimits.addLimits()

    //service request sample limits are stored in xml
    XMLSampleDataImporter.importFromFile(Resources.SERVICE_REQUEST_METRIC_LIMITS, bundle)
  }
}
