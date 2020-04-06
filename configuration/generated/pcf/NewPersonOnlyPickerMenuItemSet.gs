package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/NewPersonOnlyPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPersonOnlyPickerMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($requiredContactType :  Type, $parentContact :  Contact) : void {
    __widgetOf(this, pcf.NewPersonOnlyPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$requiredContactType, $parentContact})
  }
  
  function refreshVariables ($requiredContactType :  Type, $parentContact :  Contact) : void {
    __widgetOf(this, pcf.NewPersonOnlyPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$requiredContactType, $parentContact})
  }
  
  
}