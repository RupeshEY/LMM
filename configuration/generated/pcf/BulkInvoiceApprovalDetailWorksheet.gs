package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceApprovalDetailWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.BulkInvoiceApprovalDetailWorksheet, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Activity :  Activity) : pcf.api.Destination {
    return __newDestination(config(), {Activity}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Activity}, 0).goInWorkspace()
  }
  
  static function push (Activity :  Activity) : pcf.api.Location {
    return __newDestination(config(), {Activity}, 0).push()
  }
  
  
}