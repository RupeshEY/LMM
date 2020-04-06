package gw.acc.iplm.jms.consumer

uses gw.api.server.Availability
uses gw.api.server.AvailabilityLevel
uses gw.api.startable.IStartablePlugin
uses gw.api.startable.StartablePluginCallbackHandler
uses gw.api.startable.StartablePluginState
uses gw.plugin.InitializablePlugin
uses org.slf4j.LoggerFactory

uses java.lang.invoke.MethodHandles
uses java.util.concurrent.locks.ReentrantLock

/**
 * This class implements a plugin for listening to a message queue that will have messages for the ECF services.
 */
@Availability(AvailabilityLevel.MULTIUSER)
class ECFConsumerService implements InitializablePlugin, IStartablePlugin {

  // Logger
  private static final var LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

  // Plugin Params
  private static final var PROVIDER_PARAM = "jmsProvider"
  private static final var RECV_QUEUE_PARAM = "jmsQueue"
  private static final var BACKUP_PARAM = "backup"
  private static final var FAILURE_PARAM = "failure"
  private var _state = StartablePluginState.Stopped
  private var _callbackHandler: StartablePluginCallbackHandler
  private var _queueConnectionFactory: String as QueueConnectionFactory
  private var _recvQueue: String as RecvQueue
  private var _backup: String as Backup
  private var _failure: String as Failure

  override function start(startablePluginCallbackHandler: StartablePluginCallbackHandler, b: boolean) {
    if(SingletonECFConsumer.getInstance(this).startConsumer(this)) {
      _state = StartablePluginState.Started
      _callbackHandler = startablePluginCallbackHandler
    }
  }

  override function stop(b: boolean) {
    SingletonECFConsumer.getInstance(this).stopConsumer()
    _state = StartablePluginState.Stopped
    _callbackHandler = null
  }

  override property get State(): StartablePluginState {
    return _state
  }

  override function setParameters(parameters: Map<Object, Object>) {
    if (parameters != null) {
      _queueConnectionFactory = parameters.get(PROVIDER_PARAM) as String
      _recvQueue = parameters.get(RECV_QUEUE_PARAM) as String
      _backup = parameters.get(BACKUP_PARAM) as String
      _failure = parameters.get(FAILURE_PARAM) as String
    }
  }

  /**
   * Keeping the class singleton to ensure JMS connection is not being duplicated.
   */
  private static class SingletonECFConsumer {

    private static var _singletonECFConsumer: SingletonECFConsumer
    private static var _lock = new ReentrantLock()
    private var _jmsConsumer: JMSConsumer

    public static function getInstance(plugin: IStartablePlugin): SingletonECFConsumer {
      using(_lock) {
        if (_singletonECFConsumer == null)
        _singletonECFConsumer = new SingletonECFConsumer()
        _singletonECFConsumer._jmsConsumer = new JMSConsumer(plugin)
      }
      return _singletonECFConsumer
    }

    public function startConsumer(ecfConsumerService: ECFConsumerService): boolean {
      return _jmsConsumer.initJMS(ecfConsumerService._queueConnectionFactory, ecfConsumerService._recvQueue)
    }

    public function stopConsumer() {
      _jmsConsumer.cleanJMS()
    }
  }

}