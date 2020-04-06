package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageXMLContentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFMessageXMLContentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ECFMessageXMLContentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (message :  LMMessage_Ext) : pcf.api.Destination {
    return __newDestination(config(), {message}, 0)
  }
  
  static function push (message :  LMMessage_Ext) : pcf.api.Location {
    return __newDestination(config(), {message}, 0).push()
  }
  
  
}