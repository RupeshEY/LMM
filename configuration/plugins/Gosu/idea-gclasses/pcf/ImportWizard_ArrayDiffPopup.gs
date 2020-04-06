package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportWizard_ArrayDiffPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ImportWizard_ArrayDiffPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (ArrayDifferences :  gw.api.admin.ImportDataArrayDifferences) : pcf.api.Destination {
    return __newDestination(config(), {ArrayDifferences}, 0)
  }
  
  static function push (ArrayDifferences :  gw.api.admin.ImportDataArrayDifferences) : pcf.api.Location {
    return __newDestination(config(), {ArrayDifferences}, 0).push()
  }
  
  
}