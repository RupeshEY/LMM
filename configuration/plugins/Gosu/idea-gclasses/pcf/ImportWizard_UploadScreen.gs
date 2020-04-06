package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_UploadScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportWizard_UploadScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ImportDataInfo :  gw.api.admin.ImportDataInfo) : void {
    __widgetOf(this, pcf.ImportWizard_UploadScreen, SECTION_WIDGET_CLASS).setVariables(false, {$ImportDataInfo})
  }
  
  function refreshVariables ($ImportDataInfo :  gw.api.admin.ImportDataInfo) : void {
    __widgetOf(this, pcf.ImportWizard_UploadScreen, SECTION_WIDGET_CLASS).setVariables(true, {$ImportDataInfo})
  }
  
  
}