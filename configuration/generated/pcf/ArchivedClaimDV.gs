package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/archive/ArchivedClaimDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchivedClaimDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimInfo :  ClaimInfo, $ArchivedClaimInfo :  ArchivedClaimInfo) : void {
    __widgetOf(this, pcf.ArchivedClaimDV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimInfo, $ArchivedClaimInfo})
  }
  
  function refreshVariables ($ClaimInfo :  ClaimInfo, $ArchivedClaimInfo :  ArchivedClaimInfo) : void {
    __widgetOf(this, pcf.ArchivedClaimDV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimInfo, $ArchivedClaimInfo})
  }
  
  
}