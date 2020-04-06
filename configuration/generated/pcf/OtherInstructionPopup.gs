package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherInstructionPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.OtherInstructionPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (otherInstructionParam :  OtherInstruction, specialHandling :  SpecialHandling, editMode :  boolean, canEdit :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {otherInstructionParam, specialHandling, editMode, canEdit}, 0)
  }
  
  function pickValueAndCommit (value :  OtherInstruction) : void {
    __widgetOf(this, pcf.OtherInstructionPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (otherInstructionParam :  OtherInstruction, specialHandling :  SpecialHandling, editMode :  boolean, canEdit :  boolean) : pcf.api.Location {
    return __newDestination(config(), {otherInstructionParam, specialHandling, editMode, canEdit}, 0).push()
  }
  
  
}