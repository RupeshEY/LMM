package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/EditableStatuteLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableStatuteLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.EditableStatuteLV, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.EditableStatuteLV, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}