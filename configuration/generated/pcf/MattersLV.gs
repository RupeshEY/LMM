package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MattersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($MatterList :  Matter[], $Claim :  Claim, $ClaimMatters :  gw.api.matter.ClaimMattersHelper) : void {
    __widgetOf(this, pcf.MattersLV, SECTION_WIDGET_CLASS).setVariables(false, {$MatterList, $Claim, $ClaimMatters})
  }
  
  function refreshVariables ($MatterList :  Matter[], $Claim :  Claim, $ClaimMatters :  gw.api.matter.ClaimMattersHelper) : void {
    __widgetOf(this, pcf.MattersLV, SECTION_WIDGET_CLASS).setVariables(true, {$MatterList, $Claim, $ClaimMatters})
  }
  
  
}