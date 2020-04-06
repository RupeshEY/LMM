package gw.api.iso

/**
 * Empty subclass of ISOReceiptBase, provided so customers can
 * override methods and properties in the base implementation.
 */
@Export
class ISOReceipt extends ISOReceiptBase {

  construct(xml : String) {
    super(xml)
  }

}
