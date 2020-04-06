package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/DeployConfirmationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DeployConfirmationPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.DeployConfirmationPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (pageHelper :  gw.bizrules.pcf.RuleDeploymentPageHelper) : pcf.api.Destination {
    return __newDestination(config(), {pageHelper}, 0)
  }
  
  static function push (pageHelper :  gw.bizrules.pcf.RuleDeploymentPageHelper) : pcf.api.Location {
    return __newDestination(config(), {pageHelper}, 0).push()
  }
  
  
}