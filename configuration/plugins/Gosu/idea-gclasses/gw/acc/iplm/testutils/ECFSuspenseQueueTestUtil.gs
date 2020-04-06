package gw.acc.iplm.testutils

uses gw.acc.iplm.dao.impl.PolicyDAOImpl
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimNotifyRq_ExtBuilder
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.services.suspensequeue.ECFSuspenseQueueService
uses gw.api.databuilder.AddressBuilder
uses gw.api.databuilder.CCUserSettingsBuilder
uses gw.api.databuilder.CredentialBuilder
uses gw.api.databuilder.UserBuilder
uses gw.api.databuilder.UserContactBuilder
uses gw.date.Month
uses gw.pl.persistence.core.Bundle

/**
 * Helper class used by different test classes for suspense queue functionality.
 * A reusable code
 */
class ECFSuspenseQueueTestUtil {

  private static final var UCR1 = "UCR1"
  private static final var JANUARY1_2016_1PM = Date.create(2016, Month.JANUARY, 1, 13, 0, 0, 0, null)


  public static function createSuspendedClaimNotifyEntity(ecfSuspenseQueueService : ECFSuspenseQueueService): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotifyXml.ClaimMovement.Contract.InsurerRiskReference = String.valueOf(System.currentTimeMillis() - 1)
    claimNotifyXml.UCR = String.valueOf(System.currentTimeMillis() + 1)
    var newClaimNotifyEntity = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyXml)

    newClaimNotifyEntity = ecfSuspenseQueueService.suspendMessage(newClaimNotifyEntity, 999, "SAMPLE DATA FROM UNIT TESTS") as ECFMessageClaimNotifyRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotifyEntity = bundle.add(newClaimNotifyEntity)
      newClaimNotifyEntity.ValidationErrorCode = ECFErrorCodeType.AllValues.first().ErrorCode
    }, User.util.UnrestrictedUser)

    return newClaimNotifyEntity
  }

  public static function createSuspendedClaimNotifyEntityWithTransactionDetail(ecfSuspenseQueueService : ECFSuspenseQueueService, umr: String, ucr:String, tr: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotifyXml.ClaimMovement.Contract.InsurerRiskReference = String.valueOf(System.currentTimeMillis() - 1)
    claimNotifyXml.UCR = ucr
    claimNotifyXml.UMR = umr
    claimNotifyXml.TR = tr
    var newClaimNotifyEntity = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyXml)

    newClaimNotifyEntity = ecfSuspenseQueueService.suspendMessage(newClaimNotifyEntity, 999, "SAMPLE DATA FROM UNIT TESTS") as ECFMessageClaimNotifyRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotifyEntity = bundle.add(newClaimNotifyEntity)
      newClaimNotifyEntity.ValidationErrorCode = ECFErrorCodeType.AllValues.first().ErrorCode
    }, User.util.UnrestrictedUser)

    return newClaimNotifyEntity
  }

  public static function createSampleClaimWithUCR(): Claim {
    var sampleClaim: Claim
    var sampleClaimUCR = String.valueOf(System.currentTimeMillis())

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      sampleClaim = ClaimBuilderHelper.createClaim(true)
      sampleClaim.UCR_Ext = sampleClaimUCR
    }, User.util.UnrestrictedUser)

    return sampleClaim
  }

  public static function getSamplePolicyFromPolicySearch(): Policy {
    var samplePolicy: Policy
    var samplePolicyNumber = "23-502012"

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      samplePolicy = new PolicyDAOImpl().findPolicy(samplePolicyNumber)?.first().retrievePolicy()
    }, User.util.UnrestrictedUser)

    return samplePolicy
  }

  public static function createUser(bundle: Bundle): User {
    return new UserBuilder()
        .withExternalUser(false)
        .withContact(new UserContactBuilder()
            .withLastName("Lee")
            .withFirstName("Nancy")
            .withPrimaryPhone(TC_WORK)
            .withEmailAddress1("nlee@acmeins.com")
            .withPrimaryAddressSetEarly(new AddressBuilder()
                .withAddressLine1("143 Lake Ave. Suite 501")
                .withCountry(TC_US)
                .withDescription("Work address")
                .withPostalCode("91253")
                .withState(State.TC_CA)
                .withAddressType(TC_BUSINESS)
                .withCity("Pasadena"))
            .withWorkPhone("213-555-8164"))
        .withUserSettings(new CCUserSettingsBuilder().withStartupPage(TC_DESKTOPACTIVITIES))
        .withCredential(new CredentialBuilder()
            .withUserName("nlee"))
        .withRoleByPublicId("reinsurance_manager")
        .create(bundle)
  }

  public static function validMessage(umr : String, ucr : String, tr : String, suspended : boolean = false): ECFMessageClaimNotifyRq_Ext {
    var cnRqEntity = ECFMessageEntityUtil.createClaimNotifyRq()

    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      cnRqEntity = bundle.add(cnRqEntity)
      cnRqEntity.AsOfDate = JANUARY1_2016_1PM
      cnRqEntity.OriginTimeStamp = JANUARY1_2016_1PM
      cnRqEntity.MessageSequence = 1bd
      cnRqEntity.Content = new Blob(("c").Bytes)
      cnRqEntity.ActionCode = ECFActionCode_Ext.TC_A
      cnRqEntity.UMR = umr
      cnRqEntity.UCR = ucr
      cnRqEntity.TR = tr
      cnRqEntity.Suspended = suspended
    }, "su")

    return cnRqEntity
  }
}