package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/CreateReviewPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateReviewPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CreateReviewPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (reviewType :  ReviewType, contact :  Contact) : pcf.api.Destination {
    return __newDestination(config(), {reviewType, contact}, 1)
  }
  
  static function createDestination (reviewType :  ReviewType, contact :  Contact, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {reviewType, contact, claim}, 0)
  }
  
  static function push (reviewType :  ReviewType, contact :  Contact) : pcf.api.Location {
    return __newDestination(config(), {reviewType, contact}, 1).push()
  }
  
  static function push (reviewType :  ReviewType, contact :  Contact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {reviewType, contact, claim}, 0).push()
  }
  
  
}