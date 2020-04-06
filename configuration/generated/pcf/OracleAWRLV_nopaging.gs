package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleAWRLV_nopaging extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Snapshots :  gw.api.database.DatabaseSnapshotInfo[]) : void {
    __widgetOf(this, pcf.OracleAWRLV_nopaging, SECTION_WIDGET_CLASS).setVariables(false, {$Snapshots})
  }
  
  function refreshVariables ($Snapshots :  gw.api.database.DatabaseSnapshotInfo[]) : void {
    __widgetOf(this, pcf.OracleAWRLV_nopaging, SECTION_WIDGET_CLASS).setVariables(true, {$Snapshots})
  }
  
  
}