package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.MetroFlowDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Workflow :  Workflow) : pcf.api.Destination {
    return __newDestination(config(), {Workflow}, 0)
  }
  
  static function drilldown (Workflow :  Workflow) : pcf.api.Location {
    return __newDestination(config(), {Workflow}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Workflow :  Workflow) : pcf.api.Location {
    return __newDestination(config(), {Workflow}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Workflow :  Workflow) : pcf.api.Location {
    return __newDestination(config(), {Workflow}, 0).goInMain()
  }
  
  static function printPage (Workflow :  Workflow) : pcf.api.Location {
    return __newDestination(config(), {Workflow}, 0).printPage()
  }
  
  static function push (Workflow :  Workflow) : pcf.api.Location {
    return __newDestination(config(), {Workflow}, 0).push()
  }
  
  
}