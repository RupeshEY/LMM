package gw.acc.iplm.enhancements

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimNotifyRq_ExtBuilder
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ECFMessageClaimNotifyRq_ExtMessageStateEnhancementTest extends GUnitTestClass {

  function testIsMsgStateAwaitingFalse() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        // Given
        var ecfMsg = new ECFMessageClaimNotifyRq_ExtBuilder()
            .withMessageState(null)
            .create()
        // When/Then
        assertFalse(ecfMsg.MessageStateAwaiting)
      })
    })
  }

  function testIsMsgStateAwaitingTrue() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        // Given
        var ecfMsg = new ECFMessageClaimNotifyRq_ExtBuilder()
            .withMessageState(ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE)
            .create()
        // When/Then
        assertTrue(ecfMsg.MessageStateAwaiting)
      })
    })
  }
}