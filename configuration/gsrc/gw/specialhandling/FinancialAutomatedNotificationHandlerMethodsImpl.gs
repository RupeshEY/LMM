package gw.specialhandling

uses gw.api.locale.DisplayKey
uses gw.api.email.Email
uses gw.api.specialhandling.AutomatedHandlerTrigger
uses gw.api.util.CurrencyUtil

/**
 * The customer editable implementation of AutomatedHandlerMethods for an AutomatedNotificationHandler that is 
 * triggered by a change in a FinancialThreshold.  Anyone wishing to modify the special handling afforded by the 
 * default AutomatedNotificationHandlerMethodsImpl can override the appropriate functions here.
 */
@Export
class FinancialAutomatedNotificationHandlerMethodsImpl extends AutomatedNotificationHandlerMethodsImpl {
  construct(financialAutomatedNotificationHandler : FinancialAutomatedNotificationHandler) {
    super(financialAutomatedNotificationHandler)
  }
 
 /**
  * @return the associated FinancialThresholdTrigger as an instance of AutomatedHandlerTrigger
  */
  override property get Trigger() : AutomatedHandlerTrigger {
    return Handler.FinancialThresholdTrigger
  }
  
  /**
   * @return the associated AutomatedNotificationHandler as an instance of FinancialAutomatedNotificationHandler
   */
  override property get Handler() : FinancialAutomatedNotificationHandler {
    return super.Handler as FinancialAutomatedNotificationHandler
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

  /**
   * Creates a general reminder activity notifying the claim's assigned user that a claim indicator has been triggered but
   * that an email notification could not be sent to because the indicated contact role has no reachable contacts.
   */
  override protected function createNotificationActivity(aClaim : Claim, emailResult : Email) {
    
    // use the out-of-the-box General Reminder activity pattern
    var newActivity = aClaim.newActivity(
              ActivityPattern.finder.getActivityPatternByCode("general_reminder"), null)
      
    newActivity.Subject = DisplayKey.get("Web.Admin.AutomatedHandlerTrigger.CannotNotifyContactActivity.Subject", Handler.EmailRole)    
    newActivity.Description = DisplayKey.get("Web.Admin.AutomatedHandlerTrigger.FinancialThreshold.CannotNotifyContactActivity.Description", 
            Handler.EmailRole, 
            Handler.FinancialThresholdTrigger.ThresholdAmount,
            emailResult.Subject,
            emailResult.Body)

    newActivity.assign(aClaim.AssignedGroup, aClaim.AssignedUser)
  }
}