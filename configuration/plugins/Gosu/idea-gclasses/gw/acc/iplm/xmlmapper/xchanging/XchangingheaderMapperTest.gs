package gw.acc.iplm.xmlmapper.xchanging

uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.testharness.v3.GUnitTestClass

class XchangingheaderMapperTest extends GUnitTestClass {

  private static var _mapper: XchangingheaderMapper
  private static var _claimResponse: ClaimResponseRq

  function beforeMethod() {
    super.beforeMethod()
    _claimResponse  = ECFMessageUtil.createNewClaimResponseRq()
    _mapper = new XchangingheaderMapper(_claimResponse.Insurer.Party.FirstId, _claimResponse.ServiceProvider.Party.FirstId, _claimResponse.CreationDate, ECFMessageConstants.CLAIMRESPONSE_HEADER_TYPE, _claimResponse.UUId)
  }

  function testXchangingheaderObjectCreated_ForClaimResponse() {
    var result = _mapper.createXchangingheader()
    assertNotNull(result)
  }

  function testXchangingheaderObjectCreated_ForClaimRetrieve() {
    var cr = ECFMessageUtil.createNewClaimRetrieveRq()
    _mapper = new XchangingheaderMapper(cr.Insurer.Party.FirstId, cr.ServiceProvider.Party.FirstId, cr.CreationDate, ECFMessageConstants.CLAIMRETRIEVE_HEADER_TYPE, cr.UUId)
    var result = _mapper.createXchangingheader()
    assertNotNull(result)
  }

  function testSenderAddedToXchangingheader() {
    var result = _mapper.createXchangingheader()
    assertNotNull("No Sender in the XML object", result.Sender)
    assertEquals(_claimResponse.Insurer.Party.FirstId, result.Sender.Party.Id)
  }

  function testReceiverAddedToXchangingheader() {
    var result = _mapper.createXchangingheader()
    assertNotNull("No Receiver in the XML object", result.Receiver)
    assertEquals(_claimResponse.ServiceProvider.Party.FirstId, result.Receiver.Party.Id)
  }

  function testTimestampAddedToXchangingheader() {
    var result = _mapper.createXchangingheader()
    assertNotNull("No Timestamp in the XML object", result.Timestamp)
    assertEquals(_claimResponse.CreationDate, result.Timestamp.toString())
  }

  function testMsgTypeAddedToXchangingheader() {
    var result = _mapper.createXchangingheader()
    assertNotNull("No MsgTypeCd in the XML object", result.MsgTypeCd)
    assertEquals(ECFMessageConstants.CLAIMRESPONSE_HEADER_TYPE, result.MsgTypeCd)
  }

  function testRequestUUIDAddedToXchangingheader() {
    var result = _mapper.createXchangingheader()
    assertNotNull("No RequestUUID in the XML object", result.RequestUUId)
    assertEquals(_claimResponse.UUId, result.RequestUUId)
  }
}