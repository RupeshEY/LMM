package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimContactPrintDetails extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimContactPrintDetails, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, selectedClaimContact :  ClaimContact) : pcf.api.Destination {
    return __newDestination(config(), {claim, selectedClaimContact}, 0)
  }
  
  static function drilldown (claim :  Claim, selectedClaimContact :  ClaimContact) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedClaimContact}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, selectedClaimContact :  ClaimContact) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedClaimContact}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, selectedClaimContact :  ClaimContact) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedClaimContact}, 0).goInMain()
  }
  
  static function printPage (claim :  Claim, selectedClaimContact :  ClaimContact) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedClaimContact}, 0).printPage()
  }
  
  static function push (claim :  Claim, selectedClaimContact :  ClaimContact) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedClaimContact}, 0).push()
  }
  
  
}