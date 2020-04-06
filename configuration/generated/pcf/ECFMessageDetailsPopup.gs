package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ECFMessageDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claimDataMsg :  ECFMessageClaimData_Ext) : pcf.api.Destination {
    return __newDestination(config(), {claimDataMsg}, 0)
  }
  
  static function push (claimDataMsg :  ECFMessageClaimData_Ext) : pcf.api.Location {
    return __newDestination(config(), {claimDataMsg}, 0).push()
  }
  
  
}