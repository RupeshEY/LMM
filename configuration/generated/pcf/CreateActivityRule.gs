package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CreateActivityRule.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateActivityRule extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CreateActivityRule, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (ruleToClone :  ActivityRule, token :  String) : pcf.api.Destination {
    return __newDestination(config(), {ruleToClone, token}, 1)
  }
  
  static function createDestination (token :  String) : pcf.api.Destination {
    return __newDestination(config(), {token}, 0)
  }
  
  static function drilldown (ruleToClone :  ActivityRule, token :  String) : pcf.api.Location {
    return __newDestination(config(), {ruleToClone, token}, 1).drilldown()
  }
  
  static function drilldown (token :  String) : pcf.api.Location {
    return __newDestination(config(), {token}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (ruleToClone :  ActivityRule, token :  String) : pcf.api.Location {
    return __newDestination(config(), {ruleToClone, token}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (token :  String) : pcf.api.Location {
    return __newDestination(config(), {token}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (ruleToClone :  ActivityRule, token :  String) : pcf.api.Location {
    return __newDestination(config(), {ruleToClone, token}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (token :  String) : pcf.api.Location {
    return __newDestination(config(), {token}, 0).goInMain()
  }
  
  static function printPage (ruleToClone :  ActivityRule, token :  String) : pcf.api.Location {
    return __newDestination(config(), {ruleToClone, token}, 1).printPage()
  }
  
  static function printPage (token :  String) : pcf.api.Location {
    return __newDestination(config(), {token}, 0).printPage()
  }
  
  static function push (ruleToClone :  ActivityRule, token :  String) : pcf.api.Location {
    return __newDestination(config(), {ruleToClone, token}, 1).push()
  }
  
  static function push (token :  String) : pcf.api.Location {
    return __newDestination(config(), {token}, 0).push()
  }
  
  
}