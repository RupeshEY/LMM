package gw.acc.iplm.services.policy

uses gw.acc.iplm.dao.PolicyDAO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ECFPolicyServiceTest extends GUnitTestClass {

  private var _service : ECFPolicyService
  private var _policyDAO : PolicyDAO

  override function beforeMethod() {
    _policyDAO = Mockito.mock(PolicyDAO)
    _service = new ECFPolicyService(_policyDAO)
  }

  function testFindPolicy_NullPolicyNumber() {
    AssertUtils.assertCausesECFExceptionWithType(\-> _service.findPolicy(null), ECFErrorCodeType.POLICY_NUMBER_BLANK)
  }

  function testFindPolicy_BlankPolicyNumber() {
    AssertUtils.assertCausesECFExceptionWithType(\-> _service.findPolicy(" "), ECFErrorCodeType.POLICY_NUMBER_BLANK)
  }

  function testFindPolicy_PolicyNotFound() {
    final var policyNumber = "TestPolicy"
    Mockito.doReturn(new PolicySummary[] {}).when(_policyDAO).findPolicy(Mockito.anyString())

    AssertUtils.assertCausesECFExceptionWithType(\-> _service.findPolicy(policyNumber), ECFErrorCodeType.POLICY_NOT_FOUND_IN_SYSTEM)
  }

  /**
   * The PolicyDAO will return one policy result which is not unique
   *
   * Should throw an exception
   */
  function testFindPolicy_FirstPolicyNotUnique() {
    final var policyNumber = "TestPolicy"
    var policySummary = Mockito.mock(PolicySummary)
    var policyRetrievalResultSetNotUnique = Mockito.mock(PolicyRetrievalResultSet)

    Mockito.when(policyRetrievalResultSetNotUnique.NotUnique).thenReturn(true)

    Mockito.doReturn(new PolicySummary[]{policySummary, policySummary}).when(_policyDAO).findPolicy(Mockito.anyString())
    Mockito.doReturn(policyRetrievalResultSetNotUnique).when(_policyDAO).retrievePolicyFromPolicySummary(Mockito.any())

    AssertUtils.assertCausesECFExceptionWithType(\-> _service.findPolicy(policyNumber), ECFErrorCodeType.POLICY_NOT_UNIQUE)
  }

  /**
   * The PolicyDAO will return two policy results.
   * The first one will say the Policy is Unique
   * The second one will say the Policy is not Unique
   *
   * Should throw an exception
   */
  function testFindPolicy_SecondPolicyNotUnique() {
    final var policyNumber = "TestPolicy"
    var policySummary = Mockito.mock(PolicySummary)
    var policyRetrievalResultSetUnique = Mockito.mock(PolicyRetrievalResultSet)
    var policyRetrievalResultSetNotUnique = Mockito.mock(PolicyRetrievalResultSet)

    Mockito.when(policyRetrievalResultSetUnique.NotUnique).thenReturn(false)
    Mockito.when(policyRetrievalResultSetNotUnique.NotUnique).thenReturn(true)

    Mockito.doReturn(new PolicySummary[] {policySummary, policySummary}).when(_policyDAO).findPolicy(Mockito.anyString())
    Mockito.doReturn(policyRetrievalResultSetUnique).doReturn(policyRetrievalResultSetNotUnique).when(_policyDAO).retrievePolicyFromPolicySummary(Mockito.any())

    AssertUtils.assertCausesECFExceptionWithType(\-> _service.findPolicy(policyNumber), ECFErrorCodeType.POLICY_NOT_UNIQUE)
  }

  /**
   * The PolicyDAO will return two policy results.
   * The first one will have a canceled policy
   * The second one will have an expired policy
   *
   * Should throw an exception
   */
  function testFindPolicy_NoValidPolicies() {
    final var policyNumber = "TestPolicy"
    var policySummary = Mockito.mock(PolicySummary)
    var policyRetrievalResultSet = Mockito.mock(PolicyRetrievalResultSet)
    var policyCanceled = Mockito.mock(Policy)
    var policyExpired = Mockito.mock(Policy)


    Mockito.when(policyRetrievalResultSet.NotUnique).thenReturn(false)
    Mockito.when(policyCanceled.Status).thenReturn(PolicyStatus.TC_CANCELED)
    Mockito.when(policyExpired.Status).thenReturn(PolicyStatus.TC_EXPIRED)

    Mockito.doReturn(new PolicySummary[]{policySummary, policySummary}).when(_policyDAO).findPolicy(Mockito.anyString())
    Mockito.doReturn(policyRetrievalResultSet).when(_policyDAO).retrievePolicyFromPolicySummary(Mockito.any())
    Mockito.when(policyRetrievalResultSet.Result).thenReturn(policyCanceled).thenReturn(policyExpired)

    AssertUtils.assertCausesECFExceptionWithType(\-> _service.findPolicy(policyNumber), ECFErrorCodeType.POLICY_NOT_VALID)
  }

  /**
   * The PolicyDAO will return two policy results.
   *
   * Should throw an exception
   */
  function testFindPolicy_MultiplePoliciesReturned() {
    final var policyNumber = "TestPolicy"
    var policySummary = Mockito.mock(PolicySummary)
    var policyRetrievalResultSet = Mockito.mock(PolicyRetrievalResultSet)
    var policy = Mockito.mock(Policy)


    Mockito.when(policyRetrievalResultSet.NotUnique).thenReturn(false)

    Mockito.doReturn(new PolicySummary[]{policySummary, policySummary}).when(_policyDAO).findPolicy(Mockito.anyString())
    Mockito.doReturn(policyRetrievalResultSet).when(_policyDAO).retrievePolicyFromPolicySummary(Mockito.any())
    Mockito.when(policyRetrievalResultSet.Result).thenReturn(policy)

    AssertUtils.assertCausesECFExceptionWithType(\-> _service.findPolicy(policyNumber), ECFErrorCodeType.POLICY_MULTIPLE_RESULTS)
  }

  /**
   * The PolicyDAO will return one result with a missing Policy Type
   *
   * Should throw an exception
   */
  function testFindPolicy_PolicyMissingPolicyType() {
    final var policyNumber = "TestPolicy"
    var policySummary = Mockito.mock(PolicySummary)
    var policyRetrievalResultSet = Mockito.mock(PolicyRetrievalResultSet)
    var policy = Mockito.mock(Policy)


    Mockito.when(policyRetrievalResultSet.NotUnique).thenReturn(false)

    Mockito.doReturn(new PolicySummary[]{policySummary}).when(_policyDAO).findPolicy(Mockito.anyString())
    Mockito.doReturn(policyRetrievalResultSet).when(_policyDAO).retrievePolicyFromPolicySummary(Mockito.any())
    Mockito.when(policyRetrievalResultSet.Result).thenReturn(policy)

    AssertUtils.assertCausesECFExceptionWithType(\-> _service.findPolicy(policyNumber), ECFErrorCodeType.POLICY_MISSING_TYPE)
  }

  /**
   * The PolicyDAO will return one valid result
   *
   * Should return the mocked policy
   */
  function testFindPolicy_ReturnsPolicy() {
    final var policyNumber = "TestPolicy"
    var policySummary = Mockito.mock(PolicySummary)
    var policyRetrievalResultSet = Mockito.mock(PolicyRetrievalResultSet)
    var policy = Mockito.mock(Policy)


    Mockito.when(policyRetrievalResultSet.NotUnique).thenReturn(false)
    Mockito.when(policy.Status).thenReturn(PolicyStatus.TC_INFORCE)
    Mockito.when(policy.PolicyType).thenReturn(PolicyType.TC_COMMERCIALPROPERTY)


    Mockito.doReturn(new PolicySummary[]{policySummary}).when(_policyDAO).findPolicy(Mockito.anyString())
    Mockito.doReturn(policyRetrievalResultSet).when(_policyDAO).retrievePolicyFromPolicySummary(Mockito.any())
    Mockito.when(policyRetrievalResultSet.Result).thenReturn(policy)

    assertEquals(policy, _service.findPolicy(policyNumber))
  }

}