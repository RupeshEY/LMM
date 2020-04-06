package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/archive/RetrieveClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RetrieveClaimInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($retrieveClaimInfo :  ArchivedClaimInfo) : void {
    __widgetOf(this, pcf.RetrieveClaimInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {$retrieveClaimInfo})
  }
  
  function refreshVariables ($retrieveClaimInfo :  ArchivedClaimInfo) : void {
    __widgetOf(this, pcf.RetrieveClaimInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {$retrieveClaimInfo})
  }
  
  
}