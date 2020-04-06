package gw.acc.iplm.services

uses gw.acc.iplm.utils.ECFConstants
uses gw.pl.persistence.core.Bundle

class LMMessageReprocessService {

  /**
   * Flags a message to be Reprocessed.
   * Will create a new bundle and commit the transaction in the end.
   *
   * @param messages List of messages to be flagged
   * @return List of flagged messages
   */
  public function flagToBeReprocessed(messages: List<LMMessage_Ext>) : List<LMMessage_Ext> {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      messages = flagToBeReprocessed(messages, bundle)
    }, ECFConstants.ECF_SUPER_USER)
    return messages
  }

  /**
   * Flags a message to be Reprocessed.
   *
   * @param messages List of messages to be flagged
   * @param bundle Transaction Bundle
   * @return List of flagged messages
   */
  public function flagToBeReprocessed(messages: List<LMMessage_Ext>, bundle: Bundle) : List<LMMessage_Ext> {
    return messages.map(\message -> changeReprocessFlag(message, true, bundle))
  }

  /**
   * Unflags a message from being Reprocessed.
   * Will create a new bundle and commit the transaction in the end.
   *
   * @param messages List of messages to be unflagged
   * @return List of unflagged messages
   */
  public function unflagFromReprocess(messages: List<LMMessage_Ext>) : List<LMMessage_Ext> {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      messages = unflagFromReprocess(messages, bundle)
    }, ECFConstants.ECF_SUPER_USER)
    return messages
  }

  /**
   * Unflags a message from being Reprocessed.
   *
   * @param messages List of messages to be unflagged
   * @param bundle Transaction Bundle
   * @return List of unflagged messages
   */
  public function unflagFromReprocess(messages: List<LMMessage_Ext>, bundle: Bundle) : List<LMMessage_Ext> {
    return messages.map(\message -> changeReprocessFlag(message, false, bundle))
  }

  private function changeReprocessFlag(message: LMMessage_Ext, value: Boolean, bundle: Bundle) : LMMessage_Ext{
    message = bundle.add(message)
    message.Reprocess = value
    return message
  }

}