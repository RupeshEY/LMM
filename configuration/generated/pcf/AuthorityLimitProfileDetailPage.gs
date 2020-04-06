package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AuthorityLimitProfileDetailPage extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AuthorityLimitProfileDetailPage, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (AuthorityLimitProfile :  AuthorityLimitProfile) : pcf.api.Destination {
    return __newDestination(config(), {AuthorityLimitProfile}, 0)
  }
  
  static function drilldown (AuthorityLimitProfile :  AuthorityLimitProfile) : pcf.api.Location {
    return __newDestination(config(), {AuthorityLimitProfile}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (AuthorityLimitProfile :  AuthorityLimitProfile) : pcf.api.Location {
    return __newDestination(config(), {AuthorityLimitProfile}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (AuthorityLimitProfile :  AuthorityLimitProfile) : pcf.api.Location {
    return __newDestination(config(), {AuthorityLimitProfile}, 0).goInMain()
  }
  
  static function printPage (AuthorityLimitProfile :  AuthorityLimitProfile) : pcf.api.Location {
    return __newDestination(config(), {AuthorityLimitProfile}, 0).printPage()
  }
  
  static function push (AuthorityLimitProfile :  AuthorityLimitProfile) : pcf.api.Location {
    return __newDestination(config(), {AuthorityLimitProfile}, 0).push()
  }
  
  
}