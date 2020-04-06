package gw.acc.iplm.utils.pcf.admin

uses com.guidewire.commons.typelist.TypeFilter
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass

class ECFAdminMessageLogHelperTest extends GUnitTestClass {

  override public function beforeMethod() {
    super.beforeMethod()
    deleteAllMessages()
  }

  public function testGetECFMessages_NoFilter() {
    //Create three different non-suspended messages
    var cn1 = ECFMessageEntityUtil.createClaimNotifyRq()
    var cr1 = ECFMessageEntityUtil.createClaimRetrieveRq()
    var dd1 = ECFMessageEntityUtil.createDocumentDownloadRq()
    //Create one suspended message
    var cn2 = suspendMessage(ECFMessageEntityUtil.createClaimNotifyRq())

    var messageResults = new ECFAdminMessageLogHelper().getLMMessages(null, null, null, false, null)

    assertEquals(3, messageResults.Count)
  }

  public function testGetECFMessages_MessageType() {
    //Create two ClaimNotify types, one suspended, one not suspended
    var cn1 = ECFMessageEntityUtil.createClaimNotifyRq()
    var cn2 = suspendMessage(ECFMessageEntityUtil.createClaimNotifyRq())

    //Create two more messages with different types
    var cr1 = ECFMessageEntityUtil.createClaimRetrieveRq()
    var dd1 = ECFMessageEntityUtil.createDocumentDownloadRq()

    var messageResults = new ECFAdminMessageLogHelper().getLMMessages(getClaimNotifyTypeFilter(), null, null, false, null)

    assertEquals(1, messageResults.Count)
  }

  public function testGetECFMessages_MessageTypeIncludingSuspended() {
    //Create two ClaimNotify types, one suspended, one not suspended
    var cn1 = ECFMessageEntityUtil.createClaimNotifyRq()
    var cn2 = suspendMessage(ECFMessageEntityUtil.createClaimNotifyRq())

    //Create two more messages with different types
    var cr1 = ECFMessageEntityUtil.createClaimRetrieveRq()
    var dd1 = ECFMessageEntityUtil.createDocumentDownloadRq()

    var typeFilter = getClaimNotifyTypeFilter()
    var messageResults = new ECFAdminMessageLogHelper().getLMMessages(typeFilter, null, null, true, null)

    assertEquals(2, messageResults.Count)
  }

  public function testGetECFMessages_StartDate() {
    final var startDateFilter = Date.Now.addDays(-1).trimToMidnight()

    //Create two messages with creation date after the start date filter
    var cn1 = setCreationDate(ECFMessageEntityUtil.createClaimNotifyRq(), startDateFilter.addHours(1))
    var cr1 = setCreationDate(ECFMessageEntityUtil.createClaimRetrieveRq(), startDateFilter.addHours(1))

    //Create two messages with create date before the start date filter (one suspended)
    var dd1 = setCreationDate(ECFMessageEntityUtil.createDocumentDownloadRq(), startDateFilter.addYears(-1))
    var cn2_preSuspend = suspendMessage(ECFMessageEntityUtil.createClaimNotifyRq())
    var cn2 = setCreationDate(cn2_preSuspend, startDateFilter.addYears(-1))

    var messageResults = new ECFAdminMessageLogHelper().getLMMessages(null, startDateFilter, null, false, null)

    assertEquals(2, messageResults.Count)
  }

  public function testGetECFMessages_EndDate() {
    final var endDateFilter = Date.Now.addDays(2).trimToMidnight()

    //Create two messages with creation date before the end date filter
    var cn1 = setCreationDate(ECFMessageEntityUtil.createClaimNotifyRq(), endDateFilter.addHours(-1))
    var cr1 = setCreationDate(ECFMessageEntityUtil.createClaimRetrieveRq(), endDateFilter.addHours(-1))

    //Create two messages with create date after the end date filter (one suspended)
    var dd1 = setCreationDate(ECFMessageEntityUtil.createDocumentDownloadRq(), endDateFilter.addYears(1))
    var cn2_preSuspend = suspendMessage(ECFMessageEntityUtil.createClaimNotifyRq())
    var cn2 = setCreationDate(cn2_preSuspend, endDateFilter.addYears(-1))

    var messageResults = new ECFAdminMessageLogHelper().getLMMessages(null, null, endDateFilter, false, null)

    assertEquals(2, messageResults.Count)
  }

