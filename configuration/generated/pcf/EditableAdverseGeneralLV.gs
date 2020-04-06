package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableAdverseGeneralLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.EditableAdverseGeneralLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.EditableAdverseGeneralLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}