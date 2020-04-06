package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyAttributeInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($FixedPropertyIncident :  FixedPropertyIncident) : void {
    __widgetOf(this, pcf.PropertyAttributeInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$FixedPropertyIncident})
  }
  
  function refreshVariables ($FixedPropertyIncident :  FixedPropertyIncident) : void {
    __widgetOf(this, pcf.PropertyAttributeInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$FixedPropertyIncident})
  }
  
  
}