package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableServiceProviderLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimContactRoleList :  ClaimContactRole[], $Exposure :  Exposure) : void {
    __widgetOf(this, pcf.EditableServiceProviderLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimContactRoleList, $Exposure})
  }
  
  function refreshVariables ($ClaimContactRoleList :  ClaimContactRole[], $Exposure :  Exposure) : void {
    __widgetOf(this, pcf.EditableServiceProviderLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimContactRoleList, $Exposure})
  }
  
  
}