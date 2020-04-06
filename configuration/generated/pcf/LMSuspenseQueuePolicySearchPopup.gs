package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/policysearch/LMSuspenseQueuePolicySearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LMSuspenseQueuePolicySearchPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.LMSuspenseQueuePolicySearchPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (message :  LMMessageLloydsSCM_Ext) : pcf.api.Destination {
    return __newDestination(config(), {message}, 0)
  }
  
  function pickValueAndCommit (value :  java.lang.String) : void {
    __widgetOf(this, pcf.LMSuspenseQueuePolicySearchPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (message :  LMMessageLloydsSCM_Ext) : pcf.api.Location {
    return __newDestination(config(), {message}, 0).push()
  }
  
  
}