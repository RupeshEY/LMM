package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableBenefitPeriodsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.EditableBenefitPeriodsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.EditableBenefitPeriodsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}