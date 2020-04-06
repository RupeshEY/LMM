package gw.plugin.vendormanagement
uses entity.ServiceRequestMetricLimit
uses entity.Claim
uses gw.lang.Export
uses entity.Policy
uses typekey.ServiceRequestTier
uses entity.SpecialistService
uses entity.ServiceRequestInstruction
uses gw.api.database.Query
uses gw.plugin.vendormanagement.IServiceRequestMetricLimitFinderPlugin
uses gw.api.vendormanagement.ServiceRequestMetricLimitValues
uses java.util.HashSet
uses java.math.BigDecimal
uses java.util.List

@Export
class ServiceRequestMetricLimitFinderImpl implements IServiceRequestMetricLimitFinderPlugin {

  construct() {  }

  /**
   * The limit values returned from this implementation may have been calculated with certain 
   * fields on the service request, using the values on ServiceRequestMetricLimit as offsets.
   */
  override function findLimitValues(metric : ServiceRequestMetric) : ServiceRequestMetricLimitValues {
    var limitsForType = Query.make(ServiceRequestMetricLimit).compare(ServiceRequestMetricLimit#ServiceRequestMetricType, Equals, metric.Subtype).select().toList()
    var result : ServiceRequestMetricLimit = null
    if (not limitsForType.Empty) {
      var limits = new HashSet<ServiceRequestMetricLimit>()
      metric.ServiceRequest.Instruction.OrderedServices*.Service*.Ancestry.each(\ ancestry -> {
        var map = limitsForType.partition(\ lim -> qualityOfLimitMatch(lim, metric.ServiceRequest.Tier, metric.ServiceRequest.Claim.Policy.CustomerServiceTier, ancestry.first(), ancestry.last(), metric.ServiceRequest.Currency))
        var max = map.Keys.max()
        if (max >= 0) {
          limits.add(map[max].first())
        }
      })
      result = findMostLenientLimit(limits.toList())
    }
    if (result == null) {
      return null
    } else if (result.LimitType == TC_NOOFFSET) {
      return new ServiceRequestMetricLimitValues(result.DecimalTargetValue, result.DecimalYellowValue, result.DecimalRedValue, result.MetricUnit)
    } else {
      return calculateLimit(result, metric)
    }
  }

  override function limitValuesOutOfDate(serviceReq : ServiceRequest) : boolean {
    var tierChanged = serviceReq.isFieldChanged(ServiceRequest#Tier)
    var currencyChanged = serviceReq.Claim.isFieldChanged(Claim#Currency)
    var customerServiceTierChanged = serviceReq.Claim.Policy.isFieldChanged(Policy#CustomerServiceTier)
    return tierChanged or currencyChanged or customerServiceTierChanged or serviceReq.New
  }
  
  /**
   * Ranks the quality of the match based on a ranking of the matching characteristics.  Those are ranked to break ties if a service request matches 
   * more than one limit but on different characteristics.
   */
  private function qualityOfLimitMatch(limit : ServiceRequestMetricLimit, tier : ServiceRequestTier, customerServiceTier : CustomerServiceTier, category : SpecialistService, specialistService : SpecialistService, currency : Currency) : int {
    var score = 0
    if (limit.Currency == currency) {
      score += 9
    } else if (limit.Currency != null) {
      return -1
    }
    if (limit.SpecialistService == specialistService) {
      score += 7
    } else if (limit.SpecialistService != null) {
      return -1
    }
    if (limit.ServiceCategory == category) {
      score += 5
    } else if (limit.ServiceCategory != null) {
      return -1
    }
    if (limit.CustomerServiceTier == customerServiceTier) {
      score += 3
    } else if (limit.CustomerServiceTier != null) {
      return -1
    }    
    if (limit.ServiceRequestTier == tier) {
      score += 1
    } else if (limit.ServiceRequestTier != null) {
      return -1
    }
    return score
  }
  
  private function calculateLimit(limitResult : ServiceRequestMetricLimit, metric : ServiceRequestMetric) : ServiceRequestMetricLimitValues {
    metric.MetricUnit = limitResult.MetricUnit // we may have a new unit for the calculations
    var target : BigDecimal
    if (metric.BaseValueForLimitCalculation == null) {
      target = null
    } else if (limitResult.DecimalTargetValue == null ) {
      target = (limitResult.LimitType == TC_ABSOLUTEOFFSET ? metric.calculateLimitValue(0, limitResult.LimitType) : metric.calculateLimitValue(100, limitResult.LimitType)) as BigDecimal
    } else {
      target = metric.calculateLimitValue(limitResult.DecimalTargetValue, limitResult.LimitType) as BigDecimal
    }
    var yellow = (limitResult.DecimalYellowValue == null or metric.BaseValueForLimitCalculation == null) 
                                                                                    ? null : metric.calculateLimitValue(limitResult.DecimalYellowValue, limitResult.LimitType) as BigDecimal
    var red = (limitResult.DecimalRedValue == null or metric.BaseValueForLimitCalculation == null) 
                                                                                    ? null : metric.calculateLimitValue(limitResult.DecimalRedValue, limitResult.LimitType) as BigDecimal
    return new ServiceRequestMetricLimitValues(target, yellow, red, limitResult.MetricUnit)
  }

  /**
   * Looks for the most lenient limit: compare units (days > hours) then red limit, yellow limit, target limit
   * @return the one with the greatest time value (ties, return either)
   */  
  private function findMostLenientLimit(limits : List<ServiceRequestMetricLimit>) : ServiceRequestMetricLimit {
    var mostLenient : ServiceRequestMetricLimit = null

    for (limit in limits) {
      if (mostLenient == null or limit.MetricUnit.Priority > mostLenient.MetricUnit.Priority) {
        mostLenient = limit
      } else if (limit.MetricUnit == mostLenient.MetricUnit) {
        if (limit.DecimalRedValue > mostLenient.DecimalRedValue) {
          mostLenient = limit
        } else if (limit.DecimalRedValue == mostLenient.DecimalRedValue) {
          if (limit.DecimalYellowValue > mostLenient.DecimalYellowValue) {
            mostLenient = limit
          } else if (limit.DecimalYellowValue == mostLenient.DecimalYellowValue and limit.DecimalTargetValue > mostLenient.DecimalTargetValue) {
            mostLenient = limit
          }
        }
      }
    }
    return mostLenient
  }
}