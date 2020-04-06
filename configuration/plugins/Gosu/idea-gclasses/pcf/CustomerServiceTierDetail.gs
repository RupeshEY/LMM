package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomerServiceTierDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CustomerServiceTierDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (aCustomerServiceTier :  CustomerServiceTierSpecialHandling) : pcf.api.Destination {
    return __newDestination(config(), {aCustomerServiceTier}, 0)
  }
  
  static function createDestination (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {aCustomerServiceTier, startInEditModeFlag}, 1)
  }
  
  static function drilldown (aCustomerServiceTier :  CustomerServiceTierSpecialHandling) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier}, 0).drilldown()
  }
  
  static function drilldown (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier, startInEditModeFlag}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (aCustomerServiceTier :  CustomerServiceTierSpecialHandling) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier, startInEditModeFlag}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (aCustomerServiceTier :  CustomerServiceTierSpecialHandling) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier, startInEditModeFlag}, 1).goInMain()
  }
  
  static function printPage (aCustomerServiceTier :  CustomerServiceTierSpecialHandling) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier}, 0).printPage()
  }
  
  static function printPage (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier, startInEditModeFlag}, 1).printPage()
  }
  
  static function push (aCustomerServiceTier :  CustomerServiceTierSpecialHandling) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier}, 0).push()
  }
  
  static function push (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : pcf.api.Location {
    return __newDestination(config(), {aCustomerServiceTier, startInEditModeFlag}, 1).push()
  }
  
  
}