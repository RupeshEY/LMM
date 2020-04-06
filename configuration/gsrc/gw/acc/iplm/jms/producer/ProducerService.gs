package gw.acc.iplm.jms.producer

uses javax.xml.soap.SOAPMessage

/**
 * Interface to queue messages
 */
interface ProducerService {
    function queueMessage(messageToQueue: SOAPMessage)
}