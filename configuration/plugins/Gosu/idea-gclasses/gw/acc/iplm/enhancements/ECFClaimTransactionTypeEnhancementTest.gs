package gw.acc.iplm.enhancements

uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ECFClaimTransactionTypeEnhancementTest extends GUnitTestClass {

  function testFirstAdviceIsAdvice() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var transactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
        assertTrue(transactionType.IsAdvice)
        assertFalse(transactionType.IsSettlement)
      })
    })
  }
  function testInterimAdviceIsAdvice() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var transactionType = ECFClaimTransactionType_Ext.TC_INTERIMADVICE
        assertTrue(transactionType.IsAdvice)
        assertFalse(transactionType.IsSettlement)
      })
    })
  }

  function testFirstAdviceAndSettlementIsSettlement() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var transactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT
        assertFalse(transactionType.IsAdvice)
        assertTrue(transactionType.IsSettlement)
      })
    })
  }
  function testInterimAdviceAndSettlementIsSettlement() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        var transactionType = ECFClaimTransactionType_Ext.TC_INTERIMADVICEANDSETTLEMENT
        assertFalse(transactionType.IsAdvice)
        assertTrue(transactionType.IsSettlement)
      })
    })
  }
}