package gw.api.financials

/**
 * Returns a new CheckCreator subclass implemented in Gosu.
 * Customers can modify this implementation in order to return their own subclass
 * of CheckCreatorGosuBase.
 */
@Export
class CheckCreatorProviderImpl implements CheckCreatorProvider {

  construct() {
  }
  // These constructors are required by the metadata layer.
  // However, the owner calls createCheckCreator() in Java code
  // and links itself to the returned CheckCreator.
  construct(owner : Claim) {
  }
  construct(owner : Exposure) {
  }
  construct(owner : CheckSet) {
  }

  override function createCheckCreator() : CheckCreator {
    return new CheckCreatorGosuBase()
  }

}
