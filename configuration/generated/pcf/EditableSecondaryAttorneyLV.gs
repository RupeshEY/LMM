package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/EditableSecondaryAttorneyLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableSecondaryAttorneyLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($matter :  Matter) : void {
    __widgetOf(this, pcf.EditableSecondaryAttorneyLV, SECTION_WIDGET_CLASS).setVariables(false, {$matter})
  }
  
  function refreshVariables ($matter :  Matter) : void {
    __widgetOf(this, pcf.EditableSecondaryAttorneyLV, SECTION_WIDGET_CLASS).setVariables(true, {$matter})
  }
  
  
}