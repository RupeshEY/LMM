package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/EditableClaimUserRolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableClaimUserRolesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimUserModel :  ClaimUserModel, $claim :  Claim) : void {
    __widgetOf(this, pcf.EditableClaimUserRolesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimUserModel, $claim})
  }
  
  function refreshVariables ($ClaimUserModel :  ClaimUserModel, $claim :  Claim) : void {
    __widgetOf(this, pcf.EditableClaimUserRolesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimUserModel, $claim})
  }
  
  
}