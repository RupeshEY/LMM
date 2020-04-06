package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MedicalDiagnosisLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($injury :  InjuryIncident, $isEditable :  Boolean) : void {
    __widgetOf(this, pcf.MedicalDiagnosisLV, SECTION_WIDGET_CLASS).setVariables(false, {$injury, $isEditable})
  }
  
  function refreshVariables ($injury :  InjuryIncident, $isEditable :  Boolean) : void {
    __widgetOf(this, pcf.MedicalDiagnosisLV, SECTION_WIDGET_CLASS).setVariables(true, {$injury, $isEditable})
  }
  
  
}