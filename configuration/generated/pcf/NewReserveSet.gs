package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewReserveSet extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewReserveSet, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {Claim}, 0)
  }
  
  static function createDestination (Claim :  Claim, Exposure :  Exposure, addNew :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Exposure, addNew}, 2)
  }
  
  static function createDestination (Claim :  Claim, Exposure :  Exposure, CostType :  CostType, CostCategory :  CostCategory, ReservingCurrency :  Currency) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Exposure, CostType, CostCategory, ReservingCurrency}, 3)
  }
  
  static function createDestination (Claim :  Claim, Reserve :  Reserve, Exposure :  Exposure) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Reserve, Exposure}, 1)
  }
  
  static function drilldown (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).drilldown()
  }
  
  static function drilldown (Claim :  Claim, Exposure :  Exposure, addNew :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, addNew}, 2).drilldown()
  }
  
  static function drilldown (Claim :  Claim, Exposure :  Exposure, CostType :  CostType, CostCategory :  CostCategory, ReservingCurrency :  Currency) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, CostType, CostCategory, ReservingCurrency}, 3).drilldown()
  }
  
  static function drilldown (Claim :  Claim, Reserve :  Reserve, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Reserve, Exposure}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Exposure :  Exposure, addNew :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, addNew}, 2).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Exposure :  Exposure, CostType :  CostType, CostCategory :  CostCategory, ReservingCurrency :  Currency) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, CostType, CostCategory, ReservingCurrency}, 3).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Reserve :  Reserve, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Reserve, Exposure}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Exposure :  Exposure, addNew :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, addNew}, 2).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Exposure :  Exposure, CostType :  CostType, CostCategory :  CostCategory, ReservingCurrency :  Currency) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, CostType, CostCategory, ReservingCurrency}, 3).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Reserve :  Reserve, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Reserve, Exposure}, 1).goInMain()
  }
  
  static function printPage (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).printPage()
  }
  
  static function printPage (Claim :  Claim, Exposure :  Exposure, addNew :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, addNew}, 2).printPage()
  }
  
  static function printPage (Claim :  Claim, Exposure :  Exposure, CostType :  CostType, CostCategory :  CostCategory, ReservingCurrency :  Currency) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, CostType, CostCategory, ReservingCurrency}, 3).printPage()
  }
  
  static function printPage (Claim :  Claim, Reserve :  Reserve, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Reserve, Exposure}, 1).printPage()
  }
  
  static function push (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).push()
  }
  
  static function push (Claim :  Claim, Exposure :  Exposure, addNew :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, addNew}, 2).push()
  }
  
  static function push (Claim :  Claim, Exposure :  Exposure, CostType :  CostType, CostCategory :  CostCategory, ReservingCurrency :  Currency) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, CostType, CostCategory, ReservingCurrency}, 3).push()
  }
  
  static function push (Claim :  Claim, Reserve :  Reserve, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Reserve, Exposure}, 1).push()
  }
  
  
}