package gw.command
uses java.util.ArrayList
uses gw.api.financials.CurrencyAmount
uses java.math.BigDecimal
uses gw.api.databuilder.IntegerClaimMetricLimitBuilder
uses gw.api.databuilder.MoneyClaimMetricLimitBuilder
uses gw.api.databuilder.PercentClaimMetricLimitBuilder
uses gw.pl.persistence.core.Bundle
uses java.util.List

@Export
class ClaimMetricLimit extends CCBaseCommand  {
  
  function withDefault() {
    all()
  }
  
  function all() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      for (policyType in PolicyType.getTypeKeys(false)) {
        createClaimMetricLimits(limitBundle, policyType)
      }
    })
  }
  
  function auto_per() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      createClaimMetricLimits(limitBundle, PolicyType.TC_PERSONALAUTO)
    })
  }

  function wc() {
    gw.transaction.Transaction.runWithNewBundle(\ limitBundle -> {
      createClaimMetricLimits(limitBundle, PolicyType.TC_WORKERSCOMP)
    })
  }

  private function createClaimMetricLimits(limitBundle : Bundle, policyType : PolicyType) {
    clearAllLimitsForPolicyType(limitBundle, policyType)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_DAYSOPENCLAIMMETRIC, MetricUnit.TC_DAYS, ClaimMetricCategory.TC_OVERALLCLAIMMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_DAYSINITIALCONTACTWITHINSUREDCLAIMMETRIC, MetricUnit.TC_DAYS, ClaimMetricCategory.TC_OVERALLCLAIMMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_DAYSLASTVIEWEDBYADJUSTERCLAIMMETRIC, MetricUnit.TC_DAYS, ClaimMetricCategory.TC_CLAIMACTIVITYMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_DAYSLASTVIEWEDBYSUPERVISORCLAIMMETRIC, MetricUnit.TC_DAYS, ClaimMetricCategory.TC_CLAIMACTIVITYMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_OVERDUEACTIVITIESCLAIMMETRIC, MetricUnit.TC_NUMERIC, ClaimMetricCategory.TC_CLAIMACTIVITYMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_OPENESCALATEDACTIVITIESCLAIMMETRIC, MetricUnit.TC_NUMERIC, ClaimMetricCategory.TC_CLAIMACTIVITYMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_ALLESCALATEDACTIVITIESCLAIMMETRIC, MetricUnit.TC_NUMERIC, ClaimMetricCategory.TC_CLAIMACTIVITYMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_PERCENTESCALATEDACTIVITIESCLAIMMETRIC, MetricUnit.TC_PERCENT, ClaimMetricCategory.TC_CLAIMACTIVITYMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_NETTOTALINCURREDCLAIMMETRIC, MetricUnit.TC_CURRENCY, ClaimMetricCategory.TC_CLAIMFINANCIALSMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_TOTALPAIDCLAIMMETRIC, MetricUnit.TC_CURRENCY, ClaimMetricCategory.TC_CLAIMFINANCIALSMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_PERCENTINCURREDLOSSCOSTSCLAIMMETRIC, MetricUnit.TC_PERCENT, ClaimMetricCategory.TC_CLAIMFINANCIALSMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_PERCENTPAIDLOSSCOSTSCLAIMMETRIC, MetricUnit.TC_PERCENT, ClaimMetricCategory.TC_CLAIMFINANCIALSMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_TIMETOFIRSTPAYMENTCLAIMMETRIC, MetricUnit.TC_DAYS, ClaimMetricCategory.TC_CLAIMFINANCIALSMETRICS)
    createLimits(limitBundle, policyType, typekey.ClaimMetric.TC_PERCENTRESERVECHANGECLAIMMETRIC, MetricUnit.TC_PERCENT, ClaimMetricCategory.TC_CLAIMFINANCIALSMETRICS)
    // special condition for NumReserveChanges by request from QA
    createNumericMetricLimit(limitBundle, policyType, typekey.ClaimMetric.TC_RESERVECHANGECOUNTCLAIMMETRIC, ClaimMetricCategory.TC_CLAIMFINANCIALSMETRICS, 2, 3, 7)
  }
   
  private function createLimits(limitBundle : Bundle, policyType : PolicyType, metricType : typekey.ClaimMetric, metricUnit : MetricUnit, metricCategory : ClaimMetricCategory) {
    var limits = PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType)
    var claimTiers = getClaimTiers(policyType)
    if(metricUnit == typekey.MetricUnit.TC_NUMERIC || metricUnit == typekey.MetricUnit.TC_DAYS) {
      createNumericMetricLimit(limitBundle, policyType, metricType, metricCategory, 1, 10, 20)
    } else if (metricUnit == typekey.MetricUnit.TC_CURRENCY) {
      var currencyTargetValue = new CurrencyAmount(new BigDecimal("100.00"), Currency.TC_USD)
      var currencyYellowValue = new CurrencyAmount(new BigDecimal("200.00"), Currency.TC_USD)
      var currencyRedValue = new CurrencyAmount(new BigDecimal("300.00"), Currency.TC_USD)
      for (claimTier in claimTiers) {
         new MoneyClaimMetricLimitBuilder()
              .onPolicyTypeMetricLimits(limits)
              .withClaimMetricCategory(metricCategory)
              .withClaimMetricType(metricType)
              .withClaimTier(claimTier)
              .withMetricUnit(metricUnit)
              .withMoneyTargetValue(currencyTargetValue)
              .withMoneyYellowValue(currencyYellowValue)
              .withMoneyRedValue(currencyRedValue)
              .withCurrency(inferCurrencyFrom({ currencyTargetValue, currencyYellowValue, currencyRedValue }))
              .create(limitBundle)
        currencyTargetValue = currencyTargetValue.addStrict(new BigDecimal("100.00").ofCurrency(Currency.TC_USD))
        currencyYellowValue = currencyYellowValue.addStrict(new BigDecimal("500.00").ofCurrency(Currency.TC_USD))
        currencyRedValue = currencyRedValue.addStrict(new BigDecimal("1000.00").ofCurrency(Currency.TC_USD))
      }
    } else if (metricUnit == typekey.MetricUnit.TC_PERCENT) {
      if(metricType == typekey.ClaimMetric.TC_PERCENTINCURREDLOSSCOSTSCLAIMMETRIC || metricType == typekey.ClaimMetric.TC_PERCENTPAIDLOSSCOSTSCLAIMMETRIC) {
        var percentTargetValue = new BigDecimal("30")
        var percentYellowValue = new BigDecimal("20")
        var percentRedValue = new BigDecimal("10")

        for (claimTier in claimTiers) {
          new PercentClaimMetricLimitBuilder()
                .withAscendingLimitOrder(false)
                .onPolicyTypeMetricLimits(limits) 
                .withClaimMetricCategory(metricCategory)
                .withClaimMetricType(metricType)
                .withClaimTier(claimTier)
                .withMetricUnit(metricUnit)
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
        
        for (claimTier in claimTiers) {
          new PercentClaimMetricLimitBuilder()
                .withAscendingLimitOrder(true)
                .onPolicyTypeMetricLimits(limits)
                .withClaimMetricCategory(metricCategory)
                .withClaimMetricType(metricType)
                .withClaimTier(claimTier)
                .withMetricUnit(metricUnit)
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
  
  private function createNumericMetricLimit(limitBundle : Bundle, policyType : PolicyType, metricType : typekey.ClaimMetric, metricCategory : ClaimMetricCategory, targetValue : int, yellowValue : int, redValue : int ) {
    var limits = PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType)
    var claimTiers = getClaimTiers(policyType)
    for (claimTier in claimTiers) {
      new  IntegerClaimMetricLimitBuilder()
            .onPolicyTypeMetricLimits(limits)
            .withClaimMetricCategory(metricCategory)
            .withClaimMetricType(metricType)
            .withClaimTier(claimTier)
            .withMetricUnit(MetricUnit.TC_NUMERIC)
            .withIntegerTargetValue(targetValue)
            .withIntegerYellowValue(yellowValue)
            .withIntegerRedValue(redValue)
            .create(limitBundle)
      targetValue++
      yellowValue++
      redValue++
    }
  }
  
  private function inferCurrencyFrom( currencyAmounts : List<CurrencyAmount> ) : Currency
  {
    return currencyAmounts.firstWhere( \ ca -> ca.Currency != null ).Currency
  }

  private function clearAllLimitsForPolicyType(limitBundle : Bundle, policyType : PolicyType) {
    var limits = limitBundle.add(PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType))
    for (limit in limits.ClaimMetricLimits) {
      limit.remove()
    }
    limitBundle.commit()
  }

  private function getClaimTiers(policyType : PolicyType) : List<ClaimTier>  {
    var claimTiers = new ArrayList<ClaimTier>()
    claimTiers.add(null) //add default metric
    for (claimTier in ClaimTier.getTypeKeys(false)) {
      if(claimTier.hasCategory(policyType) ){          
        claimTiers.add(claimTier)
      }
    }
    return claimTiers
  }    


}
