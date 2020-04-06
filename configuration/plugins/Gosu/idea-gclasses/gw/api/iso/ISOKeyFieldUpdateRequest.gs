package gw.api.iso

/**
 * Empty subclass of ISOKeyFieldUpdateRequestBase, provided so customers can
 * override methods and properties in the base implementation.
 */
@Export
class ISOKeyFieldUpdateRequest extends ISOKeyFieldUpdateRequestBase {
  
  construct(reportable : ISOReportable)  {
    super(reportable)
  }

}
