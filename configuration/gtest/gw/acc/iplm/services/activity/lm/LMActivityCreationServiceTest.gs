package gw.acc.iplm.services.activity.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.services.activity.ActivityBuilder
uses gw.acc.iplm.testutils.AssertUtils
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMActivityCreationServiceTest extends GUnitTestClass {

  var _activityBuilder : ActivityBuilder
  var _message : LMMessageLloydsSCM_Ext
  var _claim : Claim

  override function beforeMethod() {
    super.beforeMethod()
    _activityBuilder = null
    _message = null
    _claim = null
  }

  function testActivityForNewClaim_CallsShortSubject() {
    createMockForActivityBuilder()
    createMockForMessage()

    new LMActivityCreationService().activityForNewClaim(_message, _activityBuilder)

    Mockito.verify(_activityBuilder, Mockito.times(1)).withShortSubject(Mockito.anyString())
  }

  function testActivityForNewClaim_CallsSubject() {
    createMockForActivityBuilder()
    createMockForMessage()

    new LMActivityCreationService().activityForNewClaim(_message, _activityBuilder)

    Mockito.verify(_activityBuilder, Mockito.times(1)).withSubject(Mockito.anyString())
  }

  function testActivityForNewClaim_CallsDescription() {
    createMockForActivityBuilder()
    createMockForMessage()

    new LMActivityCreationService().activityForNewClaim(_message, _activityBuilder)

    Mockito.verify(_activityBuilder, Mockito.times(1)).withDescription(Mockito.anyString())
  }

  function testActivityForExistingClaim_CallsShortSubject() {
    createMockForActivityBuilder()
    createMockForMessage()

    new LMActivityCreationService().activityForExistingClaim(_message, _activityBuilder)

    Mockito.verify(_activityBuilder, Mockito.times(1)).withShortSubject(Mockito.anyString())
  }

  function testActivityForExistingClaim_CallsSubject() {
    createMockForActivityBuilder()
    createMockForMessage()

    new LMActivityCreationService().activityForExistingClaim(_message, _activityBuilder)

    Mockito.verify(_activityBuilder, Mockito.times(1)).withSubject(Mockito.anyString())
  }

  function testActivityForExistingClaim_CallsDescription() {
    createMockForActivityBuilder()
    createMockForMessage()

    new LMActivityCreationService().activityForExistingClaim(_message, _activityBuilder)

    Mockito.verify(_activityBuilder, Mockito.times(1)).withDescription(Mockito.anyString())
  }

  function testCreateActivities_NoClaimShouldThrowException() {
    createMockForMessage()

    Mockito.when(_message.Claim).thenReturn(null)

    AssertUtils.assertCausesLMExceptionWithType(\-> new LMActivityCreationService().createActivities(_message), LMErrorCodeType.CLAIM_MISSING)
  }

  function testCreateActivities_ShouldCallcreateDefaultActivity() {
    createMockForMessage()
    createMockForClaim()

    var activityCreationService = Mockito.spy(new LMActivityCreationService())
    Mockito.doNothing().when(activityCreationService).createDefaultActivity(_message)

    activityCreationService.createActivities(_message)

    Mockito.verify(activityCreationService, Mockito.times(1)).createDefaultActivity(_message)
  }

  function testCreateDefaultActivities_ShouldThrowExceptionWithNoMessages() {
    createMockForMessage()
    createMockForClaim()
    Mockito.when(_claim.LMMessages).thenReturn({})

    AssertUtils.assertCausesLMExceptionWithType(\-> new LMActivityCreationService().createActivities(_message), LMErrorCodeType.CLAIM_HAS_NO_MESSAGES)
  }

  function testCreateDefaultActivities_ShouldCallNewClaimActivity() {
    createMockForMessage()
    createMockForActivityBuilder()
    createMockForClaim()
    Mockito.when(_claim.LMMessages).thenReturn({_message})

    var activityCreationService = Mockito.spy(new LMActivityCreationService())
    Mockito.doReturn(_activityBuilder).when(activityCreationService).activityForNewClaim(_message, _activityBuilder)

    activityCreationService.createDefaultActivity(_message, _activityBuilder)

    Mockito.verify(activityCreationService, Mockito.times(1)).activityForNewClaim(_message, _activityBuilder)
    Mockito.verify(activityCreationService, Mockito.times(0)).activityForExistingClaim(_message, _activityBuilder)
    Mockito.verify(_activityBuilder, Mockito.times(1)).withMessage(_message)
    Mockito.verify(_activityBuilder, Mockito.times(1)).createActivity()
  }

  function testCreateDefaultActivities_ShouldCallExistingClaimActivity() {
    createMockForMessage()
    createMockForActivityBuilder()
    createMockForClaim()
    Mockito.when(_claim.LMMessages).thenReturn({_message, _message})

    var activityCreationService = Mockito.spy(new LMActivityCreationService())
    Mockito.doReturn(_activityBuilder).when(activityCreationService).activityForExistingClaim(_message, _activityBuilder)

    activityCreationService.createDefaultActivity(_message, _activityBuilder)

    Mockito.verify(activityCreationService, Mockito.times(0)).activityForNewClaim(_message, _activityBuilder)
    Mockito.verify(activityCreationService, Mockito.times(1)).activityForExistingClaim(_message, _activityBuilder)
    Mockito.verify(_activityBuilder, Mockito.times(1)).withMessage(_message)
    Mockito.verify(_activityBuilder, Mockito.times(1)).createActivity()
  }

  function createMockForActivityBuilder() {
    _activityBuilder = Mockito.mock(ActivityBuilder)

    Mockito.doReturn(_activityBuilder).when(_activityBuilder).withShortSubject(Mockito.anyString())
    Mockito.doReturn(_activityBuilder).when(_activityBuilder).withSubject(Mockito.anyString())
    Mockito.doReturn(_activityBuilder).when(_activityBuilder).withDescription(Mockito.anyString())
  }

  function createMockForMessage() {
    _message = Mockito.mock(LMMessageLloydsSCM_Ext)

    Mockito.when(_message.MessageType).thenReturn(ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM)
    Mockito.when(_message.Subtype).thenReturn(typekey.LMMessage_Ext.TC_LMMESSAGELLOYDSSCM_EXT)
  }

  function createMockForClaim() {
    _claim = Mockito.mock(Claim)

    if (_message != null) {
      Mockito.when(_message.Claim).thenReturn(_claim)
    }
  }

}