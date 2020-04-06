package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MedCaseMgrDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.MedCaseMgrDV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.MedCaseMgrDV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}