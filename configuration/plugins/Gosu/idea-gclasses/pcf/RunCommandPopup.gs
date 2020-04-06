package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/RunCommandPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RunCommandPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.RunCommandPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (command :  com.guidewire.pl.quickjump.BaseCommand, methodInfo :  gw.lang.reflect.IMethodInfo) : pcf.api.Destination {
    return __newDestination(config(), {command, methodInfo}, 0)
  }
  
  function pickValueAndCommit (value :  Object) : void {
    __widgetOf(this, pcf.RunCommandPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (command :  com.guidewire.pl.quickjump.BaseCommand, methodInfo :  gw.lang.reflect.IMethodInfo) : pcf.api.Location {
    return __newDestination(config(), {command, methodInfo}, 0).push()
  }
  
  
}