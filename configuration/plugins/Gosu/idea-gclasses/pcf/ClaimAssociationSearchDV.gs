package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAssociationSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimAssociationSearchCriteria :  ClaimAssociationSearchCriteria) : void {
    __widgetOf(this, pcf.ClaimAssociationSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimAssociationSearchCriteria})
  }
  
  function refreshVariables ($ClaimAssociationSearchCriteria :  ClaimAssociationSearchCriteria) : void {
    __widgetOf(this, pcf.ClaimAssociationSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimAssociationSearchCriteria})
  }
  
  
}