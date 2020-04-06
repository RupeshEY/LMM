package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/acl/ECFUploadDocumentACLPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFUploadDocumentACLPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ECFUploadDocumentACLPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (aDocument :  Document) : pcf.api.Destination {
    return __newDestination(config(), {aDocument}, 0)
  }
  
  static function push (aDocument :  Document) : pcf.api.Location {
    return __newDestination(config(), {aDocument}, 0).push()
  }
  
  
}