package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/preferences/UserPreferencesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserPreferencesScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($UserSettings :  UserSettings, $User :  User) : void {
    __widgetOf(this, pcf.UserPreferencesScreen, SECTION_WIDGET_CLASS).setVariables(false, {$UserSettings, $User})
  }
  
  function refreshVariables ($UserSettings :  UserSettings, $User :  User) : void {
    __widgetOf(this, pcf.UserPreferencesScreen, SECTION_WIDGET_CLASS).setVariables(true, {$UserSettings, $User})
  }
  
  
}