package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentTransferPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.PaymentTransferPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Payment :  Payment, Claim :  Claim, reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : pcf.api.Destination {
    return __newDestination(config(), {Payment, Claim, reserveLineInputSetHelper}, 0)
  }
  
  static function push (Payment :  Payment, Claim :  Claim, reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : pcf.api.Location {
    return __newDestination(config(), {Payment, Claim, reserveLineInputSetHelper}, 0).push()
  }
  
  
}