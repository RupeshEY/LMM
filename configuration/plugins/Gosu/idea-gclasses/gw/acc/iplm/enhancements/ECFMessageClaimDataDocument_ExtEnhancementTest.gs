package gw.acc.iplm.enhancements

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimDataDocument_ExtBuilder
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ECFMessageClaimDataDocument_ExtEnhancementTest extends GUnitTestClass {

  var _docBuilder = new ECFMessageClaimDataDocument_ExtBuilder()

  function testEmptySizeAndFormat() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var doc = _docBuilder.create()
        assertEquals("", doc.Size)
      })
    })
  }

  function testEmptyFormat() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _docBuilder.withFileSize(12bd)
        var doc = _docBuilder.create()
        assertEquals("12.0000", doc.Size)
      })
    })
  }

  function testCombinesSizeAndUnit() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _docBuilder.withFileSize(12bd)
        _docBuilder.withFileSizeUnit(ECFMsgNotifRqDocSizeUnit_Ext.TC_MB)
        var doc = _docBuilder.create()
        assertEquals("12.0000 MB", doc.Size)
      })
    })
  }

  // business wise it should not happen, there should be size present
  function testOnlyUnit() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _docBuilder.withFileSizeUnit(ECFMsgNotifRqDocSizeUnit_Ext.TC_MB)
        var doc = _docBuilder.create()
        assertEquals(" MB", doc.Size)
      })
    })
  }
}