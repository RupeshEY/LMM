package gw.api.iso

/**
 * Empty subclass of ISOReplyBase, provided so customers can
 * override methods and properties in the base implementation.
 */
@Export
class ISOReply extends ISOReplyBase {
  
  construct(xml : String) {
    super(xml)
  }
}
