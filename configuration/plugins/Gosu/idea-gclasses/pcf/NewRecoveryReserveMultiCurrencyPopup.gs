package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRecoveryReserveMultiCurrencyPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewRecoveryReserveMultiCurrencyPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (WizardHelper :  gw.api.financials.RecoveryReserveWizardHelper, EditWrapper :  TransactionEditWrapper) : pcf.api.Destination {
    return __newDestination(config(), {WizardHelper, EditWrapper}, 0)
  }
  
  static function push (WizardHelper :  gw.api.financials.RecoveryReserveWizardHelper, EditWrapper :  TransactionEditWrapper) : pcf.api.Location {
    return __newDestination(config(), {WizardHelper, EditWrapper}, 0).push()
  }
  
  
}