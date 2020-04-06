package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditablePropertyLienholdersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditablePropertyLienholdersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicyLocation :  PolicyLocation, $Claim :  Claim) : void {
    __widgetOf(this, pcf.EditablePropertyLienholdersLV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicyLocation, $Claim})
  }
  
  function refreshVariables ($PolicyLocation :  PolicyLocation, $Claim :  Claim) : void {
    __widgetOf(this, pcf.EditablePropertyLienholdersLV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicyLocation, $Claim})
  }
  
  
}