package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/ReserveSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReserveSetLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ReserveList :  Reserve[]) : void {
    __widgetOf(this, pcf.ReserveSetLV, SECTION_WIDGET_CLASS).setVariables(false, {$ReserveList})
  }
  
  function refreshVariables ($ReserveList :  Reserve[]) : void {
    __widgetOf(this, pcf.ReserveSetLV, SECTION_WIDGET_CLASS).setVariables(true, {$ReserveList})
  }
  
  
}