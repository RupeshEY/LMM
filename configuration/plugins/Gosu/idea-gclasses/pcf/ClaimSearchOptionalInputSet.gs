package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchOptionalInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimSearchCriteria :  ClaimSearchCriteria) : void {
    __widgetOf(this, pcf.ClaimSearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimSearchCriteria})
  }
  
  function refreshVariables ($ClaimSearchCriteria :  ClaimSearchCriteria) : void {
    __widgetOf(this, pcf.ClaimSearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimSearchCriteria})
  }
  
  
}