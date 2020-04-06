package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewReserveMultiCurrencyPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewReserveMultiCurrencyPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (WizardHelper :  gw.api.financials.ReserveWizardHelper, EditWrapper :  TransactionEditWrapper) : pcf.api.Destination {
    return __newDestination(config(), {WizardHelper, EditWrapper}, 0)
  }
  
  static function push (WizardHelper :  gw.api.financials.ReserveWizardHelper, EditWrapper :  TransactionEditWrapper) : pcf.api.Location {
    return __newDestination(config(), {WizardHelper, EditWrapper}, 0).push()
  }
  
  
}