package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/desktop/claimsearch/ECFSuspenseQueueClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFSuspenseQueueClaimSearchPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ECFSuspenseQueueClaimSearchPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claimDataMessage :  ECFMessageClaimData_Ext) : pcf.api.Destination {
    return __newDestination(config(), {claimDataMessage}, 0)
  }
  
  function pickValueAndCommit (value :  java.lang.String) : void {
    __widgetOf(this, pcf.ECFSuspenseQueueClaimSearchPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (claimDataMessage :  ECFMessageClaimData_Ext) : pcf.api.Location {
    return __newDestination(config(), {claimDataMessage}, 0).push()
  }
  
  
}