  public function testGetECFMessages_StartDateAndEndDate() {
    final var startDateFilter = Date.Now.addDays(-1).trimToMidnight()
    final var endDateFilter = Date.Now.addDays(2).trimToMidnight()

    //Create two messages with creation date inside the start and end date range
    var cn1 = setCreationDate(ECFMessageEntityUtil.createClaimNotifyRq(), startDateFilter.addHours(1))
    var cr1 = setCreationDate(ECFMessageEntityUtil.createClaimRetrieveRq(), endDateFilter.addHours(-1))

    //Create two messages with create date outside of the start and end date range, plus one suspended.
    var dd1 = setCreationDate(ECFMessageEntityUtil.createDocumentDownloadRq(), startDateFilter.addYears(-1))
    var ds1 = setCreationDate(ECFMessageEntityUtil.createDocumentSearchRq(), endDateFilter.addYears(1))
    var cn2_preSuspend = suspendMessage(ECFMessageEntityUtil.createClaimNotifyRq())
    var cn2 = setCreationDate(cn2_preSuspend, endDateFilter.addYears(-1))

    var messageResults = new ECFAdminMessageLogHelper().getLMMessages(null, startDateFilter, endDateFilter, false, null)

    assertEquals(2, messageResults.Count)
  }

  public function testGetECFMessages_IncludeSuspended() {
    //Create one suspended message
    var cn2 = suspendMessage(ECFMessageEntityUtil.createClaimNotifyRq())

    var messageResults = new ECFAdminMessageLogHelper().getLMMessages(null, null, null, true, null)

    assertEquals(1, messageResults.Count)
  }

  public function testGetECFMessages_AllFilters() {
    final var messageTypeFilter = getClaimNotifyTypeFilter()
    final var startDateFilter = Date.Now.addDays(-1).trimToMidnight()
    final var endDateFilter = Date.Now.addDays(2).trimToMidnight()

    //Create two messages with creation date inside the start and end date range, but do not match the filtered type.
    var cr1 = setCreationDate(ECFMessageEntityUtil.createClaimRetrieveRs(), startDateFilter.addHours(1))
    var cr2 = setCreationDate(ECFMessageEntityUtil.createClaimRetrieveRq(), endDateFilter.addHours(-1))

    //Create two messages with create date outside of the start and end date range, one which matches the type.
    var cn1 = setCreationDate(ECFMessageEntityUtil.createClaimNotifyRq(), startDateFilter.addYears(-1))
    var ds1 = setCreationDate(ECFMessageEntityUtil.createDocumentSearchRq(), endDateFilter.addYears(1))

    //Create two messages which adhere to all filters.
    var cn2 = setCreationDate(ECFMessageEntityUtil.createClaimNotifyRq(), startDateFilter.addHours(1))
    var cn3_preSuspend = suspendMessage(ECFMessageEntityUtil.createClaimNotifyRq())
    var cn3 = setCreationDate(cn3_preSuspend, endDateFilter.addHours(-1))

    var messageResults = new ECFAdminMessageLogHelper().getLMMessages(messageTypeFilter, startDateFilter, endDateFilter, true, null)

    assertEquals(2, messageResults.Count)
  }

  private function deleteAllMessages() {
    var allMessages = Query.make(LMMessage_Ext).select().toList()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      allMessages.each(\elt -> {
        bundle.delete(elt)
      })
    }, User.util.UnrestrictedUser)
  }

  private function suspendMessage(ecfMessage: ECFMessage_Ext): ECFMessage_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      ecfMessage.Suspended = true
    }, User.util.UnrestrictedUser)

    return ecfMessage
  }

  private function setCreationDate(ecfMessage: ECFMessage_Ext, newDateTime: Date): ECFMessage_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      ecfMessage.setFieldValue("CreateTime", newDateTime)
    }, User.util.UnrestrictedUser)

    return ecfMessage
  }

  private function getClaimNotifyTypeFilter(): LMMessageCategory_Ext {
    return LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
  }

}