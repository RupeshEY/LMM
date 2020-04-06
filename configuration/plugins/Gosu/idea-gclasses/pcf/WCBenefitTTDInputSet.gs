package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/WCBenefitTTDInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitTTDInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.WCBenefitTTDInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.WCBenefitTTDInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}