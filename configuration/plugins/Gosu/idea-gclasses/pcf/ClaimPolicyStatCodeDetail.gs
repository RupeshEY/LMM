package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyStatCodeDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimPolicyStatCodeDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, StatCode :  StatCode) : pcf.api.Destination {
    return __newDestination(config(), {Claim, StatCode}, 0)
  }
  
  static function drilldown (Claim :  Claim, StatCode :  StatCode) : pcf.api.Location {
    return __newDestination(config(), {Claim, StatCode}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, StatCode :  StatCode) : pcf.api.Location {
    return __newDestination(config(), {Claim, StatCode}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, StatCode :  StatCode) : pcf.api.Location {
    return __newDestination(config(), {Claim, StatCode}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, StatCode :  StatCode) : pcf.api.Location {
    return __newDestination(config(), {Claim, StatCode}, 0).printPage()
  }
  
  static function push (Claim :  Claim, StatCode :  StatCode) : pcf.api.Location {
    return __newDestination(config(), {Claim, StatCode}, 0).push()
  }
  
  
}