package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InvalidCoverageForCauseLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($InvalidCoverageForCauseList :  gw.api.database.IQueryBeanResult<InvalidCoverageForCause>) : void {
    __widgetOf(this, pcf.InvalidCoverageForCauseLV, SECTION_WIDGET_CLASS).setVariables(false, {$InvalidCoverageForCauseList})
  }
  
  function refreshVariables ($InvalidCoverageForCauseList :  gw.api.database.IQueryBeanResult<InvalidCoverageForCause>) : void {
    __widgetOf(this, pcf.InvalidCoverageForCauseLV, SECTION_WIDGET_CLASS).setVariables(true, {$InvalidCoverageForCauseList})
  }
  
  
}