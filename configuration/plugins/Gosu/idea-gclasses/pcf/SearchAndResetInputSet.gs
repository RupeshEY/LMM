package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/search/SearchAndResetInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SearchAndResetInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.SearchAndResetInputSet, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.SearchAndResetInputSet, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}