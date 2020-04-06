package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotCovTerm800Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotCovTerm800Popup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimSnapshotCovTerm800Popup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (CovTerm :  dynamic.Dynamic) : pcf.api.Destination {
    return __newDestination(config(), {CovTerm}, 0)
  }
  
  static function push (CovTerm :  dynamic.Dynamic) : pcf.api.Location {
    return __newDestination(config(), {CovTerm}, 0).push()
  }
  
  
}