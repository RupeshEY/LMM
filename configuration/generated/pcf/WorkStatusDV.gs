package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/WorkStatusDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkStatusDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aWorkStatus :  WorkStatus) : void {
    __widgetOf(this, pcf.WorkStatusDV, SECTION_WIDGET_CLASS).setVariables(false, {$aWorkStatus})
  }
  
  function refreshVariables ($aWorkStatus :  WorkStatus) : void {
    __widgetOf(this, pcf.WorkStatusDV, SECTION_WIDGET_CLASS).setVariables(true, {$aWorkStatus})
  }
  
  
}