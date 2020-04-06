package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/EditNote.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditNote extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.EditNote, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Note :  Note, Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {Note, Claim}, 0)
  }
  
  static function drilldown (Note :  Note, Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Note, Claim}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Note :  Note, Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Note, Claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Note :  Note, Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Note, Claim}, 0).goInMain()
  }
  
  static function printPage (Note :  Note, Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Note, Claim}, 0).printPage()
  }
  
  static function push (Note :  Note, Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Note, Claim}, 0).push()
  }
  
  
}