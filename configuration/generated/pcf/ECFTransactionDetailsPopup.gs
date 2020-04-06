package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ECFTransactionDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFTransactionDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ECFTransactionDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claimDataMsg :  ECFMessageClaimData_Ext) : pcf.api.Destination {
    return __newDestination(config(), {claimDataMsg}, 0)
  }
  
  static function createDestination (claimDataMsg :  ECFMessageClaimData_Ext, goToRespondOnEnter :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {claimDataMsg, goToRespondOnEnter}, 1)
  }
  
  static function push (claimDataMsg :  ECFMessageClaimData_Ext) : pcf.api.Location {
    return __newDestination(config(), {claimDataMsg}, 0).push()
  }
  
  static function push (claimDataMsg :  ECFMessageClaimData_Ext, goToRespondOnEnter :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claimDataMsg, goToRespondOnEnter}, 1).push()
  }
  
  
}