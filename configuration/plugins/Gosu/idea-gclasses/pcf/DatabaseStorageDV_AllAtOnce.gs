package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DatabaseStorageDV_AllAtOnce extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ParameterSet :  gw.api.database.DatabaseParameterSet) : void {
    __widgetOf(this, pcf.DatabaseStorageDV_AllAtOnce, SECTION_WIDGET_CLASS).setVariables(false, {$ParameterSet})
  }
  
  function refreshVariables ($ParameterSet :  gw.api.database.DatabaseParameterSet) : void {
    __widgetOf(this, pcf.DatabaseStorageDV_AllAtOnce, SECTION_WIDGET_CLASS).setVariables(true, {$ParameterSet})
  }
  
  
}