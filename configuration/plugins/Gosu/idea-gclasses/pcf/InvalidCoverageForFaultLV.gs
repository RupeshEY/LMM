package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InvalidCoverageForFaultLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($InvalidCoverageForFaultList :  gw.api.database.IQueryBeanResult<InvalidCoverageForFault>) : void {
    __widgetOf(this, pcf.InvalidCoverageForFaultLV, SECTION_WIDGET_CLASS).setVariables(false, {$InvalidCoverageForFaultList})
  }
  
  function refreshVariables ($InvalidCoverageForFaultList :  gw.api.database.IQueryBeanResult<InvalidCoverageForFault>) : void {
    __widgetOf(this, pcf.InvalidCoverageForFaultLV, SECTION_WIDGET_CLASS).setVariables(true, {$InvalidCoverageForFaultList})
  }
  
  
}