package gw.acc.iplm.services.api

uses gw.acc.iplm.exception.imr.IMRErrorCodeType
uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.jms.producer.IMRProducerService
uses gw.acc.iplm.xmlmapper.repositoryoperation.PostRqMapper
uses gw.acc.iplm.xmlmapper.repositoryoperation.RepositoryOperationRqMapper
uses gw.acc.iplm.xmlmapper.repositoryoperation.RepositoryOperationRqMapperFactory
uses gw.acc.iplm.xmlmapper.soap.SoapAttachmentBuilder
uses gw.acc.iplm.xmlmapper.soap.SoapMessageBuilder

uses javax.xml.messaging.JAXMException
uses javax.xml.soap.SOAPMessage

abstract class OutboundIMRService<T extends ECFDocumentMessage_Ext> extends OutboundService<T> {

  protected var _repositoryOperationRqMapper: RepositoryOperationRqMapper
  protected var _postRqMapper: PostRqMapper
  protected var _soapMessageBuilder: SoapMessageBuilder
  protected var _soapAttachmentBuilder: SoapAttachmentBuilder

  construct() {
    super()
    _producerService = new IMRProducerService()
  }

  protected override function generatePayload(message: T): SOAPMessage {
    _repositoryOperationRqMapper = new RepositoryOperationRqMapperFactory().getMapper(message)
    var repositoryOperationRq = _repositoryOperationRqMapper.createRepositoryOperationRq()

    _postRqMapper = new PostRqMapper(repositoryOperationRq)
    var postRq = _postRqMapper.createPostRq()

    _soapMessageBuilder = new SoapMessageBuilder(postRq)
    var envelope = _soapMessageBuilder.createSoapMessage()

    _soapAttachmentBuilder = new SoapAttachmentBuilder(envelope)
    envelope = _soapAttachmentBuilder.addXmlAttachment(repositoryOperationRq, postRq.WorkFolder.MsgFile.FileId.substring(4))
    return envelope
  }

  protected override function sendOutboundMessage(payload: SOAPMessage) {
    try {
      _producerService.queueMessage(payload)
    } catch (ex: JAXMException) {
      LOGGER.error("There was an error connecting to the IMR Service for a Document Operation request. Error: {}", ex)
      throw new IMRException(IMRErrorCodeType.IMR_UNABLE_TO_CONNECT, ex)
    } catch (ex: Exception) {
      LOGGER.error("There was an error connecting to the IMR Service for a Document Operation request. Error: {}", ex)
      throw new IMRException(IMRErrorCodeType.IMR_UNABLE_TO_CONNECT, ex)
    }
  }
}