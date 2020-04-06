package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAutomatedActivityHandlerPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewAutomatedActivityHandlerPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (specialHandling :  SpecialHandling, handlerSubtype :  gw.entity.IEntityType) : pcf.api.Destination {
    return __newDestination(config(), {specialHandling, handlerSubtype}, 0)
  }
  
  static function push (specialHandling :  SpecialHandling, handlerSubtype :  gw.entity.IEntityType) : pcf.api.Location {
    return __newDestination(config(), {specialHandling, handlerSubtype}, 0).push()
  }
  
  
}