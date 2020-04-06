package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveItemListPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ArchiveItemListPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (archiveDetailsData :  gw.api.archiving.ArchiveDetailsData) : pcf.api.Destination {
    return __newDestination(config(), {archiveDetailsData}, 0)
  }
  
  static function push (archiveDetailsData :  gw.api.archiving.ArchiveDetailsData) : pcf.api.Location {
    return __newDestination(config(), {archiveDetailsData}, 0).push()
  }
  
  
}