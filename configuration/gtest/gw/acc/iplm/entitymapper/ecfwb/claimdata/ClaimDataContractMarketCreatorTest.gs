package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ClaimDataContractMarketCreatorTest extends GUnitTestClass {
  private static var _claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()
  private static var _claimNotifyDTO: ClaimMessageDTO
  private static var _retrieveClaimXml = ECFMessageUtil.createNewClaimRetrieveRs()
  private static var _retrieveClaimDTO: ClaimMessageDTO

  override function beforeClass() {
    _claimNotifyDTO = new ClaimMessageDTO(_claimNotifyXml)
    _retrieveClaimDTO = new ClaimMessageDTO(_retrieveClaimXml)
    super.beforeClass()
  }

  function testCorrectNumberOfInsurersAreCreated_ClaimNotify() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimDataEntity = new ECFMessageClaimData_Ext()
        ClaimDataContractMarketCreator.createContractMarket(claimDataEntity, _claimNotifyDTO)
        assertEquals(4, claimDataEntity.ECFContractMarkets.length)
      })
    })
  }

  function testCorrectNumberOfInsurersAreCreated_RetrieveClaim() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimDataEntity = new ECFMessageClaimData_Ext()
        ClaimDataContractMarketCreator.createContractMarket(claimDataEntity, _retrieveClaimDTO)
        assertEquals(4, claimDataEntity.ECFContractMarkets.length)
      })
    })
  }

  function testCorrectDataIsMapped_ClaimNotify() {
    var leadId = "urn:lloyds:0623"
    var agreementPartyId = "urn:lirma:C1104"
    var followerId1 = "urn:lloyds:2623"
    var followerId2 = "urn:lirma:GW2001"

    var leadName = "Beazley 0623"
    var agreementPartyName = "Chubb C1104"
    var followerName1 = "Beazley 2623"
    var followerName2 = "SYNDICATE 2001"

    var leadPercentage = 50.0000000bd
    var agreementPartyPercentage = 15.0000000bd
    var followerPercentage1 = 25.0000000bd
    var followerPercentage2 = 10.0000000bd

    var bureau1 = ECFBureauType_Ext.TC_LLOYDS
    var bureau2 = ECFBureauType_Ext.TC_LIRMA

    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimDataEntity = new ECFMessageClaimData_Ext()
        ClaimDataContractMarketCreator.createContractMarket(claimDataEntity, _claimNotifyDTO)
        assertTrue("Lead ID not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyID).contains(leadId))
        assertTrue("Agreement Party ID not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyID).contains(agreementPartyId))
        assertTrue("Follower 1 ID not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyID).contains(followerId1))
        assertTrue("Follower 2 ID not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyID).contains(followerId2))

        assertTrue("Lead name not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyName).contains(leadName))
        assertTrue("Agreement Party name not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyName).contains(agreementPartyName))
        assertTrue("Follower 1 name not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyName).contains(followerName1))
        assertTrue("Follower 2 name not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyName).contains(followerName2))

        assertTrue("First bureau not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.Bureau).contains(bureau1))
        assertTrue("Second bureau not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.Bureau).contains(bureau2))

        assertEquals("There should be 1 lead", 1, claimDataEntity.ECFContractMarkets.where(\insurer -> insurer.ParticipantFunction == TC_LEAD).length)
        assertEquals("There should be 1 agreement party", 1, claimDataEntity.ECFContractMarkets.where(\insurer -> insurer.ParticipantFunction == TC_AGREEMENTPARTY).length)
        assertEquals("There should be 2 followers", 2, claimDataEntity.ECFContractMarkets.where(\insurer -> insurer.ParticipantFunction == TC_FOLLOWER).length)

        assertEquals("There should be 1 primary role", 1, claimDataEntity.ECFContractMarkets.where(\insurer -> insurer.IsPrimaryRole).length)

        assertEquals(leadPercentage, claimDataEntity.ECFContractMarkets.firstWhere(\insurer -> insurer.PartyID == leadId).InsurerSharePercentage)
        assertEquals(agreementPartyPercentage, claimDataEntity.ECFContractMarkets.firstWhere(\insurer -> insurer.PartyID == agreementPartyId).InsurerSharePercentage)
        assertEquals(followerPercentage1, claimDataEntity.ECFContractMarkets.firstWhere(\insurer -> insurer.PartyID == followerId1).InsurerSharePercentage)
        assertEquals(followerPercentage2, claimDataEntity.ECFContractMarkets.firstWhere(\insurer -> insurer.PartyID == followerId2).InsurerSharePercentage)
      })
    })
  }

  function testCorrectDataIsMapped_RetrieveClaim() {
    var leadId = "urn:lloyds:2032"
    var followerId1 = "urn:lloyds:1230"
    var followerId2 = "urn:lloyds:0623"
    var followerId3 = "urn:lloyds:2031"

    var leadName = "LLOYD'S 2032 SYND"
    var followerName1 = "LLOYD'S SYNDICATE"
    var followerName2 = "Beazley 0623"
    var followerName3 = "LLOYD'S 2031 SYND"

    var leadPercentage = 5.0000000bd
    var followerPercentage1 = 32.0000000bd
    var followerPercentage2 = 5.0000000bd
    var followerPercentage3 = 5.0000000bd

    var bureau1 = ECFBureauType_Ext.TC_LLOYDS

    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var claimDataEntity = new ECFMessageClaimData_Ext()
        ClaimDataContractMarketCreator.createContractMarket(claimDataEntity, _retrieveClaimDTO)
        assertTrue("Lead ID not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyID).contains(leadId))
        assertTrue("Follower 1 ID not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyID).contains(followerId1))
        assertTrue("Follower 2 ID not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyID).contains(followerId2))
        assertTrue("Follower 3 ID not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyID).contains(followerId3))

        assertTrue("Lead name not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyName).contains(leadName))
        assertTrue("Follower 1 name not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyName).contains(followerName1))
        assertTrue("Follower 2 name not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyName).contains(followerName2))
        assertTrue("Follower 3 name not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.PartyName).contains(followerName3))

        assertTrue("Bureau not mapped", claimDataEntity.ECFContractMarkets.map(\insurer -> insurer.Bureau).contains(bureau1))

        assertEquals("There should be 1 lead", 1, claimDataEntity.ECFContractMarkets.where(\insurer -> insurer.ParticipantFunction == TC_LEAD).length)
        assertEquals("There should be 3 followers", 3, claimDataEntity.ECFContractMarkets.where(\insurer -> insurer.ParticipantFunction == TC_FOLLOWER).length)
        assertEquals("There should be 0 agreement parties", 0, claimDataEntity.ECFContractMarkets.where(\insurer -> insurer.ParticipantFunction == TC_AGREEMENTPARTY).length)

        assertEquals("There should be 1 primary role", 1, claimDataEntity.ECFContractMarkets.where(\insurer -> insurer.IsPrimaryRole).length)

        assertEquals(leadPercentage, claimDataEntity.ECFContractMarkets.firstWhere(\insurer -> insurer.PartyID == leadId).InsurerSharePercentage)
        assertEquals(followerPercentage1, claimDataEntity.ECFContractMarkets.firstWhere(\insurer -> insurer.PartyID == followerId1).InsurerSharePercentage)
        assertEquals(followerPercentage2, claimDataEntity.ECFContractMarkets.firstWhere(\insurer -> insurer.PartyID == followerId2).InsurerSharePercentage)
        assertEquals(followerPercentage3, claimDataEntity.ECFContractMarkets.firstWhere(\insurer -> insurer.PartyID == followerId3).InsurerSharePercentage)
      })
    })
  }

}