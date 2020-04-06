package gw.specialhandling

uses gw.api.specialhandling.AutomatedHandlerTrigger

/**
 * The customer editable implementation of AutomatedHandlerMethods for an AutomatedActivityHandler that is 
 * triggered by a change in a ClaimIndicator.  Anyone wishing to modify the special handling afforded by the 
 * default AutomatedActivityHandlerMethodsImpl can override the appropriate functions here.
 */
@Export
class ClaimIndicatorAutomatedActivityHandlerMethodsImpl extends AutomatedActivityHandlerMethodsImpl {

  construct(claimIndicatorAutomatedActivityHandler : ClaimIndicatorAutomatedActivityHandler) {
    super(claimIndicatorAutomatedActivityHandler)
  }

  /**
   * @return the associated ClaimIndicatorTrigger as an instance of AutomatedHandlerTrigger
   */
  override property get Trigger() : AutomatedHandlerTrigger {
    return Handler.ClaimIndicatorTrigger
  }
  
  /**
   * @return the associated AutomatedActivityHandler as an instance of ClaimIndicatorAutomatedActivityHandler
   */
  override property get Handler() : ClaimIndicatorAutomatedActivityHandler {
    return super.Handler as ClaimIndicatorAutomatedActivityHandler
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
}
