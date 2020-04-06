package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessagesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimMessagesScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimMessagesScreen, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimMessagesScreen, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}