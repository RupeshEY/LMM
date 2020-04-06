package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/SearchMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SearchMenuActions extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.SearchMenuActions, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.SearchMenuActions, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}