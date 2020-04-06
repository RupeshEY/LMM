package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/EditNotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditNotePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.EditNotePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (note :  entity.Note) : pcf.api.Destination {
    return __newDestination(config(), {note}, 0)
  }
  
  static function createDestination (note :  entity.Note, topicEditable :  boolean, relatedToEditable :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {note, topicEditable, relatedToEditable}, 1)
  }
  
  static function push (note :  entity.Note) : pcf.api.Location {
    return __newDestination(config(), {note}, 0).push()
  }
  
  static function push (note :  entity.Note, topicEditable :  boolean, relatedToEditable :  boolean) : pcf.api.Location {
    return __newDestination(config(), {note, topicEditable, relatedToEditable}, 1).push()
  }
  
  
}