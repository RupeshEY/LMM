package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveSourceInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveSourceInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.ArchiveSourceInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.ArchiveSourceInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}