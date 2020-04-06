package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.database.Query
uses gw.api.locale.DisplayKey
uses gw.testharness.v3.GUnitTestClass

class IMRDocumentPostRsServiceTest extends GUnitTestClass {

  private var _service : IMRDocumentPostRsService
  private var _entity : ECFMessageDocumentPostRs_Ext
  private var _claim : Claim

  override function beforeMethod() {
    _entity = ECFMessageEntityUtil.createDocumentPostRs()
    _service = new IMRDocumentPostRsService()
    _claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _entity.Claim = _claim
    }, User.util.UnrestrictedUser)
  }

  override function afterMethod(error: Throwable) {
    ECFMessageEntityUtil.deleteAllECFMessagesFromDB()
    deleteAllDocuments()
  }

  function testResetDocumentStatusWhenFailed_Download() {
    var downloadEntity = ECFMessageEntityUtil.createDocumentDownloadRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _entity = bundle.add(_entity)
      downloadEntity.Document = bundle.add(downloadEntity.Document)

      downloadEntity.Document.ECFStatus = ECFDocumentStatus_Ext.TC_PENDING_DOWNLOAD
      _entity.ReferredUUID = downloadEntity.UUID
      _entity.OperationStatus = ECFDocumentMsgStatus_Ext.TC_INVALID_PAYLOAD
    }, User.util.UnrestrictedUser)

    _service.process(_entity)

    assertEquals(ECFDocumentStatus_Ext.TC_ON_IMR, _entity.ReferredMessage.Document.ECFStatus)
  }

  function testResetDocumentStatusWhenFailed_Upload() {
    var uploadEntity = ECFMessageEntityUtil.createDocumentUploadRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _entity = bundle.add(_entity)
      uploadEntity.Document = bundle.add(uploadEntity.Document)

      uploadEntity.Document.ECFStatus = ECFDocumentStatus_Ext.TC_PENDING_UPLOAD
      _entity.ReferredUUID = uploadEntity.UUID
      _entity.OperationStatus = ECFDocumentMsgStatus_Ext.TC_INVALID_PAYLOAD
    }, User.util.UnrestrictedUser)

    _service.process(_entity)

    assertEquals(ECFDocumentStatus_Ext.TC_ON_DMS, _entity.ReferredMessage.Document.ECFStatus)
  }

  function testResetDocumentStatusWhenFailed_Search() {
    var searchEntity = ECFMessageEntityUtil.createDocumentSearchRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _entity = bundle.add(_entity)

      _entity.ReferredUUID = searchEntity.UUID
      _entity.OperationStatus = ECFDocumentMsgStatus_Ext.TC_INVALID_PAYLOAD
    }, User.util.UnrestrictedUser)

    // At the moment search messages with an invalid payload response are not supposed to do anything. This is just to test this does not cause an exception
    _service.process(_entity)
  }

  function testCreateActivityWhenFailed() {
    var searchEntity = ECFMessageEntityUtil.createDocumentSearchRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _entity = bundle.add(_entity)

      _entity.ReferredUUID = searchEntity.UUID
      _entity.OperationStatus = ECFDocumentMsgStatus_Ext.TC_INVALID_PAYLOAD
    }, User.util.UnrestrictedUser)

    final var initialActivities = _claim.Activities.Count

    _service.process(_entity)
    _claim = _claim.refresh() as Claim

    assertEquals(initialActivities + 1, _claim.Activities.Count)
    assertEquals(DisplayKey.get("Accelerator.IPLM.Activity.IMR.PostRsFailed.ShortSubject"), _claim.Activities.orderBy(\act -> act.CreateTime).last().ShortSubject)
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