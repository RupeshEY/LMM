package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/policy/StatCodeFilterDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatCodeFilterDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($FilterCriteria :  PolicyStatCodeFilterCriteria) : void {
    __widgetOf(this, pcf.StatCodeFilterDV, SECTION_WIDGET_CLASS).setVariables(false, {$FilterCriteria})
  }
  
  function refreshVariables ($FilterCriteria :  PolicyStatCodeFilterCriteria) : void {
    __widgetOf(this, pcf.StatCodeFilterDV, SECTION_WIDGET_CLASS).setVariables(true, {$FilterCriteria})
  }
  
  
}