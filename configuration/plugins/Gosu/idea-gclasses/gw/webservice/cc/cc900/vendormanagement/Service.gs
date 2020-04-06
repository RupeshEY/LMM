package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable

/**
 * Represents a SpecialistService with it identifier code and description string.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/Service")
final class Service {

  /**
   * A string value that uniquely identifies this specialist service within its enumerable set.
   */
  var _code : String as Code

  /**
   * A human-readable name for this specialist service.
   */
  var _name : String as Name

  construct() {}

  construct(valueCode : String, valueName : String) {
    _code = valueCode
    _name = valueName
  }

}
