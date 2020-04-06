package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WCPDBenefitsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ref_WC_PD_BenefitsList :  gw.api.database.IQueryBeanResult<ref_WC_PD_benefits>) : void {
    __widgetOf(this, pcf.WCPDBenefitsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ref_WC_PD_BenefitsList})
  }
  
  function refreshVariables ($ref_WC_PD_BenefitsList :  gw.api.database.IQueryBeanResult<ref_WC_PD_benefits>) : void {
    __widgetOf(this, pcf.WCPDBenefitsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ref_WC_PD_BenefitsList})
  }
  
  
}