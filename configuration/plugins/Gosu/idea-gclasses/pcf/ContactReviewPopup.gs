package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/ContactReviewPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactReviewPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ContactReviewPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (review :  Review) : pcf.api.Destination {
    return __newDestination(config(), {review}, 0)
  }
  
  static function push (review :  Review) : pcf.api.Location {
    return __newDestination(config(), {review}, 0).push()
  }
  
  
}