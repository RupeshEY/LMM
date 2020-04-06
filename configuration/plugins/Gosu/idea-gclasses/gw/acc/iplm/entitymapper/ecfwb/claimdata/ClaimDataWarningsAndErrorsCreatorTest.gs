package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ErrorsAndWarnings
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ErrorsAndWarnings_Result
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings_Result
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ClaimDataWarningsAndErrorsCreatorTest extends GUnitTestClass {

  private var _entityMapperService = new EntityMapperService()

  function testSoftWarningMappedFromClaimNotify() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()
        final var expectedWarning = Long.toString(System.currentTimeMillis())

        var softWarnings = new ArrayList<ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings>()
        var warning = new ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        warning.SoftWarningsDescription = expectedWarning
        softWarnings.add(warning)

        claimNotifyXml.ClaimMovement.Extension.Claim.Indicators.SoftWarnings = softWarnings
        final var ecfMessage = _entityMapperService.createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

        assertEquals("Soft warning not stored on entity", expectedWarning, ecfMessage.SoftWarnings.first().Description)
      })
    })
  }

  function testSoftWarningMappedFromClaimRetrieve() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claieRetrieveXml = ECFMessageUtil.createNewClaimRetrieveRs()
        final var expectedWarning = Long.toString(System.currentTimeMillis())

        var softWarnings = new ArrayList<RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings>()
        var warning = new RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        warning.SoftWarningsDescription = expectedWarning
        softWarnings.add(warning)

        claieRetrieveXml.ClaimMovement.Extension.Claim.Indicators.SoftWarnings = softWarnings
        final var ecfMessage = _entityMapperService.createEntity(claieRetrieveXml) as ECFMessageClaimRetrieveRs_Ext

        assertEquals("Soft warning not stored on entity", expectedWarning, ecfMessage.SoftWarnings.first().Description)
      })
    })
  }

  function testMultipleSoftWarningMappedFromClaimNotify() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()

        var softWarnings = new ArrayList<ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings>()
        var warning1 = new ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        warning1.SoftWarningsDescription = Long.toString(System.currentTimeMillis())
        softWarnings.add(warning1)

        var warning2 = new ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        warning2.SoftWarningsDescription = Long.toString(System.currentTimeMillis())
        softWarnings.add(warning2)

        var warning3 = new ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        warning3.SoftWarningsDescription = Long.toString(System.currentTimeMillis())
        softWarnings.add(warning3)

        claimNotifyXml.ClaimMovement.Extension.Claim.Indicators.SoftWarnings = softWarnings
        final var ecfMessage = _entityMapperService.createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

        assertEquals("Soft warnings not stored on entity", 3, ecfMessage.SoftWarnings.Count)
      })
    })
  }

  function testMultipleSoftWarningMappedFromClaimRetrieve() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claieRetrieveXml = ECFMessageUtil.createNewClaimRetrieveRs()

        var softWarnings = new ArrayList<RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings>()
        var warning1 = new RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        warning1.SoftWarningsDescription = Long.toString(System.currentTimeMillis())
        softWarnings.add(warning1)

        var warning2 = new RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        warning2.SoftWarningsDescription = Long.toString(System.currentTimeMillis())
        softWarnings.add(warning2)

        var warning3 = new RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        warning3.SoftWarningsDescription = Long.toString(System.currentTimeMillis())
        softWarnings.add(warning3)

        claieRetrieveXml.ClaimMovement.Extension.Claim.Indicators.SoftWarnings = softWarnings
        final var ecfMessage = _entityMapperService.createEntity(claieRetrieveXml) as ECFMessageClaimRetrieveRs_Ext

        assertEquals("Soft warnings not stored on entity", 3, ecfMessage.SoftWarnings.Count)
      })
    })
  }

  function testWarningMappedFromClaimNotify() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()
        final var expectedWarningDescription = Long.toString(System.currentTimeMillis())
        final var expectedWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        final var expectedWarningCode = "U077"

        var errorsOrWarnings = new ClaimNotifyEventRqType_ErrorsAndWarnings()
        var results = new ArrayList<ClaimNotifyEventRqType_ErrorsAndWarnings_Result>()
        var result = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        result.ErrorWarningDescription = expectedWarningDescription
        result.ErrorWarningLevel = expectedWarningLevel
        result.ErrorCode = expectedWarningCode
        results.add(result)

        errorsOrWarnings.Result = results
        claimNotifyXml.ErrorsAndWarnings = errorsOrWarnings

        final var ecfMessage = _entityMapperService.createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

        assertEquals("Warning description not stored on entity", expectedWarningDescription, ecfMessage.ErrorsOrWarnings.first().Description)
        assertEquals("Warning level not stored on entity", ECFErrorType_Ext.get(expectedWarningLevel.toString()), ecfMessage.ErrorsOrWarnings.first().ErrorType)
        assertEquals("Warning code not stored on entity", expectedWarningCode, ecfMessage.ErrorsOrWarnings.first().ErrorCode)
      })
    })
  }

  function testWarningMappedFromClaimRetrieve() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claieRetrieveXml = ECFMessageUtil.createNewClaimRetrieveRs()
        final var expectedWarningDescription = Long.toString(System.currentTimeMillis())
        final var expectedWarningLevel = RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        final var expectedWarningCode = "U077"

        var errorsOrWarnings = new RetrieveClaimRs_ErrorsAndWarnings()
        var results = new ArrayList<RetrieveClaimRs_ErrorsAndWarnings_Result>()
        var result = new RetrieveClaimRs_ErrorsAndWarnings_Result()
        result.ErrorWarningDescription = expectedWarningDescription
        result.ErrorWarningLevel = expectedWarningLevel
        result.ErrorCode = expectedWarningCode
        results.add(result)

        errorsOrWarnings.Result = results
        claieRetrieveXml.ErrorsAndWarnings = errorsOrWarnings

        final var ecfMessage = _entityMapperService.createEntity(claieRetrieveXml) as ECFMessageClaimRetrieveRs_Ext

        assertEquals("Warning description not stored on entity", expectedWarningDescription, ecfMessage.ErrorsOrWarnings.first().Description)
        assertEquals("Warning level not stored on entity", ECFErrorType_Ext.get(expectedWarningLevel.toString()), ecfMessage.ErrorsOrWarnings.first().ErrorType)
        assertEquals("Warning code not stored on entity", expectedWarningCode, ecfMessage.ErrorsOrWarnings.first().ErrorCode)
      })
    })
  }

  function testMultipleWarningMappedFromClaimNotify() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()

        var errorsOrWarnings = new ClaimNotifyEventRqType_ErrorsAndWarnings()
        var results = new ArrayList<ClaimNotifyEventRqType_ErrorsAndWarnings_Result>()

        var result1 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        result1.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result1.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        result1.ErrorCode = "U001"
        results.add(result1)

        var result2 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        result2.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result2.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        result2.ErrorCode = "U002"
        results.add(result2)

        var result3 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        result3.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result3.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        result3.ErrorCode = "U003"
        results.add(result3)

        errorsOrWarnings.Result = results
        claimNotifyXml.ErrorsAndWarnings = errorsOrWarnings
        final var ecfMessage = _entityMapperService.createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

        assertEquals("Warnings not stored on entity", 3, ecfMessage.ErrorsOrWarnings.Count)
      })
    })
  }

  function testMultipleWarningMappedFromClaimRetrieve() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claieRetrieveXml = ECFMessageUtil.createNewClaimRetrieveRs()

        var errorsOrWarnings = new RetrieveClaimRs_ErrorsAndWarnings()
        var results = new ArrayList<RetrieveClaimRs_ErrorsAndWarnings_Result>()

        var result1 = new RetrieveClaimRs_ErrorsAndWarnings_Result()
        result1.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result1.ErrorWarningLevel = RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        result1.ErrorCode = "U001"
        results.add(result1)

        var result2 = new RetrieveClaimRs_ErrorsAndWarnings_Result()
        result2.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result2.ErrorWarningLevel = RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        result2.ErrorCode = "U002"
        results.add(result2)

        var result3 = new RetrieveClaimRs_ErrorsAndWarnings_Result()
        result3.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result3.ErrorWarningLevel = RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        result3.ErrorCode = "U003"
        results.add(result3)

        errorsOrWarnings.Result = results
        claieRetrieveXml.ErrorsAndWarnings = errorsOrWarnings
        final var ecfMessage = _entityMapperService.createEntity(claieRetrieveXml) as ECFMessageClaimRetrieveRs_Ext

        assertEquals("Warnings not stored on entity", 3, ecfMessage.ErrorsOrWarnings.Count)
      })
    })
  }

  function testErrorMappedFromClaimNotify() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()
        final var expectedWarningDescription = Long.toString(System.currentTimeMillis())
        final var expectedWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        final var expectedWarningCode = "U077"

        var errorsOrWarnings = new ClaimNotifyEventRqType_ErrorsAndWarnings()
        var results = new ArrayList<ClaimNotifyEventRqType_ErrorsAndWarnings_Result>()
        var result = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        result.ErrorWarningDescription = expectedWarningDescription
        result.ErrorWarningLevel = expectedWarningLevel
        result.ErrorCode = expectedWarningCode
        results.add(result)

        errorsOrWarnings.Result = results
        claimNotifyXml.ErrorsAndWarnings = errorsOrWarnings

        final var ecfMessage = _entityMapperService.createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

        assertEquals("Error description not stored on entity", expectedWarningDescription, ecfMessage.ErrorsOrWarnings.first().Description)
        assertEquals("Error level not stored on entity", ECFErrorType_Ext.get(expectedWarningLevel.toString()), ecfMessage.ErrorsOrWarnings.first().ErrorType)
        assertEquals("Error code not stored on entity", expectedWarningCode, ecfMessage.ErrorsOrWarnings.first().ErrorCode)
      })
    })
  }

  function testErrorMappedFromClaimRetrieve() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claieRetrieveXml = ECFMessageUtil.createNewClaimRetrieveRs()
        final var expectedWarningDescription = Long.toString(System.currentTimeMillis())
        final var expectedWarningLevel = RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        final var expectedWarningCode = "U077"

        var errorsOrWarnings = new RetrieveClaimRs_ErrorsAndWarnings()
        var results = new ArrayList<RetrieveClaimRs_ErrorsAndWarnings_Result>()
        var result = new RetrieveClaimRs_ErrorsAndWarnings_Result()
        result.ErrorWarningDescription = expectedWarningDescription
        result.ErrorWarningLevel = expectedWarningLevel
        result.ErrorCode = expectedWarningCode
        results.add(result)

        errorsOrWarnings.Result = results
        claieRetrieveXml.ErrorsAndWarnings = errorsOrWarnings

        final var ecfMessage = _entityMapperService.createEntity(claieRetrieveXml) as ECFMessageClaimRetrieveRs_Ext

        assertEquals("Error description not stored on entity", expectedWarningDescription, ecfMessage.ErrorsOrWarnings.first().Description)
        assertEquals("Error level not stored on entity", ECFErrorType_Ext.get(expectedWarningLevel.toString()), ecfMessage.ErrorsOrWarnings.first().ErrorType)
        assertEquals("Error code not stored on entity", expectedWarningCode, ecfMessage.ErrorsOrWarnings.first().ErrorCode)
      })
    })
  }

  function testMultipleErrorMappedFromClaimNotify() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()

        var errorsOrWarnings = new ClaimNotifyEventRqType_ErrorsAndWarnings()
        var results = new ArrayList<ClaimNotifyEventRqType_ErrorsAndWarnings_Result>()

        var result1 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        result1.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result1.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        result1.ErrorCode = "U001"
        results.add(result1)

        var result2 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        result2.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result2.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        result2.ErrorCode = "U002"
        results.add(result2)

        var result3 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        result3.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result3.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        result3.ErrorCode = "U003"
        results.add(result3)

        errorsOrWarnings.Result = results
        claimNotifyXml.ErrorsAndWarnings = errorsOrWarnings
        final var ecfMessage = _entityMapperService.createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

        assertEquals("Errors not stored on entity", 3, ecfMessage.ErrorsOrWarnings.Count)
      })
    })
  }

  function testMultipleErrorMappedFromClaimRetrieve() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claieRetrieveXml = ECFMessageUtil.createNewClaimRetrieveRs()

        var errorsOrWarnings = new RetrieveClaimRs_ErrorsAndWarnings()
        var results = new ArrayList<RetrieveClaimRs_ErrorsAndWarnings_Result>()

        var result1 = new RetrieveClaimRs_ErrorsAndWarnings_Result()
        result1.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result1.ErrorWarningLevel = RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        result1.ErrorCode = "U001"
        results.add(result1)

        var result2 = new RetrieveClaimRs_ErrorsAndWarnings_Result()
        result2.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result2.ErrorWarningLevel = RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        result2.ErrorCode = "U002"
        results.add(result2)

        var result3 = new RetrieveClaimRs_ErrorsAndWarnings_Result()
        result3.ErrorWarningDescription = Long.toString(System.currentTimeMillis())
        result3.ErrorWarningLevel = RetrieveClaimRs_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        result3.ErrorCode = "U003"
        results.add(result3)

        errorsOrWarnings.Result = results
        claieRetrieveXml.ErrorsAndWarnings = errorsOrWarnings
        final var ecfMessage = _entityMapperService.createEntity(claieRetrieveXml) as ECFMessageClaimRetrieveRs_Ext

        assertEquals("Errors not stored on entity", 3, ecfMessage.ErrorsOrWarnings.Count)
      })
    })
  }

  function testErrorMappedFromRespondErrorNotify() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var respondErrorNotifyXml = ECFMessageUtil.createNewRespondErrorNotifyRq()
        final var expectedWarningDescription = respondErrorNotifyXml.ErrorsAndWarnings.Result.first().ErrorWarningDescription
        final var expectedWarningLevel = respondErrorNotifyXml.ErrorsAndWarnings.Result.first().ErrorWarningLevel
        final var expectedWarningCode = respondErrorNotifyXml.ErrorsAndWarnings.Result.first().ErrorCode
        final var ecfMessage = _entityMapperService.createEntity(respondErrorNotifyXml) as ECFMessageClaimNotifyRq_Ext

        assertEquals("Error description not stored on entity", expectedWarningDescription, ecfMessage.ErrorsOrWarnings.first().Description)
        assertEquals("Error level not stored on entity", ECFErrorType_Ext.get(expectedWarningLevel.toString()), ecfMessage.ErrorsOrWarnings.first().ErrorType)
        assertEquals("Error code not stored on entity", expectedWarningCode, ecfMessage.ErrorsOrWarnings.first().ErrorCode)
      })
    })
  }

  function testClaimRetrieveWithNoErrorsOrWarnings() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claieRetrieveXml = ECFMessageUtil.createNewClaimRetrieveRs()
        final var ecfMessage = _entityMapperService.createEntity(claieRetrieveXml) as ECFMessageClaimRetrieveRs_Ext
        assertEquals("Errors on entity but not in XML", 0, ecfMessage.ErrorsOrWarnings.Count)
      })
    })
  }

  function testClaimNotifyWithNoErrorsOrWarnings() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()
        final var ecfMessage = _entityMapperService.createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext
        assertEquals("Errors on entity but not in XML", 0, ecfMessage.ErrorsOrWarnings.Count)
      })
    })
  }
}