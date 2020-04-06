package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/CatastropheSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheSearchScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($gotoCatastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastropheSearchScreen, SECTION_WIDGET_CLASS).setVariables(false, {$gotoCatastrophe})
  }
  
  function refreshVariables ($gotoCatastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastropheSearchScreen, SECTION_WIDGET_CLASS).setVariables(true, {$gotoCatastrophe})
  }
  
  
}