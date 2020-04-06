package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableBodyPartDetailsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Incident :  InjuryIncident, $includeCompensabilityFields :  boolean) : void {
    __widgetOf(this, pcf.EditableBodyPartDetailsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Incident, $includeCompensabilityFields})
  }
  
  function refreshVariables ($Incident :  InjuryIncident, $includeCompensabilityFields :  boolean) : void {
    __widgetOf(this, pcf.EditableBodyPartDetailsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Incident, $includeCompensabilityFields})
  }
  
  
}