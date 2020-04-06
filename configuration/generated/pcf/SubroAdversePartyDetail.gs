package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SubroAdversePartyDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.SubroAdversePartyDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (party :  SubroAdverseParty) : pcf.api.Destination {
    return __newDestination(config(), {party}, 0)
  }
  
  static function drilldown (party :  SubroAdverseParty) : pcf.api.Location {
    return __newDestination(config(), {party}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (party :  SubroAdverseParty) : pcf.api.Location {
    return __newDestination(config(), {party}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (party :  SubroAdverseParty) : pcf.api.Location {
    return __newDestination(config(), {party}, 0).goInMain()
  }
  
  static function printPage (party :  SubroAdverseParty) : pcf.api.Location {
    return __newDestination(config(), {party}, 0).printPage()
  }
  
  static function push (party :  SubroAdverseParty) : pcf.api.Location {
    return __newDestination(config(), {party}, 0).push()
  }
  
  
}