package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MedicalPersonnelLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimContactList :  ClaimContact[]) : void {
    __widgetOf(this, pcf.MedicalPersonnelLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimContactList})
  }
  
  function refreshVariables ($ClaimContactList :  ClaimContact[]) : void {
    __widgetOf(this, pcf.MedicalPersonnelLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimContactList})
  }
  
  
}