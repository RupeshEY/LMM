package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/attributes/AttributeDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AttributeDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AttributeDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Attribute :  Attribute) : pcf.api.Destination {
    return __newDestination(config(), {Attribute}, 0)
  }
  
  static function drilldown (Attribute :  Attribute) : pcf.api.Location {
    return __newDestination(config(), {Attribute}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Attribute :  Attribute) : pcf.api.Location {
    return __newDestination(config(), {Attribute}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Attribute :  Attribute) : pcf.api.Location {
    return __newDestination(config(), {Attribute}, 0).goInMain()
  }
  
  static function printPage (Attribute :  Attribute) : pcf.api.Location {
    return __newDestination(config(), {Attribute}, 0).printPage()
  }
  
  static function push (Attribute :  Attribute) : pcf.api.Location {
    return __newDestination(config(), {Attribute}, 0).push()
  }
  
  
}