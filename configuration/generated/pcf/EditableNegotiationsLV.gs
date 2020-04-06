package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableNegotiationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableNegotiationsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($NegotiationList :  Negotiation[], $claim :  Claim) : void {
    __widgetOf(this, pcf.EditableNegotiationsLV, SECTION_WIDGET_CLASS).setVariables(false, {$NegotiationList, $claim})
  }
  
  function refreshVariables ($NegotiationList :  Negotiation[], $claim :  Claim) : void {
    __widgetOf(this, pcf.EditableNegotiationsLV, SECTION_WIDGET_CLASS).setVariables(true, {$NegotiationList, $claim})
  }
  
  
}