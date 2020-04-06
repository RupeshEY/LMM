package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableWaitingPeriodsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.EditableWaitingPeriodsLV, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.EditableWaitingPeriodsLV, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}