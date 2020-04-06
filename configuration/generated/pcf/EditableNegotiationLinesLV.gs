package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableNegotiationLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableNegotiationLinesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Negotiation :  Negotiation) : void {
    __widgetOf(this, pcf.EditableNegotiationLinesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Negotiation})
  }
  
  function refreshVariables ($Negotiation :  Negotiation) : void {
    __widgetOf(this, pcf.EditableNegotiationLinesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Negotiation})
  }
  
  
}