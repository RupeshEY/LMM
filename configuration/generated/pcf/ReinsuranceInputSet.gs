package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/generalstatus/ReinsuranceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.ReinsuranceInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.ReinsuranceInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}