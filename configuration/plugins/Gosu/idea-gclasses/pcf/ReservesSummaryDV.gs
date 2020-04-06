package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/ReservesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReservesSummaryDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($NewReserveSet :  gw.api.financials.ReserveWizardHelper, $Exposure :  Exposure, $addNew :  Boolean) : void {
    __widgetOf(this, pcf.ReservesSummaryDV, SECTION_WIDGET_CLASS).setVariables(false, {$NewReserveSet, $Exposure, $addNew})
  }
  
  function refreshVariables ($NewReserveSet :  gw.api.financials.ReserveWizardHelper, $Exposure :  Exposure, $addNew :  Boolean) : void {
    __widgetOf(this, pcf.ReservesSummaryDV, SECTION_WIDGET_CLASS).setVariables(true, {$NewReserveSet, $Exposure, $addNew})
  }
  
  
}