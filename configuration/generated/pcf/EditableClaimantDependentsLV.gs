package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableClaimantDependentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimContactRoleList :  ClaimContactRole[], $ClaimContactRoleOwner :  gw.api.contact.ClaimContactRoleOwner, $role :  ContactRole) : void {
    __widgetOf(this, pcf.EditableClaimantDependentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimContactRoleList, $ClaimContactRoleOwner, $role})
  }
  
  function refreshVariables ($ClaimContactRoleList :  ClaimContactRole[], $ClaimContactRoleOwner :  gw.api.contact.ClaimContactRoleOwner, $role :  ContactRole) : void {
    __widgetOf(this, pcf.EditableClaimantDependentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimContactRoleList, $ClaimContactRoleOwner, $role})
  }
  
  
}