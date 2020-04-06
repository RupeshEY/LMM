package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNegotiationPrintDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimNegotiationPrintDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Negotiation :  Negotiation) : pcf.api.Destination {
    return __newDestination(config(), {Negotiation}, 0)
  }
  
  static function drilldown (Negotiation :  Negotiation) : pcf.api.Location {
    return __newDestination(config(), {Negotiation}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Negotiation :  Negotiation) : pcf.api.Location {
    return __newDestination(config(), {Negotiation}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Negotiation :  Negotiation) : pcf.api.Location {
    return __newDestination(config(), {Negotiation}, 0).goInMain()
  }
  
  static function printPage (Negotiation :  Negotiation) : pcf.api.Location {
    return __newDestination(config(), {Negotiation}, 0).printPage()
  }
  
  static function push (Negotiation :  Negotiation) : pcf.api.Location {
    return __newDestination(config(), {Negotiation}, 0).push()
  }
  
  
}