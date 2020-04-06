package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalDetailWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ApprovalDetailWorksheet, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Activity :  Activity) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Activity}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Claim :  Claim, Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Claim, Activity}, 0).goInWorkspace()
  }
  
  static function push (Claim :  Claim, Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Claim, Activity}, 0).push()
  }
  
  
}