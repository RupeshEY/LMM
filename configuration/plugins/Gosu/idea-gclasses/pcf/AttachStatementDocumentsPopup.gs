package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/AttachStatementDocumentsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AttachStatementDocumentsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AttachStatementDocumentsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (createdStatement :  ServiceRequestStatement) : pcf.api.Destination {
    return __newDestination(config(), {createdStatement}, 0)
  }
  
  static function push (createdStatement :  ServiceRequestStatement) : pcf.api.Location {
    return __newDestination(config(), {createdStatement}, 0).push()
  }
  
  
}