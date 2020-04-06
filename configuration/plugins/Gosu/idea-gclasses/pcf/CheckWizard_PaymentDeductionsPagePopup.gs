package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckWizard_PaymentDeductionsPagePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CheckWizard_PaymentDeductionsPagePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Wizard :  gw.api.financials.CheckWizardInfo, Check :  Check) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Wizard, Check}, 0)
  }
  
  static function push (Claim :  Claim, Wizard :  gw.api.financials.CheckWizardInfo, Check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, Wizard, Check}, 0).push()
  }
  
  
}