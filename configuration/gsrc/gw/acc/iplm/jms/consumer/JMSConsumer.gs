package gw.acc.iplm.jms.consumer

uses gw.acc.iplm.InterceptorManager
uses gw.api.startable.IStartablePlugin
uses org.apache.activemq.ActiveMQConnectionFactory
uses org.slf4j.LoggerFactory

uses javax.jms.Connection
uses javax.jms.ExceptionListener
uses javax.jms.JMSException
uses javax.jms.MessageConsumer
uses javax.jms.MessageListener
uses javax.jms.Queue
uses javax.jms.Session
uses java.lang.invoke.MethodHandles

/**
 * Creates and cleans JMS consumer
 */
class JMSConsumer implements ExceptionListener, MessageListener {
  private final var LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())
  // JMS
  private var _jmsConnectionFactory: ActiveMQConnectionFactory
  private var _jmsConnection: Connection
  private var _jmsSession: Session
  private var _jmsQueue: Queue
  private var _jmsConsumer: MessageConsumer
  // Plugin
  private var _startablePlugin: IStartablePlugin

  /**
   * @param plugin {@link IStartablePlugin}'s stop method will be invoked in case of any Exception
   */
  public construct(plugin: IStartablePlugin) {
    _startablePlugin = plugin
  }

  /**
   * Starts the activemq connection and creates the consumer
   * @param connectionFactoryURL Connection factory URL as {@link String}
   * @param queue Name of the queue
   * @return True if initialized successfully, false otherwise
   */
  public function initJMS(connectionFactoryURL: String, queue: String): boolean {
    LOGGER.debug("Initializing JMS Consumer Connection")
    try {
      _jmsConnectionFactory = new ActiveMQConnectionFactory(connectionFactoryURL)
      _jmsConnection = _jmsConnectionFactory.createConnection()
      _jmsConnection.start()
      _jmsConnection.setExceptionListener(this)
      _jmsSession = _jmsConnection.createSession(false, Session.CLIENT_ACKNOWLEDGE)
      _jmsQueue = _jmsSession.createQueue(queue)
      _jmsConsumer = _jmsSession.createConsumer(_jmsQueue)
      _jmsConsumer.setMessageListener(this)
    } catch (e: JMSException) {
      LOGGER.error(e.getMessage(), e)
      cleanJMS()
      return false
    }
    return true
  }

  public function cleanJMS() {
    LOGGER.debug("Cleaning JMS Consumer Connection")
    try {
      if (_jmsConsumer != null) {
        _jmsConsumer.close()
        _jmsConsumer = null
      }
      if (_jmsSession != null) {
        _jmsSession.close()
        _jmsSession = null
      }
      if (_jmsConnection != null) {
        _jmsConnection.close()
        _jmsConnection = null
      }
    } catch (e: JMSException) {
      LOGGER.error("Error while cleaning JMS: ${e.getMessage()}")
    }
  }

  override function onException(ex: JMSException) {
    LOGGER.error("Exception on JMSConsumer with URL " + _jmsConnectionFactory?.getBrokerURL(), ex)
    _startablePlugin.stop(false)
  }

  override function onMessage(message: javax.jms.Message) {
    LOGGER.debug("Message with ID ${message.getJMSMessageID()} received")
    message.acknowledge()
    InterceptorManager.intercept(message)
  }
}