package gw.api.iso

/**
 * Empty subclass of ISORequestBase, provided so customers can
 * override methods and properties in the base implementation.
 */
@Export
class ISORequest extends ISORequestBase {
    
  protected construct(inClaim : Claim) {
    super(inClaim)
  }

}
