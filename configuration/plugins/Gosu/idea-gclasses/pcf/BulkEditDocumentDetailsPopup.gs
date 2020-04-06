package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkEditDocumentDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.BulkEditDocumentDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (documentDetailsHelper :  gw.document.DocumentDetailsApplicationHelper) : pcf.api.Destination {
    return __newDestination(config(), {documentDetailsHelper}, 0)
  }
  
  static function push (documentDetailsHelper :  gw.document.DocumentDetailsApplicationHelper) : pcf.api.Location {
    return __newDestination(config(), {documentDetailsHelper}, 0).push()
  }
  
  
}