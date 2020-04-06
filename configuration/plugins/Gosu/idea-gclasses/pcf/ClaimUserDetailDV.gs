package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUserDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimUserDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimUserModel :  ClaimUserModel, $Claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimUserDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimUserModel, $Claim})
  }
  
  function refreshVariables ($ClaimUserModel :  ClaimUserModel, $Claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimUserDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimUserModel, $Claim})
  }
  
  
}