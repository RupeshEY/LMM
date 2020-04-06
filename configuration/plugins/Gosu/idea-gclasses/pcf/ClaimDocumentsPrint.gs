package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimDocumentsPrint extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimDocumentsPrint, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, includeHidden :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {Claim, includeHidden}, 0)
  }
  
  static function drilldown (Claim :  Claim, includeHidden :  boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, includeHidden}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, includeHidden :  boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, includeHidden}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, includeHidden :  boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, includeHidden}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, includeHidden :  boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, includeHidden}, 0).printPage()
  }
  
  static function push (Claim :  Claim, includeHidden :  boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, includeHidden}, 0).push()
  }
  
  
}