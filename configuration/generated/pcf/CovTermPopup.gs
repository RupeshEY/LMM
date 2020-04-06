package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CovTermPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (CovTermParam :  CovTerm, EditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {CovTermParam, EditMode}, 1)
  }
  
  static function createDestination (Coverage :  Coverage, CovTermType :  typekey.CovTerm, EditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {Coverage, CovTermType, EditMode}, 0)
  }
  
  static function push (CovTermParam :  CovTerm, EditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {CovTermParam, EditMode}, 1).push()
  }
  
  static function push (Coverage :  Coverage, CovTermType :  typekey.CovTerm, EditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {Coverage, CovTermType, EditMode}, 0).push()
  }
  
  
}