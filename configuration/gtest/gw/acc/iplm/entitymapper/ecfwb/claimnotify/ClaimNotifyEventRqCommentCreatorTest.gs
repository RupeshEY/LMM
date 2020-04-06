package gw.acc.iplm.entitymapper.ecfwb.claimnotify

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ClaimNotifyEventRqCommentCreatorTest extends GUnitTestClass {

  private var _entityMapperService = new EntityMapperService()

  function testNewClaimNotifyRqWithEmptyComments() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        // Given
        final var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
        xmlPayload.ClaimMovement.Extension.ClaimEntry.Comments.PublicComments = null
        xmlPayload.ClaimMovement.Extension.ClaimEntry.Comments.PrivateComments.Comment = {}
        xmlPayload.ClaimMovement.Extension.ClaimEntry.Comments.CrossMarketComments = {}
        xmlPayload.ClaimMovement.Extension.ClaimEntry.Comments.Broker = {}
        xmlPayload.ClaimMovement.Extension.ClaimEntry.Comments.SlipLead = {}
        xmlPayload.ClaimMovement.Extension.ClaimEntry.AggregateDetails = {}

        // When
        final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext

        // Then
        assertEquals(0, ecfMessage.BrokerComments.length)
        assertEquals(0, ecfMessage.SlipLeadComments.length)
        assertEquals(0, ecfMessage.PublicComments.length)
        assertEquals(0, ecfMessage.PrivateComments.length)
        assertEquals(0, ecfMessage.CrossMarketPublicComments.length)
        assertEquals(0, ecfMessage.CrossMarketPrivateComments.length)
        assertEquals(0, ecfMessage.AggregateDetails.length)
      })
    })
  }

  function testNewClaimNotifyRqWithoutComments() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        // Given
        final var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
        xmlPayload.ClaimMovement.Extension.ClaimEntry.Comments = null
        xmlPayload.ClaimMovement.Extension.ClaimEntry.AggregateDetails = {}

        // When
        final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext

        // Then
        assertEquals(0, ecfMessage.BrokerComments.length)
        assertEquals(0, ecfMessage.SlipLeadComments.length)
        assertEquals(0, ecfMessage.PublicComments.length)
        assertEquals(0, ecfMessage.PrivateComments.length)
        assertEquals(0, ecfMessage.CrossMarketPublicComments.length)
        assertEquals(0, ecfMessage.CrossMarketPrivateComments.length)
        assertEquals(0, ecfMessage.AggregateDetails.length)
      })
    })
  }

  function testNewClaimNotifyRqWithComments() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
        final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext

        assertEquals(1, ecfMessage.BrokerComments.length)
        final var brokerComment1 = ecfMessage.BrokerComments[0]
        assertEquals(1, brokerComment1.LineNumber)
        assertEquals("AJH DCF DWHC UDHSF UFHUFHV DFOUI DFUH UDHV UHFVUFHVUFHVB", brokerComment1.Detail)

        assertEquals(1, ecfMessage.SlipLeadComments.length)
        final var slipLead1 = ecfMessage.SlipLeadComments[0]
        assertEquals(1, slipLead1.LineNumber)
        assertEquals("SlipLeadAJH", slipLead1.Detail)

        assertEquals(2, ecfMessage.PublicComments.length)
        final var publicComment1 = ecfMessage.PublicComments.firstWhere(\cmnt -> cmnt.Detail == "public comments 1")
        assertEquals(1, publicComment1.LineNumber)
        final var publicComment2 = ecfMessage.PublicComments.firstWhere(\cmnt -> cmnt.Detail == "XCS Query")
        assertEquals(2, publicComment2.LineNumber)

        assertEquals(2, ecfMessage.PrivateComments.length)
        final var privateComment1 = ecfMessage.PrivateComments.firstWhere(\cmnt -> cmnt.Detail == "private comments 1")
        assertEquals(1, privateComment1.LineNumber)
        final var privateComment2 = ecfMessage.PrivateComments.firstWhere(\cmnt -> cmnt.Detail == "XCS Query Private")
        assertEquals(2, privateComment2.LineNumber)

        assertEquals(3, ecfMessage.CrossMarketPublicComments.length)
        final var crossMarketPublicComment1 = ecfMessage.CrossMarketPublicComments.firstWhere(\cmnt ->
            cmnt.SyndicateName == "WRITE BACK TEST1")
        assertEquals(ECFBureauType_Ext.TC_LIRMA, crossMarketPublicComment1.BureauAgency)
        assertEquals(1, crossMarketPublicComment1.LineNumber)
        assertEquals("writeback test", crossMarketPublicComment1.Detail)
        final var crossMarketPublicComment2 = ecfMessage.CrossMarketPublicComments.firstWhere(\cmnt ->
            cmnt.SyndicateName == "LLOYD'S SYNDICATE TEST ACCOUNT")
        assertEquals(ECFBureauType_Ext.TC_LLOYDS, crossMarketPublicComment2.BureauAgency)
        assertEquals(1, crossMarketPublicComment2.LineNumber)
        assertEquals("tetsing writeback", crossMarketPublicComment2.Detail)

        assertEquals(1, ecfMessage.CrossMarketPrivateComments.length)
        final var crossMarketPrivateComment1 = ecfMessage.CrossMarketPrivateComments.firstWhere(\cmnt ->
            cmnt.SyndicateName == "LLOYD'S SYNDICATE TEST ACCOUNT")
        assertEquals(ECFBureauType_Ext.TC_LLOYDS, crossMarketPrivateComment1.BureauAgency)
        assertEquals(1, crossMarketPrivateComment1.LineNumber)
        assertEquals("swaty1", crossMarketPrivateComment1.Detail)

        assertEquals(1, ecfMessage.AggregateDetails.length)
        final var aggregateDetail1 = ecfMessage.AggregateDetails[0]
        assertEquals(1, aggregateDetail1.LineNumber)
        assertEquals("descAD", aggregateDetail1.Detail)
      })
    })
  }
}