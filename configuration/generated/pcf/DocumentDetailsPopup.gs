package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.DocumentDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (DocumentParam :  Document) : pcf.api.Destination {
    return __newDestination(config(), {DocumentParam}, 0)
  }
  
  static function createDestination (DocumentParam :  Document, editMetadata :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {DocumentParam, editMetadata}, 1)
  }
  
  static function push (DocumentParam :  Document) : pcf.api.Location {
    return __newDestination(config(), {DocumentParam}, 0).push()
  }
  
  static function push (DocumentParam :  Document, editMetadata :  boolean) : pcf.api.Location {
    return __newDestination(config(), {DocumentParam, editMetadata}, 1).push()
  }
  
  
}