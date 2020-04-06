package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_EditNotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_EditNotePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.FNOLWizard_EditNotePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (note :  Note, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {note, claim}, 0)
  }
  
  static function push (note :  Note, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {note, claim}, 0).push()
  }
  
  
}