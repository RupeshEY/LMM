package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/WCBenefitPPDInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitPPDInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.WCBenefitPPDInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.WCBenefitPPDInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}