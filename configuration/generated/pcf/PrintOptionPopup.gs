package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/PrintOptionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PrintOptionPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.PrintOptionPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (PrintOptions :  gw.api.print.ListViewPrintOptions) : pcf.api.Destination {
    return __newDestination(config(), {PrintOptions}, 0)
  }
  
  static function push (PrintOptions :  gw.api.print.ListViewPrintOptions) : pcf.api.Location {
    return __newDestination(config(), {PrintOptions}, 0).push()
  }
  
  
}