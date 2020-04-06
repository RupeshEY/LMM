package gw.acc.iplm

uses com.sun.messaging.xml.MessageTransformer
uses entity.LMMessage_Ext
uses gw.acc.iplm.interceptor.EntityMapperInterceptor
uses gw.acc.iplm.interceptor.ValidationInterceptor
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.xml.XmlElement

uses javax.jms.TextMessage
uses javax.xml.messaging.JAXMException
uses javax.xml.soap.MessageFactory
uses javax.xml.soap.SOAPMessage
uses java.util.concurrent.locks.ReentrantLock

/*
* This class is the entry point to received messages.
* It intercepts those messages and can apply defined actions before sending them down to the service handler.
* */
class InterceptorManager {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private static var _inboundLogging = new EntityMapperInterceptor()
  private static var _inboundValidator = new ValidationInterceptor()
  private static var _lock = new ReentrantLock()

  /**
   * Intercept message calls.
   * JMS Message of type TextMessage should contain XML of a message as string.
   * JMS Message not of type TextMessage is assumed to contain a message as a SOAPMessage
   *
   * @param message The JMS message consumed from a JMS Queue
   */
  public static function intercept(message: javax.jms.Message) {
    using (_lock) {
      if (message typeis TextMessage) {
        var xml = XmlElement.parse(message.Text)
        var messageXmlElement = ECFXmlFileReader.getTypedXmlElement(xml)
        if (messageXmlElement != null) {
          intercept(messageXmlElement)
        } else {
          LOGGER.error("Context of JMS Message does not conform to any known Message structure.")
          LOGGER.debug("Message content is \n${message.Text}")
        }
      } else {
        var factory = MessageFactory.newInstance()
        var soapMessage: SOAPMessage
        try {
          soapMessage = MessageTransformer.SOAPMessageFromJMSMessage(message, factory)
          intercept(soapMessage)
        } catch (e: JAXMException) {
          LOGGER.error("Context of JMS Message does not conform to any known Message structure.")
          LOGGER.debug("Message type is ${message.JMSType}")
        }
      }
    }
  }

  /**
   * Intercept message calls.
   *
   * @param message A Message XML
   */
  public static function intercept(message: XmlElement) {
    using (_lock) {
      var lmMessage = _inboundLogging.logMessage(message)
      if (lmMessage == null) {
        LOGGER.debug("Message received does not have an associated entity. Message content is \n${message.asUTFString()}")
      } else {
        process(lmMessage)
      }
    }
  }

  /**
   * Intercept message calls.
   *
   * @param message A SOAPMessage
   */
  public static function intercept(message: SOAPMessage) {
    using (_lock) {
      var lmMessage = _inboundLogging.logMessage(message)
      if (lmMessage == null) {
        LOGGER.debug("Message received does not have an associated entity.")
        ECFUtils.logSoapMessageString(message)
      } else {
        process(lmMessage)
      }
    }
  }

  /**
   * A synchronous method for intercepting an already existing Message Entity.
   *
   * @param message A Message Entity
   */
  public static function intercept(messageEntity: LMMessage_Ext) {
    using (_lock) {
      process(messageEntity)
    }
  }

  private static function process(lmMessage: LMMessage_Ext) {
    var validationSuccess = _inboundValidator.validateBeforeProcessing(lmMessage)

    if (validationSuccess) {
      new ServiceHandler().messageDispatcher(lmMessage)
    }
  }
}