package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableClaimsInAssociationLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimAssociation :  ClaimAssociation) : void {
    __widgetOf(this, pcf.EditableClaimsInAssociationLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimAssociation})
  }
  
  function refreshVariables ($ClaimAssociation :  ClaimAssociation) : void {
    __widgetOf(this, pcf.EditableClaimsInAssociationLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimAssociation})
  }
  
  
}