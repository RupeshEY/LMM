package gw.command

uses gw.api.databuilder.IntegerExposureMetricLimitBuilder
uses java.math.BigDecimal
uses gw.api.databuilder.MoneyExposureMetricLimitBuilder
uses gw.api.databuilder.PercentExposureMetricLimitBuilder
uses gw.api.financials.CurrencyAmount
uses java.util.ArrayList
uses gw.pl.persistence.core.Bundle
uses java.util.List

@Export
class ExpMetricLimit extends CCBaseCommand  {

  function withDefault() {
    all()
  }
  
  function all() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      for (policyType in PolicyType.getTypeKeys(false)) {
        createExposureMetricLimits(limitBundle, policyType)
      }
    })
  }

  function auto_comm() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      createExposureMetricLimits(limitBundle, PolicyType.TC_BUSINESSAUTO)
    })
  }
  
  function auto_per() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      createExposureMetricLimits(limitBundle, PolicyType.TC_PERSONALAUTO)
    })
  }
  
  function prop_comm() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      createExposureMetricLimits(limitBundle, PolicyType.TC_COMMERCIALPROPERTY)
    })
  }
  
  function homeowners() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      createExposureMetricLimits(limitBundle, PolicyType.TC_HOMEOWNERS)
    })
  }

  function gen_liability() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      createExposureMetricLimits(limitBundle, PolicyType.TC_GENERALLIABILITY)
    })
  }

  function wc() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      createExposureMetricLimits(limitBundle, PolicyType.TC_WORKERSCOMP)
    })
  }

  private function createExposureMetricLimits(limitBundle : Bundle, policyType : PolicyType) {
    clearAllLimitsForPolicyType(limitBundle, policyType)
    createLimits(limitBundle, policyType, typekey.ExposureMetric.TC_DAYSOPENEXPOSUREMETRIC, MetricUnit.TC_DAYS)
    createLimits(limitBundle, policyType, typekey.ExposureMetric.TC_DAYSINITIALCONTACTWITHCLAIMANTEXPOSUREMETRIC, MetricUnit.TC_DAYS)
    createLimits(limitBundle, policyType, typekey.ExposureMetric.TC_NETTOTALINCURREDEXPOSUREMETRIC, MetricUnit.TC_CURRENCY)
    createLimits(limitBundle, policyType, typekey.ExposureMetric.TC_TOTALPAIDEXPOSUREMETRIC, MetricUnit.TC_CURRENCY)
    createLimits(limitBundle, policyType, typekey.ExposureMetric.TC_PERCENTESCALATEDACTIVITIESEXPOSUREMETRIC, MetricUnit.TC_PERCENT)
    createLimits(limitBundle, policyType, typekey.ExposureMetric.TC_PERCENTPAIDLOSSCOSTSEXPOSUREMETRIC, MetricUnit.TC_PERCENT)
    createLimits(limitBundle, policyType, typekey.ExposureMetric.TC_TIMETOFIRSTPAYMENTEXPOSUREMETRIC, MetricUnit.TC_DAYS)
  }
  
  private function createLimits(limitBundle : Bundle, policyType : PolicyType, metricType : typekey.ExposureMetric, metricUnit : MetricUnit) {
    var limits = PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType)
    var exposureTiers = getExposureTiers(policyType)
    if(metricUnit == typekey.MetricUnit.TC_NUMERIC || metricUnit == typekey.MetricUnit.TC_DAYS) {
      var targetValue = 1
      var yellowValue = 10
      var redValue = 20
      for (exposureTier in exposureTiers) {
        new IntegerExposureMetricLimitBuilder()
              .onPolicyTypeMetricLimits(limits)
              .withExposureMetricType(metricType)
              .withExposureTier(exposureTier)
              .withMetricUnit(metricUnit)
              .withIntegerTargetValue(targetValue)
              .withIntegerYellowValue(yellowValue)
              .withIntegerRedValue(redValue)
              .create(limitBundle)
        targetValue++
        yellowValue++
        redValue++
      }
    } else if (metricUnit == typekey.MetricUnit.TC_CURRENCY) {
      var currencyTargetValue = new CurrencyAmount(new BigDecimal("100.00"), Currency.TC_USD)
      var currencyYellowValue = new CurrencyAmount(new BigDecimal("200.00"), Currency.TC_USD)
      var currencyRedValue = new CurrencyAmount(new BigDecimal("400.00"), Currency.TC_USD)
      for (exposureTier in exposureTiers) {
        new MoneyExposureMetricLimitBuilder()
              .onPolicyTypeMetricLimits(limits)
              .withExposureMetricType(metricType)
              .withExposureTier(exposureTier)
              .withMetricUnit(metricUnit)
              .withCurrency( inferCurrencyFrom( { currencyTargetValue, currencyYellowValue, currencyRedValue } ) )
              .withMoneyTargetValue(currencyTargetValue)
              .withMoneyYellowValue(currencyYellowValue)
              .withMoneyRedValue(currencyRedValue)
              .create(limitBundle)
        currencyTargetValue = currencyTargetValue.addStrict(new BigDecimal("100.00").ofCurrency(Currency.TC_USD))
        currencyYellowValue = currencyYellowValue.addStrict(new BigDecimal("100.00").ofCurrency(Currency.TC_USD))
        currencyRedValue = currencyRedValue.addStrict(new BigDecimal("100.00").ofCurrency(Currency.TC_USD))
      }
    } else if (metricUnit == typekey.MetricUnit.TC_PERCENT) {
      if(metricType == TC_PERCENTPAIDLOSSCOSTSEXPOSUREMETRIC) {
        var percentTargetValue = new BigDecimal("30")
        var percentYellowValue = new BigDecimal("20")
        var percentRedValue = new BigDecimal("10")
        for (exposureTier in exposureTiers) {
          new PercentExposureMetricLimitBuilder()
                .onPolicyTypeMetricLimits(limits)
                .withExposureMetricType(metricType)
                .withExposureTier(exposureTier)
                .withMetricUnit(metricUnit)
                .withAscendingLimitOrder(false)
                .withPercentTargetValue(percentTargetValue)
                .withPercentYellowValue(percentYellowValue)
                .withPercentRedValue(percentRedValue)
                .create(limitBundle)
          percentTargetValue = percentTargetValue.add(new BigDecimal("5"))
          percentYellowValue = percentYellowValue.add(new BigDecimal("5"))
          percentRedValue = percentRedValue.add(new BigDecimal("5"))
        }
      } else {
        var percentTargetValue = new BigDecimal("10")
        var percentYellowValue = new BigDecimal("20")
        var percentRedValue = new BigDecimal("30")
        for (exposureTier in exposureTiers) {
          new PercentExposureMetricLimitBuilder()
                .onPolicyTypeMetricLimits(limits)
                .withExposureMetricType(metricType)
                .withExposureTier(exposureTier)
                .withMetricUnit(metricUnit)
                .withAscendingLimitOrder(true)
                .withPercentTargetValue(percentTargetValue)
                .withPercentYellowValue(percentYellowValue)
                .withPercentRedValue(percentRedValue)
                .create(limitBundle)
          percentTargetValue = percentTargetValue.add(new BigDecimal("5"))
          percentYellowValue = percentYellowValue.add(new BigDecimal("5"))
          percentRedValue = percentRedValue.add(new BigDecimal("5"))
        }        
      }
    }
    limitBundle.commit()
  }
  
  private function inferCurrencyFrom( currencyAmounts : List<CurrencyAmount> ) : Currency
  {
    return currencyAmounts.firstWhere( \ ca -> ca.Currency != null ).Currency
  }

  private function clearAllLimitsForPolicyType(limitBundle : Bundle, policyType : PolicyType) {
    var limits = limitBundle.add(PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType))
    for (limit in limits.ExposureMetricLimits) {
      limit.remove()
    }
    limitBundle.commit()
  }

  private function getExposureTiers(policyType : PolicyType) : List<ExposureTier>  {
    var exposureTiers = new ArrayList<ExposureTier>()
    exposureTiers.add(null) //add default metric
    for (exposureTier in ExposureTier.getTypeKeys(false)) {
      if(exposureTier.hasCategory(policyType) ){          
        exposureTiers.add(exposureTier)
      }
    }
    return exposureTiers
  }    

}
