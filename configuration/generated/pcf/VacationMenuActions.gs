package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/vacation/VacationMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VacationMenuActions extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.VacationMenuActions, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.VacationMenuActions, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}