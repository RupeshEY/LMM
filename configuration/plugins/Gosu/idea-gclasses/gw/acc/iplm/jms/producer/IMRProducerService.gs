package gw.acc.iplm.jms.producer

uses gw.api.server.Availability
uses gw.api.server.AvailabilityLevel
uses gw.api.startable.IStartablePlugin
uses gw.api.startable.StartablePluginCallbackHandler
uses gw.api.startable.StartablePluginState
uses gw.plugin.InitializablePlugin

uses javax.xml.soap.SOAPMessage
uses java.util.concurrent.locks.ReentrantLock

/**
 * This class was created to queue IMR messages outgoing to XChanging
 * so that the they can be picked up by a service to process them.
 */
@Availability(AvailabilityLevel.MULTIUSER)
class IMRProducerService implements InitializablePlugin, IStartablePlugin, ProducerService {
  // Plugin Params
  private static final var PROVIDER_PARAM = "jmsProvider"
  private static final var RECV_QUEUE_PARAM = "jmsQueue"
  private var _queueConnectionFactory: String as QueueConnectionFactory
  private var _recvQueue: String as RecvQueue
  private var _state = StartablePluginState.Stopped
  private var _callbackHandler: StartablePluginCallbackHandler

  override function start(startablePluginCallbackHandler: StartablePluginCallbackHandler, b: boolean) {
    if (SingletonIMRProducer.getInstance(this).startProducer(this)) {
      _state = StartablePluginState.Started
      _callbackHandler = startablePluginCallbackHandler
    }
  }

  override function stop(b: boolean) {
    SingletonIMRProducer.getInstance(this).stopProducer()
    _state = StartablePluginState.Stopped
    _callbackHandler = null
  }

  override property get State(): StartablePluginState {
    return _state
  }

  override function setParameters(parameters: Map<Object, Object>) {
    _queueConnectionFactory = parameters.get(PROVIDER_PARAM) as String
    _recvQueue = parameters.get(RECV_QUEUE_PARAM) as String
  }

  /**
   * Adding the message to the queue.
   *
   * @param messageToQueue
   */
  public override function queueMessage(messageToQueue: SOAPMessage) {
    SingletonIMRProducer.getInstance(this).queueMessage(messageToQueue)
  }

  /**
   * Keeping the class singleton to ensure JMS connection is not being duplicated.
   */
  private static class SingletonIMRProducer {

    private static var _singletonIMRProducer: SingletonIMRProducer
    private static var _lock = new ReentrantLock()
    private var _jmsProducer: JMSProducer

    public static function getInstance(plugin: IStartablePlugin): SingletonIMRProducer {
      using (_lock) {
         if(_singletonIMRProducer == null) {
           _singletonIMRProducer = new SingletonIMRProducer()
          _singletonIMRProducer._jmsProducer = new JMSProducer(plugin)
         }
      }
      return _singletonIMRProducer
    }

    public function startProducer(imrProducer: IMRProducerService): boolean {
      return _jmsProducer.initJMS(imrProducer._queueConnectionFactory, imrProducer._recvQueue)
    }

    public function stopProducer() {
      _jmsProducer.cleanJMS()
    }

    public function queueMessage(messageToQueue: SOAPMessage) {
      _jmsProducer.queueMessage(messageToQueue)
    }
  }
}