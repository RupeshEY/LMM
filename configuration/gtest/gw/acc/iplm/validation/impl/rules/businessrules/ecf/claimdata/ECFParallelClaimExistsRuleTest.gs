package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference
uses gw.testharness.v3.GUnitTestClass


class ECFParallelClaimExistsRuleTest extends GUnitTestClass {

  private var _rule = new ECFParallelClaimExistsRule()
  private var _claimNotifyRq: ClaimNotifyEventRq
  private var _claimRetrieveRs: RetrieveClaimRs
  private var _entityMapperService = new EntityMapperService()

  override function beforeMethod() {
    super.beforeMethod()
    _claimNotifyRq = ECFMessageUtil.createNewClaimNotifyRq()
    _claimNotifyRq.ClaimMovement.Extension.Claim.removeChild(ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference.$QNAME)

    _claimRetrieveRs = ECFMessageUtil.createNewClaimRetrieveRs()
    _claimRetrieveRs.ClaimMovement.Extension.Claim.removeChild(RetrieveClaimRs_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference.$QNAME)
  }

  public function testValidParallelUCR() {
    var claim1 = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim1.UCR_Ext)
    _claimNotifyRq.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimNotifyRq) as ECFMessageClaimNotifyRq_Ext
    try {
      _rule.validate(message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Parallel UCR, but still failed validation rule")
    }
  }


  public function testParallelUCRMatchesMessageUCR() {
    var claim1 = ClaimBuilderHelper.createClaimWithAClaimNotify()
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim1.UCR_Ext)
    _claimNotifyRq.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    _claimNotifyRq.UCR = claim1.UCR_Ext
    var message = _entityMapperService.createEntity(_claimNotifyRq) as ECFMessageClaimNotifyRq_Ext
    try {
      _rule.validate(message)
    } catch (exp: ECFException) {
      assertEquals("Error code 126 expected", 126, exp.ECFErrorCode.ErrorCode)
    }
  }

  public function testNullParallelUCR() {
    var message = _entityMapperService.createEntity(_claimNotifyRq) as ECFMessageClaimNotifyRq_Ext
    _rule.validate(message)
  }


  public function testInvalidParallelUCR() {
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add("&^*^uhu")
    _claimNotifyRq.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimNotifyRq) as ECFMessageClaimNotifyRq_Ext
    try {
      _rule.validate(message)
    } catch (exp: ECFException) {
      assertEquals("Error code 125 expected", 125, exp.ECFErrorCode.ErrorCode)
    }
  }

  public function testValidParallelUCRListWithLastEmptyString() {
    var claim = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim.UCR_Ext)
    parallelUniqueClaimReferenceList.add("")
    _claimNotifyRq.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimNotifyRq) as ECFMessageClaimNotifyRq_Ext
    try {
      _rule.validate(message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Parallel UCR, but still failed validation rule")
    }
  }

  public function testValidParallelUCRListWithNullValue() {
    var claim = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim.UCR_Ext)
    parallelUniqueClaimReferenceList.add(null)
    _claimNotifyRq.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimNotifyRq) as ECFMessageClaimNotifyRq_Ext
    try {
      _rule.validate(message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Parallel UCR, but still failed validation rule")
    }
  }

  public function testValidParallelUCRListWithMultipleInvalidValues() {
    var claim = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add("")
    parallelUniqueClaimReferenceList.add("  ")
    parallelUniqueClaimReferenceList.add(null)
    parallelUniqueClaimReferenceList.add(claim.UCR_Ext)
    parallelUniqueClaimReferenceList.add("")
    parallelUniqueClaimReferenceList.add(null)
    _claimNotifyRq.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimNotifyRq) as ECFMessageClaimNotifyRq_Ext
    try {
      _rule.validate(message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Parallel UCR, but still failed validation rule")
    }
  }

  public function testValidParallelUCR_ClaimRetrieve() {
    var claim1 = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim1.UCR_Ext)
    _claimRetrieveRs.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimRetrieveRs) as ECFMessageClaimRetrieveRs_Ext
    try {
      _rule.validate(message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Parallel UCR, but still failed validation rule")
    }
  }


  public function testParallelUCRMatchesMessageUCR_ClaimRetrieve() {
    var claim1 = ClaimBuilderHelper.createClaimWithAClaimNotify()
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim1.UCR_Ext)
    _claimRetrieveRs.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    _claimRetrieveRs.UCR = claim1.UCR_Ext
    var message = _entityMapperService.createEntity(_claimRetrieveRs) as ECFMessageClaimRetrieveRs_Ext
    try {
      _rule.validate(message)
    } catch (exp: ECFException) {
      assertEquals("Error code 126 expected", 126, exp.ECFErrorCode.ErrorCode)
    }
  }

  public function testNullParallelUCR_ClaimRetrieve() {
    var message = _entityMapperService.createEntity(_claimRetrieveRs) as ECFMessageClaimRetrieveRs_Ext
    _rule.validate(message)
  }


  public function testInvalidParallelUCR_ClaimRetrieve() {
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add("&^*^uhu")
    _claimRetrieveRs.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimRetrieveRs) as ECFMessageClaimRetrieveRs_Ext
    try {
      _rule.validate(message)
    } catch (exp: ECFException) {
      assertEquals("Error code 125 expected", 125, exp.ECFErrorCode.ErrorCode)
    }
  }

  public function testValidParallelUCRListWithLastEmptyString_ClaimRetrieve() {
    var claim = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim.UCR_Ext)
    parallelUniqueClaimReferenceList.add("")
    _claimRetrieveRs.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimRetrieveRs) as ECFMessageClaimRetrieveRs_Ext
    try {
      _rule.validate(message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Parallel UCR, but still failed validation rule")
    }
  }

  public function testValidParallelUCRListWithNullValue_ClaimRetrieve() {
    var claim = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add(claim.UCR_Ext)
    parallelUniqueClaimReferenceList.add(null)
    _claimRetrieveRs.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimRetrieveRs) as ECFMessageClaimRetrieveRs_Ext
    try {
      _rule.validate(message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Parallel UCR, but still failed validation rule")
    }
  }

  public function testValidParallelUCRListWithMultipleInvalidValues_ClaimRetrieve() {
    var claim = ClaimBuilderHelper.createClaim(true)
    var parallelUniqueClaimReferenceList = new ArrayList<String>()
    parallelUniqueClaimReferenceList.add("")
    parallelUniqueClaimReferenceList.add("  ")
    parallelUniqueClaimReferenceList.add(null)
    parallelUniqueClaimReferenceList.add(claim.UCR_Ext)
    parallelUniqueClaimReferenceList.add("")
    parallelUniqueClaimReferenceList.add(null)
    _claimRetrieveRs.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference = parallelUniqueClaimReferenceList
    var message = _entityMapperService.createEntity(_claimRetrieveRs) as ECFMessageClaimRetrieveRs_Ext
    try {
      _rule.validate(message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid Parallel UCR, but still failed validation rule")
    }
  }

}