package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ECFMessageSuspenseQueueDeleteAdditionalMessagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageSuspenseQueueDeleteAdditionalMessagePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ECFMessageSuspenseQueueDeleteAdditionalMessagePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (ecfMessageClaimData :  ECFMessageClaimData_Ext) : pcf.api.Destination {
    return __newDestination(config(), {ecfMessageClaimData}, 0)
  }
  
  static function push (ecfMessageClaimData :  ECFMessageClaimData_Ext) : pcf.api.Location {
    return __newDestination(config(), {ecfMessageClaimData}, 0).push()
  }
  
  
}