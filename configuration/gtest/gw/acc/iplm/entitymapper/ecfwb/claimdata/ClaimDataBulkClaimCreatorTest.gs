package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.services.message.MonetaryAmountAsserter
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.testdata.TestDataUtil
uses gw.api.util.DateUtil
uses gw.testharness.v3.GUnitTestClass

class ClaimDataBulkClaimCreatorTest extends GUnitTestClass {

  private var _entityMapperService = new EntityMapperService()

  function testNewClaimNotifyRqWithDocuments() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var xmlPayload = ECFMessageUtil.createNewClaimNotifyRqWithBulk()
        final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
        assertEquals(2bd, ecfMessage.BulkClaimNoOfItems)
        assertEquals("00000000", ecfMessage.BulkClaimHeaderUCR)
        assertEquals("000000000001", ecfMessage.BulkClaimHeaderTR)

        assertEquals(2, ecfMessage.BulkClaims.length)
        final var bulk1 = ecfMessage.BulkClaims.firstWhere(\crr -> crr.UCR == "111111111")
        assertEquals("1111111110001", bulk1.TR)
        assertEquals("Phil Todd", bulk1.LossName)
        assertEquals(DateUtil.createDateInstance(11, 28, 2015).getTime(), bulk1.LossDate.getTime())

        // we have 3 Details in the xml. One of them is a duplicate, we can see that it's ignored
        assertEquals(2, bulk1.Details.length)
        final var bulk1Detail1 = bulk1.Details.firstWhere(\crr -> crr.SettlementCurrency == Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(100000, bulk1Detail1.SettlementAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(1234567890123.01d, bulk1Detail1.OutstandingAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(1234567890123.02d, bulk1Detail1.PreviouslyPaidAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(1234567890123.03d, bulk1Detail1.IncurredAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(1234567890123.04d, bulk1Detail1.VatAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(1234567890123.05d, bulk1Detail1.ImportedServicesAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(1234567890123.06d, bulk1Detail1.PaidThisTimeAmount, Currency.TC_USD)
        assertEquals(Currency.TC_USD, bulk1Detail1.Currency)
        assertEquals("ISN1", bulk1Detail1.ImportedServicesNarrative)
        assertEquals(1L, bulk1Detail1.ComponentLineNo)
        final var bulk1Detail2 = bulk1.Details.firstWhere(\crr -> crr.SettlementCurrency == Currency.TC_EUR)
        assertNull(bulk1Detail2.OutstandingAmount)
        assertNull(bulk1Detail2.PreviouslyPaidAmount)
        assertNull(bulk1Detail2.IncurredAmount)
        assertNull(bulk1Detail2.VatAmount)
        assertNull(bulk1Detail2.PaidThisTimeAmount)
        assertEquals("ISN3", bulk1Detail2.ImportedServicesNarrative)
        assertEquals(Currency.TC_EUR, bulk1Detail2.Currency)
        assertEquals(1L, bulk1Detail1.ComponentLineNo)
        assertNull(bulk1Detail2.OutstandingAmount)

        final var bulk2 = ecfMessage.BulkClaims.firstWhere(\crr -> crr.UCR == "222222222")
        assertEquals("2222222220001", bulk2.TR)
        assertEquals("Robert Berkes", bulk2.LossName)
        assertEquals(DateUtil.createDateInstance(11, 28, 2015).getTime(), bulk2.LossDate.getTime())

        assertEquals(2, bulk2.Details.length)
        final var bulk2Detail1 = bulk2.Details.firstWhere(\crr -> crr.SettlementCurrency == Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(200000, bulk2Detail1.SettlementAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(0.01d, bulk2Detail1.OutstandingAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(0.02d, bulk2Detail1.PreviouslyPaidAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(0.03d, bulk2Detail1.IncurredAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(0.04d, bulk2Detail1.VatAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(0.05d, bulk2Detail1.ImportedServicesAmount, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(0.06d, bulk2Detail1.PaidThisTimeAmount, Currency.TC_USD)
        assertEquals("ISN2", bulk2Detail1.ImportedServicesNarrative)
        assertEquals(Currency.TC_USD, bulk2Detail1.Currency)
        assertEquals(2L, bulk2Detail1.ComponentLineNo)
        final var bulk2Detail2 = bulk2.Details.firstWhere(\crr -> crr.SettlementCurrency == null)
        MonetaryAmountAsserter.checkMonetaryAmount(220000, bulk2Detail2.SettlementAmount, Currency.TC_EUR)
        assertNull(bulk2Detail2.OutstandingAmount)
        assertNull(bulk2Detail2.PreviouslyPaidAmount)
        assertNull(bulk2Detail2.IncurredAmount)
        assertNull(bulk2Detail2.VatAmount)
        assertNull(bulk2Detail2.PaidThisTimeAmount)
        assertNull(bulk2Detail2.ImportedServicesNarrative)
        assertNull(bulk2Detail2.OutstandingAmount)
        assertEquals(2L, bulk2Detail1.ComponentLineNo)
        assertEquals(Currency.TC_EUR, bulk2Detail2.Currency)
      })
    })
  }
}