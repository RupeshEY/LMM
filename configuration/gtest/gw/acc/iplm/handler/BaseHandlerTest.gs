package gw.acc.iplm.handler

uses gw.acc.iplm.services.api.AbstractService
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

/**
 * Base test class for Handlers.
 * This class can be extended by individual handler tests and will automatically include a few common tests.
 * To prepare each test the child test must first call the prepareTest() method, chained with forHandler(), withValidSubtypes(), withExpectedServiceClass().
 * E.g:
 *
 * prepareTest()
 *   .forHandler(new ClaimNotifyHandler())
 *   .withValidSubtypes({typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT})
 *   .withExpectedServiceClass(ClaimNotifyService)
 */
abstract class BaseHandlerTest extends GUnitTestClass {

  private var _validSubtypes : List<typekey.LMMessage_Ext>
  private var _invalidSubtypes : List<typekey.LMMessage_Ext>
  private var _expectedService: Class<AbstractService>
  protected var _handler : AbstractBaseHandler

  public function testCanHandle() {
    evaluateCanHandleForTypes(_validSubtypes, _validSubtypes)
  }

  public function testCanHandle_InvalidKeys() {
    evaluateCanHandleForTypes(_invalidSubtypes, {})
  }

  public function testExpectedHandler() {
    assertSame("Service Class is wrong", _expectedService, _handler.Service.Class)
  }

  public function testCallsService() {
    var mockedService = Mockito.mock(AbstractService)
    Mockito.doNothing().when(mockedService).process(Mockito.any(ECFMessage_Ext))
    var message = Mockito.mock(ECFMessageClaimNotifyRq_Ext)

    _handler.Service = mockedService
    _handler.processMessage(message)

    Mockito.verify(mockedService, Mockito.times(1)).process(Mockito.any(ECFMessage_Ext))
  }

  private function evaluateCanHandleForTypes(type: List<typekey.LMMessage_Ext>, expected: List<typekey.LMMessage_Ext>) {
    var canHandleList: List<typekey.LMMessage_Ext> = {}

    for (valSub in type) {
      var canHandle = _handler.canHandle(valSub)
      if (canHandle) {
        canHandleList.add(valSub)
      }
    }

    assertCollectionEquals(expected, canHandleList)
  }

  public function prepareTest() : BaseHandlerTest {
    return this
  }

  public function forHandler(handler: AbstractBaseHandler) : BaseHandlerTest {
    _handler = handler
    return this
  }

  public function withValidSubtypes(validSubtypes: ArrayList<typekey.LMMessage_Ext>) : BaseHandlerTest {
    _validSubtypes = validSubtypes
    buildInvalidSubtypes()
    return this
  }

  public function withExpectedServiceClass(serviceClass: Class<AbstractService>) : BaseHandlerTest {
    _expectedService = serviceClass
    return this
  }

  private function buildInvalidSubtypes() {
    _invalidSubtypes = typekey.LMMessage_Ext.getAllTypeKeys().where(\elt -> not _validSubtypes.contains(elt))
  }
}