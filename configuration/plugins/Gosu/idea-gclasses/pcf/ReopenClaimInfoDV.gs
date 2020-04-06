package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ReopenClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenClaimInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ReopenClaimInfo :  ReopenClaimInfo) : void {
    __widgetOf(this, pcf.ReopenClaimInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {$ReopenClaimInfo})
  }
  
  function refreshVariables ($ReopenClaimInfo :  ReopenClaimInfo) : void {
    __widgetOf(this, pcf.ReopenClaimInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {$ReopenClaimInfo})
  }
  
  
}