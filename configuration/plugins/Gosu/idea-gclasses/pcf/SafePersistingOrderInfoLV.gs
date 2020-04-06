package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SafePersistingOrderInfoLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($safePersistingOrderTables :  List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData>) : void {
    __widgetOf(this, pcf.SafePersistingOrderInfoLV, SECTION_WIDGET_CLASS).setVariables(false, {$safePersistingOrderTables})
  }
  
  function refreshVariables ($safePersistingOrderTables :  List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData>) : void {
    __widgetOf(this, pcf.SafePersistingOrderInfoLV, SECTION_WIDGET_CLASS).setVariables(true, {$safePersistingOrderTables})
  }
  
  
}