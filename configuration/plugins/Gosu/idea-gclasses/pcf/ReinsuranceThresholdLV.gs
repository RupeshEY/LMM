package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceThresholdLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ReinsuranceThresholdList :  gw.api.database.IQueryBeanResult<ReinsuranceThreshold>) : void {
    __widgetOf(this, pcf.ReinsuranceThresholdLV, SECTION_WIDGET_CLASS).setVariables(false, {$ReinsuranceThresholdList})
  }
  
  function refreshVariables ($ReinsuranceThresholdList :  gw.api.database.IQueryBeanResult<ReinsuranceThreshold>) : void {
    __widgetOf(this, pcf.ReinsuranceThresholdLV, SECTION_WIDGET_CLASS).setVariables(true, {$ReinsuranceThresholdList})
  }
  
  
}