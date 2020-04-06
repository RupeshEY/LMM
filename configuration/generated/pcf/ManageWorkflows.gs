package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/ManageWorkflows.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ManageWorkflows extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ManageWorkflows, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (workflows :  Workflow[]) : pcf.api.Destination {
    return __newDestination(config(), {workflows}, 0)
  }
  
  static function createDestination (workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, criteria :  WorkflowSearchCriteria) : pcf.api.Destination {
    return __newDestination(config(), {workflowQuery, criteria}, 1)
  }
  
  static function drilldown (workflows :  Workflow[]) : pcf.api.Location {
    return __newDestination(config(), {workflows}, 0).drilldown()
  }
  
  static function drilldown (workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, criteria :  WorkflowSearchCriteria) : pcf.api.Location {
    return __newDestination(config(), {workflowQuery, criteria}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (workflows :  Workflow[]) : pcf.api.Location {
    return __newDestination(config(), {workflows}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, criteria :  WorkflowSearchCriteria) : pcf.api.Location {
    return __newDestination(config(), {workflowQuery, criteria}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (workflows :  Workflow[]) : pcf.api.Location {
    return __newDestination(config(), {workflows}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, criteria :  WorkflowSearchCriteria) : pcf.api.Location {
    return __newDestination(config(), {workflowQuery, criteria}, 1).goInMain()
  }
  
  static function printPage (workflows :  Workflow[]) : pcf.api.Location {
    return __newDestination(config(), {workflows}, 0).printPage()
  }
  
  static function printPage (workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, criteria :  WorkflowSearchCriteria) : pcf.api.Location {
    return __newDestination(config(), {workflowQuery, criteria}, 1).printPage()
  }
  
  static function push (workflows :  Workflow[]) : pcf.api.Location {
    return __newDestination(config(), {workflows}, 0).push()
  }
  
  static function push (workflowQuery :  gw.api.database.IQueryBeanResult<Workflow>, criteria :  WorkflowSearchCriteria) : pcf.api.Location {
    return __newDestination(config(), {workflowQuery, criteria}, 1).push()
  }
  
  
}