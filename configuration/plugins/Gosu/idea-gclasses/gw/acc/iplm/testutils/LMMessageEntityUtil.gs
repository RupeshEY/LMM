package gw.acc.iplm.testutils

uses gw.api.database.Query
uses gw.transaction.Transaction

class LMMessageEntityUtil {

  public static function getAllLMMessages(): List<LMMessage_Ext> {
    return Query.make(LMMessage_Ext).select().toList()
  }

  public static function deleteAllLMMessagesFromDB() {
    var messageList = getAllLMMessages()
    Transaction.runWithNewBundle(\bundle -> {
      messageList.each(\elt -> bundle.delete(elt))
    }, "su")
  }

}