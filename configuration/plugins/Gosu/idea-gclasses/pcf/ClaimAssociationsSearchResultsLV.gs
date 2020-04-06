package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationsSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAssociationsSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimAssociationList :  ClaimAssociation[]) : void {
    __widgetOf(this, pcf.ClaimAssociationsSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimAssociationList})
  }
  
  function refreshVariables ($ClaimAssociationList :  ClaimAssociation[]) : void {
    __widgetOf(this, pcf.ClaimAssociationsSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimAssociationList})
  }
  
  
}