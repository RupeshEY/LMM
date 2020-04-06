package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowLogEntryDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.MetroFlowLogEntryDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Workflow :  Workflow, LogEntry :  WorkflowTextLog) : pcf.api.Destination {
    return __newDestination(config(), {Workflow, LogEntry}, 0)
  }
  
  static function drilldown (Workflow :  Workflow, LogEntry :  WorkflowTextLog) : pcf.api.Location {
    return __newDestination(config(), {Workflow, LogEntry}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Workflow :  Workflow, LogEntry :  WorkflowTextLog) : pcf.api.Location {
    return __newDestination(config(), {Workflow, LogEntry}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Workflow :  Workflow, LogEntry :  WorkflowTextLog) : pcf.api.Location {
    return __newDestination(config(), {Workflow, LogEntry}, 0).goInMain()
  }
  
  static function printPage (Workflow :  Workflow, LogEntry :  WorkflowTextLog) : pcf.api.Location {
    return __newDestination(config(), {Workflow, LogEntry}, 0).printPage()
  }
  
  static function push (Workflow :  Workflow, LogEntry :  WorkflowTextLog) : pcf.api.Location {
    return __newDestination(config(), {Workflow, LogEntry}, 0).push()
  }
  
  
}