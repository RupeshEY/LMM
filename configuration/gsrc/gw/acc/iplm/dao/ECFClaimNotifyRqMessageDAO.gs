package gw.acc.iplm.dao

uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.path.Paths

class ECFClaimNotifyRqMessageDAO {

  /**
   * This method returns all suspended claim data messages for the given claim transaction.
   *
   * @param ucr UCR for the message
   * @param umr UMR for the message
   * @param tr  TR for the message
   * @return List of all all suspended claim data messages
   */
  function findAllSuspendedMsgsForClaimTransaction(ucr: String, umr: String, tr: String): List<ECFMessageClaimData_Ext> {
    return Query.make(ECFMessageClaimData_Ext)
        .compare(ECFMessageClaimData_Ext#Suspended, Equals, true)
        .compare(ECFMessageClaimData_Ext#UCR, Equals, ucr)
        .compare(ECFMessageClaimData_Ext#UMR, Equals, umr)
        .compare(ECFMessageClaimData_Ext#TR, Equals, tr)
        .select()
        .orderBy(QuerySelectColumns.path(Paths.make(ECFMessageClaimData_Ext#CreateTime)))
        .toList()
  }
}