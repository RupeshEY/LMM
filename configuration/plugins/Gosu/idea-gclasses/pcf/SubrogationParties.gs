package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationParties extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.SubrogationParties, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 0)
  }
  
  static function createDestination (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : pcf.api.Destination {
    return __newDestination(config(), {claim, selectedWrapper}, 1)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).drilldown()
  }
  
  static function drilldown (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedWrapper}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedWrapper}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedWrapper}, 1).goInMain()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).printPage()
  }
  
  static function printPage (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedWrapper}, 1).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).push()
  }
  
  static function push (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : pcf.api.Location {
    return __newDestination(config(), {claim, selectedWrapper}, 1).push()
  }
  
  
}