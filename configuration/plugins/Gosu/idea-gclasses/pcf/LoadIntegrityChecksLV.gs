package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecksLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.LoadHistoryHelper, $IntegrityChecks :  gw.api.database.IQueryBeanResult<LoadIntegrityCheck>) : void {
    __widgetOf(this, pcf.LoadIntegrityChecksLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper, $IntegrityChecks})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.LoadHistoryHelper, $IntegrityChecks :  gw.api.database.IQueryBeanResult<LoadIntegrityCheck>) : void {
    __widgetOf(this, pcf.LoadIntegrityChecksLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper, $IntegrityChecks})
  }
  
  
}