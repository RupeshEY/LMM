package gw.acc.iplm

uses gw.acc.iplm.utils.ECFConstants
uses org.slf4j.Logger

abstract class ChainOfResponsibility<T> {
  protected static final var LOGGER : Logger = ECFConstants.LOGGER_BLOCK()

  /**
   * The next link in the chain of responsibility
   */
  private var _next: ChainOfResponsibility

  /**
   * Internal property to set the link to the next handler class
   *
   * @param link The next service handler in the chain of responsibility
   */
  internal property set Next(link: ChainOfResponsibility) {
    _next = link
  }

  /**
   * Add handler to head of the chain
   *
   * @param handler
   * @return AbstractBaseHandler
   */
  public function add(handler: ChainOfResponsibility): ChainOfResponsibility {
    handler.Next = this
    return handler
  }

  /**
   * Abstract function to determine if this link in the chain can handle a certain input.
   *
   * @param element T - input element under analysis
   * @return Boolean - True if the link can handle the provided element. False otherwise
   */
  abstract function canHandle(element: T): Boolean

  /**
   * Abstract function that performs some action when this link in the chain can handle a certain element.
   * Called by the handle method when canHandle is true.
   *
   * @param element T - input element to be processed
   */
  abstract function execute(element: T)

  /**
   * Main entry point of the Chain of Responsibility.
   * Starts by checking if the first element of the chain can handle an input. If so, call the execute method. Otherwise go to the next element in the chain an repeat the process.
   *
   * @param element T - input element under analysis
   * @return ChainOfResponsibility - the handler object that can handle this element
   */
  public function handle(element: T) : ChainOfResponsibility {
    if (this.canHandle(element)) {
      this.execute(element)
      return this
    } else {
      return _next?.handle(element)
    }
  }

}