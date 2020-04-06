package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewPersonOnlyPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewPersonOnlyPickerMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($requiredContactType :  Type, $parentContact :  Contact, $claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimNewPersonOnlyPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$requiredContactType, $parentContact, $claim})
  }
  
  function refreshVariables ($requiredContactType :  Type, $parentContact :  Contact, $claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimNewPersonOnlyPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$requiredContactType, $parentContact, $claim})
  }
  
  
}