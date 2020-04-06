package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UploadDocumentContentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.UploadDocumentContentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (document :  Document) : pcf.api.Destination {
    return __newDestination(config(), {document}, 0)
  }
  
  static function push (document :  Document) : pcf.api.Location {
    return __newDestination(config(), {document}, 0).push()
  }
  
  
}