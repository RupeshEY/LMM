package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/CloseMatterInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseMatterInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CloseMatterInfo :  CloseMatterInfo) : void {
    __widgetOf(this, pcf.CloseMatterInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {$CloseMatterInfo})
  }
  
  function refreshVariables ($CloseMatterInfo :  CloseMatterInfo) : void {
    __widgetOf(this, pcf.CloseMatterInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {$CloseMatterInfo})
  }
  
  
}