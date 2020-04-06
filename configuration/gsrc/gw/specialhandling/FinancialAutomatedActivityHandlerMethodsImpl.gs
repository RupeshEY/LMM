package gw.specialhandling

uses gw.api.specialhandling.AutomatedHandlerTrigger
uses gw.specialhandling.AutomatedActivityHandlerMethodsImpl
uses gw.api.util.CurrencyUtil

/**
 * The customer editable implementation of AutomatedHandlerMethods for an AutomatedActivityHandler that is
 * triggered by a change in a FinancialThreshold.  Anyone wishing to modify the special handling afforded by the 
 * default AutomatedActivityHandlerMethodsImpl can override the appropriate functions here.
 */
@Export
class FinancialAutomatedActivityHandlerMethodsImpl extends AutomatedActivityHandlerMethodsImpl {
  construct(financialAutomatedActivityHandler : FinancialAutomatedActivityHandler) {
    super(financialAutomatedActivityHandler)
  }
 
  /**
   * @return the associated FinancialThresholdTrigger as an instance of AutomatedHandlerTrigger
   */
  override property get Trigger() : AutomatedHandlerTrigger {
    return Handler.FinancialThresholdTrigger
  }
  
  /**
   * @return the associated AutomatedActivityHandler as an instance of FinancialAutomatedActivityHandler
   */
  override property get Handler() : FinancialAutomatedActivityHandler {
    return super.Handler as FinancialAutomatedActivityHandler
  }

  /**
   * Initializes a new instance of the correct type of AutomatedHandlerTrigger for this
   * AutomatedHandler and associates it with the handler.  If the trigger has already previously
   * been initialized then this method does no work.
   */
  override function initializeTrigger() {
    if (this.Trigger == null) {
      var newTrigger = new FinancialThresholdTrigger()
      newTrigger.AutomatedHandler = this.Handler
      newTrigger.FinancialThreshold = FinancialThreshold.TC_NETTOTALINCURRED
      newTrigger.Currency = CurrencyUtil.getReportingCurrency()
      newTrigger.TriggeringCause = FinancialTriggerCause.TC_REACHED
    }
  }
}