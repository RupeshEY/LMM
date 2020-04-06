package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimNegotiationDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNegotiationDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Negotiation :  Negotiation) : void {
    __widgetOf(this, pcf.ClaimNegotiationDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$Negotiation})
  }
  
  function refreshVariables ($Negotiation :  Negotiation) : void {
    __widgetOf(this, pcf.ClaimNegotiationDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$Negotiation})
  }
  
  
}