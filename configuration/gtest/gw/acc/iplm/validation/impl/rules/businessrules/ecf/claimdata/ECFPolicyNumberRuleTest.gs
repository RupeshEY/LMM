package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ECFPolicyNumberRuleTest extends GUnitTestClass {

  private var _rule: ECFPolicyNumberRule
  private var _cn: ECFMessageClaimNotifyRq_Ext
  private var _cr: ECFMessageClaimRetrieveRs_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _cn = ECFMessageEntityUtil.createClaimNotifyRq()
    _cr = ECFMessageEntityUtil.createClaimRetrieveRs()
    _rule = new ECFPolicyNumberRule()
  }

  public function testNullPolicyNumber() {
    _cn.PolicyNumber = null
    assertCausesException(\-> {
      _rule.validate(_cn)
    }, ECFException)
  }

  public function testInValidClaim() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cn.PolicyNumber = "54-123456"
        _cn.UCR = createClaim().UCR_Ext
        try {
          _rule.validate(_cn)
        } catch (e: IllegalArgumentException) {
          fail("The XML had a valid Policy Number, but still failed validation rule")
        }
      })
    })
  }

  public function testValidClaim() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cn.UCR = createClaim().UCR_Ext
        _cn.PolicyNumber = "54-123456"
        _cn.UCR = createClaim().UCR_Ext
        try {
          _rule.validate(_cn)
        } catch (e: IllegalArgumentException) {
          fail("The XML had a valid Policy Number, but still failed validation rule")
        }
      })
    })
  }

  public function testValidPolicy() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cn.UCR = "123"
        _cn.PolicyNumber = "54-123456"
        _cn.UCR = createClaim().UCR_Ext
        try {
          _rule.validate(_cn)
        } catch (e: IllegalArgumentException) {
          fail("The XML had a valid Policy Number, but still failed validation rule")
        }
      })
    })
  }

  public function testInValidPolicy() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cn.UCR = "123"
        _cn.PolicyNumber = "200000000102"
        assertCausesException(\-> {
          _rule.validate(_cn)
        }, ECFException)
      })
    })
  }

  public function testInvalidClaimAndPolicy() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cn.UCR = "1234"
      _cn.PolicyNumber = "200000000102"
        assertCausesException(\-> {
      _rule.validate(_cn)
    }, ECFException)
      })
    })
  }

  public function testInValidClaim_ClaimRetrieve() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cr.PolicyNumber = "54-123456"
        _cr.UCR = createClaim().UCR_Ext
        try {
          _rule.validate(_cr)
        } catch (e: IllegalArgumentException) {
          fail("The XML had a valid Policy Number, but still failed validation rule")
        }
      })
    })
  }

  public function testValidClaim_ClaimRetrieve() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cr.UCR = createClaim().UCR_Ext
        _cr.PolicyNumber = "54-123456"
        _cr.UCR = createClaim().UCR_Ext
        try {
          _rule.validate(_cr)
        } catch (e: IllegalArgumentException) {
          fail("The XML had a valid Policy Number, but still failed validation rule")
        }
      })
    })
  }

  public function testValidPolicy_ClaimRetrieve() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cr.UCR = "123"
        _cr.PolicyNumber = "54-123456"
        _cr.UCR = createClaim().UCR_Ext
        try {
          _rule.validate(_cr)
        } catch (e: IllegalArgumentException) {
          fail("The XML had a valid Policy Number, but still failed validation rule")
        }
      })
    })
  }

  public function testInValidPolicy_ClaimRetrieve() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cr.UCR = "123"
        _cr.PolicyNumber = "200000000102"
        assertCausesException(\-> {
          _rule.validate(_cr)
        }, ECFException)
      })
    })
  }

  public function testInvalidClaimAndPolicy_ClaimRetrieve() {
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _cr.UCR = "1234"
        _cr.PolicyNumber = "200000000102"
        assertCausesException(\-> {
          _rule.validate(_cr)
        }, ECFException)
      })
    })
  }

  private static function createClaim(): Claim {
    return ClaimBuilderHelper.createClaim(true)
  }
}