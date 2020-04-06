package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/EditableClaimContactRolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableClaimContactRolesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimContact :  ClaimContact) : void {
    __widgetOf(this, pcf.EditableClaimContactRolesLV, SECTION_WIDGET_CLASS).setVariables(false, {$claimContact})
  }
  
  function refreshVariables ($claimContact :  ClaimContact) : void {
    __widgetOf(this, pcf.EditableClaimContactRolesLV, SECTION_WIDGET_CLASS).setVariables(true, {$claimContact})
  }
  
  
}