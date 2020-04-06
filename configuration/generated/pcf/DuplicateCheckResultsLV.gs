package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/financials/DuplicateCheckResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DuplicateCheckResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CheckList :  Check[]) : void {
    __widgetOf(this, pcf.DuplicateCheckResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$CheckList})
  }
  
  function refreshVariables ($CheckList :  Check[]) : void {
    __widgetOf(this, pcf.DuplicateCheckResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$CheckList})
  }
  
  
}