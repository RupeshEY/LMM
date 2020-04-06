package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExistingAccountRefWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ExistingAccountRefWorksheet, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (account :  Account, policies :  java.util.List<Policy>) : pcf.api.Destination {
    return __newDestination(config(), {account, policies}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (account :  Account, policies :  java.util.List<Policy>) : pcf.api.Location {
    return __newDestination(config(), {account, policies}, 0).goInWorkspace()
  }
  
  static function push (account :  Account, policies :  java.util.List<Policy>) : pcf.api.Location {
    return __newDestination(config(), {account, policies}, 0).push()
  }
  
  
}