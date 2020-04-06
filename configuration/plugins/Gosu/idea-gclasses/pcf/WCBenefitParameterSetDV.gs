package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitParameterSetDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WCBenefitParameterSet :  WCBenefitParameterSet) : void {
    __widgetOf(this, pcf.WCBenefitParameterSetDV, SECTION_WIDGET_CLASS).setVariables(false, {$WCBenefitParameterSet})
  }
  
  function refreshVariables ($WCBenefitParameterSet :  WCBenefitParameterSet) : void {
    __widgetOf(this, pcf.WCBenefitParameterSetDV, SECTION_WIDGET_CLASS).setVariables(true, {$WCBenefitParameterSet})
  }
  
  
}