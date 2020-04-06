package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimUsersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimUserModelList :  ClaimUserModel[]) : void {
    __widgetOf(this, pcf.ClaimUsersLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimUserModelList})
  }
  
  function refreshVariables ($ClaimUserModelList :  ClaimUserModel[]) : void {
    __widgetOf(this, pcf.ClaimUsersLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimUserModelList})
  }
  
  
}