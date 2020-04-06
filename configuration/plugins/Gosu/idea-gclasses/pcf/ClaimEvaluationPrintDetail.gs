package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluationPrintDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimEvaluationPrintDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Evaluation :  Evaluation) : pcf.api.Destination {
    return __newDestination(config(), {Evaluation}, 0)
  }
  
  static function drilldown (Evaluation :  Evaluation) : pcf.api.Location {
    return __newDestination(config(), {Evaluation}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Evaluation :  Evaluation) : pcf.api.Location {
    return __newDestination(config(), {Evaluation}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Evaluation :  Evaluation) : pcf.api.Location {
    return __newDestination(config(), {Evaluation}, 0).goInMain()
  }
  
  static function printPage (Evaluation :  Evaluation) : pcf.api.Location {
    return __newDestination(config(), {Evaluation}, 0).printPage()
  }
  
  static function push (Evaluation :  Evaluation) : pcf.api.Location {
    return __newDestination(config(), {Evaluation}, 0).push()
  }
  
  
}