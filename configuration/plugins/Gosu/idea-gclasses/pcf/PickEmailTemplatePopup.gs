package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PickEmailTemplatePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.PickEmailTemplatePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (inSearchCriteria :  gw.api.email.EmailTemplateSearchCriteria) : pcf.api.Destination {
    return __newDestination(config(), {inSearchCriteria}, 0)
  }
  
  function pickValueAndCommit (value :  gw.plugin.email.IEmailTemplateDescriptor) : void {
    __widgetOf(this, pcf.PickEmailTemplatePopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (inSearchCriteria :  gw.api.email.EmailTemplateSearchCriteria) : pcf.api.Location {
    return __newDestination(config(), {inSearchCriteria}, 0).push()
  }
  
  
}