package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimSearchScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($archiveSearchEnabled :  boolean) : void {
    __widgetOf(this, pcf.FreeTextClaimSearchScreen, SECTION_WIDGET_CLASS).setVariables(false, {$archiveSearchEnabled})
  }
  
  function refreshVariables ($archiveSearchEnabled :  boolean) : void {
    __widgetOf(this, pcf.FreeTextClaimSearchScreen, SECTION_WIDGET_CLASS).setVariables(true, {$archiveSearchEnabled})
  }
  
  
}