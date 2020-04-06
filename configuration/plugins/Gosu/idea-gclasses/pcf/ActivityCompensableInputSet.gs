package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityCompensableInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityCompensableInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityCompensableInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Activity})
  }
  
  function refreshVariables ($Claim :  Claim, $Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityCompensableInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Activity})
  }
  
  
}