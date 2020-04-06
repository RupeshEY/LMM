package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/CloseClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseClaimInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CloseClaimInfo :  CloseClaimInfo) : void {
    __widgetOf(this, pcf.CloseClaimInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {$CloseClaimInfo})
  }
  
  function refreshVariables ($CloseClaimInfo :  CloseClaimInfo) : void {
    __widgetOf(this, pcf.CloseClaimInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {$CloseClaimInfo})
  }
  
  
}