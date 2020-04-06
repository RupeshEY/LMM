package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/BlankNewContactPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BlankNewContactPickerMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.BlankNewContactPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.BlankNewContactPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}