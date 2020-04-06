package gw.acc.iplm.desktop

uses gw.api.database.Query

class DesktopMessageSuspenseQueue {

  /**
   * Returns the count of all Suspended Messages assigned to a given user
   * @param user
   * @return Count of Suspended Messages
   */
  public static function getSuspendedMessagesCount(user: User) : Integer {
      return Query.make(LMMessage_Ext)
          .compare(LMMessage_Ext#Suspended, Equals, true)
          .compare(LMMessage_Ext#AssignedUser, Equals, user)
          .select()
          .Count
  }
}