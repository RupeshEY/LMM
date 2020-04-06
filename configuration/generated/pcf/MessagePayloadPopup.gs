package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessagePayloadPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MessagePayloadPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.MessagePayloadPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (MessageId :  long) : pcf.api.Destination {
    return __newDestination(config(), {MessageId}, 0)
  }
  
  static function push (MessageId :  long) : pcf.api.Location {
    return __newDestination(config(), {MessageId}, 0).push()
  }
  
  
}