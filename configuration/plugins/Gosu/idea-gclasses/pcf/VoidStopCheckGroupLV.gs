package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VoidStopCheckGroupLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CheckGroup :  CheckGroup) : void {
    __widgetOf(this, pcf.VoidStopCheckGroupLV, SECTION_WIDGET_CLASS).setVariables(false, {$CheckGroup})
  }
  
  function refreshVariables ($CheckGroup :  CheckGroup) : void {
    __widgetOf(this, pcf.VoidStopCheckGroupLV, SECTION_WIDGET_CLASS).setVariables(true, {$CheckGroup})
  }
  
  
}