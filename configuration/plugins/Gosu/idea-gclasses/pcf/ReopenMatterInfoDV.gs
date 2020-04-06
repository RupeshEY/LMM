package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/ReopenMatterInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenMatterInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ReopenMatterInfo :  ReopenMatterInfo) : void {
    __widgetOf(this, pcf.ReopenMatterInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {$ReopenMatterInfo})
  }
  
  function refreshVariables ($ReopenMatterInfo :  ReopenMatterInfo) : void {
    __widgetOf(this, pcf.ReopenMatterInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {$ReopenMatterInfo})
  }
  
  
}