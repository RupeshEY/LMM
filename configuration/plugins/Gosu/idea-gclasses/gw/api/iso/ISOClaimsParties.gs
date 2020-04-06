package gw.api.iso

/**
 * Empty subclass of ISOAdjusterPartiesBase, provided so customers can
 * override methods and properties in the base implementation.
 */
@Export
class ISOClaimsParties extends ISOClaimsPartiesBase {

  construct(isoRequest : ISOClaimSearchRequestBase) {
    super(isoRequest)
  }

}
