package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/EditableRULienholdersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableRULienholdersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RU :  LocationBasedRU, $Claim :  Claim) : void {
    __widgetOf(this, pcf.EditableRULienholdersLV, SECTION_WIDGET_CLASS).setVariables(false, {$RU, $Claim})
  }
  
  function refreshVariables ($RU :  LocationBasedRU, $Claim :  Claim) : void {
    __widgetOf(this, pcf.EditableRULienholdersLV, SECTION_WIDGET_CLASS).setVariables(true, {$RU, $Claim})
  }
  
  
}