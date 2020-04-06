package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

/**
 * This class tests the functionality of ClaimDataContactsCreator
 */

class ClaimDataContactsCreatorTest extends GUnitTestClass {

  private var _entityMapperService = new EntityMapperService()

  function testNewClaimNotifyRqContactData() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
        final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimData_Ext
        assertEquals("ADJUSTER", ecfMessage.ECFContactData.AdjusterName)
        assertNull("Sample XML does not have Adjuster Reference, it must be null", ecfMessage.ECFContactData.AdjusterReference)
        assertEquals("TEST BROKER 0001", ecfMessage.ECFContactData.BrokerPartyName)
        assertEquals("GW0001", ecfMessage.ECFContactData.BrokerPartyId)
        assertEquals("xxxxx", ecfMessage.ECFContactData.BrokerContactName)
        assertEquals("1234", ecfMessage.ECFContactData.BrokerContactTelephone)
        assertEquals("SYNDICATE 0566", ecfMessage.ECFContactData.BureauLeadInsurerOrReinsurer)
        assertEquals("xxxxxx", ecfMessage.ECFContactData.BureauLeadInsurerContactName)
        assertNull("Sample XML does not have Contact Telephone info for BureauLeadingInsurerOrReinsurer, it must be null", ecfMessage.ECFContactData.BureauLeadInsurerContactPhone)
        assertEquals("abcd@efg.com", ecfMessage.ECFContactData.BureauLeadInsurerContactEmail)
        assertEquals("urn:lloyds:0623", ecfMessage.ECFContactData.InsurerId)
        assertEquals("Beazley 0623", ecfMessage.ECFContactData.InsurerName)
        assertEquals("lloyds", ecfMessage.ECFContactData.InsurerAgency)
        assertNull("Sample XML does not have Reinsurer Id, it must be null", ecfMessage.ECFContactData.ReinsurerId)
        assertNull("Sample XML does not have Reinsurer Name, it must be null", ecfMessage.ECFContactData.ReinsurerName)
        assertNull("Sample XML does not have Reinsurer Agency, it must be null", ecfMessage.ECFContactData.ReinsurerAgency)
        assertEquals("LAWYER", ecfMessage.ECFContactData.LawyerName)
        assertNull("Sample XML does not have Lawyer Reference, it must be null", ecfMessage.ECFContactData.LawyerReference)
      })
    })
  }

  function testNewClaimRetrieveRsContactData() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var xmlPayload = ECFMessageUtil.createNewClaimRetrieveRs()
        final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimData_Ext
        assertNull("Sample XML does not have Adjuster Name, it must be null", ecfMessage.ECFContactData.AdjusterName)
        assertNull("Sample XML does not have Adjuster Reference, it must be null", ecfMessage.ECFContactData.AdjusterReference)
        assertEquals("G2 TEST 31AP", ecfMessage.ECFContactData.BrokerPartyName)
        assertEquals("urn:lloyds:0001", ecfMessage.ECFContactData.BrokerPartyId)
        assertEquals("XXXXX", ecfMessage.ECFContactData.BrokerContactName)
        assertEquals("123566", ecfMessage.ECFContactData.BrokerContactTelephone)
        assertEquals("LLOYD'S 2032 SYND", ecfMessage.ECFContactData.BureauLeadInsurerOrReinsurer)
        assertEquals("BACK21", ecfMessage.ECFContactData.BureauLeadInsurerContactName)
        assertEquals("67676767", ecfMessage.ECFContactData.BureauLeadInsurerContactPhone)
        assertNull("Sample XML does not have Contact Email for BureauLeadingInsurerOrReinsurer, it must be null", ecfMessage.ECFContactData.BureauLeadInsurerContactEmail)
        assertEquals("urn:lloyds:0623", ecfMessage.ECFContactData.InsurerId)
        assertEquals("Beazley 0623", ecfMessage.ECFContactData.InsurerName)
        assertEquals("lloyds", ecfMessage.ECFContactData.InsurerAgency)
        assertNull("Sample XML does not have Reinsurer Id, it must be null", ecfMessage.ECFContactData.ReinsurerId)
        assertNull("Sample XML does not have Reinsurer Name, it must be null", ecfMessage.ECFContactData.ReinsurerName)
        assertNull("Sample XML does not have Reinsurer Agency, it must be null", ecfMessage.ECFContactData.ReinsurerAgency)
        assertNull("Sample XML does not have Lawyer Name, it must be null", ecfMessage.ECFContactData.LawyerName)
        assertNull("Sample XML does not have Lawyer Reference, it must be null", ecfMessage.ECFContactData.LawyerReference)
      })
    })
  }
}