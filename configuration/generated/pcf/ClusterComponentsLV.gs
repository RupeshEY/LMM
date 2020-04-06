package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterComponentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($data :  gw.api.tools.ClusterComponentsData, $components :  List<gw.api.system.cluster.ComponentInfo>, $navigateToHistoryAvailable :  boolean) : void {
    __widgetOf(this, pcf.ClusterComponentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$data, $components, $navigateToHistoryAvailable})
  }
  
  function refreshVariables ($data :  gw.api.tools.ClusterComponentsData, $components :  List<gw.api.system.cluster.ComponentInfo>, $navigateToHistoryAvailable :  boolean) : void {
    __widgetOf(this, pcf.ClusterComponentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$data, $components, $navigateToHistoryAvailable})
  }
  
  
}