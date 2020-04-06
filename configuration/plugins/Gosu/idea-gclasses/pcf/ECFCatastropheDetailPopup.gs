package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/catastrophe/ECFCatastropheDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFCatastropheDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ECFCatastropheDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (catastrophe :  Catastrophe, showRelatedClaimsFinder :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {catastrophe, showRelatedClaimsFinder}, 0)
  }
  
  static function push (catastrophe :  Catastrophe, showRelatedClaimsFinder :  boolean) : pcf.api.Location {
    return __newDestination(config(), {catastrophe, showRelatedClaimsFinder}, 0).push()
  }
  
  
}