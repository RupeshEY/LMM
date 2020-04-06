package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VoidStopCheckDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Check :  Check) : void {
    __widgetOf(this, pcf.VoidStopCheckDV, SECTION_WIDGET_CLASS).setVariables(false, {$Check})
  }
  
  function refreshVariables ($Check :  Check) : void {
    __widgetOf(this, pcf.VoidStopCheckDV, SECTION_WIDGET_CLASS).setVariables(true, {$Check})
  }
  
  
}