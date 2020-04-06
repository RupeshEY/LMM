package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecksByStagingTableLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($LoadIntegrityChecks :  gw.api.tools.LoadIntegrityChecksHelper, $PickedStagingTable :  gw.api.database.WebStagingTable, $AllowNonAdminRef :  Boolean) : void {
    __widgetOf(this, pcf.LoadIntegrityChecksByStagingTableLV, SECTION_WIDGET_CLASS).setVariables(false, {$LoadIntegrityChecks, $PickedStagingTable, $AllowNonAdminRef})
  }
  
  function refreshVariables ($LoadIntegrityChecks :  gw.api.tools.LoadIntegrityChecksHelper, $PickedStagingTable :  gw.api.database.WebStagingTable, $AllowNonAdminRef :  Boolean) : void {
    __widgetOf(this, pcf.LoadIntegrityChecksByStagingTableLV, SECTION_WIDGET_CLASS).setVariables(true, {$LoadIntegrityChecks, $PickedStagingTable, $AllowNonAdminRef})
  }
  
  
}