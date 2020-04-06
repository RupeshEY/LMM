package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AccountDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function createDestination (account :  Account) : pcf.api.Destination {
    return __newDestination(config(), {account}, 1)
  }
  
  static function createDestination (account :  Account, showAccountHandlingCardToStart :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {account, showAccountHandlingCardToStart}, 2)
  }
  
  static function drilldown () : pcf.api.Location {
    return __newDestination(config(), {}, 0).drilldown()
  }
  
  static function drilldown (account :  Account) : pcf.api.Location {
    return __newDestination(config(), {account}, 1).drilldown()
  }
  
  static function drilldown (account :  Account, showAccountHandlingCardToStart :  boolean) : pcf.api.Location {
    return __newDestination(config(), {account, showAccountHandlingCardToStart}, 2).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go () : pcf.api.Location {
    return __newDestination(config(), {}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (account :  Account) : pcf.api.Location {
    return __newDestination(config(), {account}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (account :  Account, showAccountHandlingCardToStart :  boolean) : pcf.api.Location {
    return __newDestination(config(), {account, showAccountHandlingCardToStart}, 2).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain () : pcf.api.Location {
    return __newDestination(config(), {}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (account :  Account) : pcf.api.Location {
    return __newDestination(config(), {account}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (account :  Account, showAccountHandlingCardToStart :  boolean) : pcf.api.Location {
    return __newDestination(config(), {account, showAccountHandlingCardToStart}, 2).goInMain()
  }
  
  static function printPage () : pcf.api.Location {
    return __newDestination(config(), {}, 0).printPage()
  }
  
  static function printPage (account :  Account) : pcf.api.Location {
    return __newDestination(config(), {account}, 1).printPage()
  }
  
  static function printPage (account :  Account, showAccountHandlingCardToStart :  boolean) : pcf.api.Location {
    return __newDestination(config(), {account, showAccountHandlingCardToStart}, 2).printPage()
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  static function push (account :  Account) : pcf.api.Location {
    return __newDestination(config(), {account}, 1).push()
  }
  
  static function push (account :  Account, showAccountHandlingCardToStart :  boolean) : pcf.api.Location {
    return __newDestination(config(), {account, showAccountHandlingCardToStart}, 2).push()
  }
  
  
}