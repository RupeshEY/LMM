package gw.api.iso

/**
 * Empty subclass of ISOClaimSearchRequest, provided so customers can
 * override methods and properties in the base implementation.
 */
@Export
class ISOClaimSearchRequest extends ISOClaimSearchRequestBase {

  construct(inClaim : Claim)  {
    super(inClaim)
  }

}
