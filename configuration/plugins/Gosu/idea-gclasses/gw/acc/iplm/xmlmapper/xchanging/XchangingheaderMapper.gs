package gw.acc.iplm.xmlmapper.xchanging

uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.xml.date.XmlDateTime

/**
 * Mapper class for Xchnaingheader XML used in the SOAP Header of ECF Class request messages.
 * Note: All values are mandatory
 */
class XchangingheaderMapper {

  protected var _xchaningHeader: Xchangingheader

  /**
   * All parameters needed to create an Xchangingheader object.
   * All parameters are mandatory
   * @param senderId - ID of the Sending carrier
   * @param receiverId - ID of the receiver (eg Xchanging)
   * @param timestamp - Timestamp the request message was created
   * @param msgType - The type of request
   * @param requestUUID - the UUID of the request message
   */
  construct(senderId: String, receiverId: String, timestamp: String, msgType: String, requestUUID: String) {
    _xchaningHeader = new Xchangingheader()
    _xchaningHeader.Sender.Party.Id = senderId
    _xchaningHeader.Receiver.Party.Id = receiverId
    _xchaningHeader.Timestamp =  new XmlDateTime(timestamp)
    _xchaningHeader.MsgTypeCd = msgType
    _xchaningHeader.RequestUUId = requestUUID
  }

  /**
   * @return the Xchangingheader XML object, mapped from the parameters passed in the constructor
   */
  public function createXchangingheader(): Xchangingheader {
    return _xchaningHeader
  }
}