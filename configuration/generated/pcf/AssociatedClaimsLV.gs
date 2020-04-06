package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssociatedClaimsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $ClaimAssociationList :  ClaimAssociation[]) : void {
    __widgetOf(this, pcf.AssociatedClaimsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $ClaimAssociationList})
  }
  
  function refreshVariables ($Claim :  Claim, $ClaimAssociationList :  ClaimAssociation[]) : void {
    __widgetOf(this, pcf.AssociatedClaimsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $ClaimAssociationList})
  }
  
  
}