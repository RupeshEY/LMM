package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.interceptor.EntityMapperInterceptor
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass

class ECFMessageDocumentPostRs_ExtEnhancementTest extends GUnitTestClass {

  override function afterMethod(error: Throwable) {
    ECFMessageEntityUtil.deleteAllECFMessagesFromDB()
    deleteAllDocuments()
  }

  function testReferredMessage() {
    var downloadEntity = ECFMessageEntityUtil.createDocumentDownloadRq()

    var postRsXml = ECFMessageUtil.createNewPostRs()
    postRsXml.MsgItems.MsgItem.first().MsgId = downloadEntity.UUID

    var postRsEntity = new EntityMapperInterceptor().logMessage(postRsXml) as ECFMessageDocumentPostRs_Ext

    assertEquals(downloadEntity, postRsEntity.ReferredMessage)
  }

  private function deleteAllDocuments() {
    var allDocs = Query.make(Document).select().toList()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      allDocs.each(\elt -> {
        bundle.delete(elt.Claim.Policy)
        bundle.delete(elt.Claim)
        bundle.delete(elt)
      })
    }, User.util.UnrestrictedUser)
  }
}