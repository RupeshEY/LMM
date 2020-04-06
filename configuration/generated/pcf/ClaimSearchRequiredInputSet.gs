package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchRequiredInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimSearchCriteria :  ClaimSearchCriteria) : void {
    __widgetOf(this, pcf.ClaimSearchRequiredInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimSearchCriteria})
  }
  
  function refreshVariables ($ClaimSearchCriteria :  ClaimSearchCriteria) : void {
    __widgetOf(this, pcf.ClaimSearchRequiredInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimSearchCriteria})
  }
  
  
}