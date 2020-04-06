package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuoteDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.QuoteDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (quote :  ServiceRequestQuote) : pcf.api.Destination {
    return __newDestination(config(), {quote}, 0)
  }
  
  static function push (quote :  ServiceRequestQuote) : pcf.api.Location {
    return __newDestination(config(), {quote}, 0).push()
  }
  
  
}