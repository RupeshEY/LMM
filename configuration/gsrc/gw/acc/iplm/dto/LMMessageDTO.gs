package gw.acc.iplm.dto

uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.xml.XmlElement

class LMMessageDTO {

  private var _messageType: LMMessageTypeString_Ext as MessageType
  private var _messageHeader: Xchangingheader as Xchangingheader
  private var _xmlPayload: XmlElement as XMLPayLoad
  private var _bytes: byte[] as Bytes

  public construct(messageType: LMMessageTypeString_Ext, xmlPayload: XmlElement, bytes: byte[]) {
    this(messageType, xmlPayload, bytes, null)
  }

  public construct(messageType: LMMessageTypeString_Ext, xmlPayload: XmlElement, bytes: byte[], messageHeader : Xchangingheader) {
    _messageType = messageType
    _xmlPayload = xmlPayload
    _bytes = bytes
    _messageHeader = messageHeader
  }
}