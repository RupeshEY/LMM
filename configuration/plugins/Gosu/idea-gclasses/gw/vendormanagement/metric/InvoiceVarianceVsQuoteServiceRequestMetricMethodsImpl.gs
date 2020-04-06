package gw.vendormanagement.metric
uses gw.api.vendormanagement.metric.PercentServiceRequestMetricMethodsImpl
uses gw.api.metric.MetricUpdateHelper
uses java.util.Date
uses java.math.BigDecimal
uses gw.api.financials.CurrencyAmount

@Export
class InvoiceVarianceVsQuoteServiceRequestMetricMethodsImpl extends PercentServiceRequestMetricMethodsImpl {

  construct(invoiceVsQuoteServiceRequestMetric : InvoiceVarianceVsQuoteServiceRequestMetric) {
    super(invoiceVsQuoteServiceRequestMetric)
  }
  
  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    var sh = Metric.ServiceRequest.createStateHandler()
    if (not Metric.ServiceRequest.quoteAllowed(sh) or not Metric.ServiceRequest.invoiceAllowed(sh)) {
      return null
    }
    
    if ((Metric.New or helper.updateContainsChangesOfType(ServiceRequestStatement))
        and (Metric.ServiceRequest.LatestQuote != null and Metric.ServiceRequest.Invoices.HasElements)) {
      var totalInvoiced = Metric.ServiceRequest.Invoices.where(\ inv -> inv.Status != ServiceRequestInvoiceStatus.TC_REJECTED
                                                                   and  inv.Status != ServiceRequestInvoiceStatus.TC_WITHDRAWN)
                                                        .sum(\ inv -> inv.Amount) ?: new CurrencyAmount(0,Metric.ServiceRequest.Currency)
      if (totalInvoiced.Amount == 0 // implying that all the invoices that we have are rejected or withdrawn
          or Metric.ServiceRequest.LatestQuote.Amount.Amount == 0) { // to prevent / by zero
        Metric.PercentValue = null
        return null
      }
      var numerator = totalInvoiced.Amount.subtract(Metric.ServiceRequest.LatestQuote.Amount.Amount)
      setValueToRatio(numerator, Metric.ServiceRequest.LatestQuote.Amount.Amount)
      resetLimits()
    }
    return null
  }

  override property get BaseValueForLimitCalculation() : BigDecimal {
    if (!Metric.ServiceRequest?.LatestQuote.LineItems.IsEmpty) {
      return Metric.ServiceRequest?.LatestQuote.Amount.Amount
    }
    return 0
  }
  
  /**
   * Limit calculated as offset/quote.Amount.  Derivation: desired limit is the percentage equal to the invoiced amount 
   * going over the quote amount by the specified offset, or (quote.Amount + offset)/quote.Amount.
   * (quote.Amount + offset)/quote.Amount 
   * = quote.Amount/quote.Amount + offset/quote.Amount
   * = 1 + offset/quote.Amount -> which is greater than 100%, so we just take offset/quote.Amount.
   */
  override function calculateLimitValue(limitVal : BigDecimal, limitType : ServiceRequestMetricLimitType) : BigDecimal {
    if (limitType == TC_ABSOLUTEOFFSET) {
      return limitVal == 0 ? 0 : Metric.fractionToPercentage(limitVal, BaseValueForLimitCalculation)
    }
    return limitVal
  }
  
  override property get DisplayColor() : String {
    return "black"
  }
}
