package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecksCompoundLVPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.LoadIntegrityChecksCompoundLVPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (LoadIntegrityChecks :  gw.api.tools.LoadIntegrityChecksHelper, AllowNonAdminRef :  Boolean, Check :  gw.api.database.WebLoaderSQLIntegrityCheck) : pcf.api.Destination {
    return __newDestination(config(), {LoadIntegrityChecks, AllowNonAdminRef, Check}, 0)
  }
  
  static function push (LoadIntegrityChecks :  gw.api.tools.LoadIntegrityChecksHelper, AllowNonAdminRef :  Boolean, Check :  gw.api.database.WebLoaderSQLIntegrityCheck) : pcf.api.Location {
    return __newDestination(config(), {LoadIntegrityChecks, AllowNonAdminRef, Check}, 0).push()
  }
  
  
}