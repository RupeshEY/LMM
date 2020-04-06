package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckPayeesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Check :  Check) : void {
    __widgetOf(this, pcf.CheckPayeesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Check})
  }
  
  function refreshVariables ($Check :  Check) : void {
    __widgetOf(this, pcf.CheckPayeesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Check})
  }
  
  
}