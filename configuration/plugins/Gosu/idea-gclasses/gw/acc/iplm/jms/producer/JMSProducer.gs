package gw.acc.iplm.jms.producer

uses com.sun.messaging.xml.MessageTransformer
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.startable.IStartablePlugin
uses org.apache.activemq.ActiveMQConnectionFactory

uses javax.jms.Connection
uses javax.jms.ExceptionListener
uses javax.jms.JMSException
uses javax.jms.MessageProducer
uses javax.jms.Queue
uses javax.jms.Session
uses javax.xml.soap.SOAPMessage

/**
 * Provides producer functionality and queues messages
 */
class JMSProducer implements ExceptionListener {
  private final var LOGGER = ECFConstants.LOGGER_BLOCK()
  // JMS
  private var _jmsConnectionFactory: ActiveMQConnectionFactory as JMSConnectionFactory
  private var _jmsConnection: Connection as JMSConnection
  private var _jmsSession: Session as JMSSession
  private var _jmsQueue: Queue as JMSQueue
  private var _jmsProducer: MessageProducer as JMSProducer
  // Plugin
  private var _startablePlugin: IStartablePlugin

  /**
   * @param plugin {@link IStartablePlugin}'s stop method will be invoked in case of any Exception
   */
  public construct(plugin: IStartablePlugin) {
    _startablePlugin = plugin
  }


  /**
   * Sets up and configures a JMS connection with a new session, queue and producer.
   *
   * @param messagingUrl The messaging URL to connect to.
   * @param queueName    The queue to create.
   * @return True if initialized successfully, false otherwise
   */
  public function initJMS(messagingUrl: String, queueName: String): boolean {
    LOGGER.debug("Setting up JMS connection to: " + messagingUrl + " with queue name: " + queueName)
    try {
      _jmsConnectionFactory = new ActiveMQConnectionFactory(messagingUrl)
      _jmsConnection = _jmsConnectionFactory.createConnection()
      _jmsConnection.start()
      _jmsConnection.setExceptionListener(this)
      _jmsSession = _jmsConnection.createSession(false, Session.CLIENT_ACKNOWLEDGE)
      _jmsQueue = _jmsSession.createQueue(queueName)
      _jmsProducer = _jmsSession.createProducer(_jmsQueue)
    } catch (e: JMSException) {
      LOGGER.error("Error setting up the JMS Connection", e)
      cleanJMS()
      return false
    }
    return true
  }

  /**
   * Closes all the open resources if they have been
   * initialised.
   */
  public function cleanJMS() {
    try {
      if (_jmsProducer != null) {
        _jmsProducer.close()
        _jmsProducer = null
      }
      if (_jmsSession != null) {
        _jmsSession.close()
      }
      if (_jmsConnection != null) {
        _jmsConnection.close()
      }
    } catch (jmse: JMSException) {
      LOGGER.error("Error while cleaning JMS: {}", jmse.getMessage())
    }
  }

  override function onException(ex: JMSException) {
    LOGGER.error("Exception on JMSProducer with URL " + _jmsConnectionFactory?.getBrokerURL(), ex)
    _startablePlugin.stop(false)
  }

  function queueMessage(messageToQueue: SOAPMessage) {
    var message = MessageTransformer.SOAPMessageIntoJMSMessage(messageToQueue, _jmsSession)
    _jmsProducer.send(message)
  }
}