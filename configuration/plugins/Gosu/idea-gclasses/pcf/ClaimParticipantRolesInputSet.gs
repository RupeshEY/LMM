package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ClaimParticipantRolesInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimParticipantRolesInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ecfClaimResponseRq :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.ClaimParticipantRolesInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$ecfClaimResponseRq})
  }
  
  function refreshVariables ($ecfClaimResponseRq :  ECFMessageClaimResponseRq_Ext) : void {
    __widgetOf(this, pcf.ClaimParticipantRolesInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$ecfClaimResponseRq})
  }
  
  
}