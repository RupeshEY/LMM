package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportWizard_ConflictScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ImportDataInfo :  gw.api.admin.ImportDataInfo, $ImportDataConflict :  gw.api.admin.ImportDataConflict) : void {
    __widgetOf(this, pcf.ImportWizard_ConflictScreen, SECTION_WIDGET_CLASS).setVariables(false, {$ImportDataInfo, $ImportDataConflict})
  }
  
  function refreshVariables ($ImportDataInfo :  gw.api.admin.ImportDataInfo, $ImportDataConflict :  gw.api.admin.ImportDataConflict) : void {
    __widgetOf(this, pcf.ImportWizard_ConflictScreen, SECTION_WIDGET_CLASS).setVariables(true, {$ImportDataInfo, $ImportDataConflict})
  }
  
  
}