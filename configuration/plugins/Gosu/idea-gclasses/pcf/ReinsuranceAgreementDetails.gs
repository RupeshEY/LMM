package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceAgreementDetails extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ReinsuranceAgreementDetails, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (reinsuranceAgreement :  RIAgreement, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {reinsuranceAgreement, claim}, 0)
  }
  
  static function drilldown (reinsuranceAgreement :  RIAgreement, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {reinsuranceAgreement, claim}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (reinsuranceAgreement :  RIAgreement, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {reinsuranceAgreement, claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (reinsuranceAgreement :  RIAgreement, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {reinsuranceAgreement, claim}, 0).goInMain()
  }
  
  static function printPage (reinsuranceAgreement :  RIAgreement, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {reinsuranceAgreement, claim}, 0).printPage()
  }
  
  static function push (reinsuranceAgreement :  RIAgreement, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {reinsuranceAgreement, claim}, 0).push()
  }
  
  
}