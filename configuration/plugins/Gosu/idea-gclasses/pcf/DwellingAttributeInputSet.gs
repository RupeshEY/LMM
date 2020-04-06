package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DwellingAttributeInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($dwellingIncident :  DwellingIncident) : void {
    __widgetOf(this, pcf.DwellingAttributeInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$dwellingIncident})
  }
  
  function refreshVariables ($dwellingIncident :  DwellingIncident) : void {
    __widgetOf(this, pcf.DwellingAttributeInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$dwellingIncident})
  }
  
  
}