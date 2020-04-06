package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryHeadlinePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryHeadlinePanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimSummaryHeadlinePanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimSummaryHeadlinePanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}