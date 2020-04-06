package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditableAdditionalInsuredLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableAdditionalInsuredLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimContactRoleList :  ClaimContactRole[], $Claim :  Claim, $ClaimContactRoleOwner :  gw.api.contact.ClaimContactRoleOwner, $role :  ContactRole) : void {
    __widgetOf(this, pcf.EditableAdditionalInsuredLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimContactRoleList, $Claim, $ClaimContactRoleOwner, $role})
  }
  
  function refreshVariables ($ClaimContactRoleList :  ClaimContactRole[], $Claim :  Claim, $ClaimContactRoleOwner :  gw.api.contact.ClaimContactRoleOwner, $role :  ContactRole) : void {
    __widgetOf(this, pcf.EditableAdditionalInsuredLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimContactRoleList, $Claim, $ClaimContactRoleOwner, $role})
  }
  
  
}