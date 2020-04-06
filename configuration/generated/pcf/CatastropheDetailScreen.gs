package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($catastrophe :  Catastrophe, $showRelatedClaimsFinder :  boolean) : void {
    __widgetOf(this, pcf.CatastropheDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$catastrophe, $showRelatedClaimsFinder})
  }
  
  function refreshVariables ($catastrophe :  Catastrophe, $showRelatedClaimsFinder :  boolean) : void {
    __widgetOf(this, pcf.CatastropheDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$catastrophe, $showRelatedClaimsFinder})
  }
  
  
}