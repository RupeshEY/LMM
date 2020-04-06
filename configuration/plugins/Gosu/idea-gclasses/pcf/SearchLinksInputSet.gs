package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/search/SearchLinksInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SearchLinksInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($searchVisible :  Boolean, $resetVisible :  Boolean) : void {
    __widgetOf(this, pcf.SearchLinksInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$searchVisible, $resetVisible})
  }
  
  function refreshVariables ($searchVisible :  Boolean, $resetVisible :  Boolean) : void {
    __widgetOf(this, pcf.SearchLinksInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$searchVisible, $resetVisible})
  }
  
  
}