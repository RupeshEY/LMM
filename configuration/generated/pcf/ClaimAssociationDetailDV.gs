package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAssociationDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimAssociation :  ClaimAssociation) : void {
    __widgetOf(this, pcf.ClaimAssociationDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimAssociation})
  }
  
  function refreshVariables ($ClaimAssociation :  ClaimAssociation) : void {
    __widgetOf(this, pcf.ClaimAssociationDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimAssociation})
  }
  
  
}