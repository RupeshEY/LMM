package gw.acc.iplm.entitymapper.ecfwb.claimnotify

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.testharness.v3.GUnitTestClass

uses java.math.BigDecimal

class TransactionErrorNotifyMapperTest extends GUnitTestClass {

  private var _mapper = TransactionErrorNotifyMapper

  function testMapRespondErrorNotify() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = "urn:lloyds:1234"
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)

      assertEquals(notifyRqXml.UUId, errorNotifyEntity.UUID)
      assertEquals(notifyRqXml.OriginTimeStamp, errorNotifyEntity.OriginTimeStamp)
      assertEquals(ECFMessageType_Ext.TC_TRANSACTIONERRORNOTIFY, errorNotifyEntity.MessageType)
      assertNotNull(errorNotifyEntity.ErrorsOrWarnings)
      assertTrue(errorNotifyEntity.ErrorsOrWarnings.HasElements)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyAdditionalInformation() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var additionInformationFields = notifyRqXml.AdditionalInformation.ExtendedFields
    var expectedUcr = additionInformationFields.firstWhere(\elt -> elt.FieldName == "UCR").FieldValue
    var expectedUmr = additionInformationFields.firstWhere(\elt -> elt.FieldName == "UMR").FieldValue
    var expectedTr = additionInformationFields.firstWhere(\elt -> elt.FieldName == "TR").FieldValue
    var expectedMsgSq = new BigDecimal(additionInformationFields.firstWhere(\elt -> elt.FieldName == "MessageSequenceNumber").FieldValue)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = "urn:lloyds:1234"
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)

      assertEquals(expectedUcr, errorNotifyEntity.UCR)
      assertEquals(expectedUmr, errorNotifyEntity.UMR)
      assertEquals(expectedTr, errorNotifyEntity.TR)
      assertEquals(expectedMsgSq, errorNotifyEntity.MessageSequence)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyBureau_Lloyds() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    notifyRqXml.AdditionalInformation.ExtendedFields.firstWhere(\elt -> elt.FieldName == "Bureau").FieldValue = "SY"
    var expectedBureau = ECFBureauType_Ext.TC_LLOYDS

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = "urn:lloyds:1234"
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)
      assertEquals(expectedBureau, errorNotifyEntity.BureauType)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyBureau_LIRMA() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    notifyRqXml.AdditionalInformation.ExtendedFields.firstWhere(\elt -> elt.FieldName == "Bureau").FieldValue = "LR"
    var expectedBureau = ECFBureauType_Ext.TC_LIRMA

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = "urn:lloyds:1234"
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)
      assertEquals(expectedBureau, errorNotifyEntity.BureauType)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyBureau_ILU() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    notifyRqXml.AdditionalInformation.ExtendedFields.firstWhere(\elt -> elt.FieldName == "Bureau").FieldValue = "IL"
    var expectedBureau = ECFBureauType_Ext.TC_ILU

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = "urn:lloyds:1234"
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)
      assertEquals(expectedBureau, errorNotifyEntity.BureauType)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyTxStatus_DELETE() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    notifyRqXml.ErrorsAndWarnings.Result.first().ErrorCode = "Z001"
    var expectedStatus = ECFTransactionStatus_Ext.TC_DELETED

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = "urn:lloyds:1234"
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)
      assertEquals(expectedStatus, errorNotifyEntity.TransactionStatus)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyTxStatus_ERROR() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    notifyRqXml.ErrorsAndWarnings.Result.first().ErrorCode = "Z002"
    var expectedStatus = ECFTransactionStatus_Ext.TC_3

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = "urn:lloyds:1234"
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)
      assertEquals(expectedStatus, errorNotifyEntity.TransactionStatus)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyTxStatus_PreviousTxError() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    notifyRqXml.ErrorsAndWarnings.Result.first().ErrorCode = "Z003"
    var expectedStatus = ECFTransactionStatus_Ext.TC_4

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = "urn:lloyds:1234"
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)
      assertEquals(expectedStatus, errorNotifyEntity.TransactionStatus)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyReceiverId() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var expectedReceiver = "urn:lloyds:1234"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = expectedReceiver
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)
      assertEquals(expectedReceiver, errorNotifyEntity.ReceiverPartyId)
    }, User.util.UnrestrictedUser)
  }

  function testMapRespondErrorNotifyRole() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var claimNotifyThatCreatedTheClaim = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    var receiver = claimNotifyThatCreatedTheClaim.ReceiverPartyId
    notifyRqXml.AdditionalInformation.ExtendedFields.firstWhere(\elt -> elt.FieldName=="UCR").FieldValue = claimNotifyThatCreatedTheClaim.UCR
    var expectedRole = claimNotifyThatCreatedTheClaim.ReceiverContractMarket.ParticipantFunction

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = receiver
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)

      assertEquals(expectedRole, errorNotifyEntity.Role)

    }, User.util.UnrestrictedUser)
  }

  function testUpdateRespondErrorNotifyTransactionState() {
    var notifyRqXml = ECFMessageUtil.createNewTransactionErrorNotifyRq()
    var expectedReceiver = "urn:lloyds:1234"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMsg = new ECFMessageClaimNotifyRq_Ext(bundle)
      var header = new Xchangingheader()
      header.Receiver.Party.Id = expectedReceiver
      var errorNotifyEntity = _mapper.mapTransactionErrorNotify(claimNotifyMsg, header, notifyRqXml)
      assertNotNull(errorNotifyEntity.ECFTransactionState)
    }, User.util.UnrestrictedUser)
  }
}