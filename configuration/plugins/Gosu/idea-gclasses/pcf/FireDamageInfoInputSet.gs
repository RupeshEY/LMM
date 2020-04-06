package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/FireDamageInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FireDamageInfoInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($dwellingIncident :  DwellingIncident) : void {
    __widgetOf(this, pcf.FireDamageInfoInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$dwellingIncident})
  }
  
  function refreshVariables ($dwellingIncident :  DwellingIncident) : void {
    __widgetOf(this, pcf.FireDamageInfoInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$dwellingIncident})
  }
  
  
}