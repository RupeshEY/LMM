package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewNegotiationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewNegotiationDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Negotiation :  Negotiation) : void {
    __widgetOf(this, pcf.NewNegotiationDV, SECTION_WIDGET_CLASS).setVariables(false, {$Negotiation})
  }
  
  function refreshVariables ($Negotiation :  Negotiation) : void {
    __widgetOf(this, pcf.NewNegotiationDV, SECTION_WIDGET_CLASS).setVariables(true, {$Negotiation})
  }
  
  
}