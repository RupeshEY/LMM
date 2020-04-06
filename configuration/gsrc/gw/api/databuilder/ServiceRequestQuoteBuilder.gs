package gw.api.databuilder

@Export
class ServiceRequestQuoteBuilder extends ServiceRequestStatementBuilder<ServiceRequestQuote, ServiceRequestQuoteBuilder>{

  /**
   * Sets:
   * <ul>
   * <li>Description - a non-null string
   * <li>Amount - $100 (USD)
   * <li>StatementCreationTime - now
   * <li>ExpectedDaysToPerformService - 3
   * </ul>
   */
  construct() {
    super(ServiceRequestQuote)
    set(ServiceRequestQuote#ExpectedDaysToPerformService, 3)
  }

  /**
   * NOTE: does not set or create a service request
   */
  static function uiReady() : ServiceRequestQuoteBuilder {
    return new ServiceRequestQuoteBuilder()
  }
  
  /**
   * Sets the number of dates that the specialist expect to perform the work.
   * @param numberOfDaysToPerform the desired value
   * @return the modified builder
   */
  function withExpectedDaysToPerformService(numberOfDaysToPerform : int) : ServiceRequestQuoteBuilder {
    set(ServiceRequestQuote#ExpectedDaysToPerformService, numberOfDaysToPerform)
    return thisAsB()
  }
}
