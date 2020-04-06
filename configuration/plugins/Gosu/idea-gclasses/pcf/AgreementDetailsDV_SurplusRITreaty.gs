package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/AgreementDetailsDV.SurplusRITreaty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AgreementDetailsDV_SurplusRITreaty extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($agreement :  RIAgreement) : void {
    __widgetOf(this, pcf.AgreementDetailsDV_SurplusRITreaty, SECTION_WIDGET_CLASS).setVariables(false, {$agreement})
  }
  
  function refreshVariables ($agreement :  RIAgreement) : void {
    __widgetOf(this, pcf.AgreementDetailsDV_SurplusRITreaty, SECTION_WIDGET_CLASS).setVariables(true, {$agreement})
  }
  
  
}