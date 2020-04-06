package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/search/SearchOnlyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SearchOnlyInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.SearchOnlyInputSet, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.SearchOnlyInputSet, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}