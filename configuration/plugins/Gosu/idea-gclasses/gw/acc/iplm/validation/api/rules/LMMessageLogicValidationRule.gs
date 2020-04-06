package gw.acc.iplm.validation.api.rules

uses entity.LMMessage_Ext

/**
 * this class will be the base class for business logic validation
 */
interface LMMessageLogicValidationRule<T extends LMMessage_Ext> {

  /**
   * this method is the base method for validating business logic.
   * @param message entity representing the message
   */
  function validate(message: T)
}