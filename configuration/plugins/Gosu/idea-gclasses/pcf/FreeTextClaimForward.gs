package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.FreeTextClaimForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claimNumber :  String, claimStatus :  ClaimSearchType) : pcf.api.Destination {
    return __newDestination(config(), {claimNumber, claimStatus}, 0)
  }
  
  static function drilldown (claimNumber :  String, claimStatus :  ClaimSearchType) : pcf.api.Location {
    return __newDestination(config(), {claimNumber, claimStatus}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claimNumber :  String, claimStatus :  ClaimSearchType) : pcf.api.Location {
    return __newDestination(config(), {claimNumber, claimStatus}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claimNumber :  String, claimStatus :  ClaimSearchType) : pcf.api.Location {
    return __newDestination(config(), {claimNumber, claimStatus}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claimNumber :  String, claimStatus :  ClaimSearchType) : pcf.api.Location {
    return __newDestination(config(), {claimNumber, claimStatus}, 0).goInWorkspace()
  }
  
  static function printPage (claimNumber :  String, claimStatus :  ClaimSearchType) : pcf.api.Location {
    return __newDestination(config(), {claimNumber, claimStatus}, 0).printPage()
  }
  
  static function push (claimNumber :  String, claimStatus :  ClaimSearchType) : pcf.api.Location {
    return __newDestination(config(), {claimNumber, claimStatus}, 0).push()
  }
  
  
}