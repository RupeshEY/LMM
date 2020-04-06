package gw.entity

uses gw.vendormanagement.ServiceRequestActivityPattern

@Export
enhancement GWServiceRequestMetricEscalationDelegateEnhancement : entity.ServiceRequestMetricEscalationDelegate {

  property get EscalationActivityPatternForMetric() : ActivityPattern {
    if (this typeis SpecialistInitialResponseTimeServiceRequestMetric) {
      return ServiceRequestActivityPattern.VENDOR_DID_NOT_ACCEPT_WORK.Pattern
    } else if (this typeis QuoteTimelinessServiceRequestMetric) {
      return ServiceRequestActivityPattern.VENDOR_PAST_EXPECTED_QUOTE_COMPLETION_DATE.Pattern
    } else if (this typeis ServiceTimelinessServiceRequestMetric) {
      return ServiceRequestActivityPattern.VENDOR_PAST_EXPECTED_SERVICE_COMPLETION_DATE.Pattern
    }
    return null
  }  
}
