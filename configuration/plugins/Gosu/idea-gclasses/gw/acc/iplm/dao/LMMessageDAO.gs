package gw.acc.iplm.dao

uses entity.LMMessage_Ext
uses gw.api.database.Query

class LMMessageDAO {

  /**
   * Update the Status field of an LMMessage_Ext
   *
   * @param UUID of the LMMessage_Ext to change status of
   * @return Updated LMMessage_Ext or null if UUID could not be found
   */
  function setMessageStatus(ecfMessageUuid : String, messageStatus : ECFMessageStatus_Ext) : LMMessage_Ext {
    var msg = getMessageWithUuid(ecfMessageUuid)
    return setMessageStatus(msg, messageStatus)
  }

  /**
   * Update the Status field of an LMMessage_Ext
   *
   * @param LMMessage_Ext the entity to change status of
   * @return Updated LMMessage_Ext
   */
  function setMessageStatus(ecfMessage : LMMessage_Ext, messageStatus : ECFMessageStatus_Ext) : LMMessage_Ext {
    if (ecfMessage == null) {
      return null
    }
    
    var bundle = gw.transaction.Transaction.getCurrent()?:gw.transaction.Transaction.newBundle()
    bundle.add(ecfMessage)
    ecfMessage.Status = messageStatus
    return ecfMessage
  }

  /**
   * Query the database for a message with a given UUID
   *
   * @param uuid to query
   * @return LMMessage_Ext logged entity from database with the UUID
   */
  function getMessageWithUuid(uuid : String) : LMMessage_Ext {
    return Query.make(LMMessage_Ext)
        .compare(LMMessage_Ext#UUID, Equals, uuid)
        .select().FirstResult
  }
}