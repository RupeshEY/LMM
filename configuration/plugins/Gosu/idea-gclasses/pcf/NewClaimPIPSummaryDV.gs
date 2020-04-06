package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPIPSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimPIPSummaryDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.NewClaimPIPSummaryDV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.NewClaimPIPSummaryDV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}