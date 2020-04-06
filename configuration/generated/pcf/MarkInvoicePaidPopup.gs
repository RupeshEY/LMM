package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/MarkInvoicePaidPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MarkInvoicePaidPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.MarkInvoicePaidPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (invoice :  ServiceRequestInvoice) : pcf.api.Destination {
    return __newDestination(config(), {invoice}, 0)
  }
  
  static function push (invoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {invoice}, 0).push()
  }
  
  
}