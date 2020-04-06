package gw.acc.iplm.utils.pcf.admin

uses entity.LMMessage_Ext
uses gw.api.database.Query

class ECFAdminMessageLogHelper {

  /**
   * Returns a list of LM Messages from the database, based on the filtering criteria
   * passed in as arguments.
   *
   * @param messageCategory
   * @param startDate
   * @param endDate
   * @param includeSuspended
   * @param messageDirection
   * @return List<entity.ECFMessage_Ext>
   */
  public static function getLMMessages(messageCategory: LMMessageCategory_Ext, startDate: Date, endDate: Date, includeSuspended: boolean, messageDirection : ECFMessageDirectionType_Ext): List<entity.LMMessage_Ext> {
    var messageQuery = Query.make(LMMessage_Ext)

    if (startDate != null) {
      messageQuery.compare(LMMessage_Ext#CreateTime, GreaterThanOrEquals, startDate.trimToMidnight())
    }

    if (endDate != null) {
      messageQuery.compare(LMMessage_Ext#CreateTime, LessThan, endDate.trimToMidnight().addDays(1))
    }

    if (not includeSuspended) {
      messageQuery.compare(LMMessage_Ext#Suspended, Equals, false)
    }

    if (messageCategory != null) {
      messageQuery.compare(LMMessage_Ext#MessageCategory, Equals, messageCategory)
    }

    if (messageDirection != null) {
      messageQuery.compare(LMMessage_Ext#MessageDirection, Equals, messageDirection)
    }

    var messages = messageQuery.select().toList()

    return messages
  }

  /**
   * Returns a specific Message Direction if only one exists for the provided message category. Returns
   * null if there are more than one option (i.e: no restriction).
   *
   * @param messageCategory
   * @return {@link typekey.ECFMessageDirectionType_Ext} A specific message direction, or null if there's no restriction
   */
  public static function getMessageDirectionRestrictionForCategory(messageCategory: LMMessageCategory_Ext) : ECFMessageDirectionType_Ext{
    switch (messageCategory){
      case LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY:
      case LMMessageCategory_Ext.TC_LLOYDSSCM:
        return ECFMessageDirectionType_Ext.TC_INBOUND
      default:
        return null
    }
  }

}