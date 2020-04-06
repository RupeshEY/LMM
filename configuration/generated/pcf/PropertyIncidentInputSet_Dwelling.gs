package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/PropertyIncidentInputSet.Dwelling.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyIncidentInputSet_Dwelling extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.PropertyIncidentInputSet_Dwelling, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.PropertyIncidentInputSet_Dwelling, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}