package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRuleDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ActivityRuleDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (head :  ActivityRuleHead, version :  ActivityRuleVersion) : pcf.api.Destination {
    return __newDestination(config(), {head, version}, 0)
  }
  
  static function drilldown (head :  ActivityRuleHead, version :  ActivityRuleVersion) : pcf.api.Location {
    return __newDestination(config(), {head, version}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (head :  ActivityRuleHead, version :  ActivityRuleVersion) : pcf.api.Location {
    return __newDestination(config(), {head, version}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (head :  ActivityRuleHead, version :  ActivityRuleVersion) : pcf.api.Location {
    return __newDestination(config(), {head, version}, 0).goInMain()
  }
  
  static function printPage (head :  ActivityRuleHead, version :  ActivityRuleVersion) : pcf.api.Location {
    return __newDestination(config(), {head, version}, 0).printPage()
  }
  
  static function push (head :  ActivityRuleHead, version :  ActivityRuleVersion) : pcf.api.Location {
    return __newDestination(config(), {head, version}, 0).push()
  }
  
  
}