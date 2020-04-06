package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimPartiesInvolvedDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPartiesInvolvedDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimPartiesInvolvedDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claimContact :  ClaimContact, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claimContact, claim}, 0)
  }
  
  static function drilldown (claimContact :  ClaimContact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claimContact, claim}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claimContact :  ClaimContact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claimContact, claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claimContact :  ClaimContact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claimContact, claim}, 0).goInMain()
  }
  
  static function printPage (claimContact :  ClaimContact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claimContact, claim}, 0).printPage()
  }
  
  static function push (claimContact :  ClaimContact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claimContact, claim}, 0).push()
  }
  
  
}