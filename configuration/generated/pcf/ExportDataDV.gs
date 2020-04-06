package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ExportDataDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExportDataDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExportDataInfo :  gw.api.admin.ExportDataInfo) : void {
    __widgetOf(this, pcf.ExportDataDV, SECTION_WIDGET_CLASS).setVariables(false, {$ExportDataInfo})
  }
  
  function refreshVariables ($ExportDataInfo :  gw.api.admin.ExportDataInfo) : void {
    __widgetOf(this, pcf.ExportDataDV, SECTION_WIDGET_CLASS).setVariables(true, {$ExportDataInfo})
  }
  
  
}