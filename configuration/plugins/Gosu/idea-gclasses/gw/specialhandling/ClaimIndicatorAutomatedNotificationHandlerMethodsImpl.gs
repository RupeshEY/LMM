package gw.specialhandling

uses gw.api.locale.DisplayKey
uses gw.api.email.Email
uses gw.api.specialhandling.AutomatedHandlerTrigger
uses gw.specialhandling.AutomatedNotificationHandlerMethodsImpl


/**
 * The customer editable implementation of AutomatedHandlerMethods for an AutomatedNotificationHandler that is 
 * triggered by a change in a ClaimIndicator.  Anyone wishing to modify the special handling afforded by the 
 * default AutomatedNotificationHandlerMethodsImpl can override the appropriate functions here.
 */
@Export
class ClaimIndicatorAutomatedNotificationHandlerMethodsImpl extends AutomatedNotificationHandlerMethodsImpl {
  construct(claimIndicatorAutomatedNotificationHandler : ClaimIndicatorAutomatedNotificationHandler) {
    super(claimIndicatorAutomatedNotificationHandler)
  }
 
 /**
  * @return the associated ClaimIndicatorTrigger as an instance of AutomatedHandlerTrigger
  */
  override property get Trigger() : AutomatedHandlerTrigger {
    return Handler.ClaimIndicatorTrigger
  }
  
  /**
   * @return the associated AutomatedNotificationHandler as an instance of ClaimIndicatorAutomatedNotificationHandler
   */
  override property get Handler() : ClaimIndicatorAutomatedNotificationHandler {
    return super.Handler as ClaimIndicatorAutomatedNotificationHandler
  }

  /**
   * Initializes a new instance of the correct type of AutomatedHandlerTrigger for this
   * AutomatedHandler and associates it with the handler.  If the trigger has already previously
   * been initialized then this method does no work.
   */
   override function initializeTrigger() {
    if (this.Trigger == null) {
      (new ClaimIndicatorTrigger()).AutomatedHandler = this.Handler
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
    newActivity.Description = DisplayKey.get("Web.Admin.AutomatedHandlerTrigger.ClaimIndicator.CannotNotifyContactActivity.Description", 
            Handler.EmailRole, 
            Handler.ClaimIndicatorTrigger.ClaimIndicator.DisplayName,
            emailResult.Subject,
            emailResult.Body)

    newActivity.assign(aClaim.AssignedGroup, aClaim.AssignedUser)
  }

}